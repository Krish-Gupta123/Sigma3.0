//practice question

//img 1 question 1
console.log("IMG 1 question 1");
let str = "apple";

if((str[0] === 'a') && (str.length>3))
{
    console.log("good string");
}
else{
    console.log("not a good string");
}

//img 1 question 2
console.log("IMG 1 question 2");
//predict the output wala question hai
//output:- safe

let num = 12;

if((num%3 === 0) && ( (num+1 == 15) || (num-1 ==11)))
{
    console.log("safe");
} else {
    console.log("unsafe");
}

//truthy and falsy 
console.log("truthy & falsy");

if(true)
{
    console.log("it has value true");
}else{
    console.log("it has value false");
}

if(false)
{
        console.log("it has value true");
}else{
        console.log("it has value false");
}

//if condition mai 1 ke jagah baaki cheeze change karke output dekh lo :-1, 0,""," ",undefined,NaN,null,-0,"apnacollege"
if(" ")
{
    console.log("it has value true");
}else{
    console.log("it has value false");
}

//switch statements
let color = "green"

switch(color)
{
    case "red":
        console.log("stop");
        break;
    case "yellow":
        console.log("slow down");
        break;
    case "green":
        console.log("go");
        break;
    default:
        console.log("light is broken");
}

//practice Question
//img 2 

let day = 10;

switch(day)
{
    case 1:
        console.log("monday");
        break;
    case 2:
        console.log("tuesday");
        break;
    case 3:
        console.log("wednesday");
        break;
    case 4:
        console.log("thursday");
        break;
    case 5:
        console.log("friday");
        break;
    case 6:
        console.log("saturday");
        break;
    case 7:
        console.log("sunday");
        break;
    default:
        console.log("invalid day");
}

