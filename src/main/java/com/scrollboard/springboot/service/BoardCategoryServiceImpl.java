package com.scrollboard.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrollboard.springboot.Repository.BoardCategoryRepository;
import com.scrollboard.springboot.model.BoardCategory;

@Service
public class BoardCategoryServiceImpl implements BoardCategoryService {

	@Autowired
	BoardCategoryRepository boardCategoryRepository;
	
	@Override
	public List<BoardCategory> getCategories() {
		return boardCategoryRepository.findAll();
	}

}
