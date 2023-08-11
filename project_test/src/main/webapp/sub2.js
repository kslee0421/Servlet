jQuery(document).ready(function(){
	$('.guideText').guideText({});

	$('.toggle').each(function(){
		var class_on = 'on';
		var toggle = $(this);
		var alltoggle = toggle.find('div');
		var active = toggle.find('.active');
		active.addClass(class_on);	
			
		alltoggle.click(function(){
			var tip = $(this); 
			var other = $(this).next();
			alltoggle.removeClass(class_on)
			tip.addClass(class_on);
		});
	});
});
