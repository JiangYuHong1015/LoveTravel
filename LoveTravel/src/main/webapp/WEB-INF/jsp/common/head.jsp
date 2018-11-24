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

	<title>i 旅行 首页</title>
	<link rel="shortcut icon" href="${pageContext.request.contextPath }/statics/favicon.ico" type="image/x-icon" />
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/lib/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/lib/star-rating/star-rating.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/cityselect.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/reset.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/common.css">



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
				</ul>
			</div>
		</div>
	</div>
<!-- 头部结束 -->

<!-- nav开始 -->
	<div class="i-nav clearfix">
		<div class="i-nav-wrap">
			<ul>
				<li class="current"><a href="${pageContext.request.contextPath }/" ><i class="icon-home"></i>首页</a></li>
				<li><a href="${pageContext.request.contextPath }/statics/travel/index.html"><i class="icon-globe"></i>旅游</a></li>
				<li><a href="${pageContext.request.contextPath }/statics/tavern/index.html"><i class="icon-hospital"></i>酒店</a></li>
				<li><a href="${pageContext.request.contextPath }/flyTicket"><i class="icon-plane"></i>机票</a></li>
				<!-- <li><a href="#"><i class="icon-credit-card"></i>门票</a></li> -->
				<li><a href="${pageContext.request.contextPath }/statics/strategy/index.html"><i class="icon-book"></i>攻略</a></li>
				<li><a href="${pageContext.request.contextPath }/user/userView"><i class="icon-person"></i>个人中心</a></li>
			</ul>
			<div class="i-nav-login">
				<a href="login.html">登陆</a>
				<span>|</span>
				<a href="register.html">注册</a>
			</div>
		</div>
	</div>
<!-- nav结束 -->

