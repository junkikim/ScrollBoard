package com.scrollboard.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scrollboard.springboot.Repository.BoardRepository;
import com.scrollboard.springboot.model.Board;

@Controller
public class BoardController {
	
	@Autowired
	BoardRepository boardRepository;
	
	@RequestMapping(path="/boardlist", method=RequestMethod.GET)
	public @ResponseBody String boardList() {
		
		List<Board> boardList = null;
		boardList = boardRepository.findAll();
		
		System.out.println(boardList.size());
		
		for(Board board : boardList) {
			System.out.println(board);
		}
		
		
		String result = null;
		
		return result;
	}

}
