//Example that js is oop.

var person={
    name: "Led Zeppelin",
    age: 14,
    gender: 'male',
    displayname: function(){
        console.log(this.name);
    }
}
document.getElementById('submit').onclick=person.displayname;