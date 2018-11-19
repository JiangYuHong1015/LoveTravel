package com.bdqn.mapper.comments;

import com.bdqn.pojo.Comments;
import com.bdqn.pojo.CommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentsMapper {
    
    //获取评论总数量
    int getCommentsCount() throws Exception;
    
    //获取评论列表
    List<Comments> getCommentsList(@Param(value="form")Integer currentPageNo,@Param(value="pageSize")Integer pageSize ) throws Exception;
    
   
    
    int countByExample(CommentsExample example);
    
    int deleteByExample(CommentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Comments record);

    int insertSelective(Comments record);

    List<Comments> selectByExample(CommentsExample example);

    Comments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByExample(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);
}