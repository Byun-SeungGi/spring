package hello.core.member;

public class MemberServiceImpl implements MemberSerivce {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void Join(Member member) {

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
