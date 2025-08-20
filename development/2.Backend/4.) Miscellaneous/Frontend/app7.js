class Mammal{
    constructor(name){ // base class / parent class
        this.name = name;
        this.type = "warm-blooded";
    }
    eat(){
        console.log("I am eating");
    }
}

class Dog extends Mammal{ // child
    constructor(name){
        super(name);
    }
    bark(){
        console.log("bhau bhau!");
    }
    eat(){
        console.log("dog is eating"); // overriding eat function
    }
}

class cat extends Mammal{ // child
    constructor(name){
        super(name);
    }
    meow(){
        console.log("meow meow !");
    }
}