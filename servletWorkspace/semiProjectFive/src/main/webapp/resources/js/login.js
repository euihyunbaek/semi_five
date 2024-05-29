
  document.addEventListener("DOMContentLoaded", function() {
    const tabs = document.querySelectorAll('.tab');
    const loginForm = document.getElementById('loginForm');
  
    tabs.forEach(tab => {
        tab.addEventListener('click', () => {
            tabs.forEach(t => t.classList.remove('active'));
            tab.classList.add('active');
           
        });
    });

  });

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