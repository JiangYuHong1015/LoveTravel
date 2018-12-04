<%@page import="com.bdqn.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<title>机票列表页</title>
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath }/statics/favicon.ico">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/cityselect.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/reset.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/common.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/flyTicketList.css">

<style type="text/css">
                                    
#login-body{

	border: solid;color: gray;
	width: 500px;
	height: 220px
	
position:absolute;     left:0;    top:0;   right:0;   bottom:0;   margin:auto;
display: none;
	
}


</style>



</head>
<body>
<!-- 头部开始 -->
<div class="i-top clearfix">
	<div class="i-top-wrap">
		<div class="i-logo fl">
			<a href="#" title="i旅行">i旅行</a>
		</div>
		<div class="i-hotline fr">
			<ul>
				<li><a href="${pageContext.request.contextPath }">首页</a></li>
				<li><a href="#">客服中心</a></li>
				<li>|</li>
				<li><a href="#">24小时热线：400-855-6666</a></li>
				<li class="i-top-phone">
					<a href="#"><i class="icon-mobile-phone"></i></a>
					<div class="i-top-app i-top-appL">
						<img src="${pageContext.request.contextPath }/statics/images/img/erweima_1126.jpg" height="102" width="102" alt="">
						<p>手机扫码快速下载</p>
						<p>App享受最多50% 优惠力度</p>
					</div>
				</li>
				<li class="i-top-phone i-top-wei">
					<a href="#"><i class="icon-comments"></i></a>
					<div class="i-top-app i-top-app-wei">
						<img src="${pageContext.request.contextPath }/statics/images/img/erweima_1126.jpg" height="102" width="102" alt="">
						<p>i旅行微信公众号: <a href="#">ilvxing</a></p>
						<p>手机扫一扫，享受专属福利</p>
					</div>
				</li>
				 <li class="i-top-phone i-top-wei">
				 	<img alt="" src="${pageContext.request.contextPath }/statics/images/img.jpg" width="30" height="30">
                  	<span class="tx-top"></span>
					<div class="i-top-app i-top-app-wei">
						<div id="topClass">
							<a href="${pageContext.request.contextPath }/user/userView">酒店预定</a><br/>
							<a href="${pageContext.request.contextPath }/flyTicket">机票优惠</a><br/>
							<a href="${pageContext.request.contextPath }/user/userView">最新攻略</a><br/>
							<a href="${pageContext.request.contextPath }/doLogut">退出登陆</a>
						</div>
					</div>
				</li> 
			</ul>
		</div>
	</div>
</div>
<!-- 头部结束 -->

<!-- nav开始 -->
	<div class="i-nav clearfix">
		<div class="i-nav-wrap">
			<ul>
				<li><a href="${pageContext.request.contextPath }/" ><i class="icon-home"></i>首页</a></li>
				<li><a href="travel/index.html"><i class="icon-globe"></i>旅游</a></li>
				<li><a href="tavern/index.html"><i class="icon-hospital"></i>酒店</a></li>
				<li class="current"><a href="flyTicket.html"><i class="icon-plane"></i>机票</a></li>
				<!-- <li><a href="#"><i class="icon-credit-card"></i>门票</a></li> -->
				<li><a href="strategy/index.html"><i class="icon-book"></i>攻略</a></li>
			</ul>
			<div class="i-nav-login">
				<a href="login.html">登陆</a>
				<span>|</span>
				<a href="register.html">注册</a>
			</div>
		</div>
	</div>
<!-- nav结束 -->

<!-- 主体部分开始 -->
<div class="flylist-bd clearfix">
	<!-- from 开始 -->
	<form class="reSearchForm clearfix">
		<div class="flight-type">
			<div class="select_box">
                <span class="select_txt">单 程</span><i class="arr icon-angle-down"></i>
                <div class="option">
                    <a href="#">单 程</a>
                    <a href="#">往 返</a>
                    <a href="#">联 程</a>
                </div>
            </div>
			<div class="select_box select_pos">
                <span class="select_txt">舱位</span><i class="arr icon-angle-down"></i>
                <div class="option">
                    <a href="#">不 限</a>
                    <a href="#">经济舱</a>
                    <a href="#">商务舱</a>
                    <a href="#">头等舱</a>
                </div>
            </div>
		</div>
		
		<div class="flight_item">
			<span>从</span>
			<input class="cityone" placeholder="出发城市" type="text" id="citySelect_one">
			<i class="icon-map-marker"></i>
		</div>
		<div class="flight_item_change">
			<a class="ico_change" href="javascript:;"></a>
		</div>
		<div class="flight_item">
			<span>从</span>
			<input class="citytwo" placeholder="到达城市" type="text" id="citySelect_two">
			<i class="icon-map-marker"></i>
		</div>
		<div class="flight_item flight_clder">
			<span>出发</span>
			<input type="text" placeholder="2016-12-08" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd',position:{left:-48,top:17}})">
			<i class="icon-calendar"></i>
		</div>
		<div class="flight_item flight_clder flight_cldertwo">
			<span>返回</span>
			<input type="text" placeholder="2016-12-20" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd',position:{left:-130,top:17}})">
			<i class="icon-calendar"></i>
		</div>
		<div class="flight_submit">
			<button><i class="icon-search"></i></button>
		</div>
	</form>

	<!-- 吸顶开始 -->

	<form class="reSearchForm formpos clearfix">
		<div class="flight-type">
			<div class="select_box">
                <span class="select_txt">单 程</span><i class="arr icon-angle-down"></i>
                <div class="option">
                    <a href="#">单 程</a>
                    <a href="#">往 返</a>
                    <a href="#">联 程</a>
                </div>
            </div>
			<div class="select_box select_pos">
                <span class="select_txt">舱位</span><i class="arr icon-angle-down"></i>
                <div class="option">
                    <a href="#">不 限</a>
                    <a href="#">经济舱</a>
                    <a href="#">商务舱</a>
                    <a href="#">头等舱</a>
                </div>
            </div>
		</div>
		
		<div class="flight_item">
			<span>从</span>
			<input class="cityone" placeholder="出发城市" type="text" id="citySelect_three" value="">
			<i class="icon-map-marker"></i>
		</div>
		<div class="flight_item_change">
			<a class="ico_change" href="javascript:;"></a>
		</div>
		<div class="flight_item">
			<span>从</span>
			<input class="citytwo" placeholder="到达城市" type="text" id="citySelect_four" value="">
			<i class="icon-map-marker"></i>
		</div>
		<div class="flight_item flight_clder">
			<span>出发</span>
			<input type="text" placeholder="2016-12-08" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd',position:{left:-48,top:17}})">
			<i class="icon-calendar"></i>
		</div>
		<div class="flight_item flight_clder flight_cldertwo">
			<span>返回</span>
			<input type="text" placeholder="2016-12-20" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd',position:{left:-130,top:17}})">
			<i class="icon-calendar"></i>
		</div>
		<div class="flight_submit">
			<button><i class="icon-search"></i></button>
		</div>
	</form>
	<!-- 吸顶结束 -->
	<div class="searchHistory">
		<h3>历史查询：</h3>
		<p>
			单程 ${leaveCity } - ${arriveCity } 出发日期：${leaveDate }
		</p>
	</div>
	<!-- from 结束 -->
	
	<!-- 筛选部分开始 -->
	<div class="flight-left">
		<div class="flight-left-top">
			<h3>筛选</h3>
			<span>共60条航空信息</span>
			<i>清空全部</i>
		</div>
		<ul>
			<li>
				<i class="icon-time"></i><p>起飞时段</p><span class="arr-in icon-angle-right"></span>
				<ul class="flight-left-in">
					<li class="flight-left-infirst">
						<label>
							<input type="checkbox">上午(6-12点) 
							<span class="flight-left_price">
								<em>¥</em>400
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">中午(12-18点) 
							<span class="flight-left_price">
								<em>¥</em>568
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">晚上(18-24点) 
							<span class="flight-left_price">
								<em>¥</em>400
							</span>
						</label>
					</li>
				</ul>
			</li> 
			<li>
				<i class="icon-ok-sign"></i><p>航空公司</p><span class="arr-in icon-angle-right"></span>
				<ul class="flight-left-in">
					<li class="flight-left-infirst">
						<label>
							<input type="checkbox">东方航空 
							<span class="flight-left_price">
								<em>¥</em>400
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">河北航空 
							<span class="flight-left_price">
								<em>¥</em>627
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">海南航空 
							<span class="flight-left_price">
								<em>¥</em>760
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">吉祥航空 
							<span class="flight-left_price">
								<em>¥</em>740
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">南方航空 
							<span class="flight-left_price">
								<em>¥</em>760
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">上海航空 
							<span class="flight-left_price">
								<em>¥</em>500
							</span>
						</label>
					</li>
				</ul>
			</li>
			<li>
				<i class="icon-bookmark-empty"></i><p>报销凭证</p><span class="arr-in icon-angle-right"></span>
				<ul class="flight-left-in">
					<li class="flight-left-infirst">
						<label>
							<input type="checkbox">行程单 
							<span class="flight-left_price">
								<em>¥</em>400
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">发票 
							<span class="flight-left_price">
								<em>¥</em>495
							</span>
						</label>
					</li>
				</ul>
			</li>
			<li>
				<i class="icon-flag"></i><p>起飞机场</p><span class="arr-in icon-angle-right"></span>
				<ul class="flight-left-in">
					<li class="flight-left-infirst">
						<label>
							<input type="checkbox">首都 
							<span class="flight-left_price">
								<em>¥</em>400
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">南苑 
							<span class="flight-left_price">
								<em>¥</em>595
							</span>
						</label>
					</li>
				</ul>
			</li>
			<li>
				<i class=" icon-coffee"></i><p>舱位</p><span class="arr-in icon-angle-right"></span>
				<ul class="flight-left-in">
					<li class="flight-left-infirst">
						<label>
							<input type="checkbox">经济舱 
							<span class="flight-left_price">
								<em>¥</em>400
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">公务/头等舱 
							<span class="flight-left_price">
								<em>¥</em>695
							</span>
						</label>
					</li>
				</ul>
			</li>
			<li>
				<i class="icon-plane"></i><p>计划机型</p><span class="arr-in icon-angle-right"></span>
				<ul class="flight-left-in">
					<li class="flight-left-infirst">
						<label>
							<input type="checkbox">中型机
							<span class="flight-left_price">
								<em>¥</em>495
							</span>
						</label>
					</li>
					<li>
						<label>
							<input type="checkbox">大型机 
							<span class="flight-left_price">
								<em>¥</em>695
							</span>
						</label>
					</li>
				</ul>
			</li>
		</ul>
	
	</div>
	<!-- 筛选部分结束 -->

	<!-- 列表部分开始 -->
	<div class="flight-right">
		<div class="flight-right-top">
			<!-- 日历导航 -->
			<div class="i_calendar_tab clearfix">
				<div class="i_prevDate"><a href="javascript:;">&lt;</a></div>
				<div class="i_calendar_tab_list clearfix">
					<ul class="clearfix">
					<!-- 1 -->
						<li>
							<a href="#">
								<b>¥380</b>
								<span>11—20 周日</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥350</b>
								<span>11—21 周一</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—22 周二</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥390</b>
								<span>11—23 周三</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥420</b>
								<span>11—24 周四</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥320</b>
								<span>11—25 周五</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥330</b>
								<span>11—26 周六</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—27 周日</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥370</b>
								<span>11—28 周一</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—29 周二</span>
							</a>
						</li>
						<!-- 2 -->
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周二</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周二</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周二</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周二</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周二</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周二</span>
							</a>
						</li>
						<!-- 3 -->
						<li>
							<a href="#">
								<b>¥400</b>
								<span>11—21 周二</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周三</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周三</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周三</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周三</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周三</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周三</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周三</span>
							</a>
						</li>
						<!-- 4 -->
						<li>
							<a href="#">
								<b>¥410</b>
								<span>11—21 周四</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周四</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周四</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周四</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周四</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周四</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周四</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周四</span>
							</a>
						</li>
						<!-- 5 -->
						<li>
							<a href="#">
								<b>¥420</b>
								<span>11—21 周五</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周五</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周五</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周五</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周五</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周五</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周五</span>
							</a>
						</li>
						<li>
							<a href="#">
								<b>¥360</b>
								<span>11—21 周五</span>
							</a>
						</li>
					</ul>
				</div>
				<div class="i_next_date"><a href="javascript:;">&gt;</a></div>
			</div>
		</div>
		<div class="flight-right-con">
		<form action="flyTicketList" method="post">
			<input type="hidden" name="leaveCity"  value="${leaveCity }"/>
			<input type="hidden" name="arriveCity"  value="${arriveCity }"/>
			<input type="hidden" name="leaveDate"  value="${leaveDate }"/>
			<input type="hidden" name="airlineName" id="airlineName" value=""/>
			<input type="hidden" name="arriveAirport" id="arriveAirport" value=""/>
			<input type="hidden" name="leaveAirport" id="leaveAirport" value=""/>
			<input type="hidden" name="timeLable" id="timeLable" value="1"/>
			
			<div class="flight-sort clearfix">
				<ul>
					<li>
						<div class="select_box">
			            	<span class="select_txt">航空公司</span><i class="arr icon-angle-down"></i>
			                <div class="option">
			                	<c:forEach var="airlines" items="${airlinesList }">
			                    	<a class="airCompany" airlineName="${airlines.airlinename }" >${airlines.airlinename }</a>
			                   </c:forEach>
			                </div>
			            </div>
					</li>

					<li>
						<div class="select_box">
			                <span class="select_txt">起飞机场</span><i class="arr icon-angle-down"></i>
			                <div class="option">
			                <c:if test="${leaveAirportStationList != null }">
			                	<c:forEach var="airportStation" items="${leaveAirportStationList }">
			                    	<a class="leaveAirport" leaveAirport="${airportStation.leaveAirport }" >${airportStation.leaveAirport }</a>
			                   </c:forEach>
			                </c:if>
			                </div>
			            </div>
					</li>
					
					<li>
						<div class="select_box">
			                <span class="select_txt">落地机场</span><i class="arr icon-angle-down"></i>
			                <div class="option">
			                <c:if test="${arriveAirportStationList != null }">
			                	<c:forEach var="arriveAirportStation" items="${arriveAirportStationList }">
			                		<a class="arriveAirport" arriveAirport="${arriveAirportStation.arriveAirport }">${arriveAirportStation.arriveAirport }</a>
			                	</c:forEach>
			                </c:if>
			                </div>
			            </div>
					</li>
					
					<li>
						<div class="select_box">
			                <span class="select_txt">起飞时间</span><i class="arr icon-angle-down"></i>
			                <div class="option">
			                    <a class="timeLable" timeLable="1">早-->晚</a>
			                    <a class="timeLable" timeLable="2">晚-->早</a>
			                </div>
			            </div>
					</li>
					<li>
						<div class="select_box">
			                <span class="select_txt"><button type="submit">提交</button></span>
			                
			            </div>
					</li>
				</ul>
			</div>
		</form>	





		<form action="user/makeFlyOrder" method="post" id="flight">
			<input type="hidden" name="leaveCity"  value="${leaveCity }"/>
			<input type="hidden" name="arriveCity"  value="${arriveCity }"/>
			<input type="hidden" name="leaveDate"  value="${leaveDate }"/>
			
			<input type="hidden" name="fid" id="fids" value=""/>
			<input type="hidden" name="airlineName" id="airlineNames" value=""/>
			<input type="hidden" name="leaveTime" id="leaveTimes" value=""/>
			<input type="hidden" name="leaveAirport" id="leaveAirports" value=""/>
			<input type="hidden" name="price" id="price" value=""/>
			<input type="hidden" name="arriveTime" id="arriveTimes" value=""/>
			<input type="hidden" name="arriveAirport" id="arriveAirports" value=""/>
			<input type="hidden" name="currentSeats" id="currentSeats" value=""/>
			
			
			
			
			<div class="sort-line clearfix">
				<ul>
					<li class="sort-info">航班信息</li>
					<li class="sort-start">出发时间</li>
					<li class="sort-time">到达时间</li>
					<li class="sort-stage">准点率</li>
					<li class="sort-price">最低价格</li>
				</ul>
			</div> 

			<div class="sort-list">
				<ul>
				
				<c:forEach var="flightListInfo" items="${flightList }">
					<li>
						<div class="sort-list-detail">
							<span class="sort-info-list">
								<h4>${flightListInfo.airlineName }</h4>
								<p>${flightListInfo.fid }</p>
							</span>
							
							<span class="sort-start-list">
								<p>${flightListInfo.leaveTime }</p>
								<p>${flightListInfo.leaveAirport }</p>
							</span>
						
							<span class="sort-longarr">
								<i>${flightListInfo.totalTime }小时</i>
								<i></i>
							</span>
							
							<span class="sort-start-list sort-time-list">
								<p>${flightListInfo.arriveTime }</p>
								<p>${flightListInfo.arriveAirport }</p>
							</span>
							
							<span class="sort-stage-list">
								<em>准点率</em><em>88%</em>
							</span>
							<span class="sort-price-list">
								<i>￥</i>
								<i>${flightListInfo.price }</i>
								<i>起</i>
							</span>
							<button class="sort-btnsubmit" type="button"><span>订票</span><i class="icon-angle-down"></i></button>
						</div>
						
						
						<div class="sort-list-detail-in">
							<div class="sort-detail-wrap">
								<div class="detail-wrap clearfix">
									<div class="detail-wrap-info">
										行程单 <span>|</span> <i>退改￥362起</i>
									</div>
									<div class="detail-wrap-sale">
										<span>6.2折</span>
									</div>
									<div class="detail-wrap-price">
										<span>￥</span><i><fmt:formatNumber value="${(flightListInfo.price/flightListInfo.discount)*0.62}" pattern="##,###"/></i>
									</div>
									
									
									<%
									User sessionName =(User) session.getAttribute("userSession");%>
									<% if(sessionName != null){%>
										<button class="submitClass" type="submit" fid="${flightListInfo.fid }" arriveTime="${flightListInfo.arriveTime }" arriveAirport="${flightListInfo.arriveAirport }"
										leaveTime="${flightListInfo.leaveTime }"leaveAirport="${flightListInfo.leaveAirport }" airlineName="${flightListInfo.airlineName }"
										price="${(flightListInfo.price/flightListInfo.discount)*0.62}" currentSeats="${flightListInfo.currentSeats }">选定</button>
									<%}else{%>
										<button class="buttonClass" type="button" fid="${flightListInfo.fid }" arriveTime="${flightListInfo.arriveTime }" arriveAirport="${flightListInfo.arriveAirport }"
										leaveTime="${flightListInfo.leaveTime }"leaveAirport="${flightListInfo.leaveAirport }" airlineName="${flightListInfo.airlineName }"
										price="${(flightListInfo.price/flightListInfo.discount)*0.62}" currentSeats="${flightListInfo.currentSeats }">选定</button>
									<%}%>
									
								</div>

								<div class="detail-wrap">
									<div class="detail-wrap-info">
										行程单 <span>|</span> <i>退改￥462起</i>
									</div>
									
									<div class="detail-wrap-sale">
										<span>5.6折</span>
									</div>
									
									<div class="detail-wrap-price">
										<span>￥</span><i><fmt:formatNumber value="${(flightListInfo.price/flightListInfo.discount)*0.56}" pattern="##,###"/></i>
									</div>
									
									<% if(sessionName != null){%>
										<button class="submitClass" type="submit" fid="${flightListInfo.fid }" arriveTime="${flightListInfo.arriveTime }" arriveAirport="${flightListInfo.arriveAirport }"
										leaveTime="${flightListInfo.leaveTime }"leaveAirport="${flightListInfo.leaveAirport }" airlineName="${flightListInfo.airlineName }"
										price="${(flightListInfo.price/flightListInfo.discount)*0.56}"currentSeats="${flightListInfo.currentSeats }" >选定</button>
									<%}else{%>
										<button class="buttonClass" type="button" fid="${flightListInfo.fid }" arriveTime="${flightListInfo.arriveTime }" arriveAirport="${flightListInfo.arriveAirport }"
										leaveTime="${flightListInfo.leaveTime }"leaveAirport="${flightListInfo.leaveAirport }" airlineName="${flightListInfo.airlineName }"
										price="${(flightListInfo.price/flightListInfo.discount)*0.56}" currentSeats="${flightListInfo.currentSeats }">选定</button>
									<%}%>
								</div>
								
								<div class="detail-wrap detail-wrap-fullprice">
									<div class="detail-wrap-info">
										行程单 <span>|</span> <i><a href="#">免费</a>改期</i>
									</div>
									<div class="detail-wrap-sale">
										<span>9.3折</span>
									</div>
									<div class="detail-wrap-price">
										<span>￥</span><i><fmt:formatNumber value="${(flightListInfo.price/flightListInfo.discount)*0.93}" pattern="##,###"/></i>
						
									</div>
									<% if(sessionName != null){%>
										<button class="submitClass" type="submit" fid="${flightListInfo.fid }" arriveTime="${flightListInfo.arriveTime }" arriveAirport="${flightListInfo.arriveAirport }"
										leaveTime="${flightListInfo.leaveTime }"leaveAirport="${flightListInfo.leaveAirport }" airlineName="${flightListInfo.airlineName }"
										price="${(flightListInfo.price/flightListInfo.discount)*0.93}" currentSeats="${flightListInfo.currentSeats }">选定</button>
									<%}else{%>
										<button class="buttonClass" type="button" fid="${flightListInfo.fid }" arriveTime="${flightListInfo.arriveTime }" arriveAirport="${flightListInfo.arriveAirport }"
										leaveTime="${flightListInfo.leaveTime }"leaveAirport="${flightListInfo.leaveAirport }" airlineName="${flightListInfo.airlineName }"
										price="${(flightListInfo.price/flightListInfo.discount)*0.93}" currentSeats="${flightListInfo.currentSeats }">选定</button>
									<%}%>
								</div>

								<div class="detail-wrap detail-wrap-fullprice detail-wrap-online">
									<div class="detail-wrap-info">
										行程单 <span>|</span> <i><a href="#">免费</a>改期</i>
									</div>
									<div class="detail-wrap-sale">
										<span>全价</span>
									</div>
									<div class="detail-wrap-price">
										<span>￥</span><i><c:out value="${fn:substring(flightListInfo.price/flightListInfo.discount,0,fn:indexOf(flightListInfo.price/flightListInfo.discount, '.'))}"/></i>
						
									</div>
									<% if(sessionName != null){%>
										<button class="submitClass" type="submit" fid="${flightListInfo.fid }" arriveTime="${flightListInfo.arriveTime }" arriveAirport="${flightListInfo.arriveAirport }"
										leaveTime="${flightListInfo.leaveTime }"leaveAirport="${flightListInfo.leaveAirport }" airlineName="${flightListInfo.airlineName }"
										price="${(flightListInfo.price/flightListInfo.discount)}" currentSeats="${flightListInfo.currentSeats }" >选定</button>
									<%}else{%>
										<button class="buttonClass" type="button" fid="${flightListInfo.fid }" arriveTime="${flightListInfo.arriveTime }" arriveAirport="${flightListInfo.arriveAirport }"
										leaveTime="${flightListInfo.leaveTime }"leaveAirport="${flightListInfo.leaveAirport }" airlineName="${flightListInfo.airlineName }"
										price="${(flightListInfo.price/flightListInfo.discount)}" currentSeats="${flightListInfo.currentSeats }" >选定</button>
									<%}%>
								</div>
							</div>
						</div>
					</li>
					</c:forEach>
				</ul>
				
				
				 <div class="login-body" id="login-body">
            		<div id="staticOption">
            		<h2>尊敬的用户，您还没有登陆，请登陆后再操作</h2>
                    <fieldset>
                       
                        <div class="form-group margin-left-100">
                            <div class="input-group input-group-lg col-sm-9">
                                <span class="input-group-addon"><i class="icon-user"></i></span>
                                <input type="text" id="username" class="form-control ie-input" name="username"
                                       placeholder="请输入注册手机/注册邮箱">
                                       <font color="red"></font>
                            </div>
                        </div>
                        

                        <div class="form-group margin-left-100">
                            <div class="input-group input-group-lg col-sm-9">
                                <span class="input-group-addon"><i class="icon-lock"></i></span>
                                <input type="password" id="password" class="form-control ie-input" name="password" placeholder="请输入密码">
                            	<font color="red">${error }</font>
                            </div>
                        </div>
                      

                    </fieldset>
                    
                	<button type="button" class="btn btn-danger" id="login">登陆</button>
                	<button type="button" class="btn btn-danger"  id="back">返回</button>
           		 </div>
       			</div>
			</div>
		</form>
	</div>

		<!-- 分页 -->
<div class="i_pagewrap clearfix">
	<div class="i_pages">
		<a href="javascript:;" class="i_prepage">上一页</a>
		<a href="#" class="i_current i_num">1</a>
		<a href="#" class="i_num">2</a>
		<a href="#" class="i_num">3</a>
		<a href="#" class="i_num">4</a>
		<a href="#" class="i_num">5</a>
		<a href="#" class="i_num">6</a>
		<a href="#" class="i_num">7</a>
		<a href="#" class="i_num">8</a>
		<span class="i_morepage">...</span>
		<a href="#" class="i_num">25</a>
		<a href="javascript:;" class="i_nextpage">下一页></a>
		<div class="i_skippage">
			<span>到</span>
			<input type="text">
			<span>页</span>
		</div>
		<a href="#" class="i_ensure">确定</a>		
	</div>

	<!-- 声明 -->
	 <div class="i_statement">
		<h3>航班信息免责声明:</h3>
		<p>i旅行网 提供的各类航班相关的信息，包括但不限于舱位价格、餐食、起降准点率等，来源于中国航信、全国各大机场、航空公司及相关部门公布数据。由于这些信息可能随时变化，以及网络传输问题，携程提供的此类信息可能并非最新或存在误差，因此仅供旅客作为一般参考，任何公司或个人不能将此作为i旅行做出任何承诺或做出任何保证的依据。</p>
		 <div class="i_shengming_pic">
			<img src="images/icon/i_shengming_pic_03.png" height="33" width="59" alt="">
			<p class="i_sm_wf">
				<span>数据信息由</span><br>
				<span>中国民航信息网络股份有限公司提供</span>
			</p>
		</div>
	</div>
</div>  
</div>
</div>
	<!-- 列表部分结束 -->

 <input type="hidden" id="path" name="path" value="${pageContext.request.contextPath }"/>
 <input type="hidden" id="referer" name="referer" value="<%=request.getHeader("Referer")%>"/>
<%@include file="../common/down.jsp"%>

<script src="${pageContext.request.contextPath }/statics/lib/jquery-1.11.1.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/lib/cityselect.js"></script>
<script src="${pageContext.request.contextPath }/statics/lib/My97DatePicker/WdatePicker.js"></script>

<script src="${pageContext.request.contextPath }/statics/js/common.js"></script>
<script src="${pageContext.request.contextPath }/statics/js/flyTicketList.js"></script>
<script src="${pageContext.request.contextPath }/statics/localjs/fly.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.8.3.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/localjs/login.js"></script>


<script type="text/javascript">

$("#login").on("click",function(){
	var username = $("#username");
	var password = $("#password");
	
 	 $.ajax({
		url:"doTicketLogin",
		type:"POST",
		data:{username:username.val(),password:password.val()},
		dateType:"json",
		success:function(data){
			if(data.result == "true"){
				$("#login-body").hide();
				$("#flight").submit();
			}else if(data.result == "false"){
				$("#password").next().html("密码错误");
			}
		}
 	})
}); 


$(".buttonClass").on("click",function(){
	var arriveTime = $(this).attr("arriveTime");
	var leaveTime = $(this).attr("leaveTime");
	var arriveAirport = $(this).attr("arriveAirport");
	var leaveAirport = $(this).attr("leaveAirport");
	var airlineName = $(this).attr("airlineName");
	var fid = $(this).attr("fid");
	var price = Math.round($(this).attr("price"));
	var currentSeats=$(this).attr("currentSeats");
	alert(currentSeats);
	
	$("#arriveTimes").val(arriveTime);
	$("#arriveAirports").val(arriveAirport);
	$("#leaveTimes").val(leaveTime);
	$("#leaveAirports").val(leaveAirport);
	$("#airlineNames").val(airlineName);
	$("#fids").val(fid);
	$("#price").val(price);
	$("#currentSeats").val(currentSeats);
	
	$("#login-body").show();
	

});


$("#back").on("click",function(){
	$("#login-body").hide();
});


$(".submitClass").on("click",function(){
	
	var arriveTime = $(this).attr("arriveTime");
	var leaveTime = $(this).attr("leaveTime");
	var arriveAirport = $(this).attr("arriveAirport");
	var leaveAirport = $(this).attr("leaveAirport");
	var airlineName = $(this).attr("airlineName");
	var fid = $(this).attr("fid");
	var price = Math.round($(this).attr("price"));
	var currentSeats=$(this).attr("currentSeats");
	alert(currentSeats);
	
	$("#arriveTimes").val(arriveTime);
	$("#arriveAirports").val(arriveAirport);
	$("#leaveTimes").val(leaveTime);
	$("#leaveAirports").val(leaveAirport);
	$("#airlineNames").val(airlineName);
	$("#fids").val(fid);
	$("#price").val(price);
	$("#currentSeats").val(currentSeats);
	
	
	
	

});



</script>

</body>
</html>