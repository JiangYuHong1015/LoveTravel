package com.bdqn.service.user;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.mapper.user.UserMapper;
import com.bdqn.pojo.User;


@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;

	
	public User userExist(String param) throws Exception {
		
		User user = null;
		//根据邮箱查找
		User userByEmail = userMapper.getUserByEmail(param);
		//根据手机号查找
		User userByPhone = userMapper.getUserByPhone(param);
		
		//判断是否有找到对应的user
		if(null != userByEmail){
			user = userByEmail;
		}else if(null != userByPhone){
			user = userByPhone;
		}
		return user;
	}

	

	public User doLogin(String param, String password) throws Exception {
		
		//根据用户名找到对应的user
		User user = this.userExist(param);
		//根据找到的user对象进行密码匹配
		if(null != user){
			//密码不匹配时返回null
			if(!user.getUserpassword().equals(password)){
				user = null;
			}
		}
		
		return user;
	}



	public User getUserRoleName(int id) throws Exception {
		//根据id查找用户角色
		User user = userMapper.getUserRoleName(id);
		return user;
	}



	@Override
	public boolean updateUserById(User user) throws Exception {
		
		boolean flag = false;
		//根据id修改用户信息
		if(userMapper.updateUserById(user) > 0){
			flag = true;
		}
		
		return flag;
	}



	@Override
	public boolean updatePhoto(User user) throws Exception {
		
		boolean flag = false;
		//上传头像
		if(userMapper.updatePhoto(user) > 0){
			flag = true;
		}
		
		return flag;
	}





	



}
