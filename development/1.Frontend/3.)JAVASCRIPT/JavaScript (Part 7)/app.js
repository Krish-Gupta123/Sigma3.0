//note : code ke ek ek part ko uncomment karke run karna pura ek sath mat karna

//this in javaScript ***********************************************************************************************

// const student = {
//     name : "krish",
//     age: 19,
//     eng : 80,
//     math : 90,
//     phy :70,
//     getAvg() {
//         console.log(this); // this points to student object
//         let avg = ( this.math+ this.eng+ this.phy) / 3;
//         console.log(`${this.name} got avg marks : ${avg}`);
//     }

    

// };
// student.getAvg();


// function getAvg()
// {
//     console.log(this);
// }
// //hamara js ka sara code ek window object mai 
// //store hota hai by default isliye jab this created object ke bahar
// //print karte hai toh window object return karta hai 
// getAvg();


//try and catch *************************************************************************************************

// note : js mai kabhi bhi try statement akele nhi likh sakte uske sath ek catch statement likhna jarurui hota hai warna error aa jata hai


// // let a = 5;
// try{
//     console.log(a);
// }
// catch(err){
//     console.log("caught an error .. a is not defined");
//     console.log(err);
// }



// arrow functions *********************************************************************************************

// console.log("sum func : ")
// const sum =  (a,b) => {
//                 console.log(a+b);
//             }

// sum(2,4);
// console.log(sum);

// // Note : arrow func ke liye func defination jab print karte tab f symbol nhi likh ke aata

// //agar ek he argument wala func bana rhe hai arrow func mai toh argument ko bracket mai nhi dalenge func defination mai toh bhi run ho jaega 
// console.log("cube func : ")
// const cube = n => {
//     console.log(n*n*n);
//     // return n*n*n;
// }
// console.log(cube);
// cube(3);
// cube(2);
// cube(4);

// console.log("power func : ")
// const power = (a,b) =>{
//     return a**b;
// }
// console.log(power(2,4));
// console.log(power(3,2));

// console.log("arrow func without argument")

// //agar ek bhi argument nhi hai arrow func mai toh empty parenthesis dalna compulsory hai warna error aaega
// const hello = () => {
//     console.log("hello");
// }
// hello();

// Implicit return in arrow function *************************************************************************

// const mul = (a,b) => (a*b);
// console.log(mul(2,3));
// console.log(mul(9,7));

// const sum  = (a,b) => (a+b);
// console.log(sum(4,5));
// console.log(sum(-14,50));

// const cube = (n) => (n*n*n);
// console.log(cube(2));
// console.log(cube(3));
// console.log(cube(5));


//set Timeout function ********************************************************************************************
//Note : set Timeout is an inbuild function of window object

// console.log("Hi there");

// setTimeout( () => {
//     console.log("Apna College");
// } , 4000);

// console.log("welcome");

// // --------------------------------------------------------------------
// console.log("Hi there");

// let func = function greet(){
//     console.log("Apna College");
// }
// setTimeout(func , 4000);

// console.log("welcome");

// set interval func ******************************************************************************************

// let id = setInterval ( () => {
//     console.log("Apna college");
// },2000);

// console.log(id);


// let id2 = setInterval ( () => {
//     console.log("hello world");
// },3000);

// console.log(id2);

// setTimeout( () => {
//     clearInterval(id);
// },10000);

// setTimeout( () => {
//     clearInterval(id2);
// },10000);



//this with arrow functions **************************************************************************************
//V.V.V IMP : 
// Note: func mai jab this keyword use karte toh woh khud ko he point karta hai function ka scope unke object pe he rehta hai lekin wahi jab arrow func mai this keyword use karte tab woh lexical scope use karta i.e. apne parent func ka scope use karta  ……...... that is the reason ke sab bolte hai ke js mai this keyword use karne ke liye kafi expertise chaiye


// const student = {
//     name : "aman",
//     marks : 95,
//     prop : this, //global scope
//     getName : function() {
//         console.log(this);
//         return this.name;
//     },
//     getMarks : () => {
//         console.log(this);
//         return this.marks; //parent's scope -> window
//         //return undefined as uses lexical scope i.e parent func scope ........ window object pe point karega last mai jake
//     },
//     getInfo1 : function() {
//         setTimeout( () => {
//             console.log(this); //parent's scope -> setTimeout ka parent yaha getInfo1 hai isliye student object pe point karega
//         } , 2000);
//     },
//     getInfo2 : function(){
//         setTimeout( function() {
//             console.log(this); // uses itself scope -> setTimeout ka scope use hoga aur setTimeout window object ka inbuilt func hai isliye winow object pe point hoga
//         },2000);
//     }

// };

// console.log(student.getName());
// console.log(student.getMarks());
// student.getInfo1();
// student.getInfo2();

// practice Question ****************************************************************************************
// write a arrow function that returns the square of a number 'n' ------------------------------

// let square = (n) => {
//     return n*n;
// }

// // or

// let square2 = (n) => (n*n);

// console.log(square(2));
// console.log(square(3));
// console.log(square(5));

// console.log(square2(2));
// console.log(square2(3));
// console.log(square2(5));

// write a func that prints hello world 5 times at interval of 2sec each --------------------------------

// let id = setInterval( () => {
//     console.log("Hello World");
// },2000);

// setTimeout(() => { 
//     clearInterval(id);
//     console.log("clear Interval ran");
//     } , 10000);