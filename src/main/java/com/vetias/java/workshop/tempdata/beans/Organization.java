package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDate;

public record Organization(String Name,
    String Website,
    String Email,
    String contactNumber,
    long RegistrationNumber,
    String description,
    LocalDate RegistrationDate) {

}
