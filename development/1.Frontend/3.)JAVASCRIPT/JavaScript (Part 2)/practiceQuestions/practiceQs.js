//question 1
let num = 20

if(num%10 == 0)
{
    console.log("good");
}
else{
    console.log("bad");
}

//question 2

//uncomment to execute the question 2 code

// let name = prompt("Enter your name : ");
// let age = prompt("Enter your age : ");

// alert(`${name} is ${age} years old. `);


//question 3
let quaterNo = 4;

switch(quaterNo)
{
    case 1:
        console.log("January,February,March");
        break;

    case 2:
        console.log("April,May,June");
        break;

    case 3:
        console.log("July,August,September");
        break;

    case 4:
        console.log("October,November,December");
        break;

    default:
        console.log("pls enter a valid number");

}


//question 4
// drive ke sol mai iska ans galat diya hai apna sahi hai bas if condition mai unhone variable ka naam galat likha hai

let str = "Apples";

if(((str[0] === 'a') || (str[0] === 'A')) && (str.length>5))
{
console.log("Its a golden string");
}
else{
    console.log("Not a golden string")
}

//question 5

let a = 15;
let b = 19;
let c = 90;

if(a>b){
    if(a>c)
    {
        console.log(`${a} is largest`);
        
    }
    else{
        console.log(`${c} is largest`)
    }
}
else {
    if(b>c)
    {
        console.log(`${b} is largest`);
    }
    else{
        console.log(`${c} is largest`);
    }
}

//question 6

let num1 = 32;
let num2 = 27;

let ld1 = num1%10;
let ld2 = num2%10;

if(ld1 === ld2)
{
    console.log("last digits are same of given two numbers");
}
else{
    console.log("last digits are not same of given two numbers");
}