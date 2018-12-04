<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
 <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

	<title>i 旅行-机票预订</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath }/statics/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/common.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/index.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/lib/bootstrap/css/bootstrap-theme.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/lib/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/login.css"/>
  
  
   	<link rel="dns-prefetch" href="//webresource.c-ctrip.com" />
    <link rel="dns-prefetch" href="//pic.c-ctrip.com" />
    <link rel="dns-prefetch" href="//images3.c-ctrip.com" />
    <link rel="dns-prefetch" href="//crm.ws.ctrip.com" />
    <link rel="dns-prefetch" href="//s.c-ctrip.com" />
    <link rel="dns-prefetch" href="//www.google-analytics.com" />
    <link href="//webresource.c-ctrip.com/ResFlightOnline/I4/css/book.css?releaseno=CR_2018_11_14_12_00_01" rel="stylesheet" type="text/css" />
  
  
    <script src="${pageContext.request.contextPath }/statics/lib/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath }/statics/lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath }/statics/js/common.js"></script>
    <script src="${pageContext.request.contextPath }/statics/js/util.js"></script>

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
				<li><a href="${pageContext.request.contextPath }/">首页</a></li>
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

<div class="header-wrapper">
    <div class="header" id="J_hd">
        <div class="order-progress">
            <div class="prog-step prog-current">
                <div class="progress-line"></div>
                <h4><i class="icon ico-step"></i>乘机信息</h4>
            </div>
            <div class="prog-step">
                <div class="progress-line"></div>
                <h4>支付</h4>
            </div>
            <div class="prog-step prog-last">
                <h4>完成</h4>
            </div>
        </div>
    </div>
</div>


<div class="travel-login">
<section>
  <div class="row">
  <div class="col-md-12 col-sm-12 col-xs-12">
    <div class="x_panel">
      <div class="x_content">
	 	
       <div class="clearfix"></div>
        <form id="contactForm" class="form-horizontal form-label-left" action=payForTicket method="post">
        
		     <input type="hidden" id="path" name="path" value="${pageContext.request.contextPath }"/>
		     <input type="hidden" id="referer" name="referer" value="<%=request.getHeader("Referer")%>"/>
	         <div class="form-group">
	            <div class="col-md-6 col-md-offset-3">
	               <button type="button" class="btn btn-primary">乘客信息</button>
	            </div>
	          </div>
         
	          <div class="item form-group">
	            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">联系姓名 <span class="required">*</span>
	            </label>
	           	<div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
		            <input type="text" class="form-control has-feedback-left" data-validate-length-range="20" data-validate-words="1"
		            name="contactName" id="contactName" required="required" placeholder="与证件名一致" value="">
		            <font color="red"></font>
		            <span class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
	            </div>
	          </div>
	          
	          <div class="item form-group">
	            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">证件类型 <span class="required">*</span>
	            </label>
	            <div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
	              <select name="cardType" id="cardType" class="form-control has-feedback-left" required="required">
	              	<option value="1">身份证</option>
	              	<option value="2">护照</option>
	              </select>
	              <span class="fa fa-envelope form-control-feedback left" aria-hidden="true"></span>
	            </div>
	          </div>
	          
	          <div class="item form-group">
	            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">证件号码 <span class="required">*</span>
	            </label>
	           	<div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
		            <input type="text" class="form-control has-feedback-left" name="cardNo" id="cardNo" required="required" placeholder="请输入证件号" value="">
		            <font color="red"></font>
		            <span class="fa fa-envelope form-control-feedback left" aria-hidden="true"></span>
	            </div>
	          </div>
          
	           <div class="item form-group">
	           		<label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">联系电话 <span class="required">*</span></label>
	            	<div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
		               <input type="text" class="form-control has-feedback-left" name="phone" id="phone" required="required" placeholder="用于接收预定信息" value="">
		               <font color="red"></font>
		               <span class="fa fa-phone form-control-feedback left" aria-hidden="true"></span>
	                </div>
	          </div>
	          <input type="hidden" name="fid" value="${flight.fid }" />
	          <input type="hidden" name="leaveDate" value="${flight.leaveDate }" />
	          <input type="hidden" name="leaveCity" value="${flight.leaveCity }" />
	          <input type="hidden" name="arriveCity" value="${flight.arriveCity }" />
	          <input type="hidden" name="leaveTime" value="${flight.leaveTime }" />
	          <input type="hidden" name="arriveTime" value="${flight.arriveTime }" />
	          <input type="hidden" name="leaveAirport" value="${flight.leaveAirport }" />
	          <input type="hidden" name="arriveAirport" value="${flight.arriveAirport }" />
	          <input type="hidden" name="price" value="${price }" />
	          <input type="hidden" name="currentSeats" value="${flight.currentSeats }" />
	         
	          <div class="ln_solid"></div>
	          <div class="form-group">
	            <div class="col-md-6 col-md-offset-3">
	              <button id="add" type="submit" class="btn btn-primary">保存</button>
	              <button type="button" class="btn btn-primary" id="back">返回</button>
	              <br/><br/>
	            </div>
	          </div>
	        </form>
	      </div>
	    </div>
	  </div>
	</div>
</section>
<aside>
	<div class="login-header">
	    <div>
	        <span>订单信息</span>&nbsp;&nbsp;&nbsp;<a href="#"> 注意事项 | </a>请确保旅客信息正确无误！
	    </div>
	    <span class="right-erweima "></span>
	</div>
	
	<div class="login-footer">
	    <div class="footer-message">
	        1.目前该舱位仅剩${flight.currentSeats }个座位，请尽快完成预订。<br>
	   	    2.您预订的产品仅限预订成人票，不可使用港澳通行证预订。<br>
	        3.该航班预计最晚于起飞前24小时完成出票。<br>
	    </div>
	</div>
        
    <div class="login-footer">
       <div class="footer-message">
        	 航班号：${flight.fid }&nbsp;&nbsp;&nbsp; 价格：${price }<br>
        	 <%-- 时间 ${flight.totalTime } --%>
         ${flight.leaveDate } &nbsp;&nbsp;&nbsp; ${flight.leaveCity }    ------>  ${flight.arriveCity }<br>
      	        
                             起飞时间：${flight.leaveTime }&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   落地时间：${flight.arriveTime }<br>
                             起飞机场：${flight.leaveAirport } &nbsp;&nbsp;&nbsp;  落地机场：${flight.arriveAirport }<br>
       </div>
   </div>
        
   <div class="login-footer"></div>
</aside>
</div>



<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.8.3.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/localjs/contactAdd.js"></script>

</body>
</html>