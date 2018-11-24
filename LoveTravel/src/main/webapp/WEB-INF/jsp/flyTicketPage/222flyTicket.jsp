<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/head.jsp"%>
<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/flyTicket.css">
	

<!-- i-banner开始 -->
<div class="banner clearfix">
	<!-- 全屏轮播部分开始 -->
	<ul class="banner_list">
        <li class="act banner-li1"><a href="#"></a></li>
        <li class="banner-li2"><a href="#"></a></li>
        <li class="banner-li3"><a href="#"></a></li>
        <li class="banner-li4"><a href="#"></a></li>
    </ul>
 	
   <!-- 全屏轮播部分结束 -->
   <!-- i-tab切换 -->
	<div class="i_area">
	<ol class="lb" >
    	<li class="li_1 cur"></li>
        <li></li>
        <li></li>
        <li></li>
   	 </ol>
	   <div class="i_tab">
	   		<ul class="i_tab_l ">
	   			<li class="travel clearfix">
	   				<a href="javascript:;">旅游</a>
	   				<div class="i_tab_r">
	   					<div class="i_box">
	   						<div class="i_title">
	   							<a href="javascript:;" class="line">特卖汇</a>
	   							<a href="javascript:;">出境旅游</a>
	   							<a href="javascript:;">国内旅游</a>
	   						</div>
	   						<!--1-->
	   						<div class="discount i_show">
	   							<form action="">
	   								<div class="i_destin">目的地  <input type="text" id="citySelect_one" placeholder="三亚" /></div>
	   								<div class="i_live">
	   									入住时间  <input  class="Wdate" type="text" placeholder="2016.12待定"  onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   									退房时间  <input type="text" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   								</div>
	   								<div class="i_rank">
	   								酒店级别  <select name="" id="">
		   									 	<option selected="selected" value="0">不限</option>
												<option value="5">五星级/豪华</option>
												<option value="4">四星级/高档</option>
												<option value="3">三星级/舒适</option>
												<option value="2">二星级以下/经济</option>
	   								     </select>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="海岛" />
	   									<div class="i_key">
		   									<a href="">温泉</a>、<a href="">亲子</a>、<a href="">自由行</a>、<a href="">名胜古迹</a>、<a href="">都市购物</a>
	   									</div>
	   									
	   								</div>
	   								<button class="i_btn">搜索行程 ></button>
	   							</form>
	   						</div>
	   						<!--2-->
	   						<div class="discount">
	   							<form action="">
	   								<div class="i_destin">目的地  <input type="text" id="citySelect_two" placeholder="三亚" /></div>
	   								<div class="i_live">
	   									入住时间  <input type="text" placeholder="2016.12待定" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   									退房时间  <input type="text" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   								</div>
	   								<div class="i_rank">
	   								酒店级别  <select name="" id="">
	   									 	<option selected="selected">不限</option>
											<option>五星级/豪华</option>
											<option>四星级/高档</option>
											<option>三星级/舒适</option>
											<option>二星级以下/经济</option>
	   								     </select>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="海岛" />
	   									<div class="i_key">
		   									<a href="#">泰国</a>、<a href="#">马尔代夫</a>、<a href="#">夏威夷</a>、<a href="#">美国</a>、<a href="#">东南亚</a>
										</div>
	   								</div>
	   								<button class="i_btn">搜索行程 ></button>
	   							</form>
	   						</div>
	   						<!--3-->
	   						<div class="discount">
	   							<form action="">
	   								<div class="i_destin">目的地  <input type="text" id="citySelect_three" placeholder="三亚" /></div>
	   								<div class="i_live">
	   									入住时间  <input type="text" placeholder="2016.12待定" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   									退房时间  <input type="text" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   								</div>
	   								<div class="i_rank">
	   								酒店级别  <select name="" id="">
	   									 	<option selected="selected">不限</option>
											<option>五星级/豪华</option>
											<option>四星级/高档</option>
											<option>三星级/舒适</option>
											<option>二星级以下/经济</option>
	   								     </select>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="海岛" />
	   									<div class="i_key">
		   									<a href="#">三亚</a>、<a href="#">厦门</a>、<a href="#">山东</a>、<a href="#">桂林</a>、<a href="#">东北</a>
	   									</div>
	   								</div>
	   								<button class="i_btn">搜索行程 ></button>
	   							</form>
	   						</div>
	   					</div>	
	   				</div>
	   			</li>
	   			<li class="hotel clearfix">
	   				<a href="javascript:;">酒店</a>
	   				<div class="i_tab_r">
	   					<div class="i_box">
	   						<div class="i_title">
	   							<a href="javascript:;" class="line">国内酒店</a>
	   							<a href="javascript:;">海外酒店</a>
	   							<a href="javascript:;">酒店团购</a>
	   						</div>
	   						<!--1-->
	   						<div class="discount i_show">
	   							<form action="">
	   								<div class="i_destin">目的地  <input type="text" id="citySelect_four" placeholder="三亚" /></div>
	   								<div class="i_live">
	   									入住时间  <input type="text" placeholder="2016.12待定" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   									退房时间  <input type="text" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   								</div>
	   								<div class="i_rank">
	   								酒店级别  <select name="" id="">
	   										<option selected="selected">不限</option>
											<option>五星级/豪华</option>
											<option>四星级/高档</option>
											<option>三星级/舒适</option>
											<option>二星级以下/经济</option>
	   								     </select>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="海岛" />
	   									<div class="i_key">
		   									<a href="">温泉</a>、<a href="">亲子</a>、<a href="">自由行</a>、<a href="">名胜古迹</a>、<a href="">都市购物</a>
	   									</div>
	   									
	   								</div>
	   								<button class="i_btn">搜索行程 ></button>
	   							</form>
	   						</div>
	   						<!--2-->
	   						<div class="discount">
	   							<form action="">
	   								<div class="i_destin">目的地  <input type="text" id="citySelect_five" placeholder="三亚" /></div>
	   								<div class="i_live">
	   									入住时间  <input type="text" placeholder="2016.12待定" />
	   									退房时间  <input type="text" />
	   								</div>
	   								<div class="i_rank">
	   								每间住客数  <select name="" id="">
	   									 	<option value="1"> 1成人 </option>
											<option value="2" selected="selected"> 2成人 </option>
											<option value="3"> 3成人 </option>
											<option value="4"> 4成人 </option>
											<option value="5"> 5成人 </option>
											<option value="6"> 6成人 </option>
											<option value="7"> 7成人 </option>
											<option value="8"> 8成人 </option>
	   								     </select>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="海岛" /> 
	   								</div>
	   								<button class="i_btn i_btn_hai">搜索行程 ></button>
	   							</form>
	   						</div>
	   						<!--3-->
	   						<div class="discount">
	   							<form action="">
	   								<div class="i-city">
	   									<p>
	   										<span>热门城市：</span>
	   										<a href="#">上海</a>
	   										<a href="#">广州</a>
	   										<a href="#">深圳</a>
	   										<a href="#">北京</a>
	   										<a href="#">成都</a>
	   										<a href="#">杭州</a>
	   										<a href="#">苏州</a>
	   										<a href="#">青岛</a>
	   									</p>
	   									<p>
	   										<span>热门团购：</span>
	   										<a href="#">度假公寓</a>
	   										<a href="#">别墅轰趴</a>
	   										<a href="#">住店游玩</a>
	   										<a href="#">情侣酒店</a>
	   										<a href="#">火车票专享</a>
	   									</p>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="(选填)商圈/景区/酒店品牌/酒店名称/关键字" />
	   								</div>
	   								<div class="keyword">
	   									目的地 <input type="text" />
	   								</div>
	   								<button class="i_btn">搜索行程 ></button>
	   							</form>
	   						</div>
	   					</div>
	   				</div>
	   			</li>
	   			<li class="cur show fly clearfix">
	   				<a href="javascript:;">机票</a>
	   					   				<div class="i_tab_r">
	   					<div class="i_box">
	   						<div class="i_title">
	   							<a href="javascript:;" class="line">国内机票</a>
	   							<a href="javascript:;">国际机票</a>
	   							<a href="javascript:;">发现低价</a>
	   						</div>
	   						<!--1-->
	   						<div class="discount i_show">
	   							<form action="">
	   								<div class="i_destin i_hang">航程类型
		   								<label>
											<input name="flightway"  checked="checked" type="radio">单程
										</label> 
										<label>
											<input name="flightway" type="radio">往返
										</label>
										<label>
											<input name="flightway" type="radio">多程
										</label>
		   							</div>
	   								<div class="i_live">
	   								出发城市  <input type="text" placeholder="北京" />第一程日期  <input type="text" placeholder="yy-mm-dd" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   								</div>
	   								<div class="i_rank i_live">
	   								中转城市  <input type="text" placeholder="上海" />第二程日期  <input type="text" placeholder="yy-mm-dd" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   								</div>
	   								<div class="keyword i-fly-keyword">
	   									到达城市 <input type="text" placeholder="广州" />
	   									<div class="i_key">
		   									<a href="">温泉</a>、<a href="">亲子</a>、<a href="">自由行</a>、<a href="">名胜古迹</a>、<a href="">都市购物</a>
	   									</div>
	   									
	   								</div>
	   								<button class="i_btn">搜索行程 ></button>
	   							</form>
	   						</div>
	   						<!--2-->
	   						<div class="discount">
	   							<form action="">
	   								<div class="i_destin i_hang">航程类型
		   								<label>
											<input name="flightway"  checked="checked" type="radio">单程
										</label> 
										<label>
											<input name="flightway" type="radio">往返
										</label>
										<label>
											<input name="flightway" type="radio">多程
										</label>
		   							</div>
	   								<div class="i_live">
	   									入住时间  <input type="text" placeholder="2016.12待定" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   									退房时间  <input type="text"  class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   								</div>
	   								<div class="i_rank">
	   								每间住客数  <select name="" id="">
	   									 	<option value="1"> 1成人 </option>
											<option value="2" selected="selected"> 2成人 </option>
											<option value="3"> 3成人 </option>
											<option value="4"> 4成人 </option>
											<option value="5"> 5成人 </option>
											<option value="6"> 6成人 </option>
											<option value="7"> 7成人 </option>
											<option value="8"> 8成人 </option>
	   								     </select>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="海岛" /> 
	   								</div>
	   								<button class="i_btn i_btn_hai">搜索行程 ></button>
	   							</form>
	   						</div>
	   						<!--3-->
	   						<div class="discount">
	   							<form action="">
	   								<div class="i-city">
	   									<p>
	   										<span>热门城市：</span>
	   										<a href="#">上海</a>
	   										<a href="#">广州</a>
	   										<a href="#">深圳</a>
	   										<a href="#">北京</a>
	   										<a href="#">成都</a>
	   										<a href="#">杭州</a>
	   										<a href="#">苏州</a>
	   										<a href="#">青岛</a>
	   									</p>
	   									<p>
	   										<span>热门团购：</span>
	   										<a href="#">度假公寓</a>
	   										<a href="#">别墅轰趴</a>
	   										<a href="#">住店游玩</a>
	   										<a href="#">情侣酒店</a>
	   										<a href="#">火车票专享</a>
	   									</p>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="(选填)商圈/景区/酒店品牌/酒店名称/关键字" />
	   								</div>
	   								<div class="keyword">
	   									目的地 <input type="text" />
	   								</div>
	   								<button class="i_btn">搜索行程 ></button>
	   							</form>
	   						</div>
	   					</div>
	   				</div>
	   			</li>
	   			<li class="ticket clearfix">
	   				<a href="javascript:;">门票</a>
	   					<div class="i_tab_r">
	   						<div class="discount i-ticket">
	   							<form action="">
	   								<div class="i-city">
	   									<p>
	   										<span>热门城市：</span>
	   										<a href="#">上海</a>
	   										<a href="#">广州</a>
	   										<a href="#">深圳</a>
	   										<a href="#">北京</a>
	   										<a href="#">成都</a>
	   										<a href="#">杭州</a>
	   										<a href="#">苏州</a>
	   										<a href="#">青岛</a>
	   									</p>
	   									<p>
	   										<span>热门活动: </span>
	   										<a href="#">门票特权日</a>
	   										<a href="#">早秋赏景</a>
	   										<a href="#">国庆提前订</a>
	   										<a href="#">旅行WiFi</a>
	   										<a href="#">日本旅行卡</a>
	   									</p>
	   									<p>
	   										<span>热门团购：</span>
	   										<a href="#">度假公寓</a>
	   										<a href="#">别墅轰趴</a>
	   										<a href="#">住店游玩</a>
	   										<a href="#">情侣酒店</a>
	   										<a href="#">火车票专享</a>
	   									</p>
	   									<p>
	   										<span>热门推荐: </span>
	   										<a href="#">东方盐湖城</a>
	   										<a href="#">长隆海洋王国</a>
	   										<a href="#">圆明园</a>
	   										<a href="#">印象武隆</a>
	   									</p>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="(选填)商圈/景区/酒店品牌/酒店名称/关键字" />
	   								</div>
	   								<div class="keyword">
	   									目的地 <input type="text" id="citySelect_six" />
	   								</div>
	   								<button class="i_btn">搜索行程 ></button>
	   							</form>
	   					</div>	
	   				</div>
	   			</li>
	   			<li class="idea clearfix">
	   				<a href="javascript:;">攻略</a>
	   				<div class="i_tab_r">
	   					<div class="i_box">
	   						<div class="i_title">
	   							<a href="javascript:;" class="line">热门游记</a>
	   							<a href="javascript:;">精华游记</a>
	   							<a href="javascript:;">行程计划</a>
	   						</div>
	   						<!--1-->
	   						<div class="discount i_show">
	   							<form action="">
	   								<div class="i-city i-idea">
	   									<p>
	   										<span>热门城市：</span>
	   										<a href="#">上海</a>
	   										<a href="#">广州</a>
	   										<a href="#">深圳</a>
	   										<a href="#">北京</a>
	   										<a href="#">成都</a>
	   										<a href="#">杭州</a>
	   										<a href="#">苏州</a>
	   										<a href="#">青岛</a>
	   									</p>
	   									<p>
	   										<span>热门活动: </span>
	   										<a href="#">门票特权日</a>
	   										<a href="#">早秋赏景</a>
	   										<a href="#">国庆提前订</a>
	   										<a href="#">旅行WiFi</a>
	   										<a href="#">日本旅行卡</a>
	   									</p>
	   									<p>
	   										<span>热门团购：</span>
	   										<a href="#">度假公寓</a>
	   										<a href="#">别墅轰趴</a>
	   										<a href="#">住店游玩</a>
	   										<a href="#">情侣酒店</a>
	   										<a href="#">火车票专享</a>
	   									</p>
	   									<p>
	   										<span>热门推荐: </span>
	   										<a href="#">东方盐湖城</a>
	   										<a href="#">长隆海洋王国</a>
	   										<a href="#">圆明园</a>
	   										<a href="#">印象武隆</a>
	   									</p>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="(选填)商圈/景区/酒店品牌/酒店名称/关键字" />
	   								</div>
	   								<div class="keyword">
	   									目的地 <input type="text" id="citySelect_six" />
	   								</div>
	   								<button class="i_btn">搜索行程 ></button>
	   							</form>
	   					</div>
	   						<!--2-->
	   						<div class="discount">
	   							<form action="">
	   								<div class="i_destin">目的地  <input type="text" id="citySelect_five" placeholder="三亚" /></div>
	   								<div class="i_live">
	   									入住时间  <input type="text" placeholder="2016.12待定" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   									退房时间  <input type="text" class="Wdate" onfocus="WdatePicker({doubleCalendar:true,dateFmt:'yyyy-MM-dd'})"/>
	   								</div>
	   								<div class="i_rank">
	   								每间住客数  <select name="" id="">
	   									 	<option value="1"> 1成人 </option>
											<option value="2" selected="selected"> 2成人 </option>
											<option value="3"> 3成人 </option>
											<option value="4"> 4成人 </option>
											<option value="5"> 5成人 </option>
											<option value="6"> 6成人 </option>
											<option value="7"> 7成人 </option>
											<option value="8"> 8成人 </option>
	   								     </select>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="海岛" /> 
	   								</div>
	   								<button class="i_btn i_btn_hai">搜索行程 ></button>
	   							</form>
	   						</div>
	   						<!--3-->
	   						<div class="discount">
	   							<form action="">
	   								<div class="i-city">
	   									<p>
	   										<span>热门城市：</span>
	   										<a href="#">上海</a>
	   										<a href="#">广州</a>
	   										<a href="#">深圳</a>
	   										<a href="#">北京</a>
	   										<a href="#">成都</a>
	   										<a href="#">杭州</a>
	   										<a href="#">苏州</a>
	   										<a href="#">青岛</a>
	   									</p>
	   									<p>
	   										<span>热门团购：</span>
	   										<a href="#">度假公寓</a>
	   										<a href="#">别墅轰趴</a>
	   										<a href="#">住店游玩</a>
	   										<a href="#">情侣酒店</a>
	   										<a href="#">火车票专享</a>
	   									</p>
	   								</div>
	   								<div class="keyword">
	   									关键词 <input type="text" placeholder="(选填)商圈/景区/酒店品牌/酒店名称/关键字" />
	   								</div>
	   								<div class="keyword">
	   									目的地 <input type="text" />
	   								</div>
	   								<button class="i_btn">搜索行程 ></button>
	   							</form>
	   						</div>
	   					</div>
	   				</div>
	   			</li>
	   		</ul>
	   </div>
   </div>
</div>
<!-- i-banner结束 -->	

<!-- 机票折线图开始 -->
<section class="clearfix">
	<div class="i-brokenline">
		<i></i>
		<div class="i-brokenline-wrap">
			<h3>机票价格趋势查询</h3>
			<span></span>
		</div>
		<div class="i-brokenlinesearch">
			<form action="">
				城市 <input type="text" id="citySelect_lineone" placeholder="出发城市" >-<input type="text" id="citySelect_linetwo" placeholder="达到城市">
				<button>搜索</button>
			</form>
		</div>
	</div>
	<div class="flodline" id="flodline">
		<!-- <div id="line" style="width:822px;height:492px;"></div> -->
	</div>
</section>
<!-- 机票折线图结束 -->


<!-- 航空公司促销开始 -->
<section class="clearfix">
	<div class="i-brokenline i-fly-sale">
		<i></i>
		<div class="i-brokenline-wrap">
			<h3>航空公司促销</h3>
			<span></span>
		</div>
		<a class="i-fly-salemore">更多促销信息 ></a>
	</div>
	<ul class="i-fly-salepro">
		<li>
			<a href="flyTicketList.html"><img src="${pageContext.request.contextPath }/statics/images/img/flyTicket_xxx1202_10.jpg" height="174" width="281" alt=""></a>
		</li>
		<li>
			<a href="flyTicketList.html"><img src="${pageContext.request.contextPath }/statics/images/img/ftyj01_0315_03.jpg" height="174" width="281" alt=""></a>
		</li>
		<li>
			<a href="flyTicketList.html"><img src="${pageContext.request.contextPath }/statics/images/img/ftyj01_0315_05.jpg" height="174" width="281" alt=""></a>
		</li>
		<li class="flylastli">
			<a href="flyTicketList.html"><img src="${pageContext.request.contextPath }/statics/images/img/ftyj01_0315_07.jpg" height="174" width="281" alt=""></a>
		</li>
	</ul>
	
</section>
<!-- 航空公司促销结束 -->


<!-- 特价机票汇总开始 -->
<section class="clearfix">
	<div class="i-brokenline i-fly-sale-sum">
		<i></i>
		<div class="i-brokenline-wrap">
			<h3>特价机票汇总</h3>
			<span></span>
		</div>

		<div class="i-brokenline-wrap-right">
			<div class="i-fly-sum-des">
				  <select name="" id="">
							<option selected="selected">北京出发</option>
							<option>上海</option>
							<option>广州</option>
							<option>成都</option>
							<option>昆明</option>
							<option>杭州</option>
							<option>厦门</option>
							<option>港澳台</option>
							<option>其他城市</option>
					     </select>			
			</div>
			<div class="i-fly-sum-month">
				  <select name="" id="">
							<option selected="selected">全部月份</option>
							<option>12月</option>
							<option>1月</option>
							<option>2月</option>
							<option>3月</option>
							<option>4月</option>
							<option>5月</option>
					     </select>			
			</div>
			<div class="i-fly-sum-hot">
				<a href="#">热门</a>
				<a href="#">国内特价机票</a>
				<a href="#">国外特价机票</a>
				<a href="#">亚洲</a>
				<a href="#">欧洲</a>
				<a href="#">美洲</a>
				<a href="#">非洲</a>
			</div>
			<a class="i-fly-salemore">更多特价机票 ></a>
		</div>

		
	</div>
      
	<div class="i-fly-sale-detail clearfix">
		<ul>
			<li>
				<a href="#">
					<span class="city">北京<i></i>吉隆坡</span>
					<span class="data">04月15日</span>
					<span class="sale">0.54折</span>
				</a>
					<span class="price">¥16166</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>札幌</span>
					<span class="data">04月15日</span>
					<span class="sale">0.6折</span>
				</a>
					<span class="price">¥869</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>马尼拉</span>
					<span class="data">04月15日</span>
					<span class="sale">0.6折</span>
				</a>
					<span class="price">¥914</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>香港</span>
					<span class="data">04月15日</span>
					<span class="sale">0.6折</span>
				</a>
					<span class="price">¥946</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>新加坡</span>
					<span class="data">04月15日</span>
					<span class="sale">0.6折</span>
				</a>
					<span class="price">¥1046</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>兰卡威</span>
					<span class="data">04月15日</span>
					<span class="sale">0.6折</span>
				</a>
					<span class="price">¥1059</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>甲米</span>
					<span class="data">04月15日</span>
					<span class="sale">0.6折</span>
				</a>
					<span class="price">¥1087</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>曼谷</span>
					<span class="data">04月15日</span>
					<span class="sale">0.6折</span>
				</a>
					<span class="price">¥1093</span>
			</li>
		</ul>

		<ul>
			<li>
				<a href="#">
					<span class="city">北京<i></i>普吉</span>
					<span class="data">04月15日</span>
					<span class="sale">0.8折</span>
				</a>
					<span class="price">¥1139</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>胡志明市</span>
					<span class="data">04月15日</span>
					<span class="sale">0.8折</span>
				</a>
					<span class="price">¥1178</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>清迈</span>
					<span class="data">04月15日</span>
					<span class="sale">0.8折</span>
				</a>
					<span class="price">¥1215</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>符拉迪沃斯托克</span>
					<span class="data">04月15日</span>
					<span class="sale">0.8折</span>
				</a>
					<span class="price">¥1246</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>巴厘岛</span>
					<span class="data">04月15日</span>
					<span class="sale">0.8折</span>
				</a>
					<span class="price">¥1263</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>暹粒</span>
					<span class="data">04月15日</span>
					<span class="sale">0.8折</span>
				</a>
					<span class="price">¥1269</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>斗湖</span>
					<span class="data">04月15日</span>
					<span class="sale">0.8折</span>
				</a>
					<span class="price">¥1360</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>福冈</span>
					<span class="data">04月15日</span>
					<span class="sale">0.8折</span>
				</a>
					<span class="price">¥1365</span>
			</li>
		</ul>

		<ul>
			<li>
				<a href="#">
					<span class="city">北京<i></i>广州</span>
					<span class="data">04月15日</span>
					<span class="sale">0.4折</span>
				</a>
					<span class="price">¥763</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>深圳</span>
					<span class="data">04月15日</span>
					<span class="sale">0.4折</span>
				</a>
					<span class="price">¥792</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>三亚</span>
					<span class="data">04月15日</span>
					<span class="sale">0.4折</span>
				</a>
					<span class="price">¥625</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>乌鲁木齐</span>
					<span class="data">04月15日</span>
					<span class="sale">0.4折</span>
				</a>
					<span class="price">¥625</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>上海</span>
					<span class="data">04月15日</span>
					<span class="sale">0.4折</span>
				</a>
					<span class="price">¥430</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>青岛</span>
					<span class="data">04月15日</span>
					<span class="sale">0.4折</span>
				</a>
					<span class="price">¥220</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>成都</span>
					<span class="data">04月15日</span>
					<span class="sale">0.4折</span>
				</a>
					<span class="price">¥770</span>
			</li>
			<li>
				<a href="#">
					<span class="city">北京<i></i>大连</span>
					<span class="data">04月15日</span>
					<span class="sale">0.4折</span>
				</a>
					<span class="price">¥170</span>
			</li>
		</ul>
	</div>
	
</section>
<!-- 特价机票汇总结束 -->

<%@include file="../common/footer.jsp"%>
<script src="${pageContext.request.contextPath }/statics/js/flyTicket.js"></script>
<script src="${pageContext.request.contextPath }/statics/lib/jquery-1.11.1.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/lib/cityselect.js"></script>
<script src="${pageContext.request.contextPath }/statics/lib/echarts.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/lib/My97DatePicker/WdatePicker.js"></script>


