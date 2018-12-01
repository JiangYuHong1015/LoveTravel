package com.bdqn.mapper.flightOrder;

import com.bdqn.pojo.FlightOrder;
import com.bdqn.pojo.FlightOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightOrderMapper {
    int countByExample(FlightOrderExample example);

    int deleteByExample(FlightOrderExample example);

    int deleteByPrimaryKey(Integer id);

    //插入订单信息
    int insert(FlightOrder record) throws Exception;
    

    int insertSelective(FlightOrder record);

    List<FlightOrder> selectByExample(FlightOrderExample example);

    FlightOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FlightOrder record, @Param("example") FlightOrderExample example);

    int updateByExample(@Param("record") FlightOrder record, @Param("example") FlightOrderExample example);

    int updateByPrimaryKeySelective(FlightOrder record);

    int updateByPrimaryKey(FlightOrder record);
}