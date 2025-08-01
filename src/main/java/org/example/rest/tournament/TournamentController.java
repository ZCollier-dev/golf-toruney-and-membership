package org.example.rest.tournament;

import org.example.rest.member.Member;
import org.example.rest.member.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@CrossOrigin
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @GetMapping("/tournament")
    public List<Tournament> getAllTournaments(){
        return tournamentService.getAll();
    }

    @GetMapping("/tournament_search")
    public List<Tournament> getTournamentSearch(@RequestParam(value = "start_date", required = false) Calendar startDate,
                                                @RequestParam(value = "location", required = false) String location){
        List<Tournament> results = new ArrayList<>();

        if (startDate != null){
            List<Tournament> tourneysFound = tournamentService.findByStartDate(startDate);
            results.addAll(tourneysFound);
        } else if(location != null){
            List<Tournament> tourneysFound = tournamentService.findByLocation(location);
            results.addAll(tourneysFound);
        }

        return results;
    }

    @GetMapping("/tournament/members/{id}")
    public List<MemberDTO> getTournamentMembersById(@PathVariable Long id){
        Tournament foundTournament = tournamentService.findById(id);
        if (foundTournament != null){
            return foundTournament.getMembers();
        }
        return null;
    }

    @PostMapping("/tournament")
    public Tournament createTournament(@RequestBody Tournament tournament){
        return tournamentService.createTournament(tournament);
    }

    @PutMapping("/tournament/{id}")
    public ResponseEntity<Tournament> updateTournament(@PathVariable Long id, @RequestBody Tournament tournament){
        return ResponseEntity.ok(tournamentService.updateTournament(id, tournament));
    }

    @PutMapping("/tournament/member/{id}")
    public ResponseEntity<Tournament> addMemberToTournamentById(@PathVariable Long id,
                                                                @RequestBody Tournament tournament,
                                                                @RequestParam("new_member") MemberDTO newMember) {
        tournament.addMember(newMember);
        return ResponseEntity.ok(tournamentService.updateTournament(id, tournament));
    }

    @DeleteMapping("/tournament/{id}")
    public void deleteTournamentById(@PathVariable Long id){
        tournamentService.deleteTournamentById(id);
    }
}
