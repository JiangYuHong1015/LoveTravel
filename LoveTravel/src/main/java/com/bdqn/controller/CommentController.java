package com.bdqn.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.Date;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bdqn.pojo.Comments;
import com.bdqn.pojo.User;
import com.bdqn.service.comments.CommentsService;
import com.bdqn.tools.Constants;

@Controller
@RequestMapping(value="/user")
public class CommentController extends BaseController {
	
	private Logger logger = Logger.getLogger(BaseController.class);
	
	@Resource
	private CommentsService commentsService;
	
	
	//跳转到添加评论页面
			@RequestMapping(value="/commentAdd/{id}/{orderNo}/{hotelName}",method=RequestMethod.GET)
			public String commentAdd(@PathVariable String id,
					@PathVariable String orderNo,@PathVariable String hotelName ,Model model,HttpSession session){
				logger.debug("commentAdd==========");
				
				User user = (User)session.getAttribute(Constants.USER_SESSION);
				
				Comments comment = new Comments();
				comment.setHotelid(Integer.parseInt(id));
				comment.setOrderno(orderNo);
				comment.setHotelname(hotelName);
				comment.setCreateby(user.getId());
				model.addAttribute("comment", comment);
				
				return"userPage/commentAdd";
				
			}
			
			@RequestMapping(value="/commentAddSave")
			public String commentAddSave(Comments comments){
				
				logger.debug("commentAddSave==========");
				
				comments.setCreatedate(new Date());
				
				boolean flag = commentsService.insertSelective(comments);
				if(flag){
					//为什么在用重定向做跳转的时候就会出现问题，想不明白，数据库的字段已经添加成功
					//return "redirect:user/userView"; 
					return"userPage/commentAdd";
					
				}
				return"userPage/commentAdd";
				
				
				
			}
	

}
