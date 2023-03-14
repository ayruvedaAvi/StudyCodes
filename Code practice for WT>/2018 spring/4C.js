var div;
function grabFun(event){
    //console.log("Grab function called.");
    div=event.currentTarget;
    document.addEventListener('mousemove',moveFun,false);
    document.addEventListener('mouseup',dropFun,false);

    event.stopPropagation();
    event.preventDefault();
}

function moveFun(event){
    //console.log("Move function called.");
    div.style.left=event.clientX+"px";
    div.style.top=event.clientY+"px";
    
    event.stopPropagation();
}

function dropFun(event){
    document.removeEventListener('mousemove',moveFun,false);
    document.removeEventListener('mouseup',dropFun,false);

    event.stopPropagation();
}

function page(){
    confirm("Do you accept the cookies?");
}