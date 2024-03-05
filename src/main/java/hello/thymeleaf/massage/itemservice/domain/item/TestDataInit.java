package hello.thymeleaf.massage.itemservice.domain.item;

import hello.thymeleaf.login.domain.item.ItemRepository;
import hello.thymeleaf.login.domain.member.Member;
import hello.thymeleaf.login.domain.member.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInit {
    private final ItemRepository4 itemRepository4;
    private final MemberRepository memberRepository;

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository4.save(new Item("itemA", 10000, 10));
        itemRepository4.save(new Item("itemB", 20000, 20));

        Member member = new Member();
        member.setLoginId("test");
        member.setPassword("test!");
        member.setName("테스터");

        memberRepository.save(member);

    }
}
