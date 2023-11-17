package prao.praospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import prao.praospring.repository.MemberRepository;
import prao.praospring.repository.MemoryMemberRepository;
import prao.praospring.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
