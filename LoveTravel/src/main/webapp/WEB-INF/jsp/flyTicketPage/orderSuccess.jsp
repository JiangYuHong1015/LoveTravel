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
            <div class="prog-step ">
                <div class="progress-line"></div>
                <h4>乘机信息</h4>
            </div>
            <div class="prog-step ">
                <div class="progress-line"></div>
                <h4>支付</h4>
            </div>
            <div class="prog-step prog-last prog-current">
                <h4><i class="icon ico-step"></i>完成</h4>
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
		        <h1></h1><br>
		        <h1></h1><br>
		        <img alt="图片加载失败" src="${pageContext.request.contextPath }/statics/images/pay.png">
		      </div>
		    </div>
		  </div>
	</div>
</section>
    <aside>
        <div class="login-header">
            <div>
                <span >订单信息&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/flyTicket" style="color:blue;"> &nbsp;&nbsp; 继续订票 </a>
            </div>
            <span class="right-erweima "></span>
        </div>
        
        <div class="login-footer">
            <div class="footer-message">
             	 航班号：${flightOrder.fid }&nbsp;&nbsp;&nbsp;价格：${flightOrder.price } <br>
              ${flightOrder.leaveDate } &nbsp;&nbsp;&nbsp; ${flightOrder.leaveCity }    ------>  ${flightOrder.arriveCity }<br>
           	        
                                  起飞时间：${flightOrder.leaveTime }&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   落地时间：${flightOrder.arriveTime }<br>
                                  起飞机场：${flightOrder.leaveAirport } &nbsp;&nbsp;&nbsp;  落地机场：${flightOrder.arriveAirport }<br>
            </div>
     	</div>
        
         <div class="login-footer">
            <div class="footer-message">
             	 乘机人姓名：${flightOrder.contactName } <br>
             	 乘机人证件号：${flightOrder.cardNo } <br>
            </div>
        </div>     
        
        <div class="login-footer"></div>
    </aside>
    <input type="hidden" id="path" name="path" value="${pageContext.request.contextPath }"/>
</div>


<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.8.3.min.js"></script>
</body>
</html>