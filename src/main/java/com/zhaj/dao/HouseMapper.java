package com.zhaj.dao;

import com.zhaj.bean.House;
import com.zhaj.bean.HouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseMapper {
	long countByExample(HouseExample example);

	int deleteByExample(HouseExample example);

	int deleteByPrimaryKey(String housesId);

	int insert(House record);

	int insertSelective(House record);

	List<House> selectByExample(HouseExample example);

	/**
	 * @param hou
	 *            根据字段查出房源
	 * @return
	 */
	List<House> selectHousesByFields(House hou);

	House selectByPrimaryKey(String housesId);

	int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

	int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

	int updateByPrimaryKeySelective(House record);

	int updateByPrimaryKey(House record);
}