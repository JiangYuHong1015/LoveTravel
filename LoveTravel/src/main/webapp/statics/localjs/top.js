
$(function(){
	$("#autographEdit").click(function(e) {
        $("#sign").toggle();
    });
	$("#autographSave").click(function(){
		var signInfo=$("#autographText").val();
		$("#autographVal").html(signInfo);
		$("#sign").hide();
	})
	
})