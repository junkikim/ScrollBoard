package com.scrollboard.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.scrollboard.springboot.Repository.BoardRepository;
import com.scrollboard.springboot.model.Board;
import com.scrollboard.springboot.model.BoardCategory;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardRepository boardRepository;

	@Override
	public Page<Board> getBaordList(List<BoardCategory> boardCategories, Pageable pageable) {
		return boardRepository.findByBoardCategoryIn(boardCategories,pageable);
	}

}
