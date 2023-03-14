// Locating mouse crusor and stuffs

document.getElementById('for_mouse').onmousemove = getCoordinates;

function getCoordinates(event){
    var x = event.clientX;
    var y= event.clientY;
    document.getElementById('xco').innerHTML=" ClientX: "+x;
    document.getElementById('yco').innerHTML=" ClientY: "+y;
}
