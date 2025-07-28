package org.example;

/* Functional API interacting with AWS Database
* Post screenshots of Postman doing API tests
* Add new members and tournaments
* Add members to tournaments
* Search members by name, membership type, phone number, tourney start date
* Search tournaments for start date, location
* Find all members in tournament
* Add Docker support */

/*
For Members:
        ◦ ID (auto generated)
        ◦ Member Name
        ◦ Member Address
        ◦ Member Email Address
        ◦ Member Phone Number
        ◦ Start Date of membership
        ◦ Duration of membership
For Tournaments:
        ◦ ID (auto generated)
        ◦ Start date.
        ◦ End date.
        ◦ Location
        ◦ Entry Fee
        ◦ Cash Prize Amount
        ◦ Participating Members
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GolfApp {
    public static void main(String[] args) {
        SpringApplication.run(GolfApp.class, args);
    }
}