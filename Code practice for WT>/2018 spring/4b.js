document.getElementById('click').onclick=factorial;

function factorial(){
    var string=prompt("Enter a number.");
    var num=parseInt(string);
    var fact=1;
    for(var i=1;i<=num;i++){
        fact=fact*i;
    }
    alert("The factorial is: "+fact);
}