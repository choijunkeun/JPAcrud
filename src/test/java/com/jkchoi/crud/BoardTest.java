package com.jkchoi.crud;

import com.jkchoi.crud.domain.Board;
import com.jkchoi.crud.repository.BoardRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootTest
class BoardTest {


    @Autowired
    BoardRepository boardrepository;

    @Test
    @Transactional      // 트랜잭션 어노테이션이 테스트에 있으면 테스트 끝난 후 롤백해버림.
    @Rollback(false)    // 트랜잭션 롤백을 false로 바꿈
    void save() throws Exception {
        // given
        Board board = Board.builder()
                .author("작성자")
                .title("제목이다")
                .content("내용이다")
                .password("123456")
                .createdDate(LocalDateTime.now())
                .modifiedDate(LocalDateTime.now())
                .build();

        // when
        Long saveId = boardrepository.save(board);
        Board findBoard = boardrepository.find(saveId);

        List<Board> findBoardList = boardrepository.findAllList();

        findBoardList.forEach((list) -> {
            System.out.println("list = " + list.toString());
        });

        // then
        Assertions.assertThat(findBoard.getId()).isEqualTo(board.getId());
        Assertions.assertThat(findBoard.getAuthor()).isEqualTo(board.getAuthor());
        Assertions.assertThat(findBoard).isEqualTo(board);
        System.out.println("findBoard == member : " + (findBoard == board));

    }

}