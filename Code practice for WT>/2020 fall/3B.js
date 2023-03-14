//below is an example of dom 0 
document.getElementById("tf3").onfocus = randomFun();

function randomFun(){
    document.getElementById("tf3").style.backgroundColor="green";
   
}
// below is an example of dom 2
tf2.addEventListener('focus',randomFun2,false);

function randomFun2(){
    document.getElementById("tf2").style.backgroundColor="grey";
}