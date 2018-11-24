package com.bdqn.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bdqn.pojo.Comments;
import com.bdqn.pojo.User;
import com.bdqn.service.comments.CommentsService;
import com.bdqn.tools.Constants;
import com.bdqn.tools.ImagesUploadSupport;
import com.bdqn.tools.PageSupport;

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
	public String commentAddSave(Comments comments,HttpSession session,HttpServletRequest request,
			@RequestParam(value="photo")MultipartFile attach){
		
		logger.debug("commentAddSave==========");
		
		String fileuploadInfo = ImagesUploadSupport.uploadPhotoSave(session, request, attach);
		if(Constants.FILEUPLOAD_ERROR_1.equals(fileuploadInfo) || Constants.FILEUPLOAD_ERROR_2.equals(fileuploadInfo)
				|| Constants.FILEUPLOAD_ERROR_3.equals(fileuploadInfo)){
			request.setAttribute("uploadError", fileuploadInfo);
			return"userPage/commentAdd";
		}
		
		comments.setCommentsimg(fileuploadInfo);
		comments.setCreatedate(new Date());
		
		boolean flag = commentsService.insertSelective(comments);
		if(flag){
			//为什么在用重定向做跳转的时候就会出现问题，想不明白，数据库的字段已经添加成功,不明白路径
			//return "redirect:user/userView"; 
			return"redirect:commentsList";
			
		}
		return"userPage/commentAdd";
	}
			
			
	@RequestMapping(value="/commentsList")
	public String getCommentsList(Model model,@RequestParam(value="pageIndex",required=false)String pageIndex){
		logger.debug("getCommentsList==========pageIndex"+pageIndex);
		//总数量
		int totalCount = 0;
		try {
			totalCount = commentsService.getCommentsCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//页面容量
		int pageSize = 3;
		//当前页
		int currentPageNo = 1;
		try {
			currentPageNo = Integer.parseInt(pageIndex);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		PageSupport pages = new PageSupport();
		pages.setCurrentPageNo(currentPageNo);
		pages.setPageSize(pageSize);
		pages.setTotalCount(totalCount);
		//总页数
		int totalPageCount = pages.getTotalPageCount();
		
		//控制首页和尾页
		if(currentPageNo < 1){
			currentPageNo = 1;
		}else if(currentPageNo > totalPageCount ){
			currentPageNo = totalPageCount;
		}
		
		
		List<Comments> hotelCommentsList = null;
		try {
			hotelCommentsList = commentsService.getCommentsList(currentPageNo, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("hotelCommentsList", hotelCommentsList);
		model.addAttribute("pages", pages);
		return "userPage/hotelCommentsList";
		
	}
	

}
