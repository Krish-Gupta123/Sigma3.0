//code ke ek ek part ko uncomment karke run karna

//Array methods *************************************************************************************************

// //forEach loop 

// let arr = [1,2,3,4,5];

// function print(el)
// {
//     console.log(el);
// }

// arr.forEach(print);

// //or
// console.log("or");

// let print1 = function(el)
// {
//     console.log(el);
// }

// arr.forEach(print1);

// //or
// console.log("or");

// arr.forEach(function(el) {
//     console.log(el);
// })

// //or
// console.log("by arrow func");

// arr.forEach((el) => {
//     console.log(el);
// });


// //using forEach with array of objects

// let arr1 = [
//     {
//         name:"krish",
//         marks:"98",
//     },

//     {
//         name :"rahul",
//         marks:87,
//     },

//     {
//         name:"harsh",
//         marks:100,
//     }
// ];

// arr1.forEach((student) => {
//     console.log(student);
// });


// map **************************************************************************

// let num = [1,2,3,4,5];

// let double = num.map(function(el){
//     return el*2;
// });

// console.log(double);

// let student = [
//     {
//         name:"krish",
//         marks:"98",
//     },

//     {
//         name :"rahul",
//         marks:87,
//     },

//     {
//         name:"harsh",
//         marks:100,
//     }
// ];

// let gpa = student.map((el) => {
//     return el.marks / 10;
// });

// console.log(gpa);


// // filter ******************************************************************

// let nums = [1,2,3,4,5,6,7,8,9];

// let even = nums.filter((el) => 
//     (el%2 == 0)
// );
// console.log(even);


// // or

// let odd = nums.filter((el) => {
//     return el%2 != 0;
// });
// console.log(odd);

// //or

// let set = nums.filter((el) => {
//     return el > 5;
// });
// console.log(set);


// // every *******************************************************************

// console.log([1,2,3,4].every((el) => 
//     (el%2 == 0)
// ));

// console.log([2,4].every((el) => 
//     (el%2 == 0)
// ));


// console.log([1,5,3,4].every((el) => 
//     (el%2 != 0)
// ));

// console.log([1,5,3].every((el) => 
//     (el%2 != 0)
// ));



// // some *******************************************************************

// console.log([1,2,3,4].some((el) => 
//     (el%2 == 0)
// ));

// console.log([2,4].some((el) => 
//     (el%2 == 0)
// ));


// console.log([1,2,6,4].some((el) => 
//     (el%2 != 0)
// ));

// console.log([2,4,6].some((el) => 
//     (el%2 != 0)
// ));


// //reduce ********************************************************************************

// console.log([1,2,3,4].reduce((res,el) => (res+el)));

// let arr = [1,2,3,4,5];
// let finalVal = arr.reduce((res,el) => res+el);
// console.log(finalVal);

// //find maximum num in array by reduce method *************************************************************************

// //by normal method


// let nums = [2,6,4,3,5,9,8,6,5,5,8,9,7,654,3,2,2,2,4,5,67,88,3];

// let mx = -1

// for(let i = 0 ; i <nums.length ; i++)
// {
//     if(mx < nums[i])
//         {
//             mx = nums[i];
//         } 
// }
// console.log(mx);



// //by reduce method 


// //apan ya max variable_name mai bhi likh sakte aur accumulator ke jagah bhi kyuki function ke andar woh functional scope jaise act karega aur variable name mai max global scope jaise act karegaa
// let max = nums.reduce((max,el) => {
//      if(max > el)
//      {
//          return max;
//      }
//      else{
//          return el;
//      }
// }
// );

// console.log(max);


// //practiceQuestion 1 ........check if all numbers in our array are multiple of 10 or not **************************************************************************

// let num = [10,20,30,40];

// console.log(num.every((el) => el%10 == 0));


// // practiceQuestion 2 ........... write a func to find minimum number in an array **************************************************************************

// let nums = [2,6,4,3,5,9,8,6,5,5,8,9,7,654,3,2,2,2,4,5,67,88,3];

// function getMin(nums)
// {
//     let min = nums.reduce((min,el) => {
//      if(min < el)
//      {
//          return min;
//      }
//      else{
//          return el;
//      }
// }
// );
// return min;
// }

// console.log(getMin(nums));


// // default parameters ********************************************************************************

// function sum(a = 1 ,b=2)
// {
//     return a+b;
// }


// function sum1(a  ,b=2)
// {
//     return a+b;
// }

// console.log(sum(21));
// console.log(sum());
// console.log(sum(1,4));

// console.log(sum1(21));
// console.log(sum1());
// console.log(sum1(1,4));


// // spread ***********************************************************************************

// let arr = [1,2,3,4,5];

// console.log(arr);
// console.log(...arr);
// console.log(Math.min(...arr));

// console.log(..."apna college");


// // spread with array literals ******************************************************************************************************


// let arr = [1,2,3,4,5];

// let newarr = [...arr];
// console.log(newarr);
// newarr.push(6);
// console.log(newarr);


// let chars = [..."hello"];
// console.log(chars);


// let odd = [1,3,5,7,9];
// let even = [2,4,6,8,10];

// let nums = [...odd , ...even];
// let nums2 = [...even , ...odd];

// console.log(nums);
// console.log(nums2);



// //spread with object literals ***********************************************************************************************************


// let data = {
//     emial : "krishrhgupta4@gmail.com",
//     pass: "kgking"
// };

// let datacopy  = {...data, id:123 ,country  : "India"};
// console.log(datacopy);

// let arr = [1,2,3,4,5];
// let obj1 = {...arr};

// let obj2 = {..."hello"};

// console.log(obj1);
// console.log(obj2);


// // rest ***************************************************************************************************


// function sum(...args)
// {
//     return args.reduce((res,el) => res+ el
//   );
// }

// console.log(sum(1,2,3,4,5));

// function hello(...args)
// {
//     for(let i = 0 ; i<args.length;i++)
//     {
//         console.log("you gave us : ",args[i]);
//     }
// }

// hello(1,2,3,4,5);


// function getMin(...args)
// {
//     let min = args.reduce((min,el) => {
//      if(min < el)
//      {
//          return min;
//      }
//      else{
//          return el;
//      }
// }
// );
// return min;
// }

// console.log(getMin(5,3,22,5,73,77,5,4,2,9));



// //destructuring ********************************************************************************************************

// let names = ["RAM","HANUMAN","kg","joyesh","harsh"];

// let [name1,name2, ...others] = names;

// console.log(name1);
// console.log(name2);
// console.log(others);


// //destructuring objects ***********************************************************************************************************


// const student = {
//     name: "krish",
//     age: 20,
//     username:"krish@123",
//     pass: "kgking",
//     city:"mumbai"
// };

// const { name ,username:user , pass : credentials,city = "pune" , area : locality ="tilaknagar"} = student;

// console.log(student.age);
// console.log(name);
// console.log(user);
// console.log(credentials);
// console.log(city);
// console.log(locality);