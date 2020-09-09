package com.board.anon.service;

import com.board.anon.entity.BoardEntity;
import com.board.anon.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoardImpl implements BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<BoardEntity> allContents() {
        return boardRepository.findAll();
    }
}
