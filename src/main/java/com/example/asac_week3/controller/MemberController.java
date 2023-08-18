package com.example.asac_week3.controller;

import com.example.asac_week3.domain.Member;
import com.example.asac_week3.service.Memberservice;
import com.example.asac_week3.service.dto.MemberRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final Memberservice memberservice;

    @GetMapping("/member/api/vi/signup")
    public Long signup(@RequestBody MemberRequestDto requestDto) {

        return memberservice.join(requestDto);
    }

    @GetMapping("/member/api/vi/search")
    public Optional<Member> searchMember(@RequestBody Long memberId) {

        return memberservice.searchById(memberId);
    }

    @PutMapping("/member/api/v1/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody MemberRequestDto requestDto) {
        Optional<Member> member = memberservice.searchById(id);

        member.get().setName(requestDto.getUsername());
        member.get().setPassword(requestDto.getPassword());

        return ResponseEntity.ok("200");
    }

    @DeleteMapping("/member/api/v1/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        Optional<Member> member = memberservice.searchById(id);
        memberservice.deleteMember(member);

        return ResponseEntity.ok("200");
    }

}

