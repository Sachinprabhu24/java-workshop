package com.vetias.java.workshop.tempdata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vetias.java.workshop.tempdata.beans.Organization;



public class OrganizationDAO {
    
    public void createTable(Connection dbConnection) {
        try {
            // JdbcDataSource h2dDataSource = new JdbcDataSource();
            // h2dDataSource.setUrl("jdbc:h2:mem:tempdataDB");
            // h2dDataSource.setUser("sa");
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
        }

        try(Statement statement = dbConnection.createStatement()){
            statement.execute("""
                CREATE TABLE ORGANIZATION(
                ID INT AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(100),
                WEBSITE VARCHAR(100),
                EMAIL VARCHAR(100),
                CONTACT_NUMBER VARCHAR(100),
                REGISTER_NUMBER INT,
                DESCRIPTION VARCHAR(234))
            """);
        }
        catch (SQLException sqlexception) {
            System.out.println("Error in creating table :"+sqlexception);
        }
    }

    public int save(Connection dbConnection, Organization vet) {
        try(PreparedStatement preparedStatement = dbConnection.prepareStatement("""
            INSERT INTO ORGANIZATION
            (name, website, email, contact_number, register_number, description) VALUES(?, ?, ?, ?, ?, ?)
        """)) {
            preparedStatement.setString(1, vet.Name());
            preparedStatement.setString(2, vet.Website());
            preparedStatement.setString(3, vet.Email());
            preparedStatement.setString(4, vet.contactNumber());
            preparedStatement.setLong(5, vet.RegistrationNumber());
            preparedStatement.setString(6, vet.description());
            preparedStatement.executeUpdate();
        } catch (SQLException sqlexception) {
            System.out.println("Error in inserting data :"+sqlexception);
        }
        return 0;
    }

    public Organization findByName(Connection dbConnection, String name) {
        Organization organization = null;
        try (PreparedStatement preparedStatement = dbConnection.prepareStatement("""
            SELECT * FROM ORGANIZATION WHERE NAME = ?
        """)) {
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet != null && resultSet.next()) {
                organization = new Organization(
                    resultSet.getString("NAME"),
                    resultSet.getString("WEBSITE"),
                    resultSet.getString("EMAIL"),
                    resultSet.getString("CONTACT_NUMBER"),
                    resultSet.getLong("REGISTER_NUMBER"),
                    resultSet.getString("DESCRIPTION"),null
                );
            }
        } catch (SQLException sqlexception) {
            System.out.println("Error in finding organization by name :" + sqlexception);
        }
        return organization;
    }
}
