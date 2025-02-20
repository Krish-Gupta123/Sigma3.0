// console.log("apna college");
// console.log("hello js");
let a =  5;
let b = 10;
console.log("sum is : ",a+b)
//this is comment


//template literals
console.log("TEMPLATE LITERALS\n");


let name =  "john";
console.log(`Hello , ${name}`);


let penPrice = 2;
let erasorPrice = 3;

// let output = "the total price is : "+(penPrice+erasorPrice)+" Rupees";
let output = `the total price is : ${penPrice + erasorPrice} Rupees`;//back ticks
console.log(output);

console.log(`penprice : ${penPrice} and erasor price is ${erasorPrice}`);

//operators in js
console.log("OPERATORS IN JS\n");


//arithmatic operators
console.log("ARITHMETIC OPERATORS\n");

let c= 10;
let d = 5;
console.log(c+d);
console.log(c-d);
console.log(c*d);
console.log(c/d);
console.log(c%d);
console.log(c**d);

//unary operators
console.log("UNARY OPERATORS\n");

console.log(c++);//10
console.log(++c);//12

//assignment operator
console.log("ASSIGNMENT OPERATORS\n");

let y = 10;
let z = 5;
z = y;
console.log(z);

//comparision operators
console.log("COMPARISION OPERATORS\n");

let age = 18;
console.log(age > 18);//false
console.log(5=='5');//true.....compares value
console.log(5==='5');//false.......compares type and then value
console.log(0=='');
console.log(0==='');
console.log('a'<'A');//js compares using unicode
console.log('P'<'p');
console.log('a'<'b')

//logical operators
console.log("LOGICAL OPERATORS\n");

console.log(true&&true);
console.log(true&&false);
console.log(false&&true);
console.log(false&&false);

console.log(true||true);
console.log(true||false);
console.log(false||true);
console.log(false||false);

console.log((!true));
console.log((!false));

let xyz = 70;

if(xyz>=33 && xyz>= 80)
{
    console.log("and");
    console.log("A+");
}

if(xyz>=33 || xyz>= 80)
    {
        console.log("or");
        console.log("A+");
    }
    
if(!(xyz <= 33))
{
    console.log("not");
    console.log("A+");
}

if((xyz>33 &&  xyz<=80) || !true)
{
    console.log("logic operators all mixed");
}

//Conditional Statements
console.log("Conditional Statements\n");

//if statements
let Age = 2;
if(Age >= 18)
{
    console.log("you can vote");
    console.log("you can drive");
    let p = 5;
    console.log(p*5);
}
if(Age<18)
{
    console.log("you cannot vote")
}

let fName = "Krish";
console.log(`hello ${fName}`);

//practice question
console.log("create a traffic light system that shows what to do based on colors");

let color = 'green';

if(color === 'red')
{
console.log(`color : ${color} ......stop`);
}
if(color === 'yellow')
{
console.log(`color : ${color} ......slow down`);
}
if(color === 'green')
{
    console.log(`color : ${color} ......go`);
}

//else if statements

let biologicalAge =  10;

if(biologicalAge>=18)
{
    console.log("you can vote");
}
else if(biologicalAge>=18)
{
console.log("you cannot vote");
}
else if(biologicalAge<18)
{
    console.log("you cannot vote2");
}

let marks = 25;
if(marks>= 80)
{
    console.log("A+");
}
else if(marks>= 60)
{
    console.log("A");
}
else if(marks>= 33)
{
    console.log("B");
}
else if(marks<33)
{
    console.log("F");
}

//else statements

let physicalAge = 10;
if(physicalAge >= 18)
{
    console.log("you can vote");
}
else{
    console.log("you cannot vote");
}


let trafficLigthColor = 'black';

if(trafficLigthColor === 'red')
{
console.log(`color : ${trafficLigthColor} ......stop`);
}
else if(trafficLigthColor === 'yellow')
{
console.log(`color : ${trafficLigthColor} ......slow down`);
}
else if(trafficLigthColor === 'green')
{
    console.log(`color : ${trafficLigthColor} ......go`);
}
else{
    console.log("traffic light is broken !!!");
}

//practice question
console.log("create a system to calculate popcorn prices based on the size the customer asked for : ");
console.log("if size is 'XL',price is Rs 250");
console.log("if size is 'L',price is Rs 200");
console.log("if size is 'M',price is Rs 100");
console.log("if size is 'S',price is Rs 50");

let size = 'XL';

if(size === 'XL')
{
console.log("price is Rs.250");
}else if(size === 'L')
{
console.log("price is Rs.200");
}else if(size === 'M')
{
console.log("price is Rs.100");
}else if(size === 'S')
{
console.log("price is Rs.50");
}
else{
console.log("inavalid size");
}


//Nested if-else
console.log("NESTED IF-ELSE\n");

let Marks = 93;
if(Marks>=33)
{
    console.log("Pass");
    if(Marks>= 80)
    {
        console.log("Grade : O");
    }
    else{
        console.log("Grade : A");
    }
}
else{
    console.log("better luck next time !");
}


