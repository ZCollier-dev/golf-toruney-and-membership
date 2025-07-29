package org.example.rest.member;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Calendar;


@Entity
public class Member {
    //attributes
    @Id
    private long id;
    private short durationMonths;
    private Calendar membershipStartDate;
    private String name;
    private String address;
    private String email;
    private String phone;

}
