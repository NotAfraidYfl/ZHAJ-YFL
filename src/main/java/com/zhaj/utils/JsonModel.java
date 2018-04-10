package com.zhaj.utils;

/**
 * 
 * 一个通用的返回json数据的类
 * 
 * @author yfl
 *
 */
public class JsonModel {

	private Integer code;
	private String info;
	private Integer total;
	private Object data;
	private Integer page;

	/**
	 * 设置错误信息并返回
	 * 
	 * @param code
	 * @param info
	 * @return
	 */
	public JsonModel error(Integer code, String info) {
		this.code = code;
		this.info = info;
		return this;
	}

	/**
	 * @return 0：成功；大于0 ：成功但有一些提示性消息；小于0：出错了
	 */
	public int getCode() {
		return code == null ? 0 : code;
	}

	/**
	 * @param code
	 *            0：成功；大于0 ：成功但有一些提示性消息；小于0：出错了
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return 数据总条数(用于分页)
	 */
	public Integer getTotal() {
		return total == null ? 0 : total;
	}

	/**
	 * @param total
	 *            数据总条数(用于分页)
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * @return 提示或错误消息
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info
	 *            提示或错误消息
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * @return 数据：对象或对象数组
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data
	 *            数据：对象或对象数组
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return 返回的数据的页数
	 */
	public Integer getPage() {
		return page == null ? 0 : page;
	}

	/**
	 * @param page
	 *            返回的数据的页数
	 */
	public void setPage(Integer page) {
		this.page = page;
	}
}
