package com.team3.itability.mypage.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
@ToString
@EqualsAndHashCode
public class memberRecruitCategoryId implements Serializable {
    @Column(name = "member_id")
    private Long memberId;
    @Column(name = "recruit_category_id")
    private Integer recruitCategoryId;

}
