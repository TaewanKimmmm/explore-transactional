package com.javable.transactional.application;

import com.javable.transactional.dao.MemberDao;
import com.javable.transactional.domain.Member;
import com.javable.transactional.dto.MemberRequest;
import com.javable.transactional.dto.MemberResponse;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberDao memberDao;

    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public MemberResponse createMember(MemberRequest request) {
        Member member = memberDao.insert(request.toMember());
        return MemberResponse.of(member);
    }
}
