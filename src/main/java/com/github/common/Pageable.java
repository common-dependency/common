package com.github.common;

import java.util.List;


public class Pageable<T> {
	
	private Integer pageIndex;
	
	private Integer pageCount;
	
	private Integer totalCount;
	
	private List<T> list;
	
	
	

	public Pageable(Integer pageIndex, Integer pageCount, Integer totalCount, List<T> list) {
		this.pageIndex = pageIndex;
		this.pageCount = pageCount;
		this.totalCount = totalCount;
		this.list = list;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	


	

}