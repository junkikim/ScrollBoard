package com.scrollboard.springboot.paging;

import org.springframework.data.domain.Sort.Direction;

public class PageRequest {

	private int page;
	private int size;
	private Direction direction;
	private String[] properties;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page <= 0 ? 1 : page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		int DEFAULT_SIZE = 10;
		int MAX_SIZE = 50;
		this.size = size > MAX_SIZE ? DEFAULT_SIZE : size;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public String[] getProperties() {
		return properties;
	}

	public void setProperties(String[] properties) {
		this.properties = properties;
	}

	public org.springframework.data.domain.PageRequest of() {
		return org.springframework.data.domain.PageRequest.of(page-1, size, direction, properties);
	}

	@Override
	public String toString() {
		return "PageRequest [page=" + page + ", size=" + size + ", direction=" + direction + ", properties="
				+ properties + "]";
	}

	
	
}
