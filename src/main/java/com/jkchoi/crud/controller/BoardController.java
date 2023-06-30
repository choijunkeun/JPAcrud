package com.jkchoi.crud.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @GetMapping("/board")
    public String board(Model model) {
//        model.addAttribute("boardList", boardList);
        return "board";
    }

    @PostMapping("/board")
    public String boardSave(Model model) {


        return "/";
    }



}
