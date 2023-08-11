$.fn.guideText=function(){  //potions 파라메터를 받아들이는 기능 
	this.each(function(){
		var element = $(this);
		var guideClass = 'mute'; 
		var guideText = this.defaultValue;
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
	return this;
};

//$용법 정리
//1. $뒤에 funtion 문서를 처음부터 끝까지 읽고 시작한다.
//2. $뒤에 셀렉터 jQury 객체 생성 메소드를 쓰기위해
//3. $뒤에 태그 동적생성
//4. $뒤에 플러그인 만들때
//5. $ ajax