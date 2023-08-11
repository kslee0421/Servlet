jQuery(document).ready(function(){
	 window.open("news.htm","","resizable=no, toolbar=no, width=670, height=760")
	// jumbo Tron
	var panel_width = $('.sliderPanel>img').width();
	var size = $('.controlButton').size();

	$('.sliderText').css('left',-1400).each(function(index){
		$(this).attr('data-index',index);
	});
	$('.controlButton').each(function(index){
		$(this).attr('data-index',index);
	}).click(function(){
		var index = $(this).attr('data-index');
		moveSlider(index);

		
	});
	
	function moveSlider(index){
		randomNumber = index;
		var willMoveLeft = -(index*(panel_width+264));
		
		$('.sliderPanel').animate({left:willMoveLeft},'500');
		$('.controlButton[data-index='+index+']').addClass('active');
		$('.controlButton[data-index!='+index+']').removeClass('active');
		$('.sliderText[data-index='+index+']').show().animate({left:20},500);
		$('.sliderText[data-index!='+index+']').hide().animate({left:-1400},500);
		
	};
	var randomNumber = Math.round(Math.random()*size-1);
	moveSlider(randomNumber);
	
	var setIntervalId;
	function timer(){
		setIntervalId = setInterval(function(){
			randomNumber++;
			if(randomNumber==size){randomNumber=0;}
			//moveSlider(randomNumber);
			$('.controlButton').eq(randomNumber).trigger('click');
		},1000);
	}
	timer();
	$('.animationCanvas').hover(
		function(){
			clearInterval(setIntervalId);
		}, 
		function(){
			timer();
		}
	);
	
	$('.left').click(function(){
		randomNumber--;
		if(randomNumber<0){randomNumber=size-1}; //5로가
		$('.controlButton').eq(randomNumber).trigger('click');
	});
	$('.right').click(function(){
		randomNumber++;
		if(randomNumber==size){randomNumber=0};
		moveSlider(randomNumber); //위에랑 같음
	});
	
	
	$('.guideText').each(function(){
	var guideClass = 'mute';                    
		var guideText = this.defaultValue;
		var element = $(this);
		element.focus(function(){
			if(element.val()===guideText){      
				element.val('');                
				element.removeClass(guideClass);   
			}
		}).blur(function(){                       
			if(element.val()===''){             
				element.val(guideText);         
				element.addClass(guideClass);      
			}
		});
		if(element.val()===guideText){          
			element.addClass(guideClass);
		};
	});
	
	$('.hoverButton').each(function(){
		var hoverButton = $(this);
		$(this).hover(
			function(){
				hoverButton.addClass('hover');
			},
			function(){
				hoverButton.removeClass('hover');
			}
		);
	});
	

	$('#bnTop div').each(function(){
		var box = $(this);
		box.hover(
			function(){
				box.find('>a').stop().animate({'margin-top':'-118px'},500);
			},
			function(){
				box.find('>a').stop().animate({'margin-top':'0px'},500);
			}
		);
	});

	$('.tabSet').each(function(){
		var topDiv = $(this);
		var anchors = topDiv.find('div.tabs a');
		var panelDivs = topDiv.find('div.panel');
		var topToggle = $(this).find('div.toggle');
		var alltoggle = topToggle.find('div.tip');
		var activeToggle = topToggle.find('div.active');
		var lastAnchor;
		var lastPanel;
		anchors.show();
		lastAnchor = anchors.filter('.on');
		lastPanel = $(lastAnchor.attr('href'));
		panelDivs.hide();
		lastPanel.show();
		activeToggle.addClass('on');
		
 		alltoggle.click(function(event){
			event.preventDefault();
			var currentToggle = $(this);
			var currentAnchor = currentToggle.find('a');
			var currentPanel = $(currentAnchor.attr('href'));
			alltoggle.removeClass('on');
			currentToggle.addClass('on');
			lastAnchor.removeClass('on');
			currentAnchor.addClass('on');
			lastPanel.hide();
			currentPanel.show();
			lastAnchor = currentAnchor;
			lastPanel = currentPanel;

		});
	});
	
	
	
    $('.rollover').each(function(){
		var a = $(this);           
		var img = a.find('img');      
		var src_off = img.attr('src');   
		var src_on = src_off.replace('-off','-on');     

		$('<img />').attr('src',src_on); 

		a.bind('mouseenter focus click',function(){
			img.attr('src',src_on);
		});
		a.bind('mouseleave blur',function(){
			img.attr('src',src_off);
		});				
	});
	
	$.getJSON('http://api.openweathermap.org/data/2.5/weather?id=1835848&appid=67acbd15d63dae006f5c472ea696081c&units=metric', function(data){
			var $minTemp = data.main.temp_min;
			var $maxTemp = data.main.temp_max;
			var $cTemp = data.main.temp;
			var $now = new Date(Date.now());
			var month = $now.getMonth()+1;
			var $cDate = $now.getFullYear() + '년 ' + month +'월 '+$now.getDate()+'일 '+$now.getHours()+'시 '+ $now.getMinutes()+'분';
			var $wIcon = data.weather[0].icon;	

			$('.clowtemp').append($minTemp);
			$('.ctemp').append($cTemp);
			$('.chightemp').append($maxTemp);
			$('.cweather').append($cDate);
			$('.cicon').append('<img src="http://openweathermap.org/img/wn/'+$wIcon+'.png" />');			
	});
	
	if($.cookie("pop") != "no") $("#pop_wrap").show();
	$("#pop_wrap").css("cursor","move").draggable();
	$("#pop_wrap area:eq(0)").on("click",function(){
		$("#pop_wrap").fadeOut("fast");
		return false;
	});
	$("#pop_wrap area:eq(1)").on("click",function(){
		$.cookie("pop","no",{expires:1});
		$("#pop_wrap").fadeOut("fast");
		return false;
	});	
	
});

