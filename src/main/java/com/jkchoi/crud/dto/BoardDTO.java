package com.jkchoi.crud.dto;


import com.jkchoi.crud.domain.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor  // 매개변수가 없는 기본생성자를 생성해주는 어노테이션
public class BoardDTO {

    private Long id;
    private String userName;
    private String password;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    @Builder
    public BoardDTO(Long id, String userName, String password, String title, String content, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Board build(){
        return Board.builder()
                .userName(userName)
                .password(password)
                .title(title)
                .content(content)
                .build();
    }


}
