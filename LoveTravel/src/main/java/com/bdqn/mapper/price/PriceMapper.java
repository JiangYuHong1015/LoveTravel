package com.bdqn.mapper.price;

import com.bdqn.pojo.Price;
import com.bdqn.pojo.PriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceMapper {
	
	//更新当前座位数量
	int updateSeatsNum(Price price)throws Exception;
	
	
    int countByExample(PriceExample example);

    int deleteByExample(PriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Price record);

    int insertSelective(Price record);

    List<Price> selectByExample(PriceExample example);

    Price selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Price record, @Param("example") PriceExample example);

    int updateByExample(@Param("record") Price record, @Param("example") PriceExample example);

    int updateByPrimaryKeySelective(Price record);

    int updateByPrimaryKey(Price record);
}