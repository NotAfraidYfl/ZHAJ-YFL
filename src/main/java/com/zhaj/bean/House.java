package com.zhaj.bean;

import java.util.Date;

public class House {
	// ����ID
	private String housesId;
	// ��������
	private String houOwner;
	// �����绰
	private String ownerTel;
	// ʡ
	private String houProvince;
	// ��
	private String houCity;
	// ��
	private String houDistrict;
	// ��ϸ��ַ
	private String houDetail;
	// ��������
	private String houDescription;
	// ��������
	private String owenerEmail;
	// ͼƬ·��
	private String houPhotos;
	// ���޻��߳��ۼ۸�
	private Float houPrice;
	// ����ʱ��
	private Date putDate;
	// ��������¥��
	private Integer houFloor;
	// ������¥��
	private Integer totalFloors;
	// ���� 1.һ�� 2.���� 3.����
	private Integer houType;
	// �������� 0 --���ַ� 1 --���ⷿ
	private Integer houCatg;
	// ����Ա��Id
	private String empId;
	// ����״̬
	private Integer houStatus;

	// �����вι�����
	public House(String housesId, String houOwner, String ownerTel, String houProvince, String houCity,
			String houDistrict, String houDetail, String houDescription, String owenerEmail, String houPhotos,
			Float houPrice, Date putDate, Integer houFloor, Integer totalFloors, Integer houType, Integer houCatg,
			String empId, Integer houStatus) {
		super();
		this.housesId = housesId;
		this.houOwner = houOwner;
		this.ownerTel = ownerTel;
		this.houProvince = houProvince;
		this.houCity = houCity;
		this.houDistrict = houDistrict;
		this.houDetail = houDetail;
		this.houDescription = houDescription;
		this.owenerEmail = owenerEmail;
		this.houPhotos = houPhotos;
		this.houPrice = houPrice;
		this.putDate = putDate;
		this.houFloor = houFloor;
		this.totalFloors = totalFloors;
		this.houType = houType;
		this.houCatg = houCatg;
		this.empId = empId;
		this.houStatus = houStatus;
	}

	public House() {
		super();
	}

	public String getHousesId() {
		return housesId;
	}

	public void setHousesId(String housesId) {
		this.housesId = housesId == null ? null : housesId.trim();
	}

	public String getHouOwner() {
		return houOwner;
	}

	public void setHouOwner(String houOwner) {
		this.houOwner = houOwner == null ? null : houOwner.trim();
	}

	public String getOwnerTel() {
		return ownerTel;
	}

	public void setOwnerTel(String ownerTel) {
		this.ownerTel = ownerTel == null ? null : ownerTel.trim();
	}

	public String getHouProvince() {
		return houProvince;
	}

	public void setHouProvince(String houProvince) {
		this.houProvince = houProvince == null ? null : houProvince.trim();
	}

	public String getHouCity() {
		return houCity;
	}

	public void setHouCity(String houCity) {
		this.houCity = houCity == null ? null : houCity.trim();
	}

	public String getHouDistrict() {
		return houDistrict;
	}

	public void setHouDistrict(String houDistrict) {
		this.houDistrict = houDistrict == null ? null : houDistrict.trim();
	}

	public String getHouDetail() {
		return houDetail;
	}

	public void setHouDetail(String houDetail) {
		this.houDetail = houDetail == null ? null : houDetail.trim();
	}

	public String getHouDescription() {
		return houDescription;
	}

	public void setHouDescription(String houDescription) {
		this.houDescription = houDescription == null ? null : houDescription.trim();
	}

	public String getOwenerEmail() {
		return owenerEmail;
	}

	public void setOwenerEmail(String owenerEmail) {
		this.owenerEmail = owenerEmail == null ? null : owenerEmail.trim();
	}

	public String getHouPhotos() {
		return houPhotos;
	}

	public void setHouPhotos(String houPhotos) {
		this.houPhotos = houPhotos == null ? null : houPhotos.trim();
	}

	public Float getHouPrice() {
		return houPrice;
	}

	public void setHouPrice(Float houPrice) {
		this.houPrice = houPrice;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Integer getHouFloor() {
		return houFloor;
	}

	public void setHouFloor(Integer houFloor) {
		this.houFloor = houFloor;
	}

	public Integer getTotalFloors() {
		return totalFloors;
	}

	public void setTotalFloors(Integer totalFloors) {
		this.totalFloors = totalFloors;
	}

	public Integer getHouType() {
		return houType;
	}

	public void setHouType(Integer houType) {
		this.houType = houType;
	}

	public Integer getHouCatg() {
		return houCatg;
	}

	public void setHouCatg(Integer houCatg) {
		this.houCatg = houCatg;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId == null ? null : empId.trim();
	}

	public Integer getHouStatus() {
		return houStatus;
	}

	public void setHouStatus(Integer houStatus) {
		this.houStatus = houStatus;
	}
}