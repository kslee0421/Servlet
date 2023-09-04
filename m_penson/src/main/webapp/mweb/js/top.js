var storage = window.localStorage.getItem("userid");
var storage2 = window.localStorage.getItem("userpw");
f.mid.value =storage;
f.mpw.value =storage2;
/*아이디저장기능*/
function id_save(){
	var ck = document.getElementById("saveid");
	if(f.mid.value==""){
		alert("아이디를 입력하셔야만 해당 기능을 사용할 수 있습니다.");
		ck.checked = false;
	}
	else{
		if(ck.checked==true){
			window.localStorage.setItem("userid",f.mid.value);
			window.localStorage.setItem("userpw",f.mpw.value);
		}
		else{
			window.localStorage.setItem("userid","");
			window.localStorage.setItem("userpw","");
		}
	}
}
function login(){
	if(f.mid.value==""){
		alert("아이디를 입력해주세요");
		f.mid.focus();
		return false;
	}else if(f.mpw.value==""){
		alert("패스워드를 입력해주세요");
		f.tid.focus();
		return false;
	}else{
		return;
	}
}
