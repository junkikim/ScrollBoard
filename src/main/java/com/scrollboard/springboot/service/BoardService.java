package com.scrollboard.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.scrollboard.springboot.model.Board;
import com.scrollboard.springboot.model.BoardCategory;

public interface BoardService {
	Page<Board> getBaordList(List<BoardCategory> boardcategory, Pageable pageable);
}
