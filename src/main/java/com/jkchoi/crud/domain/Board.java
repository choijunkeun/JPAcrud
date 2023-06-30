package com.jkchoi.crud.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity     // JPA를 사용하는 객체
@Getter
@Setter
@NoArgsConstructor  // 기본생성자
@AllArgsConstructor // 모든 필드값을 받는 생성자
@Builder
@SequenceGenerator(
        name = "BOARD_SEQ_GENERATOR",
        sequenceName = "BOARD_SEQ",
        initialValue = 1, allocationSize =1)
public class Board {    // 게시글 객체

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOARD_SEQ_GENERATOR")
    @Column(name = "board_id")
    private Long id;

    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private LocalDateTime createdDate;
    @Column(nullable = false)
    private LocalDateTime modifiedDate;

}
