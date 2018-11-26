package com.bdqn.mapper.line;

import com.bdqn.pojo.Line;
import com.bdqn.pojo.LineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LineMapper {
	
	/**
	 * 获取起飞机场列表
	 * @param leaveCity
	 * @param arriveCity
	 * @return
	 * @throws Exception
	 */
	List<Line> getLeaveAirportList(@Param(value="leaveCity")String leaveCity,@Param(value="arriveCity")String arriveCity )throws Exception;
	
	/**
	 * 获取降落机场列表
	 * @param leaveCity
	 * @param arriveCity
	 * @return
	 * @throws Exception
	 */
	List<Line> getArriveAirportList(@Param(value="leaveCity")String leaveCity,@Param(value="arriveCity")String arriveCity )throws Exception;
	
	
    int countByExample(LineExample example);

    int deleteByExample(LineExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Line record);

    int insertSelective(Line record);

    List<Line> selectByExample(LineExample example);

    Line selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") Line record, @Param("example") LineExample example);

    int updateByExample(@Param("record") Line record, @Param("example") LineExample example);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
}