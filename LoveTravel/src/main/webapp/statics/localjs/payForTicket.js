function validateTip(element,css,tipString,status){
	element.css(css);
	element.html(tipString);
	element.prev().attr("validateStatus",status);
}


var path = $("#path").val();

var account =null;
var password = null;
var pay = null;
var backBtn = null;


$(function(){
	account = $("#account");
	password = $("#password");
	pay = $("#pay");
	backBtn = $("#back");
	

	account.bind("focus",function(){
		validateTip(account.next(),{"color":"red"},"账号信息不能为空",false);
		
	}).bind("blur",function(){
		if(account.val().length < 8 || account.val().length > 20 ){
			validateTip(account.next(),{"color":"red"},"账号信息不正确",false);
		}else{
			validateTip(account.next(),{"color":"green"},"",true);
		}
		
	})
	

	
	password.bind("focus",function(){
		validateTip(password.next(),{"color":"red"},"*密码不能为空",false);
	}).bind("blur",function(){
		if(password.val().search(/^[a-zA-Z]\w{5,17}$/)==-1){
			validateTip(password.next(),{"color":"red"}," 密码输入不符合规范",false);
		}else{
			validateTip(password.next(),{"color":"green"},"",true);
		}
	});
	
	
	pay.bind("click",function(){
		if(account.attr("validateStatus") != "true"){
			username.blur();
		}else if(password.attr("validateStatus") != "true"){
			password.blur();
		}else{
			$("#payForm").submit();
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



