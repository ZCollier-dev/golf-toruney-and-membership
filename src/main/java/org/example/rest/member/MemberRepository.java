package org.example.rest.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByName(String name);
    Member findByMembershipType(String membershipType);
    Member findByPhone(String phone);
}
