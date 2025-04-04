// Note : ek ek part ko uncomment karke run karna ......pura file ek sath mat run karna

//functions *************************************************************************************************

// function hello()
// {
//     console.log("hello");
// }


// function printName()
// {
//     console.log("Apna College");
//     console.log("Shradha Khapra");
// }

// function print1To5(){
//     for(let i = 1 ; i<=5 ; i++)
//     {
//         console.log(i);
//     }
// }

// function isAdult()
// {
//     let age = 11;
//     if(age >=18)
//     {
//         console.log("is adult");
//     }
//     else{
//         console.log("not a adult");
//     }
// }

// hello();
// printName();
// print1To5();
// isAdult();



// practice question 1 **********************************************************************************
// create a funtion that prints a poem

// function printPoem()
// {
//     console.log("twinkle twinkle little star");
//     console.log("how i wounder what you are")
// }

// printPoem();


//practice question 2 ****************************************************************************************
//create a function to roll a dice and always display the value of a dice(1 to 6)

// function rollDice()
// {
//     let rand = Math.floor(Math.random()*6) + 1;
//     console.log(rand);
// }

// rollDice();


//function with arguments **************************************************************************************

// function printInfo(name,age)
// {
//     console.log(`${name}'s is ${age} years old`);
// }

// printInfo("Krish",19);
// printInfo("Karan");
// printInfo(29);//agar ek he parameter doge toh woh automatically name he consider karega usse

// function sum(a,b)
// {
//     console.log(a+b);
// }

// sum(34,19);
// sum(13,12);


// practiceQuestion 3 *****************************************************************************************
//create a function that gives average of 3 numbers

// function calAverage(a,b,c)
// {
//   let avg = (a+b+c)/3;
//   console.log(avg);
// }

// calAverage(3,7,8);
// calAverage(5,5,5);

// console.log(calAverage); // func defination

// // Note: kisse ko bhi identify karna hai ki func hai ya nhi hai simply uska naam likh dene ka console mai agar func hoga toh output mai f likhke uss function ke defination print ho jaegi

// // note: function ka khali naam likhna round brackets mat lagana round brackets lagate toh woh function calling samjhta


//practiceQuestion 4 ****************************************************************************************
//create a function to create multiplication table of a number

// function multiplicationTable(n)
// {
//     console.log("printing multiplication table of ",n);
//     for(let i = n ; i<= n*10 ; i += n)
//        { console.log(i);
// }
// }


// multiplicationTable(8);
// multiplicationTable(11);
// multiplicationTable(21);


//return keyword  *******************************************************************************************     

// function Sum(a,b)
// {
//     console.log("hello");
//     console.log("hello");
//     return a+b;
//     // console.log("hello2");// note : return statement ke baad wale statement execute nhi hote
//     // console.log("hello2");
// }

// console.log(Sum(8,3));
// console.log(Sum(3,5));
// console.log(Sum(Sum(3,4) , 5));


// function isAdult(age)
// {
//     if (age>=18)
//     {
//         return "adult";
//     }
//     else{
//         return "not an adult"
//     }
//     console.log("bye bye"); // note: return statement ke baad wale statements execute nhi hote same as java
// }

// console.log(isAdult(18));
// console.log(isAdult(12));
// console.log(isAdult(28));



//practiceQuestion 5 ****************************************************************************************
//create a function that returns the sum of numbers from 1 to n

// function sum(n)
// {
//     let sum = 0;
//     for(let i = 1 ; i <= n ; i++)
//     {
//         sum += i;
//     }
//     return sum;

// }

// console.log(sum(4));
// console.log(sum(5));
// console.log(sum(10));
// console.log(sum(100));
// console.log(sum(1000));
// console.log(sum(10000));

//practiceQuestion 6 ******************************************************************************************
// create a function that returns the concatenation of all the strings in an array


// let str = ["hi","hello","bye","!"];

// function concat(str)
// {
//     let result = "";
//     for(let i = 0 ; i<str.length;i++)
//         {
//             result += str[i];
//         } 
//         return result;
// }


// function concat2(str)
// {
//     let result = "";
//     for(let item of str)
//         {
//             result += item;
//         } 
//         return result;
// }


// console.log("1st wale ka function defination  " ,concat);
// console.log("2nd wale ka function defination  " ,concat2);

// console.log(" by 1st func : " ,concat(str));
// console.log(" by 2nd func : " ,concat2(str));


// scope ***********************************************************************************************************
//concepts same as java


// let sum = 54; // Global Scope

// function calSum(a,b)
// {
//     let sum = a+b; // Function Scope
//     console.log(sum);
// }

// calSum(2,3);
// console.log(sum); 



// block scope ***********************************************************************************************



//Note :  block scope sirf let aur const pe apply hota hai var keyword pe apply nhi hota
// {
//     let a = 5;
// }
// console.log(a); // gives error

//----------------------------------------------------------------

// {
//     const b = 10;
// }
// console.log(b); // gives error

//----------------------------------------------------------------


// {
//     var c = 15;
// }
// console.log(c);

//----------------------------------------------------------------

// for(let i = 1; i<= 5 ; i++)
// {
//     console.log(i); // block scope
// }

// console.log(i);


// lexical scope **********************************************************************************

// function outerfunc()
// {
//     let a = 5;
//     let b = 10;    
    
//     function innerfunc() // function scope
//     {
//         let x = 20;
//         console.log(a);//Note : we can use outerfunc variables in innerfunc but we cant do vice-versa 
//         console.log(b);
//     }

//     // console.log(x); //gives error
//     innerfunc(); // Note: innerfunc ko outer func ke andar he call kar sakte uske bahar nhi

// }

// outerfunc();


// practiceQuestion 7 ********************************************************************************
//predict the output : hello
//                     namaste

// let greet = "hello"; //global scope

// function changeGreet()
// {
//     let greet = "namaste";
//     console.log(greet);
//     function innerGreet()
//     {
//         console.log(greet); // lexical scope
//     }
// }
// // inner greet wale func ko change greet wale func ne kabhi call he nhi lagayi isliye woh run he nhi hoga

// console.log(greet);
// changeGreet();


//function expressions ***************************************************************************************

// let sum = function(a,b)
// {
//     return a+b;
// }

// console.log("function defination : ",sum);
// console.log(sum(3,5));

// let greet = function() {
//     console.log("hello");
// }
// greet();

// greet = function()
// {
//     console.log("namaste");
// }

// console.log(greet);
// greet();

//higher order functions *************************************************************************************

// function multipleGreet(func,n) // higher order function
// {
//     for(let i = 1 ; i<=n ;i++)
//     {
//         func();
//     }
// }

// let greet = function()
// {
//     console.log("hello");
// }

// multipleGreet(greet,5);
// multipleGreet(function() {console.log ("Jai Shree Ram");} , 100);


//higher order function (returns a function) **************************************************************

// function oddOrEvenFactory(request)
// {
//     if(request == "odd")
//     {
//         let odd = function(n)
//         {
//             console.log(!(n%2 == 0));
//         }
//         return odd;
//     }
//     else if(request == "even")
//     {
//         let even = function(n)
//         {
//             console.log(n%2 == 0);
//         }
//         return even;
//     }
//     else{
//         console.log("wrong request");
//     }
// }

// let request = "odd";
// console.log(request);
// let isOdd = oddOrEvenFactory(request);
// console.log(isOdd);
// isOdd(12);
// isOdd(11);

// let isEven = oddOrEvenFactory("even");
// console.log(isEven);
// isEven(20);
// isEven(25);


// or -----------------------------------------------------------------------------------------------

// function oddOrEvenFactory(request)
// {
//     if(request == "odd")
//     {
//         return function(n)
//         {
//             console.log(!(n%2 == 0));
//         }

//     }
//     else if(request == "even")
//     {
//         return function(n)
//         {
//             console.log(n%2 == 0);
//         }
        
//     }
//     else{
//         console.log("wrong request");
//     }
// }

// let request = "odd";
// console.log(request);
// let isOdd = oddOrEvenFactory(request);
// console.log(isOdd);
// isOdd(12);
// isOdd(11);

// let isEven = oddOrEvenFactory("even");
// console.log(isEven);
// isEven(20);
// isEven(25);

// methods ****************************************************************************************************
// methods are the action performed on an object

// const calculator = {
//     add: function(a,b)
//     {
//         return a+b;
//     },
    
//     sub : function(a,b)
//     {
//         return a-b;
//     },

//     mul : function(a,b)
//     {
//         return  a*b;
//     }
// };

// console.log(calculator);
// console.log(calculator.add);
// console.log(calculator.mul);
// console.log(calculator.add(4,5));
// console.log(calculator.sub(2,5));
// console.log(calculator.mul(3,4));


// or (method shorthand) -------------------------------------------------------------------------------------

// const calculator = {
//     add(a,b)
//     {
//         return a+b;
//     },
    
//     sub(a,b)
//     {
//         return a-b;
//     },

//     mul(a,b)
//     {
//         return  a*b;
//     }
// };

// console.log(calculator);
// console.log(calculator.add);
// console.log(calculator.mul);
// console.log(calculator.add(4,5));
// console.log(calculator.sub(2,5));
// console.log(calculator.mul(3,4));
