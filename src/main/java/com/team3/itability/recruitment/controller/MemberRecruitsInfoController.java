package com.team3.itability.recruitment.controller;

import com.team3.itability.recruitment.aggregate.MemberRecruitsInfoDTO;
import com.team3.itability.recruitment.service.MemberRecruitsInfoService;
import com.team3.itability.recruitment.vo.MemberRecruitsInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member_recruits")
public class MemberRecruitsInfoController {

    private final MemberRecruitsInfoService memberRecruitsInfoService;

    @Autowired
    public MemberRecruitsInfoController(MemberRecruitsInfoService memberRecruitsInfoService) {

        this.memberRecruitsInfoService = memberRecruitsInfoService;
    }

    @GetMapping("/{recruitId}")
    public ResponseEntity<MemberRecruitsInfoDTO> findRecruitById(@PathVariable("recruitId") String recruitId) {

        MemberRecruitsInfoDTO memberRecruitInfo = memberRecruitsInfoService.findMemberId(recruitId);

        return ResponseEntity.ok().body(memberRecruitInfo);
    }

    // 모집글별 신청 회원 목록 조회
    @GetMapping("/list/{recruitId}")
    public ResponseEntity<List<MemberRecruitsInfoVO>> findMembersListByRecruitId(@PathVariable("recruitId") String recruitId) {

        List<MemberRecruitsInfoVO> memberList = memberRecruitsInfoService.findMembersListByRecruitId(recruitId);

        return ResponseEntity.ok().body(memberList);
    }

    @PostMapping("/regist")
    public ResponseEntity<MemberRecruitsInfoVO> registMemberRecruit(@RequestBody MemberRecruitsInfoVO memberRecruitsInfo) {

        MemberRecruitsInfoDTO memberRecruits = memberRecruitsInfoService.registMemberRecruit(memberRecruitsInfo);

        return ResponseEntity.status(HttpStatus.CREATED).body(memberRecruitsInfo);
    }

    @PutMapping("/accept/{memberRecruitInfoId}")
    public ResponseEntity<String> acceptMemberRecruit(@PathVariable int memberRecruitInfoId) {

        MemberRecruitsInfoDTO memberRecruit = memberRecruitsInfoService.acceptMemberRecruit(memberRecruitInfoId);

//        return ResponseEntity.created(URI.create("/member_recruits/" + memberRecruitInfoId)).build();

        return ResponseEntity.ok().body("수락 성공");
    }

    @PutMapping("/reject/{memberRecruitInfoId}")
    public ResponseEntity<String> rejectMemberRecruit(@PathVariable int memberRecruitInfoId) {

        MemberRecruitsInfoDTO memberRecruit = memberRecruitsInfoService.rejectMemberRecruit(memberRecruitInfoId);

//        return ResponseEntity.ok(memberRecruit);
        return ResponseEntity.ok().body("거절 성공");
    }

    @DeleteMapping("/{memberRecruitInfoId}")
    public ResponseEntity<?> deleteMemberRecruit(@PathVariable int memberRecruitInfoId) {

        memberRecruitsInfoService.deleteMemberRecruit(memberRecruitInfoId);

        return ResponseEntity
                .noContent()
                .build();
    }

}
