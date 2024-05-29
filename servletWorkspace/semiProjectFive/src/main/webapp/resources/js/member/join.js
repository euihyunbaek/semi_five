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



