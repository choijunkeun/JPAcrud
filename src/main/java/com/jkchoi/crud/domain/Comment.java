package com.jkchoi.crud.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Comment {

    // @Id  기본키(PK)로 지정한다는 뜻
    // @GeneratedValue 기본키(PK) 값에 대한 생성 전략 제공, 기본값은 AUTO

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;
    // columnDefinition -> 데이터베이스 컬럼 정보를 직접 준다.
    @Column(columnDefinition = "TEXT", nullable = false)
    private String comment; // 댓글 내용
    @Column(nullable = false)
    private LocalDateTime createdDate;
    @Column(nullable = false)
    private LocalDateTime modifiedDate;




}
