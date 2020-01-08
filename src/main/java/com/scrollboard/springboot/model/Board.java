package com.scrollboard.springboot.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="board")
public class Board {

	@Id
	@Column(name = "board_no")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int boardNo;

	@OneToOne
	@JoinColumn(name = "user_id")
	private Users users;

	@OneToOne
	@JoinColumn(name = "category_no")
	private BoardCategory boardCategory;

	@Column(name = "write_date")
	private Date writeDate;

	@Column(name = "title")
	private String title;

	@Column(name = "contents")
	private String contents;

	public Board() {
	}

	public Board(int boardNo, Users users, BoardCategory boardCategory, Date writeDate, String title, String contents) {
		this.boardNo = boardNo;
		this.users = users;
		this.boardCategory = boardCategory;
		this.writeDate = writeDate;
		this.title = title;
		this.contents = contents;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public BoardCategory getBoardCategory() {
		return boardCategory;
	}

	public void setBoardCategory(BoardCategory boardCategory) {
		this.boardCategory = boardCategory;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", users=" + users + ", boardCategory=" + boardCategory + ", writeDate="
				+ writeDate + ", title=" + title + ", contents=" + contents + "]";
	}
	
	

}