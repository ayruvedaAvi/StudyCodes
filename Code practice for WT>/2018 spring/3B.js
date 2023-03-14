document.getElementById('name').onblur=validateName;

function validateName(){
    var name=document.getElementById('name').value;
    if(name==''){
        alert("Name cannot be empty");
        return false;
    }else{
        var index=name.search(/[0-9]/);
        if(index==-1){
            alert("Where is the number?");
            return false;
        }else{
            alert("Verification successful.");
            return true;
        }
    }
}