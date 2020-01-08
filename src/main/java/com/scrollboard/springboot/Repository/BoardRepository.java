package com.scrollboard.springboot.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrollboard.springboot.model.Board;
import com.scrollboard.springboot.model.BoardCategory;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
	Page<Board> findByBoardCategoryIn(List<BoardCategory> boardcategories, Pageable pageable);
}
