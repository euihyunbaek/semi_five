document.addEventListener("DOMContentLoaded", function() {
  const sidebarbtn = document.querySelector(".fi-rr-menu-burger");

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
