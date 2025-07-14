package com.vetias.java.workshop.tempdata.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import org.h2.jdbcx.JdbcDataSource;



public class OrganizationDAO {
    
    public void createTable(){
        JdbcDataSource h2dDataSource = new JdbcDataSource();
        h2dDataSource.setUrl("jdbc:h2:mem:tempdataDB");
        h2dDataSource.setUser("sa");
        try(Connection dbConnection = h2dDataSource.getConnection();Statement statement = dbConnection.createStatement()){
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
            }catch (SQLException sqlexception) {
            System.out.println("Error in creating table :"+sqlexception);
            }

    }    
}
