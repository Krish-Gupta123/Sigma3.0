//note : code ke ek ek part ko uncomment karke run karna pura ek sath mat karna
//Note : question 3 aur 4 wala kacha pakka samjha hai pura aache se nhi samjha  


// question 1 ****************************************************************************************

// let arrayAverage = (arr) => {

//     let sum = 0;
//     for(let i = 0; i <arr.length; i++)
//     {
//         sum += arr[i];
//     }
//     let avg = sum/arr.length;
//     return avg;
// }

// let array = [1,3,5,7,9];
// console.log(arrayAverage(array));



// question 2 ****************************************************************************************

// let isEven = (n) => (n%2 == 0);
// console.log(isEven(12));
// console.log(isEven(11));



// question 3 ****************************************************************************************
//predict the output

// const object = {
//     message: 'Hello, World!',
    
//     logMessage() {
//     console.log(this.message);
//     }
//     };
    
//     setTimeout(object.logMessage, 1000);


// // After a delay of 1 second, undefined is logged to the console.

// // While the setTimeout() function uses the object.logMessage as a callback, still, it
// // invokes object.logMessage as a regular function, rather than a method.
// // And during a regular function invocation this equals the global object, which is a
// // window in the case of the browser environment.
// // That's why console.log(this.message) inside logMessage method logs
// // window.message, which is undefined.


// question 4 ****************************************************************************************
// iska ans sol sheet mai wrong diya hai kisse dusre question ka explanation daal diya hai
//predict the output

// let length = 4;
// function callback() {
// console.log(this.length);
// }

// const object = {
//     length: 5,
//     method(callback) {
//     callback();
//     },
// };

// object.method(callback, 1, 2);


// // When object.method(callback, 1, 2) is called:
// // callback() is called as a normal function, not as a method of any object.
// // So, this inside callback() refers to the global object (in non-strict mode).
// // On the browser, window.length is usually 0, but it depends on context


// // Tu soch raha hoga ki method(callback, 1, 2) me teen parameters pass kiye, lekin method to sirf ek callback parameter hi accept kar raha hai. Toh baaki ke 1, 2 kya ho gaye? Chal clearly samjhaata hoon 😄

// // ⚙️ JavaScript Function Parameters Rule:
// // Agar tum kisi function ko zyada arguments dete ho than defined parameters, toh JS ignore nahi karta — wo sab arguments ko accept kar leta hai and wo arguments object me store ho jaate hain.

// // method() actually defined hai with only one parameter: callback

// // Jab method(callback, 1, 2) call hua:

// // callback = callback

// // 1 and 2 → ignored in parameter list (kyunki koi variable nahi hai unhe pakadne ke liye)

// Lekin wo fir bhi available hote hain as arguments inside method (agar use kare to)