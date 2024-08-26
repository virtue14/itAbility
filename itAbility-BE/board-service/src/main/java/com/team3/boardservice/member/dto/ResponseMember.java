package com.team3.boardservice.member.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;

@Data
public class ResponseMember {

    private long memberId;

    private String username;

    private String email;

    private String role;

    private String name;

    private String birthDate;

    private String picture;

    private String phone;

    private boolean blacklistStatus;

    private int blacklistCount;

    private int mbReportCount;
}