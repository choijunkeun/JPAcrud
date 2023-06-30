package com.jkchoi.crud.controller;


import com.jkchoi.crud.domain.Board;
import com.jkchoi.crud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;


    @GetMapping("/board")
    public String board(Model model) {

        List<Board> boardList = boardService.findBoardList();
        model.addAttribute("boardList", boardList);

        return "board";
    }

//    @PostMapping("/board")
//    public String boardSave(Model model) {
//
//
//        return "/";
//    }



}
