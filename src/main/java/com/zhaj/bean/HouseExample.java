package com.zhaj.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHousesIdIsNull() {
            addCriterion("houses_id is null");
            return (Criteria) this;
        }

        public Criteria andHousesIdIsNotNull() {
            addCriterion("houses_id is not null");
            return (Criteria) this;
        }

        public Criteria andHousesIdEqualTo(String value) {
            addCriterion("houses_id =", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdNotEqualTo(String value) {
            addCriterion("houses_id <>", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdGreaterThan(String value) {
            addCriterion("houses_id >", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdGreaterThanOrEqualTo(String value) {
            addCriterion("houses_id >=", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdLessThan(String value) {
            addCriterion("houses_id <", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdLessThanOrEqualTo(String value) {
            addCriterion("houses_id <=", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdLike(String value) {
            addCriterion("houses_id like", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdNotLike(String value) {
            addCriterion("houses_id not like", value, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdIn(List<String> values) {
            addCriterion("houses_id in", values, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdNotIn(List<String> values) {
            addCriterion("houses_id not in", values, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdBetween(String value1, String value2) {
            addCriterion("houses_id between", value1, value2, "housesId");
            return (Criteria) this;
        }

        public Criteria andHousesIdNotBetween(String value1, String value2) {
            addCriterion("houses_id not between", value1, value2, "housesId");
            return (Criteria) this;
        }

        public Criteria andHouOwnerIsNull() {
            addCriterion("hou_owner is null");
            return (Criteria) this;
        }

        public Criteria andHouOwnerIsNotNull() {
            addCriterion("hou_owner is not null");
            return (Criteria) this;
        }

        public Criteria andHouOwnerEqualTo(String value) {
            addCriterion("hou_owner =", value, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerNotEqualTo(String value) {
            addCriterion("hou_owner <>", value, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerGreaterThan(String value) {
            addCriterion("hou_owner >", value, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("hou_owner >=", value, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerLessThan(String value) {
            addCriterion("hou_owner <", value, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerLessThanOrEqualTo(String value) {
            addCriterion("hou_owner <=", value, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerLike(String value) {
            addCriterion("hou_owner like", value, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerNotLike(String value) {
            addCriterion("hou_owner not like", value, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerIn(List<String> values) {
            addCriterion("hou_owner in", values, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerNotIn(List<String> values) {
            addCriterion("hou_owner not in", values, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerBetween(String value1, String value2) {
            addCriterion("hou_owner between", value1, value2, "houOwner");
            return (Criteria) this;
        }

        public Criteria andHouOwnerNotBetween(String value1, String value2) {
            addCriterion("hou_owner not between", value1, value2, "houOwner");
            return (Criteria) this;
        }

        public Criteria andOwnerTelIsNull() {
            addCriterion("owner_tel is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTelIsNotNull() {
            addCriterion("owner_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTelEqualTo(String value) {
            addCriterion("owner_tel =", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelNotEqualTo(String value) {
            addCriterion("owner_tel <>", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelGreaterThan(String value) {
            addCriterion("owner_tel >", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelGreaterThanOrEqualTo(String value) {
            addCriterion("owner_tel >=", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelLessThan(String value) {
            addCriterion("owner_tel <", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelLessThanOrEqualTo(String value) {
            addCriterion("owner_tel <=", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelLike(String value) {
            addCriterion("owner_tel like", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelNotLike(String value) {
            addCriterion("owner_tel not like", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelIn(List<String> values) {
            addCriterion("owner_tel in", values, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelNotIn(List<String> values) {
            addCriterion("owner_tel not in", values, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelBetween(String value1, String value2) {
            addCriterion("owner_tel between", value1, value2, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelNotBetween(String value1, String value2) {
            addCriterion("owner_tel not between", value1, value2, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andHouProvinceIsNull() {
            addCriterion("hou_province is null");
            return (Criteria) this;
        }

        public Criteria andHouProvinceIsNotNull() {
            addCriterion("hou_province is not null");
            return (Criteria) this;
        }

        public Criteria andHouProvinceEqualTo(String value) {
            addCriterion("hou_province =", value, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceNotEqualTo(String value) {
            addCriterion("hou_province <>", value, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceGreaterThan(String value) {
            addCriterion("hou_province >", value, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("hou_province >=", value, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceLessThan(String value) {
            addCriterion("hou_province <", value, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceLessThanOrEqualTo(String value) {
            addCriterion("hou_province <=", value, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceLike(String value) {
            addCriterion("hou_province like", value, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceNotLike(String value) {
            addCriterion("hou_province not like", value, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceIn(List<String> values) {
            addCriterion("hou_province in", values, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceNotIn(List<String> values) {
            addCriterion("hou_province not in", values, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceBetween(String value1, String value2) {
            addCriterion("hou_province between", value1, value2, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouProvinceNotBetween(String value1, String value2) {
            addCriterion("hou_province not between", value1, value2, "houProvince");
            return (Criteria) this;
        }

        public Criteria andHouCityIsNull() {
            addCriterion("hou_city is null");
            return (Criteria) this;
        }

        public Criteria andHouCityIsNotNull() {
            addCriterion("hou_city is not null");
            return (Criteria) this;
        }

        public Criteria andHouCityEqualTo(String value) {
            addCriterion("hou_city =", value, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityNotEqualTo(String value) {
            addCriterion("hou_city <>", value, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityGreaterThan(String value) {
            addCriterion("hou_city >", value, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityGreaterThanOrEqualTo(String value) {
            addCriterion("hou_city >=", value, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityLessThan(String value) {
            addCriterion("hou_city <", value, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityLessThanOrEqualTo(String value) {
            addCriterion("hou_city <=", value, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityLike(String value) {
            addCriterion("hou_city like", value, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityNotLike(String value) {
            addCriterion("hou_city not like", value, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityIn(List<String> values) {
            addCriterion("hou_city in", values, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityNotIn(List<String> values) {
            addCriterion("hou_city not in", values, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityBetween(String value1, String value2) {
            addCriterion("hou_city between", value1, value2, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouCityNotBetween(String value1, String value2) {
            addCriterion("hou_city not between", value1, value2, "houCity");
            return (Criteria) this;
        }

        public Criteria andHouDistrictIsNull() {
            addCriterion("hou_district is null");
            return (Criteria) this;
        }

        public Criteria andHouDistrictIsNotNull() {
            addCriterion("hou_district is not null");
            return (Criteria) this;
        }

        public Criteria andHouDistrictEqualTo(String value) {
            addCriterion("hou_district =", value, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictNotEqualTo(String value) {
            addCriterion("hou_district <>", value, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictGreaterThan(String value) {
            addCriterion("hou_district >", value, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("hou_district >=", value, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictLessThan(String value) {
            addCriterion("hou_district <", value, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictLessThanOrEqualTo(String value) {
            addCriterion("hou_district <=", value, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictLike(String value) {
            addCriterion("hou_district like", value, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictNotLike(String value) {
            addCriterion("hou_district not like", value, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictIn(List<String> values) {
            addCriterion("hou_district in", values, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictNotIn(List<String> values) {
            addCriterion("hou_district not in", values, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictBetween(String value1, String value2) {
            addCriterion("hou_district between", value1, value2, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDistrictNotBetween(String value1, String value2) {
            addCriterion("hou_district not between", value1, value2, "houDistrict");
            return (Criteria) this;
        }

        public Criteria andHouDetailIsNull() {
            addCriterion("hou_detail is null");
            return (Criteria) this;
        }

        public Criteria andHouDetailIsNotNull() {
            addCriterion("hou_detail is not null");
            return (Criteria) this;
        }

        public Criteria andHouDetailEqualTo(String value) {
            addCriterion("hou_detail =", value, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailNotEqualTo(String value) {
            addCriterion("hou_detail <>", value, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailGreaterThan(String value) {
            addCriterion("hou_detail >", value, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailGreaterThanOrEqualTo(String value) {
            addCriterion("hou_detail >=", value, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailLessThan(String value) {
            addCriterion("hou_detail <", value, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailLessThanOrEqualTo(String value) {
            addCriterion("hou_detail <=", value, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailLike(String value) {
            addCriterion("hou_detail like", value, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailNotLike(String value) {
            addCriterion("hou_detail not like", value, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailIn(List<String> values) {
            addCriterion("hou_detail in", values, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailNotIn(List<String> values) {
            addCriterion("hou_detail not in", values, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailBetween(String value1, String value2) {
            addCriterion("hou_detail between", value1, value2, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDetailNotBetween(String value1, String value2) {
            addCriterion("hou_detail not between", value1, value2, "houDetail");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionIsNull() {
            addCriterion("hou_description is null");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionIsNotNull() {
            addCriterion("hou_description is not null");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionEqualTo(String value) {
            addCriterion("hou_description =", value, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionNotEqualTo(String value) {
            addCriterion("hou_description <>", value, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionGreaterThan(String value) {
            addCriterion("hou_description >", value, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("hou_description >=", value, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionLessThan(String value) {
            addCriterion("hou_description <", value, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionLessThanOrEqualTo(String value) {
            addCriterion("hou_description <=", value, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionLike(String value) {
            addCriterion("hou_description like", value, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionNotLike(String value) {
            addCriterion("hou_description not like", value, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionIn(List<String> values) {
            addCriterion("hou_description in", values, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionNotIn(List<String> values) {
            addCriterion("hou_description not in", values, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionBetween(String value1, String value2) {
            addCriterion("hou_description between", value1, value2, "houDescription");
            return (Criteria) this;
        }

        public Criteria andHouDescriptionNotBetween(String value1, String value2) {
            addCriterion("hou_description not between", value1, value2, "houDescription");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailIsNull() {
            addCriterion("owener_email is null");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailIsNotNull() {
            addCriterion("owener_email is not null");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailEqualTo(String value) {
            addCriterion("owener_email =", value, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailNotEqualTo(String value) {
            addCriterion("owener_email <>", value, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailGreaterThan(String value) {
            addCriterion("owener_email >", value, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("owener_email >=", value, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailLessThan(String value) {
            addCriterion("owener_email <", value, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailLessThanOrEqualTo(String value) {
            addCriterion("owener_email <=", value, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailLike(String value) {
            addCriterion("owener_email like", value, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailNotLike(String value) {
            addCriterion("owener_email not like", value, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailIn(List<String> values) {
            addCriterion("owener_email in", values, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailNotIn(List<String> values) {
            addCriterion("owener_email not in", values, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailBetween(String value1, String value2) {
            addCriterion("owener_email between", value1, value2, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andOwenerEmailNotBetween(String value1, String value2) {
            addCriterion("owener_email not between", value1, value2, "owenerEmail");
            return (Criteria) this;
        }

        public Criteria andHouPhotosIsNull() {
            addCriterion("hou_photos is null");
            return (Criteria) this;
        }

        public Criteria andHouPhotosIsNotNull() {
            addCriterion("hou_photos is not null");
            return (Criteria) this;
        }

        public Criteria andHouPhotosEqualTo(String value) {
            addCriterion("hou_photos =", value, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosNotEqualTo(String value) {
            addCriterion("hou_photos <>", value, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosGreaterThan(String value) {
            addCriterion("hou_photos >", value, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosGreaterThanOrEqualTo(String value) {
            addCriterion("hou_photos >=", value, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosLessThan(String value) {
            addCriterion("hou_photos <", value, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosLessThanOrEqualTo(String value) {
            addCriterion("hou_photos <=", value, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosLike(String value) {
            addCriterion("hou_photos like", value, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosNotLike(String value) {
            addCriterion("hou_photos not like", value, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosIn(List<String> values) {
            addCriterion("hou_photos in", values, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosNotIn(List<String> values) {
            addCriterion("hou_photos not in", values, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosBetween(String value1, String value2) {
            addCriterion("hou_photos between", value1, value2, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPhotosNotBetween(String value1, String value2) {
            addCriterion("hou_photos not between", value1, value2, "houPhotos");
            return (Criteria) this;
        }

        public Criteria andHouPriceIsNull() {
            addCriterion("hou_price is null");
            return (Criteria) this;
        }

        public Criteria andHouPriceIsNotNull() {
            addCriterion("hou_price is not null");
            return (Criteria) this;
        }

        public Criteria andHouPriceEqualTo(Float value) {
            addCriterion("hou_price =", value, "houPrice");
            return (Criteria) this;
        }

        public Criteria andHouPriceNotEqualTo(Float value) {
            addCriterion("hou_price <>", value, "houPrice");
            return (Criteria) this;
        }

        public Criteria andHouPriceGreaterThan(Float value) {
            addCriterion("hou_price >", value, "houPrice");
            return (Criteria) this;
        }

        public Criteria andHouPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("hou_price >=", value, "houPrice");
            return (Criteria) this;
        }

        public Criteria andHouPriceLessThan(Float value) {
            addCriterion("hou_price <", value, "houPrice");
            return (Criteria) this;
        }

        public Criteria andHouPriceLessThanOrEqualTo(Float value) {
            addCriterion("hou_price <=", value, "houPrice");
            return (Criteria) this;
        }

        public Criteria andHouPriceIn(List<Float> values) {
            addCriterion("hou_price in", values, "houPrice");
            return (Criteria) this;
        }

        public Criteria andHouPriceNotIn(List<Float> values) {
            addCriterion("hou_price not in", values, "houPrice");
            return (Criteria) this;
        }

        public Criteria andHouPriceBetween(Float value1, Float value2) {
            addCriterion("hou_price between", value1, value2, "houPrice");
            return (Criteria) this;
        }

        public Criteria andHouPriceNotBetween(Float value1, Float value2) {
            addCriterion("hou_price not between", value1, value2, "houPrice");
            return (Criteria) this;
        }

        public Criteria andPutDateIsNull() {
            addCriterion("put_date is null");
            return (Criteria) this;
        }

        public Criteria andPutDateIsNotNull() {
            addCriterion("put_date is not null");
            return (Criteria) this;
        }

        public Criteria andPutDateEqualTo(Date value) {
            addCriterion("put_date =", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateNotEqualTo(Date value) {
            addCriterion("put_date <>", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateGreaterThan(Date value) {
            addCriterion("put_date >", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("put_date >=", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateLessThan(Date value) {
            addCriterion("put_date <", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateLessThanOrEqualTo(Date value) {
            addCriterion("put_date <=", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateIn(List<Date> values) {
            addCriterion("put_date in", values, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateNotIn(List<Date> values) {
            addCriterion("put_date not in", values, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateBetween(Date value1, Date value2) {
            addCriterion("put_date between", value1, value2, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateNotBetween(Date value1, Date value2) {
            addCriterion("put_date not between", value1, value2, "putDate");
            return (Criteria) this;
        }

        public Criteria andHouFloorIsNull() {
            addCriterion("hou_floor is null");
            return (Criteria) this;
        }

        public Criteria andHouFloorIsNotNull() {
            addCriterion("hou_floor is not null");
            return (Criteria) this;
        }

        public Criteria andHouFloorEqualTo(Integer value) {
            addCriterion("hou_floor =", value, "houFloor");
            return (Criteria) this;
        }

        public Criteria andHouFloorNotEqualTo(Integer value) {
            addCriterion("hou_floor <>", value, "houFloor");
            return (Criteria) this;
        }

        public Criteria andHouFloorGreaterThan(Integer value) {
            addCriterion("hou_floor >", value, "houFloor");
            return (Criteria) this;
        }

        public Criteria andHouFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("hou_floor >=", value, "houFloor");
            return (Criteria) this;
        }

        public Criteria andHouFloorLessThan(Integer value) {
            addCriterion("hou_floor <", value, "houFloor");
            return (Criteria) this;
        }

        public Criteria andHouFloorLessThanOrEqualTo(Integer value) {
            addCriterion("hou_floor <=", value, "houFloor");
            return (Criteria) this;
        }

        public Criteria andHouFloorIn(List<Integer> values) {
            addCriterion("hou_floor in", values, "houFloor");
            return (Criteria) this;
        }

        public Criteria andHouFloorNotIn(List<Integer> values) {
            addCriterion("hou_floor not in", values, "houFloor");
            return (Criteria) this;
        }

        public Criteria andHouFloorBetween(Integer value1, Integer value2) {
            addCriterion("hou_floor between", value1, value2, "houFloor");
            return (Criteria) this;
        }

        public Criteria andHouFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("hou_floor not between", value1, value2, "houFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsIsNull() {
            addCriterion("total_floors is null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsIsNotNull() {
            addCriterion("total_floors is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsEqualTo(Integer value) {
            addCriterion("total_floors =", value, "totalFloors");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsNotEqualTo(Integer value) {
            addCriterion("total_floors <>", value, "totalFloors");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsGreaterThan(Integer value) {
            addCriterion("total_floors >", value, "totalFloors");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_floors >=", value, "totalFloors");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsLessThan(Integer value) {
            addCriterion("total_floors <", value, "totalFloors");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsLessThanOrEqualTo(Integer value) {
            addCriterion("total_floors <=", value, "totalFloors");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsIn(List<Integer> values) {
            addCriterion("total_floors in", values, "totalFloors");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsNotIn(List<Integer> values) {
            addCriterion("total_floors not in", values, "totalFloors");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsBetween(Integer value1, Integer value2) {
            addCriterion("total_floors between", value1, value2, "totalFloors");
            return (Criteria) this;
        }

        public Criteria andTotalFloorsNotBetween(Integer value1, Integer value2) {
            addCriterion("total_floors not between", value1, value2, "totalFloors");
            return (Criteria) this;
        }

        public Criteria andHouTypeIsNull() {
            addCriterion("hou_type is null");
            return (Criteria) this;
        }

        public Criteria andHouTypeIsNotNull() {
            addCriterion("hou_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouTypeEqualTo(Integer value) {
            addCriterion("hou_type =", value, "houType");
            return (Criteria) this;
        }

        public Criteria andHouTypeNotEqualTo(Integer value) {
            addCriterion("hou_type <>", value, "houType");
            return (Criteria) this;
        }

        public Criteria andHouTypeGreaterThan(Integer value) {
            addCriterion("hou_type >", value, "houType");
            return (Criteria) this;
        }

        public Criteria andHouTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hou_type >=", value, "houType");
            return (Criteria) this;
        }

        public Criteria andHouTypeLessThan(Integer value) {
            addCriterion("hou_type <", value, "houType");
            return (Criteria) this;
        }

        public Criteria andHouTypeLessThanOrEqualTo(Integer value) {
            addCriterion("hou_type <=", value, "houType");
            return (Criteria) this;
        }

        public Criteria andHouTypeIn(List<Integer> values) {
            addCriterion("hou_type in", values, "houType");
            return (Criteria) this;
        }

        public Criteria andHouTypeNotIn(List<Integer> values) {
            addCriterion("hou_type not in", values, "houType");
            return (Criteria) this;
        }

        public Criteria andHouTypeBetween(Integer value1, Integer value2) {
            addCriterion("hou_type between", value1, value2, "houType");
            return (Criteria) this;
        }

        public Criteria andHouTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("hou_type not between", value1, value2, "houType");
            return (Criteria) this;
        }

        public Criteria andHouCatgIsNull() {
            addCriterion("hou_catg is null");
            return (Criteria) this;
        }

        public Criteria andHouCatgIsNotNull() {
            addCriterion("hou_catg is not null");
            return (Criteria) this;
        }

        public Criteria andHouCatgEqualTo(Integer value) {
            addCriterion("hou_catg =", value, "houCatg");
            return (Criteria) this;
        }

        public Criteria andHouCatgNotEqualTo(Integer value) {
            addCriterion("hou_catg <>", value, "houCatg");
            return (Criteria) this;
        }

        public Criteria andHouCatgGreaterThan(Integer value) {
            addCriterion("hou_catg >", value, "houCatg");
            return (Criteria) this;
        }

        public Criteria andHouCatgGreaterThanOrEqualTo(Integer value) {
            addCriterion("hou_catg >=", value, "houCatg");
            return (Criteria) this;
        }

        public Criteria andHouCatgLessThan(Integer value) {
            addCriterion("hou_catg <", value, "houCatg");
            return (Criteria) this;
        }

        public Criteria andHouCatgLessThanOrEqualTo(Integer value) {
            addCriterion("hou_catg <=", value, "houCatg");
            return (Criteria) this;
        }

        public Criteria andHouCatgIn(List<Integer> values) {
            addCriterion("hou_catg in", values, "houCatg");
            return (Criteria) this;
        }

        public Criteria andHouCatgNotIn(List<Integer> values) {
            addCriterion("hou_catg not in", values, "houCatg");
            return (Criteria) this;
        }

        public Criteria andHouCatgBetween(Integer value1, Integer value2) {
            addCriterion("hou_catg between", value1, value2, "houCatg");
            return (Criteria) this;
        }

        public Criteria andHouCatgNotBetween(Integer value1, Integer value2) {
            addCriterion("hou_catg not between", value1, value2, "houCatg");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("emp_id like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("emp_id not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andHouStatusIsNull() {
            addCriterion("hou_status is null");
            return (Criteria) this;
        }

        public Criteria andHouStatusIsNotNull() {
            addCriterion("hou_status is not null");
            return (Criteria) this;
        }

        public Criteria andHouStatusEqualTo(Integer value) {
            addCriterion("hou_status =", value, "houStatus");
            return (Criteria) this;
        }

        public Criteria andHouStatusNotEqualTo(Integer value) {
            addCriterion("hou_status <>", value, "houStatus");
            return (Criteria) this;
        }

        public Criteria andHouStatusGreaterThan(Integer value) {
            addCriterion("hou_status >", value, "houStatus");
            return (Criteria) this;
        }

        public Criteria andHouStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("hou_status >=", value, "houStatus");
            return (Criteria) this;
        }

        public Criteria andHouStatusLessThan(Integer value) {
            addCriterion("hou_status <", value, "houStatus");
            return (Criteria) this;
        }

        public Criteria andHouStatusLessThanOrEqualTo(Integer value) {
            addCriterion("hou_status <=", value, "houStatus");
            return (Criteria) this;
        }

        public Criteria andHouStatusIn(List<Integer> values) {
            addCriterion("hou_status in", values, "houStatus");
            return (Criteria) this;
        }

        public Criteria andHouStatusNotIn(List<Integer> values) {
            addCriterion("hou_status not in", values, "houStatus");
            return (Criteria) this;
        }

        public Criteria andHouStatusBetween(Integer value1, Integer value2) {
            addCriterion("hou_status between", value1, value2, "houStatus");
            return (Criteria) this;
        }

        public Criteria andHouStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("hou_status not between", value1, value2, "houStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}