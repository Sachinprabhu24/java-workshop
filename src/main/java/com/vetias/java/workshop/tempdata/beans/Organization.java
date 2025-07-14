package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDate;

public record Organization(String Name,
String Website,
String CompleteAddress,
String contactNumber,
String Email,
long RegistrationNumber,
LocalDate RegistrationDate) {

}
