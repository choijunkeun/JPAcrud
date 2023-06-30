package com.jkchoi.crud.service;


import com.jkchoi.crud.domain.Board;
import com.jkchoi.crud.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor            // (final 붙은 필드를 찾아서) 생성자를 통한 의존성 주입을 자동으로 해준다.
@Transactional(readOnly = true)     // DB관련 작업은 트랜젝션 안에서 수행되어야함
public class BoardService {

    private final BoardRepository boardRepository;

    public List<Board> findBoardList() {
        return boardRepository.findAllList();
    }


}
