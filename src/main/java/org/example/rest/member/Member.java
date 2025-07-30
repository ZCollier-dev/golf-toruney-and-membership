package org.example.rest.member;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import org.example.rest.tournament.Tournament;

import java.util.Calendar;
import java.util.List;


@Entity
public class Member {
    //attributes
    @Id
    private Long id;
    private short durationMonths;
    private Calendar membershipStartDate;
    private String name;
    private String address;
    private String email;
    private String phone;

    @ManyToMany(mappedBy = "tournament")
    private List<Tournament> tournaments;

    //methods
    public void setId(Long id){
        this.id = id;
    }
    public Long setId(){
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

    public void setTournaments(List<Tournament> tournaments){
        this.tournaments = tournaments;
    }
    public List<Tournament> getTournaments(){
        return this.tournaments;
    }
}
