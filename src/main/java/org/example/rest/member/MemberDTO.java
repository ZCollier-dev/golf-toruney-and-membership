package org.example.rest.member;


import java.util.Calendar;

// Data Transfer Object
public class MemberDTO {
    private Long id;

    private String name;
    private Calendar membershipStartDate;
    private short durationMonths;
    private String membershipType;
    private String address;
    private String email;
    private String phone;

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }

    public void setDurationMonths(short durationMonths){
        this.durationMonths = durationMonths;
    }
    public short getDurationMonths(){
        return this.durationMonths;
    }

    public void setMembershipStartDate(Calendar membershipStartDate){
        this.membershipStartDate = membershipStartDate;
    }
    public Calendar getMembershipStartDate(){
        return this.membershipStartDate;
    }

    public void setMembershipType(String membershipType){ this.membershipType = membershipType;}
    public String getMembershipType(){ return this.membershipType; }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
}
