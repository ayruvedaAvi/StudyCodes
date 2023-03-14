document.getElementById('name').onblur=validateName;
document.getElementById('email').onblur=validateEmail;
document.getElementById('pass').onblur=validatePass;

function validateEmail(){
    var email=document.getElementById('email').value;
    if(email==""){
        alert("Email cant be empty.");
    }else{
        var index=email.search(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/);
        if(index==-1){
            alert("Invalid email.");
        }
        else{
            alert("Valid email.");
        }
    }
}

function validateName(){
    var name=document.getElementById('name').value;
    if(name==''){
        alert("Name cannot be empty.");
    }
}

function validatePass(){
    var pass=document.getElementById('pass').value;
    if(pass==''){
        alert('Password cant be empty.');
    }
}