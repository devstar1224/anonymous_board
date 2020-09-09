package com.board.anon.dto;

import com.board.anon.entity.BoardEntity;

import java.util.Date;

public class BoardDto {
    private int boardId;

    private String title;

    private String content;

    private Date date;

    private String password;

    public BoardDto(BoardEntity board) {
        this.boardId = board.getBoardId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.date = board.getDate();
        this.password = board.getPassword();
    }
}
