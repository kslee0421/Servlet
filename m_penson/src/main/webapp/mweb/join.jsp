<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 중단 -->
<section class="subpage">
<form method="post" action="./join_ok.do" id="f"> 
    <div class="member_agree">
    <p>회원 기본 정보입력</p>
    <ol class="join_ol">
    <li><input type="text" id="mid" name="mid"class="join_input1" placeholder="아이디 (영문/숫자 6~16자리)" maxlength="16"></li>
    <li><input type="text" id="mname" name="mname" class="join_input1" placeholder="이름 (홍길동)" maxlength="10"></li>
    <li><input type="password" id="mpw" name="mpw" class="join_input1" placeholder="비밀번호 (영문/숫자 6~12자리)" maxlength="12"></li>
    <li><input type="password" id="mpwc" class="join_input1" placeholder="동일한 패스워드를 입력하세요" maxlength="12"></li>
    <li><input type="email" id="memail" name="memail" class="join_input1" placeholder="이메일을 입력하세요" maxlength="35"></li>
    <li><input type="tel" id="mtel" name="mtel" class="join_input1" placeholder="연락처 ('-'는 미입력)" maxlength="11"></li>
    <li class="security">
    보안코드 : <input type="text" id="box" class="join_input2 bgcolor" maxlength="6" readonly="readonly">
    <input type="number" id="mcode"class="join_input2" placeholder="보안코드 6자리 입력" maxlength="6">
    </li>
    </ol>
    <input type="button" class="member_agreebtn" value="전송" onclick="join()">회원가입
    </div>
</form>    
</section>
<script src="./js/join.js?v=1"></script>
<script>
function join(){
	console.log(f.mpw.value);
	console.log(f.mpwc.value);
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
		else if(f.mpwc.value==""){
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
			else if((f.mpw.value)!=(f.mpwc.value)){
				alert('비밀번호 확인값이 잘못되었습니다')
			}
			else if(f.memail.value.indexOf("@")==-1){//자바에도 있다 문자열중에서 @라는 단어가 있는지 없는지 판별 ==-1은 : 그 문자가 존재하지 않습니다.
				alert('올바른 이메일 주소를 입력하세요')
			}
			else if((f.mcode.value)!=sc2){
				alert('보안코드를 잘못입력하셨습니다.')
			}
			else{
				f.submit();   // form태그안에 있는 사용자값을 전송 명령어
			}
		}
	}			

</script>