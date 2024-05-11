let Passwordfield = document.getElementById('Password');
let Password = '';
let Usernamefield = document.getElementById('Username');
let Username = '';
let form = document.getElementById('Submit');
form.addEventListener('click', ()=>{
    Password = Passwordfield;
    Username = Usernamefield;
    console.log(Username)
    console.log(Password)
})