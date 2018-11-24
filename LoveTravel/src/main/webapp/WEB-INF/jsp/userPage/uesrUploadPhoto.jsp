<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/top.jsp"%>


<div class="yui3-u-1 center-ask fix">
	<div class="yui3-u-1 center-ask fix">
		<span class="cen-note-t left"> <a href="#"
			class="yui3-u uc-ask-tab-on">上传头像</a> <a
			href="${pageContext.request.contextPath }/user/userView"
			class="yui3-u ">账号信息</a> 
		</span>
	</div>
</div>

<div class="col-md-12 col-sm-12 col-xs-12">
	<div class="x_panel">
		<div class="x_content">

			<div class="self-tx">
				<form class="img-upload" method="post" action="uploadPhotoSave"
					enctype="multipart/form-data" target="upload-frame">
					<div class="item form-group">
						<div class="col-md-6 col-sm-6 col-xs-12">
							<input type="file" class="form-control col-md-7 col-xs-12"
								name="photo" required="required" id="a_logoPicPath" />
							<font color="red">${uploadError }</font>
						</div>
						<button id="send" type="submit" class="btn btn-success">上传头像</button>
					</div>
				</form>
			</div>



			<div class="show-img fix top20">
				<form action="" method="post" id="zb-form">
					<input type="hidden" name="x" value="0" /> <input type="hidden"
						name="y" value="0" /> <input type="hidden" name="w" value="80" /> <input
						type="hidden" name="h" value="80" /> <input type="hidden" name="img"
						value="/img/moren-tx.jpg" />
			
					<!--判断是否已经传过头像：有添加class-->
					<input type="hidden" name="hasUpload self-success" />
				</form>
				<div class="portrait_left left">
					<p>仅支持PNG、GIF、JPG格式的图片，图片小于2M</p>
					<div id="picture">
						<div class="img-cell">
							<img src="${userSession.photoPath }" alt="" width="250px;" />
						</div>
					</div>
			
				</div>
				<div class="portrait_right left">
					<p>您上传的图片会自动生成，请查看自动生成的图片是否清晰</p>
					<div class="portrait_right_bottom">
						<div class="portrait1">
							<div id="img_big_preview" class="img_preview">
								<img src="${userSession.photoPath }" alt="" />
							</div>
						</div>
						<p class="img-size"></p>
						<div class="tx-save hide">
							<a href="javascript:void(0);" id="img-save">保存</a> <a
								href="javascript:void(0);" id="img-quit">取消</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>



<%@include file="../common/down.jsp"%>
<script src="${pageContext.request.contextPath }/statics/localjs/top.js"></script>		