// Constructors : doesn't return anything & start with a capital letter

function Person(name ,age){
    this.name = name,
    this.age = age
}

Person.prototype.talk = function(){
    console.log(`hi my name is ${this.name}`)
}

let p1 =  new Person("krish",20); 
let p2 =  new Person("john",26);