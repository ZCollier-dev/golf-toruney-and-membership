package org.example.rest.member;

import org.example.rest.tournament.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/member")
    public List<Member> getAllMembers(){
        return memberService.getAll();
    }

    @GetMapping("/member/{id}")
    public Member getMemberById(@PathVariable Long id){
        return memberService.findById(id);
    }

    @GetMapping("/member/tournaments/{id}")
    public List<Tournament> getMemberTournamentsById(@PathVariable Long id){
        Member foundMember = memberService.findById(id);
        if (foundMember != null){
            return foundMember.getTournaments();
        }
        return null;
    }

    @GetMapping("/member_search")
    public List<Member> getMemberSearch(@RequestParam(value = "name", required = false) String name,
                                        @RequestParam(value = "membership_type", required = false) String membershipType,
                                        @RequestParam(value = "phone", required = false) String phone){
        List<Member> results = new ArrayList<>();

        if (name != null){
            Member memberFound = memberService.findByName(name);
            results.add(memberFound);
        } else if (membershipType != null){
            List<Member> membersFound = memberService.findByMembershipType(membershipType);
            results.addAll(membersFound);
        } else if (phone != null){
            Member memberFound = memberService.findByPhone(phone);
            results.add(memberFound);
        }

        return results;
    }

    @PostMapping("/member")
    public Member createMember(@RequestBody Member member){
        return memberService.createMember(member);
    }

    @PutMapping("/member/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable Long id, @RequestBody Member member){
        return ResponseEntity.ok(memberService.updateMember(id, member));
    }

    @DeleteMapping("/member/{id}")
    public void deleteMemberById(@PathVariable Long id){
        memberService.deleteMemberById(id);
    }
}
