package com.bdqn.mapper.airlines;

import com.bdqn.pojo.Airlines;
import com.bdqn.pojo.AirlinesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirlinesMapper {
	
	//获取所有的航空公司信息
	List<Airlines>getAllAirlines()throws Exception;
	
	
	
	
    int countByExample(AirlinesExample example);

    int deleteByExample(AirlinesExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Airlines record);

    int insertSelective(Airlines record);

    List<Airlines> selectByExample(AirlinesExample example);

    Airlines selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Airlines record, @Param("example") AirlinesExample example);

    int updateByExample(@Param("record") Airlines record, @Param("example") AirlinesExample example);

    int updateByPrimaryKeySelective(Airlines record);

    int updateByPrimaryKey(Airlines record);
}