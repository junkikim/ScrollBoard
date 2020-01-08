package com.scrollboard.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scrollboard.springboot.model.Board;
import com.scrollboard.springboot.model.BoardCategory;
import com.scrollboard.springboot.paging.PageRequest;
import com.scrollboard.springboot.service.BoardCategoryService;
import com.scrollboard.springboot.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@Autowired
	BoardCategoryService boardCategoryService; 

	/**
	 * 게시글 목록을 가져와 JSON 형식으로 반환</br>
	 * Spring Data API에서 Pageable 인터페이스를 구현하여 만든 AbstractPageRequest 클래스로 부터 상속받은 PageRequest를 사용하여 페이징 처리하였음. 
	 * @param pageable page, size, Direction, properties 맴버 변수를 가지고 있음.
	 * @param boardCategories 사용자가 선택한 카테고리
	 * @return boardList와 page정보
	 */
	@ResponseBody
	@RequestMapping(path = "/boardlist", method = RequestMethod.GET)
	public Page<Board> boardList(PageRequest pageable,
			@RequestParam(name = "categoryNo") List<BoardCategory> boardCategories) {

		Page<Board> boardPage = null;
		boardPage = boardService.getBaordList(boardCategories, pageable.of());

		return boardPage;
	}
	
	/**
	 * 게시글의 카테고리를 가져와 JSON 형식으로 반환
	 * @return List<Category> 형태를 반환
	 */
	@ResponseBody
	@RequestMapping(path = "/category", method = RequestMethod.GET)
	public List<BoardCategory> categoryList() {
		List<BoardCategory> categories = null;
		categories = boardCategoryService.getCategories();
		return categories;
	}
	
}
