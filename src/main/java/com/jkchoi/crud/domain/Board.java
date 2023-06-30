package com.jkchoi.crud.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor  // 기본생성자
@AllArgsConstructor // 모든 필드값을 받는 생성자
public class Board {    // 게시글 객체

    @Id @GeneratedValue
    @Column(name = "board_id")
    private Long id;
    @Column(name = "name", nullable = false)    // 데이터베이스 컬럼명은 name
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private LocalDateTime createdDate;
    @Column(nullable = false)
    private LocalDateTime modifiedDate;


}
