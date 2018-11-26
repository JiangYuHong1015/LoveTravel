<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/top.jsp"%>
<link href="${pageContext.request.contextPath }/statics/css/commentAdd.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/statics/css/starrr.css" rel="stylesheet">




<form action="${pageContext.request.contextPath }/user/commentAddSave" method="post" enctype="multipart/form-data">
<input type="hidden" name="orderno" id="orderno" value="${comment.orderno }">
<input type="hidden" name="hotelid" id="hotelid" value="${comment.hotelid }">
<input type="hidden" name="hotelname" id="hotelname" value="${comment.hotelname }">
<input type="hidden" name="createby" id="createby" value="${comment.createby }">
<input type="hidden" name="locationscore" id="locationscore" value="">
<input type="hidden" name="facilitiesscore" id="facilitiesscore" value="">
<input type="hidden" name="cleanscore" id="cleanscore" value="">
<input type="hidden" name="servicescore" id="servicescore" value="">
<table class="comment_table">
	<tbody>
		<tr>
			<th class="title_th">总体评价</th>
			<td class="content_td">
			<div class="td-inner">
				<div class="x_content">
		            <div>
		              <span class="stars-count"> 位置</span> 
		              <div class="starrr stars">
			              <a class="fa fa-star-o" id="locationSatar1" locationScore="1"></a>
			              <a class="fa fa-star-o" id="locationSatar2" locationScore="2"></a>
			              <a class="fa fa-star-o" id="locationSatar3" locationScore="3"></a>
			              <a class="fa fa-star-o" id="locationSatar4" locationScore="4"></a>
			              <a class="fa fa-star-o" id="locationSatar5" locationScore="5"></a>
		              </div>
		            </div>
		            
					<div>
						<span class="stars-count">设施</span> 
			             <div class="starrr stars">
			              <a class="fa fa-star-o" id="facilitiesSatar1" facilitiesScore="1"></a>
			              <a class="fa fa-star-o" id="facilitiesSatar2" facilitiesScore="2"></a>
			              <a class="fa fa-star-o" id="facilitiesSatar3" facilitiesScore="3"></a>
			              <a class="fa fa-star-o" id="facilitiesSatar4" facilitiesScore="4"></a>
			              <a class="fa fa-star-o" id="facilitiesSatar5" facilitiesScore="5"></a>
		              	</div>
			        </div>
			        
			        <div>
						<span class="stars-count">卫生</span> 
			            <div class="starrr stars">
			              <a class="fa fa-star-o" id="cleansSatar1" cleanScore="1"></a>
			              <a class="fa fa-star-o" id="cleansSatar2" cleanScore="2"></a>
			              <a class="fa fa-star-o" id="cleansSatar3" cleanScore="3"></a>
			              <a class="fa fa-star-o" id="cleansSatar4" cleanScore="4"></a>
			              <a class="fa fa-star-o" id="cleansSatar5" cleanScore="5"></a>
		              	</div>
			        </div>
			        
			         <div>
						<span class="stars-count">服务</span> 
			            <div class="starrr stars">
			              <a class="fa fa-star-o" id="serviceSatar1" serviceScore="1"></a>
			              <a class="fa fa-star-o" id="serviceSatar2" serviceScore="2"></a>
			              <a class="fa fa-star-o" id="serviceSatar3" serviceScore="3"></a>
			              <a class="fa fa-star-o" id="serviceSatar4" serviceScore="4"></a>
			              <a class="fa fa-star-o" id="serviceSatar5" serviceScore="5"></a>
		              	</div>
			        </div>
            	</div>

			</div></td>
		</tr>

		<tr>
			<th class="title_th">点评内容</th>
			<td class="content_td">
				<div class="comment_input">
				
					<textarea id="commentinfo" name="commentinfo">${comment.commentinfo }</textarea>
						<div class="input_tips" id="DraftDesc">寥寥几字，积分唾手可得</div>

						<!-- <span class="msg-error" style="display: none;"
							id="notice_tip_txt_empty"><span class="icon-error"></span>请填写点评内容。</span>
						<span class="msg-error" style="display: none;"
							id="notice_tip_txt_less"><span class="icon-error"></span>点评内容须填写5字以上。</span>
						<span class="msg-error" style="display: none;"
							id="notice_tip_txt_invalid"><span class="icon-error"></span>点评内容不符合提交要求，请修改您的点评，保证内容的有效性，谢谢。</span> -->
					</div>
				</div>
			</td>
		</tr>

		<tr>
			<th class="title_th">上传图片
			</th>
			<td class="content_td">

				<div class="self-tx">
					<div class="col-md-6 col-sm-6 col-xs-12">
						<input type="file" class="form-control col-md-7 col-xs-12"
							name="photo" id="a_logoPicPath" />
						${uploadError }
					</div>
				</div>
			</td>
		</tr>
	</tbody>
</table>



<button id="send" type="submit" class="comment_btn">提交点评</button>
</form>








<%@include file="../common/down.jsp"%>
<%-- <script src="${pageContext.request.contextPath }/statics/js/starrr.js"></script> --%>
<script src="${pageContext.request.contextPath }/statics/localjs/commentsAdd.js"></script>
<script src="${pageContext.request.contextPath }/statics/localjs/top.js"></script>		