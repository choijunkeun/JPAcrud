package com.jkchoi.crud.repository;

import com.jkchoi.crud.domain.Board;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


@Repository
public class BoardRepository {
        @PersistenceContext
        private EntityManager em;

        // 게시물 저장
        public Long save(Board board) {   // 커맨드랑 쿼리랑 분리해라, 리턴값을 Id정도만 조회하는걸로 설계한다. (김영한 스타일)
            em.persist(board);
            return board.getId();
        }

        public Board find(Long id) {
            return em.find(Board.class, id);
        }
    }