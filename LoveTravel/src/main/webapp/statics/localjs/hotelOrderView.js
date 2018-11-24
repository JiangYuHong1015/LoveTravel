
var path = $("#path").val();

$(".commentAdd").on("click",function(){
	var obj = $(this);
	window.location.href="commentAdd/"+ obj.attr("hotelId")+"/"+obj.attr("hotelOrderNo")+"/"+obj.attr("hotelName");
});

$(".orderInfo").on("click",function(){
	var obj = $(this);
	window.location.href="orderDetialView?id="+ obj.attr("hotelId");
});



$(".deleteOrder").on("click",function(){
	var obj = $(this);
	if(confirm("你确定要删除【"+obj.attr("hotelName")+"】的订单吗？")){
		$.ajax({
			type:"GET",
			url :"deleteHorderOrder",
			data:{id:obj.attr("hotelId")},
			dateType:"json",
			success:function(data){
				if(data.result == "true"){
					alert("删除成功");
					obj.parents("tr").remove();
				}else if(data.result == "false"){
					alert("删除失败");
				}else if(data.result == "notexist"){
					alert("该订单不存在");
				}
			},
			error: function(data){
				alert("订单删除失败");
			}	
		});
		
	}
	
});



/*$(".deleteContact").on("click",function(){
	var obj = $(this);
	if(confirm("你确定要删除联系人【"+obj.attr("contactname")+"】的信息吗？")){
		$.ajax({
			type:"GET",
			url:"deleteConact",
			data:{id:obj.attr("contactinfoid")},
			dataType:"json",
			success:function(data){
				if(data.result == "true"){//删除成功：移除删除行
					alert("删除成功");
					obj.parents("tr").remove();
				}else if(data.result == "false"){//删除失败
					alert("对不起，删除联系人【"+obj.attr("contactname")+"】失败");
				}else if(data.result == "notexist"){
					alert("对不起，联系人【"+obj.attr("contactname")+"】不存在");
				}
			},
			error:function(data){
				alert("对不起，删除失败");
			}
		});
	}
});*/

	
