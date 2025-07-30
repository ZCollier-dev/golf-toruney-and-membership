package org.example.rest.tournament;

import org.example.rest.member.Member;
import org.example.rest.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

/* Add new tournaments
* Add members to tournaments
* Find all members in a tournament
* Search tournaments by startDate, location
* */

@Service
public class TournamentService {
    @Autowired
    private TournamentRepository tournamentRepository;

    public List<Tournament> getAll() {
        return tournamentRepository.findAll();
    }

    public Tournament findByStartDate(Calendar startDate){
        return tournamentRepository.findByStartDate(startDate);
    }
    public Tournament findByLocation(String location){
        return tournamentRepository.findByLocation(location);
    }

    public Tournament createTournament(Tournament newTournament){
        return tournamentRepository.save(newTournament);
    }

    public Tournament updateTournament(Long id, Tournament updatedTournament){
        Optional<Tournament> tourneyToUpdateOpt = tournamentRepository.findById(id);

        if(tourneyToUpdateOpt.isPresent()){
            Tournament tournamentToUpdate = tourneyToUpdateOpt.get();

            tournamentToUpdate.setCashPrize(updatedTournament.getCashPrize());
            tournamentToUpdate.setStartDate(updatedTournament.getStartDate());
            tournamentToUpdate.setEndDate(updatedTournament.getEndDate());
            tournamentToUpdate.setLocation(updatedTournament.getLocation());
            tournamentToUpdate.setEntryFee(updatedTournament.getEntryFee());
            tournamentToUpdate.setMembers(updatedTournament.getMembers());

            return tournamentRepository.save(tournamentToUpdate);
        }
        return null;
    }

    public void deleteTournamentById(Long id){
        tournamentRepository.deleteById(id);
    }
}
