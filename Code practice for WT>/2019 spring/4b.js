var oldtopid='img3';
var oldtop='200px';
var oldleft='200px';

function moveImage(newtopid){
    console.log(newtopid);
    document.getElementById(newtopid).style.zIndex="10";
    document.getElementById(oldtopid).style.zIndex="0";
    oldtopid=newtopid;
}