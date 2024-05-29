
  

// 

function changeFormMember(){
    const form = document.querySelector("#loginForm");
    const bizForm = document.querySelector("#bizLoginForm");
    const adminForm = document.querySelector("#adminLoginForm");
    form.classList.add("active");
    bizForm.classList.remove("active");
    adminForm.classList.remove("active");
}

function changeFormBiz(){
    const form = document.querySelector("#loginForm");
    const bizForm = document.querySelector("#bizLoginForm");
    const adminForm = document.querySelector("#adminLoginForm");
    form.classList.remove("active");
    bizForm.classList.add("active");
    adminForm.classList.remove("active");
}

function changeFormAdmin(){
    const form = document.querySelector("#loginForm");
    const bizForm = document.querySelector("#bizLoginForm");
    const adminForm = document.querySelector("#adminLoginForm");
    form.classList.remove("active");
    bizForm.classList.remove("active");
    adminForm.classList.add("active");
}