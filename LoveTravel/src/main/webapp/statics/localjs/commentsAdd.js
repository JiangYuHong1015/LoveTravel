
var locationSatar1 = null;
var locationSatar2 = null;
var locationSatar3 = null;
var locationSatar4 = null;
var locationSatar5 = null

var cleansSatar1 = null;
var cleansSatar2 = null;
var cleansSatar3 = null;
var cleansSatar4 = null;
var cleansSatar5 = null;


var facilitiesSatar1 = null;
var facilitiesSatar2 = null;
var facilitiesSatar3 = null;
var facilitiesSatar4 = null;
var facilitiesSatar5 = null;

var serviceSatar1 = null;
var serviceSatar2 = null;
var serviceSatar3 = null;
var serviceSatar4 = null;
var serviceSatar5 = null;


$(function(){	
	locationSatar1 = $("#locationSatar1");
	locationSatar2 = $("#locationSatar2");
	locationSatar3 = $("#locationSatar3");
	locationSatar4 = $("#locationSatar4");
	locationSatar5 = $("#locationSatar5");
	
	cleansSatar1 = $("#cleansSatar1");
	cleansSatar2 = $("#cleansSatar2");
	cleansSatar3 = $("#cleansSatar3");
	cleansSatar4 = $("#cleansSatar4");
	cleansSatar5 = $("#cleansSatar5");
	
	facilitiesSatar1 = $("#facilitiesSatar1");
	facilitiesSatar2 = $("#facilitiesSatar2");
	facilitiesSatar3 = $("#facilitiesSatar3");
	facilitiesSatar4 = $("#facilitiesSatar4");
	facilitiesSatar5 = $("#facilitiesSatar5");
	
	serviceSatar1 = $("#serviceSatar1");
	serviceSatar2 = $("#serviceSatar2");
	serviceSatar3 = $("#serviceSatar3");
	serviceSatar4 = $("#serviceSatar4");
	serviceSatar5 = $("#serviceSatar5");
	
	serviceSatar1.bind("click",function(){
		var serviceScore = serviceSatar1.attr("serviceScore");
		$("#servicescore").val(serviceScore);
		serviceSatar1.removeClass("fa fa-star-o");
		serviceSatar1.addClass("fa-star fa");
		serviceSatar2.addClass("fa fa-star-o");
		serviceSatar3.addClass("fa fa-star-o");
		serviceSatar4.addClass("fa fa-star-o");
		serviceSatar5.addClass("fa fa-star-o");
		
	});
	
	serviceSatar2.bind("click",function(){
		var serviceScore = serviceSatar2.attr("serviceScore");
		$("#servicescore").val(serviceScore);
		serviceSatar1.removeClass("fa fa-star-o");
		serviceSatar1.addClass("fa-star fa");
		serviceSatar2.removeClass("fa fa-star-o");
		serviceSatar2.addClass("fa-star fa");
		serviceSatar3.addClass("fa fa-star-o");
		serviceSatar4.addClass("fa fa-star-o");
		serviceSatar5.addClass("fa fa-star-o");
		
	});
	
	serviceSatar3.bind("click",function(){
		var serviceScore = serviceSatar3.attr("serviceScore");
		$("#servicescore").val(serviceScore);
		serviceSatar1.removeClass("fa fa-star-o");
		serviceSatar1.addClass("fa-star fa");
		serviceSatar2.removeClass("fa fa-star-o");
		serviceSatar2.addClass("fa-star fa");
		serviceSatar3.removeClass("fa fa-star-o");
		serviceSatar3.addClass("fa-star fa");
		serviceSatar4.addClass("fa fa-star-o");
		serviceSatar5.addClass("fa fa-star-o");
		
	});
	
	serviceSatar4.bind("click",function(){
		var serviceScore = serviceSatar4.attr("serviceScore");
		$("#servicescore").val(serviceScore);
		serviceSatar1.removeClass("fa fa-star-o");
		serviceSatar1.addClass("fa-star fa");
		serviceSatar2.removeClass("fa fa-star-o");
		serviceSatar2.addClass("fa-star fa");
		serviceSatar3.removeClass("fa fa-star-o");
		serviceSatar3.addClass("fa-star fa");
		serviceSatar4.removeClass("fa fa-star-o");
		serviceSatar4.addClass("fa-star fa");
		serviceSatar5.addClass("fa fa-star-o");
		
	});
	
	serviceSatar5.bind("click",function(){
		var serviceScore = serviceSatar5.attr("serviceScore");
		$("#servicescore").val(serviceScore);
		serviceSatar1.removeClass("fa fa-star-o");
		serviceSatar1.addClass("fa-star fa");
		serviceSatar2.removeClass("fa fa-star-o");
		serviceSatar2.addClass("fa-star fa");
		serviceSatar3.removeClass("fa fa-star-o");
		serviceSatar3.addClass("fa-star fa");
		serviceSatar4.removeClass("fa fa-star-o");
		serviceSatar4.addClass("fa-star fa");
		serviceSatar5.removeClass("fa fa-star-o");
		serviceSatar5.addClass("fa-star fa");
		
	});
	
	
	facilitiesSatar1.bind("click",function(){
		var facilitiesScore = facilitiesSatar1.attr("facilitiesScore");
		$("#facilitiesscore").val(facilitiesScore);
		facilitiesSatar1.removeClass("fa fa-star-o");
		facilitiesSatar1.addClass("fa-star fa");
		facilitiesSatar2.addClass("fa fa-star-o");
		facilitiesSatar3.addClass("fa fa-star-o");
		facilitiesSatar4.addClass("fa fa-star-o");
		facilitiesSatar5.addClass("fa fa-star-o");
		
	});
	
	facilitiesSatar2.bind("click",function(){
		var facilitiesScore = facilitiesSatar2.attr("facilitiesScore");
		$("#facilitiesscore").val(facilitiesScore);
		facilitiesSatar1.removeClass("fa fa-star-o");
		facilitiesSatar1.addClass("fa-star fa");
		facilitiesSatar2.removeClass("fa fa-star-o");
		facilitiesSatar2.addClass("fa-star fa");
		facilitiesSatar3.addClass("fa fa-star-o");
		facilitiesSatar4.addClass("fa fa-star-o");
		facilitiesSatar5.addClass("fa fa-star-o");
		
	});
	
	facilitiesSatar3.bind("click",function(){
		var facilitiesScore = facilitiesSatar3.attr("facilitiesScore");
		$("#facilitiesscore").val(facilitiesScore);
		facilitiesSatar1.removeClass("fa fa-star-o");
		facilitiesSatar1.addClass("fa-star fa");
		facilitiesSatar2.removeClass("fa fa-star-o");
		facilitiesSatar2.addClass("fa-star fa");
		facilitiesSatar3.removeClass("fa fa-star-o");
		facilitiesSatar3.addClass("fa-star fa");
		facilitiesSatar4.addClass("fa fa-star-o");
		facilitiesSatar5.addClass("fa fa-star-o");
		
	});
	
	facilitiesSatar4.bind("click",function(){
		var facilitiesScore = facilitiesSatar4.attr("facilitiesScore");
		$("#facilitiesscore").val(facilitiesScore);
		facilitiesSatar1.removeClass("fa fa-star-o");
		facilitiesSatar1.addClass("fa-star fa");
		facilitiesSatar2.removeClass("fa fa-star-o");
		facilitiesSatar2.addClass("fa-star fa");
		facilitiesSatar3.removeClass("fa fa-star-o");
		facilitiesSatar3.addClass("fa-star fa");
		facilitiesSatar4.removeClass("fa fa-star-o");
		facilitiesSatar4.addClass("fa-star fa");
		facilitiesSatar5.addClass("fa fa-star-o");
		
	});
	
	facilitiesSatar5.bind("click",function(){
		var facilitiesScore = facilitiesSatar5.attr("facilitiesScore");
		$("#facilitiesscore").val(facilitiesScore);
		facilitiesSatar1.removeClass("fa fa-star-o");
		facilitiesSatar1.addClass("fa-star fa");
		facilitiesSatar2.removeClass("fa fa-star-o");
		facilitiesSatar2.addClass("fa-star fa");
		facilitiesSatar3.removeClass("fa fa-star-o");
		facilitiesSatar3.addClass("fa-star fa");
		facilitiesSatar4.removeClass("fa fa-star-o");
		facilitiesSatar4.addClass("fa-star fa");
		facilitiesSatar5.removeClass("fa fa-star-o");
		facilitiesSatar5.addClass("fa-star fa");
		
	});
	
	cleansSatar1.bind("click",function(){
		var cleanScore = cleansSatar1.attr("cleanScore");
		$("#cleanscore").val(cleanScore);
		cleansSatar1.removeClass("fa fa-star-o");
		cleansSatar1.addClass("fa-star fa");
		cleansSatar2.addClass("fa fa-star-o");
		cleansSatar3.addClass("fa fa-star-o");
		cleansSatar4.addClass("fa fa-star-o");
		cleansSatar5.addClass("fa fa-star-o");
		
	});
	cleansSatar2.bind("click",function(){
		var cleanScore = cleansSatar2.attr("cleanScore");
		$("#cleanscore").val(cleanScore);
		cleansSatar1.removeClass("fa fa-star-o");
		cleansSatar1.addClass("fa-star fa");
		cleansSatar2.removeClass("fa fa-star-o");
		cleansSatar2.addClass("fa-star fa");
		cleansSatar3.addClass("fa fa-star-o");
		cleansSatar4.addClass("fa fa-star-o");
		cleansSatar5.addClass("fa fa-star-o");
		
	});
	cleansSatar3.bind("click",function(){
		var cleanScore = cleansSatar3.attr("cleanScore");
		$("#cleanscore").val(cleanScore);
		cleansSatar1.removeClass("fa fa-star-o");
		cleansSatar1.addClass("fa-star fa");
		cleansSatar2.removeClass("fa fa-star-o");
		cleansSatar2.addClass("fa-star fa");
		cleansSatar3.removeClass("fa fa-star-o");
		cleansSatar3.addClass("fa-star fa");
		cleansSatar4.addClass("fa fa-star-o");
		cleansSatar5.addClass("fa fa-star-o");
	});
	cleansSatar4.bind("click",function(){
		var cleanScore = cleansSatar4.attr("cleanScore");
		$("#cleanscore").val(cleanScore);
		cleansSatar1.removeClass("fa fa-star-o");
		cleansSatar1.addClass("fa-star fa");
		cleansSatar2.removeClass("fa fa-star-o");
		cleansSatar2.addClass("fa-star fa");
		cleansSatar3.removeClass("fa fa-star-o");
		cleansSatar3.addClass("fa-star fa");
		cleansSatar4.removeClass("fa fa-star-o");
		cleansSatar4.addClass("fa-star fa");
		cleansSatar5.addClass("fa fa-star-o");
	});
	cleansSatar5.bind("click",function(){
		var cleanScore = cleansSatar5.attr("cleanScore");
		$("#cleanscore").val(cleanScore);
		cleansSatar1.removeClass("fa fa-star-o");
		cleansSatar1.addClass("fa-star fa");
		cleansSatar2.removeClass("fa fa-star-o");
		cleansSatar2.addClass("fa-star fa");
		cleansSatar3.removeClass("fa fa-star-o");
		cleansSatar3.addClass("fa-star fa");
		cleansSatar4.removeClass("fa fa-star-o");
		cleansSatar4.addClass("fa-star fa");
		cleansSatar5.removeClass("fa fa-star-o");
		cleansSatar5.addClass("fa-star fa");
	});

	
	
	
	
	
	locationSatar1.bind("click",function(){
		var locationScore = locationSatar1.attr("locationScore");
		$("#locationscore").val(locationScore);
		locationSatar1.removeClass("fa fa-star-o");
		locationSatar1.addClass("fa-star fa");
		locationSatar2.addClass("fa fa-star-o");
		locationSatar3.addClass("fa fa-star-o");
		locationSatar4.addClass("fa fa-star-o");
		locationSatar5.addClass("fa fa-star-o");
		
	});
	
	locationSatar2.bind("click",function(){
		var locationScore = locationSatar2.attr("locationScore");
		$("#locationscore").val(locationScore);
		locationSatar1.removeClass("fa fa-star-o");
		locationSatar1.addClass("fa-star fa");
		locationSatar2.removeClass("fa fa-star-o");
		locationSatar2.addClass("fa-star fa");
		locationSatar3.addClass("fa fa-star-o");
		locationSatar4.addClass("fa fa-star-o");
		locationSatar5.addClass("fa fa-star-o");
	});
	
	locationSatar3.bind("click",function(){
		var locationScore = locationSatar3.attr("locationScore");
		$("#locationscore").val(locationScore);
		locationSatar1.removeClass("fa fa-star-o");
		locationSatar1.addClass("fa-star fa");
		locationSatar2.removeClass("fa fa-star-o");
		locationSatar2.addClass("fa-star fa");
		locationSatar3.removeClass("fa fa-star-o");
		locationSatar3.addClass("fa-star fa");
		locationSatar4.addClass("fa fa-star-o");
		locationSatar5.addClass("fa fa-star-o");
	});
	locationSatar4.bind("click",function(){
		var locationScore = locationSatar4.attr("locationScore");
		$("#locationscore").val(locationScore);
		locationSatar1.removeClass("fa fa-star-o");
		locationSatar1.addClass("fa-star fa");
		locationSatar2.removeClass("fa fa-star-o");
		locationSatar2.addClass("fa-star fa");
		locationSatar3.removeClass("fa fa-star-o");
		locationSatar3.addClass("fa-star fa");
		locationSatar4.removeClass("fa fa-star-o");
		locationSatar4.addClass("fa-star fa");
		locationSatar5.addClass("fa fa-star-o");
	});
	
	locationSatar5.bind("click",function(){
		var locationScore = locationSatar5.attr("locationScore");
		$("#locationscore").val(locationScore);
		locationSatar1.removeClass("fa fa-star-o");
		locationSatar1.addClass("fa-star fa");
		locationSatar2.removeClass("fa fa-star-o");
		locationSatar2.addClass("fa-star fa");
		locationSatar3.removeClass("fa fa-star-o");
		locationSatar3.addClass("fa-star fa");
		locationSatar4.removeClass("fa fa-star-o");
		locationSatar4.addClass("fa-star fa");
		locationSatar5.removeClass("fa fa-star-o");
		locationSatar5.addClass("fa-star fa");
	});
	
	
})
