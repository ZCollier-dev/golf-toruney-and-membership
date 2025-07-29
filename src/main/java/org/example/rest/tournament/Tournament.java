package org.example.rest.tournament;

import jakarta.persistence.*;
import org.example.rest.member.Member;

import java.util.Calendar;
import java.util.List;

@Entity
public class Tournament {
    //attributes
    @Id
    private long id;
    private float entryFee;
    private float cashPrize;
    private Calendar startDate;
    private Calendar endDate;

    @ManyToMany
    @JoinTable(
            name = "tournament_member",
            joinColumns = @JoinColumn(name = "tournament_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private List<Member> members;
}
