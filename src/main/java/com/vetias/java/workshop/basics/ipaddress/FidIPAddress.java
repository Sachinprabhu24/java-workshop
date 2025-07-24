package com.vetias.java.workshop.basics.ipaddress;
import java.net.InetAddress;

public class FidIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress ipaddress = InetAddress.getLocalHost();
            System.out.println("IP Address: " + ipaddress.getHostAddress());
        } catch (java.net.UnknownHostException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
