package com.bdqn.service.airlines;

import java.util.List;

import com.bdqn.pojo.Airlines;

public interface AirlinesService {
	
	
	/**
	 * 获取所有的航空公司信息
	 * @return 航空公司列表
	 * @throws Exception
	 */
	List<Airlines>getAllAirlines()throws Exception;

}
