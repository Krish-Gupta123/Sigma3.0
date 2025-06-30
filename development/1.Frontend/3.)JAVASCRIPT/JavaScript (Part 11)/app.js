//code ke ek ek topic ko uncomment karke run karna 


// //js call stack ***************************************************************************************************************************************************************************************************************************************************

// //similar call stack banega jaisa java mai recursion mai banta jo humne dsa mai padha tha
// function hello(){
//     console.log("inside hello fnx");
//     console.log("hello");
// }

// function demo(){
//     console.log("calling hello fnx");
//     hello();
// }

// console.log("calling demo fnx");
// demo();
// console.log("done , bye!");

// // Visualizing the call stack & Breakpoints ****************************************************************************************************************************************************************************************************************************************************

// // breakpoints ke liye below code ko inspect karke sources mai jake three() jaha call ho rha hai uss line mai  breakpoint add karke uska call stack analysis karna hai 


// function one(){
//     return 1;
// }

// function two(){
//     return one() + one();
// }

// function three(){
//     let ans = two() + one();
//     console.log(ans);
// }

// three();


// // JS is single threaded ****************************************************************************************************************************************************************************************************************************************************

// // let a = 25;
// // console.log(a);
// // let b = 10;
// // console.log(b);
// // console.log(a+b);


// setTimeout(function(){
//     console.log("apna college");
// },2000);
// setTimeout(function(){
//     console.log("hello world");
// },2000);


// console.log("hello ......");


// // callback hell **************************************************************************************************************************************************************************************************************************************************

// h1 = document.querySelector("#firstHeading");

// setTimeout(function(){
// h1.style.color = "red";
// },1000);

// setTimeout(function(){
// h1.style.color = "orange";
// },2000);


// setTimeout(function(){
// h1.style.color = "green";
// },3000);

// // or

// h1Part2 = document .querySelector("#secondHeading");

// function changeColor(color,delay){
//     setTimeout(() => {
//     h1Part2.style.color = color;
//     },delay); 
// }

// changeColor(("red"),1000);
// changeColor(("orange"),2000);
// changeColor(("green"),3000);

// //or 

// h1part3 = document.querySelector("#thirdHeading");

// function changeColor2(color,delay,nextColorChange)
// {

//     //neeche wali if wali line bol rhi hai agar nextColorChange mai kuch pass kiya hai toh usse execute kar lo agar if wala nhi likhke direct call bhi karde nextColorChange() ko toh bhi same output aaega
//     setTimeout(() => {
//         h1part3.style.color = color;
//         if(nextColorChange) nextColorChange();
//     },delay);
// }

// changeColor2("red",1000,() => {
//     changeColor2("orange",1000, () => {
//         changeColor2("green",1000, () => {
//             changeColor2("yellow",1000, () => {
//                 changeColor2("blue",1000);
//             })
//         });
//     });
// });

// //above code is known as : 
// //callback nesting -> callback hell


// // Setting up for Promises  **************************************************************************************************************************************************************************************************************************************************

// function savetoDb(data)
// {
//     let internetSpeed = Math.floor(Math.random() * 10) + 1 ;
//     if(internetSpeed > 4)
//     {
//         console.log("your data was saved : ",data);
//     }
//     else{
//         console.log("weak connection ....your data was not saved");
//     }
// }

// savetoDb("apna college");

// //or
// console.log(" ***********************savetoDb2 *******************************")

// function savetoDb2(data, success , failure)
// {
//     let internetSpeed = Math.floor(Math.random() * 10) + 1 ;
//     if(internetSpeed > 4)
//     {
//         success(data);
//     }
//     else{
//         failure();
//     }
// }

// savetoDb2("apna college" , 
//     (data) => {
//         console.log("success : your data was saved .... " , data);
//     } , 
//     () => {
//         console.log("failure : weak connection ....your data was not saved");
//     }
//     );




// console.log(" ***********************savetoDb3 *******************************")
// // or

// function savetoDb3(data, success , failure)
// {
//     let internetSpeed = Math.floor(Math.random() * 10) + 1 ;
//     if(internetSpeed > 4)
//     {
//         success(data);
//     }
//     else{
//         failure();
//     }
// }

// savetoDb3("apna college" , 
//     (data) => {
//         console.log("success : your data was saved .... " , data);
//         savetoDb3("hello world", 
//         (data) => {
//             console.log("success2 : data2 saved .... " ,data);
//             savetoDb3("Krish",
//                 (data) => {
//                     console.log("success3 : data3 saved .... ",data);
//                 },
//                 () => {
//                     console.log("failure3 : weak connection");
//                 }
//             );
//         },
//         () => {
//             console.log("failure2 : weak connection");
//         }
//     );
//     } , 
//     () => {
//         console.log("failure : weak connection ....your data was not saved");
//     }
//     );

    
// // above code ko callback hell kehte hai jismai ek callback ke andar he dusre callback rehte hai aur nested callbacks agar aur bhi dalenge toh confusing ho jaega code bohot





// // Refactoring with Promises  **************************************************************************************************************************************************************************************************************************************************

// function savetoDb(data)
// {
//     return new Promise((resolve, reject) => {
//         let internetSpeed = Math.floor(Math.random() * 10) + 1;
//         if(internetSpeed > 4)
//         {
//             resolve("success : data was saved");
//         }
//         else{
//             reject("failure : weak connection");
//         }
//     })
// }

// console.log(savetoDb("apna college"));





// // then() and catch() methods  **************************************************************************************************************************************************************************************************************************************************

// function savetoDb(data)
// {
//     return new Promise((resolve, reject) => {
//         let internetSpeed = Math.floor(Math.random() * 10) + 1;
//         if(internetSpeed > 4)
//         {
//             resolve("success : data was saved");
//         }
//         else{
//             reject("failure : weak connection");
//         }
//     })
// }

// let request = savetoDb("Apna college");

// request
//     .then( () => {
//         console.log("promise resolved");
//         console.log(request);
//     })
//     .catch( () => {
//         console.log("promise rejected");
//         console.log(request);
//     });






// // Promise chaining  **************************************************************************************************************************************************************************************************************************************************


// function savetoDb(data)
// {
//     return new Promise((resolve, reject) => {
//         let internetSpeed = Math.floor(Math.random() * 10) + 1;
//         if(internetSpeed > 4)
//         {
//             resolve("success : data was saved");
//         }
//         else{
//             reject("failure : weak connection");
//         }
//     })
// }


// savetoDb("apna college")
//     .then(() => {
//         console.log("promise 1 resolved");
//         return savetoDb("hello world");
//     })
//     .then( () => {
//         console.log("promise 2 resolved");
//         return savetoDb("Krish Gupta");
//     })
//     .then( () => {
//         console.log("promise 3 resolved")
//     })
//     .catch( () => {
//         console.log("some promise rejected");
//     });




// // Results & Errors in Promises  **************************************************************************************************************************************************************************************************************************************************

// function saveToDb(data)
// {
//     return new Promise( (resolve,reject) => {
//         let internetSpeed = Math.floor(Math.random()*10) + 1;

//         if(internetSpeed > 4)
//         {
//             resolve("success : data was saved");
//         }
//         else{
//             reject("failure : weak connection");
//         }
//     })
// }

// saveToDb("apna college")
//     .then( (result) => {
//         console.log("data 1 resolved ");
//         console.log("result of the promise : ", result);
//         return saveToDb("hello world");
//     })
//     .then((result) => {
//         console.log("data 2 resolved ");
//         console.log("result of the promise : ", result);
//         return saveToDb("krish gupta");
        
//     })
//     .then((result) => {
//         console.log("data 3 resolved ");
//         console.log("result of the promise : ", result);
//     })
//     .catch((error) => {
//         console.log("promise was rejected");
//         console.log("error of the promise : ",error);
//     });




// // Refactoring old code  **************************************************************************************************************************************************************************************************************************************************




h1part3 = document.querySelector("#thirdHeading");

// function changeColor2(color,delay,nextColorChange)
// {

//     setTimeout(() => {
//         h1part3.style.color = color;
//         if(nextColorChange) nextColorChange();
//     },delay);
// }

// changeColor2("red",1000,() => {
//     changeColor2("orange",1000, () => {
//         changeColor2("green",1000, () => {
//             changeColor2("yellow",1000, () => {
//                 changeColor2("blue",1000);
//             })
//         });
//     });
// });

//  or

function changeColor(color,delay)
{
    return new Promise( (resolve, reject) => {
        setTimeout( () => {
            h1part3.style.color = color;
            resolve("color changed")
        },delay);
    }) 
}

changeColor("red",1000)
    .then( () => {
        console.log("red color was completed");
        return changeColor("orange",1000);
    })
    .then( () => {
        console.log("orange color was completed");
        return changeColor("green",1000);
    })
    .then( () => {
        console.log("green color was completed");
        return changeColor("yellow",1000);
    })
    .then( () => {
        console.log("yellow color was completed");
        return changeColor("blue",1000)
    })
    .then( () => {
        console.log("blue color was completed");
    })
// ismai reject func ko call kiya he nhi hai changeColor wale mai (kyuki yaha setTimeout mai mostly koi error aaega he nhi) toh catch likhke koi fayda nhi kyuki woh kabhi call he nhi hoga