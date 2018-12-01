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

<!-- <style type="text/css">
	body{
		background:#87CEFA;
	}

</style> -->

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
                <div class="prog-step prog-current">
                    <div class="progress-line"></div>
                    <h4><i class="icon ico-step"></i>支付</h4>
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
        <form id="payForm" class="form-horizontal form-label-left" action=success method="post">
        
		    <input type="hidden" id="path" name="path" value="${pageContext.request.contextPath }"/>
		    <input type="hidden" id="referer" name="referer" value="<%=request.getHeader("Referer")%>"/>
	         
	        <h1></h1><br>
	        <h1></h1><br>

          <div class="item form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">支付方式 <span class="required">*</span>
            </label>
            <div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
              <select name="cardType" id="cardType" class="form-control has-feedback-left" required="required">
              	<option value="1">银联卡</option>
              	<option value="2">支付宝</option>
              	<option value="3">微信</option>
              </select>
            </div>
          </div>
          
        
          
           <div class="item form-group">
           		<label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">支付账号 <span class="required">*</span></label>
            	<div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
	               <input type="text" class="form-control has-feedback-left" name="account" id="account" required="required" placeholder="请输入账号信息" value="">
	               <font color="red"></font>
                </div>
          </div>
          
           <div class="item form-group">
           		<label class="control-label col-md-3 col-sm-3 col-xs-12"  for="select">支付密码 <span class="required">*</span></label>
            	<div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
	               <input type="text" class="form-control has-feedback-left" name="password" id="password" required="required" placeholder="请输入支付密码" value="">
	               <font color="red"></font>
                </div>
          </div>
          
          
          <input type="hidden" name="fid" value="${flightOrder.fid }" />
          <input type="hidden" name="leaveDate" value="${flightOrder.leaveDate }" />
          <input type="hidden" name="leaveCity" value="${flightOrder.leaveCity }" />
          <input type="hidden" name="arriveCity" value="${flightOrder.arriveCity }" />
          <input type="hidden" name="leaveTime" value="${flightOrder.leaveTime }" />
          <input type="hidden" name="arriveTime" value="${flightOrder.arriveTime }" />
          <input type="hidden" name="leaveAirport" value="${flightOrder.leaveAirport }" />
          <input type="hidden" name="arriveAirport" value="${flightOrder.arriveAirport }" />
          <input type="hidden" name="contactName" value="${flightOrder.contactName }" />
          <input type="hidden" name="cardNo" value="${flightOrder.cardNo }" />
          <input type="hidden" name="phone" value="${flightOrder.phone }" />
         
          <div class="ln_solid"></div>
          <div class="form-group">
            <div class="col-md-6 col-md-offset-3">
              <button id="pay" type="button" class="btn btn-primary">支付</button>
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
                1.目前该舱位仅剩3个座位，请尽快完成预订。<br>
           	    2.您预订的产品仅限预订成人票，不可使用港澳通行证预订。<br>
                3.该航班预计最晚于起飞前24小时完成出票。<br>
            </div>
        </div>
        
        
        <div class="login-footer">
            <div class="footer-message">
             	 航班号：${flightOrder.fid } <br>
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


</div>


<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/localjs/payForTicket.js"></script>
</body>
</html>