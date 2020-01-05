package com.scrollboard.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrollboard.springboot.model.BoardCategory;

@Repository
public interface BoardCategoryRepository extends JpaRepository<BoardCategory, Integer> {

}
