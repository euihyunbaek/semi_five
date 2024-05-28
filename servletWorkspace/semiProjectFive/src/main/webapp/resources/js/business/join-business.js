// //admin 아이디 사용 못하게 방지
// function checkDup() {
//   const idTag = document.querySelector("#id");
//   if(idTag.value === "admin") {
//     alert("관리자 사칭은 안됩니다.");
//     idTag.value = "";
//   }
// }

// //비밀번호 작성 조건 알려주기
// const pwdTag = document.querySelector("#pwd");
// pwdTag.addEventListener( "focus", pwdcondition ); // 더블클릭할때 동작하게 하고싶으면 dblclick

// function pwdcondition() {
//   document.querySelector("#pwdinfo");
//   pwdinfo.innerText = '비밀번호는 8~16글자. 최소 하나 이상의 영대문자. 최소 하나이상의 숫자. 최소 하나 이상의 특수문자';
// }

function checkNickDup() {
  const obj = {
    url : "/app/member-business/nick-dup",
    type : "get",
    success : function(x) { // 서버로부터 응답 받은 문자열을 x에 저장함. EventListener 가 x에 문자열을 넣으면서 호출함.
      console.log(x);

      if(x === "good") {
        alert("사용 가능한 닉네임 입니다 !");
      } else {
        alert("중복된 닉네임 입니다...");
      }
    },
    error : function(){ console.log("통신 실패...");},
  };

  $.ajax( obj );
}

function checkIdDup() {
  const obj = {
    url : "/app/member-business/id-dup",
    type : "get",
    success : function(x) { // 서버로부터 응답 받은 문자열을 x에 저장함. EventListener 가 x에 문자열을 넣으면서 호출함.
      console.log(x);

      if(x === "good") {
        alert("사용 가능한 아이디 입니다 !");
      } else {
        alert("중복된 아이디 입니다...");
      }
    },
    error : function(){ console.log("통신 실패...");},
  };

  $.ajax( obj );
}

// 탑버튼 관련
document.addEventListener("DOMContentLoaded", function() {
  // const sidebarbtn = document.querySelector(".fi-rr-menu-burger");

  // if (sidebarbtn) {
  //   sidebarbtn.addEventListener("click", function() {
  //     const side = document.querySelector("#side-bar");
  //     if (side) {
  //       side.classList.toggle("active");
  //     }
  //   });
  // }

  const topButton = document.querySelector("#top-button");

  if (topButton) {
    topButton.addEventListener("click", function() {
      window.scrollTo({ top: 0, behavior: 'smooth' });
    });
    // scroll이 될때만 TOP 버튼 보이게 하기
    window.addEventListener("scroll", function() {
      if (window.scrollY > 100) {
        topButton.style.display = "block";
      } else {
        topButton.style.display = "none";
      }
    });
  }
});
