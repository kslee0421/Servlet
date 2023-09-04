window.onload = function(){
	var f;
	var sc = "";
	var sc2 = "";
	for(f=1; f<=6; f++){
		sc= Math.floor(Math.random() * 10);
		sc2+=sc;	
	}
	document.getElementById("box").value =sc2;

window.onload =function join(){
	console.log(f.mpw.value);
	console.log(document.getElementById(mpwc));
	//alert('aa');
		if(f.mid.value==""){
			alert("아이디가 입력되지 않았습니다.");
		}
		else if(f.mname.value==""){
			alert("이름이 입력되지 않았습니다.");
		}
		else if(f.mpw.value==""){
			alert("패스워드 입력창이 입력되지 않았습니다.");
		}
		else if(document.getElementById(mpwc)==""){
			alert("패스워드확인란이 입력되지 않았습니다.");
		}
		else if(f.memail.value==""){
			alert("이메일란이 입력되지 않았습니다.");
		}
		else if(f.mtel.value==""){
			alert("전화번호란이 입력되지 않았습니다.");
		}
		else{
			if(f.mid.value.length>16 && f.mid.value.length<5){
				alert('올바른 아이디를 입력하세요.')
			}
			else if(f.mpw.value.length<6 && f.mpw.value.length>13 ){
				alert('올바른 비밀번호를 입력하세요.')
			}
			else if(isNaN(f.mtel.value)==true){ //숫자로 변환했을때 true로 뜨면 문자가 들어간거(파서인트 같은거)
				alert('정상적인 휴대폰 번호를 입력하세요')
			}
			else if(f.mpw.value!=f.mpwc.value){
				alert('비밀번호 확인값이 잘못되었습니다')
			}
			else if(f.memail.value.indexOf("@")==-1){//자바에도 있다 문자열중에서 @라는 단어가 있는지 없는지 판별 ==-1은 : 그 문자가 존재하지 않습니다.
				alert('올바른 이메일 주소를 입력하세요')
			}
			else if(f.mcode.value!=f.mpwc.sc2){
				alert('비밀번호 확인값이 잘못되었습니다')
			}
			else{
				f.submit();   // form태그안에 있는 사용자값을 전송 명령어
			}
		}
	}			
}
