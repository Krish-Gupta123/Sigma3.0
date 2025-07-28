// let n = 5;
// for(let i = 0 ; i < n ; i++)
// {
//     console.log("hello , " + i);
// }
// console.log("bye");

// // ***********************************************************************************************************************
// // Process in Node 


// let args =  process.argv;

// // loop mai i ko 2 se isliye start kiya hai kyuki starting mai 1st toh node ka path print hota aur 2nd mai current file ka path print hota isliye i ko 2 se chalu kiya ke khali arguments jo extra likhenge wohi print ho aur paths exclude ho jae
// for(let i = 2  ; i <args.length ; i++)
// {
//     console.log("hello to : ",args[i]);
// }

// // ********************************************************************************************************************
// //Export in Files 👇
// // refer math.js also

// const someValue = require("./math");

// console.log(someValue);
// console.log(someValue.sum(2,3));
// console.log(someValue.mul(2,2));
// console.log(someValue.PI);


// // ********************************************************************************************************************
// //Export in Directories 👇
// // refer whole fruits folder also

// const info = require("./Fruits");

// console.log(info);
// console.log(info[0]);
// console.log(info[0].name);
// console.log(info[1].color);




// // ********************************************************************************************************************
// //What is npm 👇

// no code


// // ********************************************************************************************************************
// // Installing Packages 👇
// // refer FigletDir folder



// // ********************************************************************************************************************
// // Package.json 👇
// // refer MyProject folder


// // ********************************************************************************************************************
// // Local Vs Global Installation 👇


// const figlet = require("figlet");

// figlet("Krish Gupta", function (err, data) {
//   if (err) {
//     console.log("Something went wrong...");
//     console.dir(err);
//     return;
//   }
//   console.log(data);
// });


// // ********************************************************************************************************************
// // import modules 👇
// // refer maths.js and package.json of same directory

import {sum,PI} from "./math.js";
import { generate } from "random-words";

console.log(sum(2,3));
console.log(PI);

console.log(generate());
