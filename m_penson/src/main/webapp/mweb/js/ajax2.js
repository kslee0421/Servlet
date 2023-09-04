var data; //ajax
var array; // json값을 배열로 받을 수 있는 변수명
//const array;  //배열값 상수값....위에서 선언하면 값이 바뀌지 않게된다.
function calldata(data){
	console.log(data);
	this.array = data;
}
function abc(){
	//console.log(this.array);
	function win(){  //통신 규약에 대한 인스턴스를 새롭게 생성하는 역할
		if(window.XMLHttpRequest){
			return new XMLHttpRequest();
		}
	}
	function file(){
		//서버 접속 성공유/무를 확인 또한 해당 로드할 파일이 정상적으로 로드가 되었는지 확인하는 공간
		if(data.readyState==XMLHttpRequest.DONE && data.status==200){
			//JSON파일은 기본이 문자열 입니다. 해당 문자열을 정상적인 배열화 
			//시켜주는 함수 입니다. (JSON.parse)
			array = JSON.parse(this.response); //response : 결과값 반환
			console.log(array);
		}
		else if(data.status==404 || data.status==405 ){
			console.log("해당 파일 및 서버에 접속 할 수 없습니다.");
		}
	}
	var w =0;
	var htmlcode="";
	var ids = document.getElementById("product"); //여기다 찍을게
	while(w <6){
		var img ="./img/hotel_04.jpg";
		var pnam ="[제주시] 금호제주 리조트";
		var pmoney = "107,000"; 
		htmlcode += `
        <li>
            <div>
                <span><img src="`+img+`"></span>
                <span>`+pname+`</span>
                <span>`+Nmuber(pmoney).toLocaleString+`원</span>
            </div>
        </li>
		`;
		w++;			
	}	
	ids.innerHTML = htmlcode;
	console.log(htmlcode);
	
	
	
	
	console.log(array);
	//sort
	let html = document.getElementById("list");
	//fot in => 배열 전용 반복문
	var s;

	//sort
	array["penson_product"].sort(function(a,b){
	//	console.log(b);
	/*	return b["point"] - a["point"]; 올림차순*/
		return a["a_wkimg"] - b["a_wkimg"];//내림차순
	}); 
//	console
	for(s in array["penson_product"]){
		//console.log(s);
		html.innerHTML += "<li>";
		var f;
		for(f in array["penson_product"][s]){
			//console.log(f);
			html.innerHTML +"</div>";
			if(f =="a_wkimg"){
			html.innerHTML += "<span>"+ array["penson_product"][s][f].toLocaleString()+ "</span>";	
			}
			else{
			html.innerHTML += "<span>"+ array["penson_product"][s][f]+"</span>";	
			}
			;
			//console.log(this.array[member_list][s][f]);
			html.innerHTML += "</li>";	
		};
	}
	data = win(); //통신 오픈
	data.onreadystatechange = file; //해당 조건에 맞는 결과값을 출력하는 역할
	data.open("get","./data.json",true); 
	/*어떤 파일을 로드할 것인지 설정("통신형태", "파일 또는 URL", "비동기&동기")
	post, get, put, delete, update, fetch
	*/
	data.send();   //해당 서버에 접속 및 실행
}




