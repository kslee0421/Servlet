//console.log("path");
/*
storage : local, session : 웹브라우져에 작은 메모리를 ㅎ활용하여 해당 정보를 기억시켜 놓는 공간
단점 : 브라우져의 공간이 다를 경우 storage값이 유/무로 나누어집니다.
window.localStorage.setItem("별명", 값 또는 변수명) : storage에 저장
window.localStorage.getItem("별명") : storage에 있는 별명명칭 값을 가져올때 사용
*/
var storage = window.localStorage.getItem("userid");
f.uid.value =storage;
/*아이디저장기능*/
function id_save(){
	var ck = document.getElementById("saveid");
	if(f.uid.value==""){
		alert("아이디를 입력하셔야만 해당 기능을 사용할 수 있습니다.");
		ck.checked = false;
	}
	else{
		if(ck.checked==true){
			window.localStorage.setItem("userid",f.uid.value);
		}
		else{
			window.localStorage.setItem("userid","");
		}
	}
}
function login(){
	if(f.uid.value==""){
			alert("아이디가 입력되지 않았습니다.");
			f.uid.focus();
			return false; //꼭 넣어야한다
	}
	else if(f.upw.value==""){
			alert("패스워드가 입력되지 않았습니다");
			f.upw.focus();
			return false; //꼭 넣어야한다
	}
	else{
	f.submit();   // form태그안에 있는 사용자값을 전송 명령어			
	}
}
/*회원가입*/
function join(){
	//alert('aa');
		if(f.sid.value==""){
			alert("아이디가 입력되지 않았습니다.");
		}
		else if(f.sname.value==""){
			alert("이름이 입력되지 않았습니다.");
		}
		else if(f.spw.value==""){
			alert("패스워드 입력창이 입력되지 않았습니다.");
		}
		else if(document.getElementById(spwc)==""){
			alert("패스워드확인란이 입력되지 않았습니다.");
		}
		else if(f.stel.value==""){
			alert("전화번호란이 입력되지 않았습니다.");
		}
		else if(f.semail.value==""){
			alert("이메일란이 입력되지 않았습니다.");
		}
		else{
			if(f.stel.value.length<10){
				alert('올바른 휴대폰 번호를 입력하세요.')
			}
			else if(isNaN(f.stel.value)==true){ //숫자로 변환했을때 true로 뜨면 문자가 들어간거(파서인트 같은거)
				alert('정상적인 휴대폰 번호를 입력하세요')
			}
			else if(f.semail.value.indexOf("@")==-1){//자바에도 있다 문자열중에서 @라는 단어가 있는지 없는지 판별 ==-1은 : 그 문자가 존재하지 않습니다.
				alert('올바른 이메일 주소를 입력하세요')
			}
			else{
				f.submit();   // form태그안에 있는 사용자값을 전송 명령어
			}
			
		}
}