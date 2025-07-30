package org.example.rest.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* Add new members
* Search by name, membership type, phone
* */

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAll(){
        return memberRepository.findAll();
    }

    public Member findByName(String name){
        return memberRepository.findByName(name);
    }
    public Member findByMembershipType(String membershipType){
        return memberRepository.findByMembershipType(membershipType);
    }
    public Member findByPhone(String phone){
        return memberRepository.findByPhone(phone);
    }

    public Member createMember(Member newMember){
        return memberRepository.save(newMember);
    }

    public Member updateMember(Long id, Member updatedMember){
        Optional<Member> memberToUpdateOpt = memberRepository.findById(id);

        if(memberToUpdateOpt.isPresent()){
            Member memberToUpdate = memberToUpdateOpt.get();

            memberToUpdate.setName(updatedMember.getName());
            memberToUpdate.setAddress(updatedMember.getAddress());
            memberToUpdate.setMembershipType(updatedMember.getMembershipType());
            memberToUpdate.setDurationMonths(updatedMember.getDurationMonths());
            memberToUpdate.setMembershipStartDate(updatedMember.getMembershipStartDate());
            memberToUpdate.setEmail(updatedMember.getEmail());
            memberToUpdate.setPhone(updatedMember.getPhone());

            return memberRepository.save(memberToUpdate);
        }
        return null;
    }

    public void deleteMemberById(Long id){
        memberRepository.deleteById(id);
    }
}
