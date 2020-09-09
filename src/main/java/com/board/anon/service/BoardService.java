package com.board.anon.service;

import com.board.anon.entity.BoardEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BoardService {
    List<BoardEntity> allContents();
}
