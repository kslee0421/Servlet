

function b_write(){
	//조건문
	var t = CKEDITOR.instances.texts.getData();
	console.log(t);
		if(f.text.value)
	//alert('aa');
		if(f.btitle.value==""){
			alert("제목이 입력되지 않았습니다.");
		}
		else if(f.bname.value==""){
			alert("작성자가 입력되지 않았습니다.");
		}
		else if(f.bpass.value==""){
			alert("패스워드 입력창이 입력되지 않았습니다.");
		}
		else if(f.bcon.value==""){
			alert("내용이 입력되지 않았습니다.");
		}
		else{
			f.submit();   // form태그안에 있는 사용자값을 전송 명령어		
		}
}