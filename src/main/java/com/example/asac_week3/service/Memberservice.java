package com.example.asac_week3.service;

import com.example.asac_week3.domain.Member;
import com.example.asac_week3.domain.MemberRepository;
import com.example.asac_week3.service.dto.MemberRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class Memberservice {

    private final MemberRepository memberRepository;

    @Transactional
    public Long join(MemberRequestDto requestDto) {

        Member member = new Member();

        member.setName(requestDto.getUsername());
        member.setPassword(requestDto.getUsername());

        memberRepository.save(member);

        return member.getId();
    }

    public Optional<Member> searchById(Long id) {
        return memberRepository.findById(id);
    }

    public void deleteMember(Optional<Member> member) {
        if (member != null)
            memberRepository.delete(member.get());
        else
            System.out.println("error");
    }
}
