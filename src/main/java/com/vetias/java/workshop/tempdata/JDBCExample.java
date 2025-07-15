package com.vetias.java.workshop.tempdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vetias.java.workshop.tempdata.beans.Organization;
import com.vetias.java.workshop.tempdata.dao.OrganizationDAO;

public class JDBCExample {

    public static void main(String[] args) {
        Connection dbConnection = null;
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("H2 Driver not found: " + e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection("jdbc:h2:mem:tempdataDB", "sa", null);
        } catch (SQLException sqlException) {
            System.out.println("Error connecting to the database: " + sqlException);
        }

        OrganizationDAO organizationDAO = new OrganizationDAO();
        organizationDAO.createTable(dbConnection);
        Organization vet = new Organization(
            "VET",
            "www.vet.com",
            "contact@vet.com",
            "+91 96851 31436",
            4546L,
            "A trust for educational development",
            null);
        organizationDAO.save(dbConnection, vet);
        Organization foundOrganization = organizationDAO.findByName(dbConnection, "VET");
        System.out.println("Found Organization: " + foundOrganization);
    }

    
}
