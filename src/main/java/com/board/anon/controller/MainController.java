package com.board.anon.controller;


import com.board.anon.dto.BoardDto;
import com.board.anon.entity.BoardEntity;
import com.board.anon.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private BoardService boardService;

    @GetMapping(value = "/board/list.do")
    public @ResponseBody
    List<BoardEntity> indexPage() {
        return boardService.allContents();
    }
}
