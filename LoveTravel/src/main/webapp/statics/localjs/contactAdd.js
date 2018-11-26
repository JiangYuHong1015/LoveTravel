
var backBtn = null;
var addBtn = null;
var contactName = null;
var cardNo = null;
var phone = null


$(function(){	
	backBtn = $("#back");
	addBtn = $("#add");
	contactName = $("#contactName");
	cardNo = $("#cardNo");
	phone = $("#phone");
	
	
	contactName.bind("focus",function(){
		validateTip(contactName.next(),{"color":"red"},"联系人姓名不能为空",false);
	}).bind("blur",function(){
		var value = contactName.val().trim();
		if(null != value && value.length > 1){
			validateTip(contactName.next(),{"color":"green"},"",true);
		}else{
			validateTip(contactName.next(),{"color":"red"},"输入不合规范",false);
		}
	})
	
	phone.bind("focus",function(){
		validateTip(phone.next(),{"color":"red"},"* 请输入手机号",false);
	}).bind("blur",function(){
		var REGpatrn=/^(13[0-9]|15[0-9]|18[0-9])\d{8}$/;
		if(phone.val().match(REGpatrn)){
			validateTip(phone.next(),{"color":"green"},"",true);
		}else{
			validateTip(phone.next(),{"color":"red"}, " 您输入的手机号格式不正确",false);
		}
	});
	
	cardNo.bind("focus",function(){
		validateTip(cardNo.next(),{"color":"red"},"证件号码不能为空",false);
	}).bind("blur",function(){
		var selectValue = $("#cardType").val();
		var cardValue = cardNo.val().trim();
		
		//验证15位身份证
		var REGcheckID1 = /^[1-9]\d{7}((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))\d{3}$/
		//验证18位身份证
		var REGcheckID2 = /^[1-9]\d{5}[1-9]\d{3}((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))\d{3}/;
		//验证护照
		var REGcheckPassword = /(P\d{7})|(G\d{8})/;
		//验证身份证
		if(selectValue == 1){
			//当输入证件为15位
			if(cardValue.length == 15){
				
				if(cardValue.match(REGcheckID1)){
					validateTip(cardNo.next(),{"color":"green"},"",true);
				}else{
					validateTip(cardNo.next(),{"color":"red"},"身份证号码不合规范",false);
				}
			//当输入证件为18位
			}else if(cardValue.length == 18){
				
				if(cardValue.match(REGcheckID2)){
					validateTip(cardNo.next(),{"color":"green"},"",true);
				}else{
					validateTip(cardNo.next(),{"color":"red"},"身份证号码不合规范",false);
				}
			//长度非15/18，即不和规范
			}else{
				validateTip(cardNo.next(),{"color":"red"},"身份证号码不合规范",false);
			}
			
		//验证护照	
		}else{
			if(cardValue.match(REGcheckPassword)){
				validateTip(cardNo.next(),{"color":"green"},"",true);
			}else{
				validateTip(cardNo.next(),{"color":"red"},"护照号码不合规范",false);
			}
		}
		
	})
	
	
	
	addBtn.on("click",function(){
		if(contactName.attr("validateStatus" != "true")){
			contactName.blur();
		}else if (phone.attr("validateStatus" != "true")){
			phone.blur();
		}else if(cardNo.attr("validateStatus" != "true")){
			cardNo.blur();
		}else{
			$("#contactForm").submit();
		}
	});
	
	
	backBtn.on("click",function(){
		//alert("modify: "+referer);
		if(referer != undefined 
			&& null != referer 
			&& "" != referer
			&& "null" != referer
			&& referer.length > 4){
		 window.location.href = referer;
		}else{
			history.back(-1);
		}
	});
	
	
})
