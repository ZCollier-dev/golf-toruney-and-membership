package org.example.rest.tournament;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.example.rest.member.Member;

import java.util.Calendar;
import java.util.List;

@Entity
public class Tournament {
    //attributes
    @Id
    private Long id;
    private float entryFee;
    private float cashPrize;
    private Calendar startDate;
    private Calendar endDate;
    private String location;

    @JsonIgnore
    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable(
            name = "tournament_member",
            joinColumns = @JoinColumn(name = "tournament_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private List<Member> members;

    //methods
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }

    public void setEntryFee(float entryFee){
        this.entryFee = entryFee;
    }
    public float getEntryFee(){
        return this.entryFee;
    }

    public void setCashPrize(float cashPrize){
        this.cashPrize = cashPrize;
    }
    public float getCashPrize(){
        return this.cashPrize;
    }

    public void setStartDate(Calendar startDate){
        this.startDate = startDate;
    }
    public Calendar getStartDate(){
        return this.startDate;
    }

    public void setEndDate(Calendar endDate){
        this.endDate = endDate;
    }
    public Calendar getEndDate(){
        return this.endDate;
    }

    public void setLocation(String location) { this.location = location; }
    public String getLocation() { return this.location; }

    public void setMembers(List<Member> members){
        this.members = members;
    }
    public List<Member> getMembers(){
        return this.members;
    }
    public void addMember(Member member){
        this.members.add(member);
    }
}
