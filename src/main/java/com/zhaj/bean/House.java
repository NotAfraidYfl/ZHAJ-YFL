package com.zhaj.bean;

import java.util.Date;

public class House {
	// 房屋ID
	private String housesId;
	// 房东姓名
	private String houOwner;
	// 房东电话
	private String ownerTel;
	// 省
	private String houProvince;
	// 市
	private String houCity;
	// 区
	private String houDistrict;
	// 详细地址
	private String houDetail;
	// 房屋描述
	private String houDescription;
	// 房东邮箱
	private String owenerEmail;
	// 图片路径
	private String houPhotos;
	// 租赁或者出售价格
	private Float houPrice;
	// 发布时间
	private Date putDate;
	// 房屋所在楼层
	private Integer houFloor;
	// 房屋总楼层
	private Integer totalFloors;
	// 房型 1.一室 2.两室 3.三室
	private Integer houType;
	// 房屋类型 0 --二手房 1 --出租房
	private Integer houCatg;
	// 负责员工Id
	private String empId;
	// 房屋状态
	private Integer houStatus;

	// 生成有参构造器
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