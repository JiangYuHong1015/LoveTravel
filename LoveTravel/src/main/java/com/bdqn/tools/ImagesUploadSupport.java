package com.bdqn.tools;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bdqn.pojo.User;

public class ImagesUploadSupport {
	
	
	public static String uploadPhotoSave(HttpSession session,HttpServletRequest request,
			@RequestParam(value="photo",required=false)MultipartFile attach){
	
		
		User users = (User)session.getAttribute(Constants.USER_SESSION);
		String fileuploadInfo = null;
		
		//图片上传的相对路径
		String photoPath = null;
		//图片上传的绝对路径
		String photoRealPath = null ;
		//获得源文件名
		String oldPhotoName = null;
		//上传图片的名称
		String fileName = null;
		if(!attach.isEmpty()){
			//获得绝对路径
			String path = request.getSession().getServletContext().getRealPath("statics"+java.io.File.separator+"uploadfiles");
			
			oldPhotoName = attach.getOriginalFilename();
			//获得源文件后缀
			String suffix = FilenameUtils.getExtension(oldPhotoName);
			int fileSize = 300000;
			//上传文件超过规定大小
			if(attach.getSize() > fileSize){
				fileuploadInfo = Constants.FILEUPLOAD_ERROR_3;
			}else if (suffix.equalsIgnoreCase("PNG") || suffix.equalsIgnoreCase("GIF") || suffix.equalsIgnoreCase("JPG")){
				//上传图片的名称
				
			    fileName = System.currentTimeMillis()+users.getPhone()+".jpg";
				
				File targetFile = new File(path,fileName);
				if(!targetFile.exists()){
					 targetFile.mkdirs();
				 }
				//上传文件
				try {
					attach.transferTo(targetFile);
				} catch (Exception e) {
					e.printStackTrace();
					fileuploadInfo = Constants.FILEUPLOAD_ERROR_1;
				}
				photoPath = request.getContextPath()+"/statics/uploadfiles/"+fileName;
				photoRealPath =path+File.separator+fileName;
				fileuploadInfo=photoPath;
				
			}else{
				fileuploadInfo = Constants.FILEUPLOAD_ERROR_2;
			}
			
		}
		return fileuploadInfo;
	
	
		
		
		
		
	}
}
