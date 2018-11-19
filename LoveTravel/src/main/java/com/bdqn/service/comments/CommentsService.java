package com.bdqn.service.comments;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.pojo.Comments;
import com.bdqn.pojo.CommentsExample;

public interface CommentsService {
	
	//增加评论
	boolean insertSelective(Comments record);
	
	//获取评论列表
	List<Comments> selectByExample(CommentsExample example);
	
	//获取评论总数
	 int getCommentsCount()throws Exception;
	 
	 //获取评论列表
	 List<Comments> getCommentsList(Integer currentPageNo,Integer pageSize ) throws Exception;
	    
}
