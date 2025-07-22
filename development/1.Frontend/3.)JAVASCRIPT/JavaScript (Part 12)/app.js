
// ********************************************************************************************************************
// async functions


// async function greet(){
//     // throw "404 page not found";
//     return "hello world"; //  returns a promise
// }

// greet()
//     .then( (result) => {
//         console.log("promise was resolved");
//         console.log("result was : ",result);
//     })
//     .catch((err) => {
//         console.log("promise was rejected with err : ",err);
//     })


// async function greet2(){
//      //  returns a promise
// }

// async function greet3()
// {
//     abc.abc();
//     return "hello bhai";
// }

// async function greet4()
// {
//     throw "some error occured";
//     return "hello bhai";
// }

// let demo =  async () => {
//     return 5;
// }



// // // can comment out below func calls if want to see output
// // console.log(greet2());
// // console.log(greet3());
// // console.log(greet4());
// // console.log(demo());



// ********************************************************************************************************************
// await Keyword

// function getNum()
// {
//     return new Promise((resolve,reject) => {
//         setTimeout(() => {
//             let num  =  Math.floor(Math.random()*10) + 1;
//             console.log(num);
//             resolve();
//         },1000);
//     })
// }

// async function demo(){
//     await getNum();
//     await getNum();
//     await getNum();
//     getNum();
//     getNum();



// }
// // uncomment below line to run func
// // console.log(demo());


// // refactoring chapter 11 last code 


// let h1part3 = document.querySelector("h1");

// function changeColor(color,delay)
// {
//     return new Promise( (resolve, reject) => {
//         setTimeout( () => {
//             h1part3.style.color = color;
//             console.log(`color changed to ${color}`);
//             resolve("color changed")
//         },delay);
//     }) 
// }

// async function demo2(){
//     await changeColor("red",1000);
//     await changeColor("orange",1000);
//     await changeColor("green",1000);
//     await changeColor("yellow",1000);
//     await changeColor("blue",1000);
// }

// console.log(demo2());


// // changeColor("red",1000)
// //     .then( () => {
// //         console.log("red color was completed");
// //         return changeColor("orange",1000);
// //     })
// //     .then( () => {
// //         console.log("orange color was completed");
// //         return changeColor("green",1000);
// //     })
// //     .then( () => {
// //         console.log("green color was completed");
// //         return changeColor("yellow",1000);
// //     })
// //     .then( () => {
// //         console.log("yellow color was completed");
// //         return changeColor("blue",1000)
// //     })
// //     .then( () => {
// //         console.log("blue color was completed");
// //     })



// // ********************************************************************************************************************
// // Handling Rejections



// let h1part3 = document.querySelector("h1");

// function changeColor(color,delay)
// {
//     return new Promise( (resolve, reject) => {
//         setTimeout( () => {

//             let num = Math.floor(Math.random()*5)+1;
//             if(num>3)
//             {
//                 reject("promise rejected");
//             }

//             h1part3.style.color = color;
//             console.log(`color changed to ${color}`);
//             resolve("color changed")
//         },delay);
//     }) 
// }

// async function demo2(){
//     try{
//     await changeColor("red",1000);
//     await changeColor("orange",1000);
//     await changeColor("green",1000);
//     await changeColor("yellow",1000);
//     await changeColor("blue",1000);
//     }
//     catch(err){
//         console.log("error occured");
//         console.log(err);
//     }

//     let a = 5;
//     console.log(a);
//     console.log("new number = ",a+3);
// }

// console.log(demo2());




// // ********************************************************************************************************************
// // What is an API

// no code 


// // ********************************************************************************************************************
// // Accessing some APIs

// no code

// // ********************************************************************************************************************
// // What is JSON

// no code


// // ********************************************************************************************************************
// // Accessing JSON data

// let jsonRes = '{"fact":"Cats are subject to gum disease and to dental caries. They should have their teeth cleaned by the vet or the cat dentist once a year.","length":133}';

// let validjson = JSON.parse(jsonRes);
// console.log(validjson);
// console.log(validjson.fact);

// let student = {
//     name:"Krish",
//     age:19,
// };
// console.log(JSON.stringify(student));

// // or

// // write below line in console terminal it will show object in string - like output but above console.log with show only js object like output without double quotes becoz :   In most browsers (like Chrome), console.log() outputs preview objects nicely, but hides the surrounding double-quotes of a string for readability.

// // JSON.stringify(student);



// // ********************************************************************************************************************
// // API Testing Tools

// no code


// // ********************************************************************************************************************
// // What is AJAX ? 

// no code

// // ********************************************************************************************************************
// // HTTPs Verbs

// no code

// // *****************************************s***************************************************************************
// // Status Codes

// no code

// // ********************************************************************************************************************
// // Adding Information in URL

// no code

// // ********************************************************************************************************************
// // Https Headers

// no code

// // ********************************************************************************************************************
// // Our First API request

// let url = "https://catfact.ninja/fact";

// //note : fetch func always returns promise
// // console.log(fetch(url));

// fetch(url)
//     .then((res) => {
//         console.log(res);
//         // console.log(res.json());
//         return res.json();
//     })
//     .then((data) => {
//         console.log("data 1 = " +  data.fact);
//         console.log("length of data 1 = " +  data.length);

//         return fetch(url);
//     })
//     .then((res) => {
//         return res.json();
//     })
//     .then((data2) => {
//         console.log("data 2 = " , data2.fact);
//     })
//     .catch((err) => {
//         console.log("Error : ", err);
//     })


// console.log("I am happy");


// // ********************************************************************************************************************
// // Using fetch with async-await

// let url = "https://catfact.ninja/fact";

// async function getFacts()
// {
//     try{
//     let res =  await fetch(url);
//     let data = await res.json();
//     console.log(data);
//     console.log(data.fact);


//     let res2 = await fetch(url);
//     let data2 = await res2.json();
//     console.log(data2.fact);

// }
//     catch(e){
//         console.log("Error : ",e);
    
    
//     }  
//     console.log("bye bye");

// }
// console.log(getFacts());