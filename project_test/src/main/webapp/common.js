jQuery(document).ready(function(){ 	var base = 100; //확대비율 초기값
	var mybody = $('body');
	$('#zoom span').on('click',function(){
		var zNum = $('#zoom span').index(this);
		if(zNum == 0){ //확대(+)
			base=100;
			
		}else if(zNum == 1){ //100%
			base+=10;
		}else{
			base-=10;
		}
		mybody.css("overflow-x","auto")
			.css("transform-origin","50% 0")
			.css("transform","scale("+base/100+")")
			.css("zoom",+base+"%");
		return false;	
	}); 
	
	$('#sound .print').on('click',function(){
		window.print();
		return false;
	});
	
    var balloon = $('<div class="balloon"></div>').appendTo('body');

	function updateBalloonPosition(x,y){
		balloon.css({left: x+15 , top : y});
	};
	
	function showBalloon(){
		balloon.stop();
		balloon.css('opacity', 0).show();
		balloon.animate({opacity:1},1000);
		
	}
	function hideBalloon(){
		balloon.stop();
		balloon.animate({opacity:1},1000,function(){
			balloon.hide() //다음 나타나는걸 준비하기위해
		});
		
		
	}
	
	$('.showBalloon').each(function(){
		var element = $(this);
		var text = element.attr('title'); //안에 문자열이 뭐양?
		element.attr('title','');  //title을 비웡~
		element.hover(
			function(event){
				balloon.text(text);
				updateBalloonPosition(event.pageX,event.pageY)  //마우스의 X좌표 jQuery 다
				/* balloon.show(); */
				showBalloon()
			},
			function(){
				/* balloon.hide(); */
				hideBalloon()
			}
		);
		element.mousemove(function(event){
			updateBalloonPosition(event.pageX,event.pageY)
			//페이지를 1px이 움직여도 따라다님
		});
	}) 
	
	$("form[name=relF]").on("submit",function(){
		var url = $("select",this).val();
		window.open(url);
		return false;
	});
	
	var defaultTop=parseInt($("#quickMenu").css("top")); // top하나만 쓰면 top값이 뭐양?
	$(window).on('scroll',function(){
		var scv = $(window).scrollTop(); //scrollTop - widow오른쪽의 scroll의 탑부분
		if (scv < 100){scv = 100}
		$("#quickMenu").stop().animate({top:scv+defaultTop+"px"},1000);
	});
	$('#quickMenu').css({top:'492px'},1000);
	
});






















