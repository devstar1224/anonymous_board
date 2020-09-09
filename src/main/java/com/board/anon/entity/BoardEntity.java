package com.board.anon.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Table (name = "BOARD")
public class BoardEntity {

    @Id
    @Column(name = "BOARD_ID")
    private int boardId;

    @Column(name = "BOARD_TITLE")
    private String title;

    @Column(name = "BOARD_CONTENT")
    private String content;

    @Column(name = "BOARD_DATE")
    private Date date;

    @Column(name = "BOARD_PASSWORD")
    private String password;

}
