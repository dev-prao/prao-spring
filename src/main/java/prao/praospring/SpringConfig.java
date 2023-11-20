package prao.praospring;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import prao.praospring.repository.JpaMemberRepository;
import prao.praospring.repository.MemberRepository;
import prao.praospring.service.MemberService;

@Configuration
public class SpringConfig {

    private EntityManager em;

    @Autowired
    public SpringConfig(final EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }
}
