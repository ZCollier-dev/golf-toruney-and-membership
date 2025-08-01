package org.example.rest.tournament;

import org.example.rest.member.Member;

import java.util.Calendar;
import java.util.List;

//Data Transfer Object
public class TournamentDTO {
    private Long id;

    private float entryFee;
    private float cashPrize;
    private Calendar startDate;
    private Calendar endDate;
    private String location;

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
}
