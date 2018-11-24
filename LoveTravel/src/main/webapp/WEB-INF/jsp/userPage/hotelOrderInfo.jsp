<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/top.jsp"%>
<div class="clearfix"></div>
<div class="row">
	<div class="col-md-12 col-sm-12 col-xs-12">
		<div class="yui3-u-1 center-ask fix">
			<div class="yui3-u-1 center-ask fix">
				<span class="cen-note-t left"> <a href="#"
					class="yui3-u uc-ask-tab-on">订单详情</a> 
				</span>
			</div>
		</div>


		<div class="col-md-12 col-sm-12 col-xs-12">
			<div class="x_panel">
				<div class="x_content">
					<p class="text-muted font-13 m-b-30"></p>
					<div id="datatable-responsive_wrapper"
						class="dataTables_wrapper form-inline dt-bootstrap no-footer">
						<div class="row">
							<div class="col-sm-12">
								<table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap dataTable no-footer dtr-inline collapsed"
									cellspacing="0" width="100%" role="grid" aria-describedby="datatable-responsive_info" style="width: 100%;">
									
									<tbody>
										<tr role="row" class="odd">
										<td>
										<div class="yui3-g">
											<div class="yui3-u-1">
												<div id="purchase-jobOE-grid" class="list-view">
													<ul class="fix list-ul">
														<li class="courseDetail fix">
															<div class="courseInfo left">
																<input type="hidden" id="api" value="http://api.kgc.cn">
																	<span class="courseTitle f16 black">订单编号：${hotelorder.orderno }</span><br/>
																	<span class="courseTitle f16 black">入住姓名：${hotelorder.resname }</span><br/>
																	<span class="courseTitle f16 black">酒店名称：${hotelorder.hotelname }</span><br/>
																	<span class="courseTitle f16 black">酒店地址：${hotelorder.hoteladdress }</span><br/>
																	
																	<span class="courseTitle f16 black">入住日期：${hotelorder.checkInDate } </span><br/>
																	<span class="courseTitle f16 black">退房日期：${hotelorder.checkOutDate }</span><br/>
																	<span class="courseTitle f16 black">入住天数：共计${hotelorder.totaldays }天</span><br/>
																	<span class="courseTitle f16 black">订单金额：共计${hotelorder.orderprice }元</span><br/>
																	<span class="courseTitle f16 black">订单状态：${hotelorder.orderStatusName }</span><br/>

									 						</div>
															 <div class="continue">
																<a href="javascript:void(0);" class="catalog-btn btn_study f14"
																	data-id="31853" data-job="31257" data-course="100">再次预定</a>
															 </div>
														</ul>
													</div>
												</div>
											</div>
										</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
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
