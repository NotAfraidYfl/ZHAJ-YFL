package com.zhaj.utils;

/**
 * 
 * һ��ͨ�õķ���json���ݵ���
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
	 * ���ô�����Ϣ������
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
	 * @return 0���ɹ�������0 ���ɹ�����һЩ��ʾ����Ϣ��С��0��������
	 */
	public int getCode() {
		return code == null ? 0 : code;
	}

	/**
	 * @param code
	 *            0���ɹ�������0 ���ɹ�����һЩ��ʾ����Ϣ��С��0��������
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return ����������(���ڷ�ҳ)
	 */
	public Integer getTotal() {
		return total == null ? 0 : total;
	}

	/**
	 * @param total
	 *            ����������(���ڷ�ҳ)
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * @return ��ʾ�������Ϣ
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info
	 *            ��ʾ�������Ϣ
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * @return ���ݣ�������������
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data
	 *            ���ݣ�������������
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return ���ص����ݵ�ҳ��
	 */
	public Integer getPage() {
		return page == null ? 0 : page;
	}

	/**
	 * @param page
	 *            ���ص����ݵ�ҳ��
	 */
	public void setPage(Integer page) {
		this.page = page;
	}
}
