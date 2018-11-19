package com.bdqn.service.comments;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.mapper.comments.CommentsMapper;
import com.bdqn.pojo.Comments;
import com.bdqn.pojo.CommentsExample;

@Service
public class CommentsServiceImpl implements CommentsService {
	
	@Resource
	private CommentsMapper commentMapper;

	@Override
	public boolean insertSelective(Comments record) {
		boolean flag = false;
		if(commentMapper.insertSelective(record) > 0){
			flag = true;
		}
		
		return flag;
	}

	@Override
	public List<Comments> selectByExample(CommentsExample example) {
		List<Comments> commentsList = commentMapper.selectByExample(example);
		
		return commentsList;
	}

	@Override
	public int getCommentsCount() throws Exception {
		
		int count = commentMapper.getCommentsCount();
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public List<Comments> getCommentsList(Integer currentPageNo,
			Integer pageSize) throws Exception {
		
		List<Comments> commentsList = commentMapper.getCommentsList((currentPageNo-1)*pageSize, pageSize);
		return commentsList;
	}

}
