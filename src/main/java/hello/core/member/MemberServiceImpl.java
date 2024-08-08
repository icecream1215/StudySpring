package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final  MemberRepository memberRepository;

    //MemberRepository 구현체에 뭐가들어갈지는 생성자로 만든다
    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
