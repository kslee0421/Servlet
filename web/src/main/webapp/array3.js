let data; //변수가 같은 중복이름을 사용하지 않도록 하기위한 선언
let array;
//const array;  //배열값 상수값....위에서 선언하면 값이 바뀌지 않게된다.
function calldata(data){
	console.log(data);
	this.array = data;
}
function abc(){
	console.log(this.array);
	//sort
	this.array["member_list"].sort(function(a,b){
	//	console.log(b);
	/*	return b["point"] - a["point"]; 올림차순*/
		return a["point"] - b["point"];//내림차순
	}); 
//	console.log(this.array);
	let html = document.getElementById("list");
	//fot in => 배열 전용 반복문
	var s;
	for(s in this.array["member_list"]){
		//console.log(s);
		html.innerHTML += "<ul>";
		var f;
		for(f in this.array["member_list"][s]){
			//console.log(f);
			html.innerHTML +"</ul>";
			if(f =="point"){
			html.innerHTML += "<li>"+ this.array["member_list"][s][f].toLocaleString()+ "</li>";	
			}
			else{
			html.innerHTML += "<li>"+ this.array["member_list"][s][f]+"</li>";	
			}
			;
			//console.log(this.array["member_list"][s][f]);
			html.innerHTML += "</ul>";
			
		};
	};
}

/*function abc(){
	// 192.168.110.214 승균
	// 192.168.110.215 경민	
	// 192.168.110.216 경선
	// 192.168.110.217 유미
	
	console.log("test");
	function aaa(){
		if(window.XMLHttpRequest){
			return new XMLHttpRequest();
		}
	}
	function bbb(){
		if(data.readyState==XMLHttpRequest.DONE && data.status==200){
			const array = JSON.parse(this.response);
			console.log(array);
			
		}
	}
	data =aaa();
	data.onreadystatechange =bbb;
	data.open("get","http://192.168.110.217:8081/web/userlist.json",true);
	data.send();}
	*/