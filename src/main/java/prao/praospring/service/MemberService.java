package prao.praospring.service;

import prao.praospring.domain.Member;
import prao.praospring.repository.MemberRepository;
import prao.praospring.repository.MemoryMemberRepository;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     * 회원 가입
     */
    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }
}
