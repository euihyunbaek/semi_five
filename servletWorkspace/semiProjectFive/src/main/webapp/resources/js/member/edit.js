/**
 * 
 */

console.log("zzz");

//document.querySelector(~~~~)
//$(~~~~);


function checkDup() {
    const id = document.querySelector("input[name=id]").value;
    const obj = {
    url : "/app/member/id-dup",
    type : "get",
    data : {"id" : id},
    success : function(x){
      console.log(x);
      if(x === "good"){
        alert("사용 가능한 아이디 입니다.");
      }else{
        alert("이미 사용중인 아이디입니다.")
      }
    },
    error : function() {console.log("통신실패입니다");},
  };

  $.ajax(obj);
}

function confirmQuit(){
	
	if(window.confirm("정말 탈퇴하시겠습니까?")){
		window.location.href="http://127.0.0.1:8888/app/member/quit"
	}
	else{
		
	}
}

