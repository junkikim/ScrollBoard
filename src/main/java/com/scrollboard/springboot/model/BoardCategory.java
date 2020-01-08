package com.scrollboard.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "board_category")
public class BoardCategory {

	@Id
	@Column(name = "category_no")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int categoryNo;

	@Column(name = "category_name")
	private String categoryName;


	public BoardCategory() {
	}

	public BoardCategory(int categoryNo, String categoryName) {
		this.categoryNo = categoryNo;
		this.categoryName = categoryName;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "BoardCategory [categoryNo=" + categoryNo + ", categoryName=" + categoryName + "]";
	}

}
