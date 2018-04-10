package com.zhaj.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PageModel {
	private Integer pageNum = 1;
	private Integer pageSize = 10;
	private String orderBy;

	@JsonIgnore
	public Integer getPageNum() {
		return pageNum == null ? 0 : pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	@JsonIgnore
	public Integer getPageSize() {
		return pageSize == null ? 0 : pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@JsonIgnore
	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

}
