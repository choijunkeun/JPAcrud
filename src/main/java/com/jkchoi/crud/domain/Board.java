package com.jkchoi.crud.domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Board {

    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;

    @Builder
    public Board(String userName, String password, String title, String content) {
        this.userName = userName;
        this.password = password;
        this.title = title;
        this.content = content;
    }

}
