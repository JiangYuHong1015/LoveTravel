<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@include file="../common/top.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="clearfix"></div>
<div class="row">
	<div class="col-md-12 col-sm-12 col-xs-12">
		<div class="yui3-u-1 center-ask fix">
			<div class="yui3-u-1 center-ask fix">
				<span class="cen-note-t left"> <a href="/my/jobOE"
					class="yui3-u uc-ask-tab-on">酒店订单点评</a> <a
					href="${pageContext.request.contextPath }/user/uploadPhoto"
					class="yui3-u ">旅游订单点评</a> <a
					href="${pageContext.request.contextPath }/user/uploadPhoto"
					class="yui3-u ">机票订单点评</a>
				</span>
			</div>
		</div>


		<div class="col-md-12 col-sm-12 col-xs-12">
			<div class="x_panel">
				<div class="x_content">
					<form method="post" action="commentsList">
						<input type="hidden" name="pageIndex" value="1" />
					</form>
				
				
					<p class="text-muted font-13 m-b-30"></p>
					<div id="datatable-responsive_wrapper"
						class="dataTables_wrapper form-inline dt-bootstrap no-footer">
						
						<div class="row">
							<div class="col-sm-12">
								<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap dataTable no-footer dtr-inline collapsed"
									cellspacing="0" width="100%" role="grid" aria-describedby="datatable-responsive_info" style="width: 100%;">
									
									<tbody>
										<c:forEach var="hotelComments" items="${hotelCommentsList }">
											
											<tr role="row" class="odd">
											<td>
											<div class="continue">
											<strong>创建日期：</strong>
     										<button> <fmt:formatDate value="${hotelComments.createdate }" type="both" pattern="yyyy年MM月dd日"/></button>
												
											</div>
											<div class="yui3-g">
												<div class="yui3-u-1">
													<div id="purchase-jobOE-grid" class="list-view">
														<ul class="fix list-ul">
															<li class="courseDetail fix"><a href="http://www.kgc.cn/job/oe/31257.shtml" class="courseImg left" target="_blank">
																<%-- <img src="${hotelComments.commentsImg }" width="220" height="124" onerror="this.src='/img/video_default20160105.jpg'" /> --%></a>
																<div class="courseInfo">
																	<input type="hidden" id="api" value="http://api.kgc.cn">
																		<a class="courseTitle f16 black" href="http://www.kgc.cn/job/oe/31257.shtml" target="_blank">${hotelComments.hotelname }</a><br/>
																			<span>服务${hotelComments.servicescore }分</span> &nbsp;&nbsp;<span>位置${hotelComments.locationscore }分</span> &nbsp;&nbsp;<span>卫生${hotelComments.cleanscore }分</span> &nbsp;&nbsp;<span>设施${hotelComments.facilitiesscore }分</span><br/>	
																			<span>${hotelComments.commentinfo } </span><br/>
																			<div class="coursePro f14" id="per_31257" data-code="31257"></div>
																			<c:choose>
																				<c:when test="${hotelComments.commentsimg == null }">
																					<font color="blue">未上传图片</font>
																				</c:when>
																				<c:otherwise><img src="${hotelComments.commentsimg }" width="220" height="124" onerror="this.src='/img/video_default20160105.jpg'" /></c:otherwise>
																			</c:choose>
																			
																		
										 						</div>
										 						<!-- <div class="continue">
																	<a href="javascript:void(0);" class="catalog-btn btn_study f14"
																		data-id="31853" data-job="31257" data-course="100"
																		data-name="Spring MVC扩展和SSM框架整合">追加评论</a>
																 </div> -->
															</ul>
														</div>
													</div>
												</div>
											</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<input type="hidden" id="totalPageCount" value="${totalPageCount}"/>
							  	<c:import url="../common/rollpage.jsp">
						          	<c:param name="totalCount" value="${totalCount}"/>
						          	<c:param name="currentPageNo" value="${currentPageNo}"/>
						          	<c:param name="totalPageCount" value="${totalPageCount}"/>
						        </c:import>
								
							</div>
						</div>
					<%-- 	<input type="hidden" id="totalPageCount" value="${totalPageCount}"/>
					  	<c:import url="../common/rollpage.jsp">
				          	<c:param name="totalCount" value="${totalCount}"/>
				          	<c:param name="currentPageNo" value="${currentPageNo}"/>
				          	<c:param name="totalPageCount" value="${totalPageCount}"/>
			          	</c:import> --%>
					</div>
				</div>
			</div>
		</div>
	<div class="clearfix"></div>
		<br />
		<br />
</div>
</div>

<%@include file="../common/down.jsp"%>
<script src="${pageContext.request.contextPath }/statics/localjs/rollpage.js"></script>
<script src="${pageContext.request.contextPath }/statics/localjs/hotelOrderView.js"></script>
