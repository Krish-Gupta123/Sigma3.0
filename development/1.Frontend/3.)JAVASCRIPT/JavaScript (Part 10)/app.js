//Note js mai ek ek code ke part ko uncomment karke run karna
//Mouse/pointer Events
// ***************************************************************************************************


// let btn = document.querySelector("button");
// console.dir(btn);

// // btn.onclick = function(){
// //     alert("button was clicked")
// // };

// function sayHello(){
//     alert("hello");
// }

// btn.onclick = sayHello;


// let btns = document.querySelectorAll(".like");
// for(button of btns)
// {
//     button.onclick = sayHello;
//     button.onmouseenter = function() {
//         console.log("you entered the button");
//     };
//     console.dir(button);
// }


//Event Listeners
// *************************************************************************************************************

// let btn = document.querySelectorAll("button");

// for(btns of btn)
// {
//     // btns.onclick = sayHello;
//     // btns.onclick = sayName;

//     // btns.addEventListener("click",sayHello);
//     // btns.addEventListener("click",sayName);
    
//     btns.addEventListener("dblclick",function(){
//         console.log("you clicked twice");
//     });

// }

// function sayHello(){
//     alert("hello");
// }

// function sayName(){
//     alert("Apna College");
// }



//Activity
// *************************************************************************************************************
// images mai jo pg activity1 mai dikh rha woh banana hai aur jab pg pe generate color pe click karenge toh koi bhi random color generate ho jaega as u can see in activity 2 image from images folder


// let btn = document.querySelector("#color");
// btn.addEventListener("click",function(){

    
// let heading = document.querySelector("#rgb");
// let box  = document.querySelector("#abc");
// let rgbValue  = getRandomColor();
// heading.innerText = rgbValue;
// box.style.backgroundColor = rgbValue;
// })




// function getRandomColor(){
//     let red = Math.floor(Math.random() * 255);
//     let green = Math.floor(Math.random() * 255);
//     let blue = Math.floor(Math.random() * 255);

//     let randomColor =  `rgb(${red},${green},${blue})`;

//     return randomColor;
// }



//Event Listeners for elements
// *************************************************************************************************************


// let p = document.querySelector("#para");

// p.addEventListener("click",function(){
//     console.log("para was click");
// })

// let box = document.querySelector("#myId");
// box.addEventListener("mouseenter",function(){
//     console.log("mouse inside box");
// })


// this in event listeners
// **************************************************************************************************************

// let btn = document.querySelector("#clickme");
// let h1 = document.querySelector("#thish1");
// let h3 = document.querySelector("#thish3");
// let p = document.querySelector("#thisp");

// // btn.addEventListener("click",function(){
// //     // console.log(this);
// //     // console.dir(this);
// //     console.dir(this.innerText);
// //     this.style.backgroundColor= "blue";
// // })

// // h3.addEventListener("click",function(){
// //     console.dir(this.innerText);
// //     this.style.backgroundColor= "blue";
// // })

// // h1.addEventListener("click",function(){
// //     console.dir(this.innerText);
// //     this.style.backgroundColor= "blue";
// // })

// // p.addEventListener("click",function(){
// //     console.dir(this.innerText);
// //     this.style.backgroundColor= "blue";
// // })

// // // or

// function changecolor(){
//     console.dir(this.innerText);
//     this.style.backgroundColor = "blue";
// }


// btn.addEventListener("click",changecolor);

// h3.addEventListener("click",changecolor);

// h1.addEventListener("click",changecolor);

// p.addEventListener("click",changecolor);


// Keyboard events
// **************************************************************************************************************


// // let btn = document.querySelector("#keyboardBtn");

// // btn.addEventListener("click",function(event){
// //     console.log(event);
// //     console.log("button clicked");
// // });

// // btn.addEventListener("dblclick",function(event){
// //     console.log(event);
// //     console.log("button click");
// // });


// let input =  document.querySelector("#keyboardInput");

// input.addEventListener("keydown",function(event){
//     console.log(event);
//     console.log("key = ",event.key);
//     console.log("code = ",event.code);
//     console.log("key was pressed");
// });

// // input.addEventListener("keyup",function(){
// //     console.log("key was released");
// // });

// let input2 = document.querySelector("#keyboardInput2");

// input2.addEventListener("keydown",function(event){
//     console.log("code = " , event.code);//ArrowUp(U) , ArrowDown(D) , ArrowLeft(L) , ArrowRight(R)

//     if(event.code == "ArrowUp" || event.code == "KeyU")
//     {
//         console.log("character moves forward");
//     }
//     else if(event.code == "ArrowDown" || event.code == "KeyD")
//     {
//         console.log("character moves backward");
//     }
//     else if(event.code == "ArrowLeft" || event.code == "KeyL")
//     {
//         console.log("character moves left");
//     }
//     else if(event.code == "ArrowRight" || event.code == "KeyR")
//     {
//         console.log("character moves Right");
//     }


// });


// form events
// **************************************************************************************************************

// let form = document.querySelector("#formEvent");

// form.addEventListener("submit",function(event){
//     event.preventDefault();
//     alert("form submitted");

// });



// Extracting from data
// **************************************************************************************************************

// let form = document.querySelector('#ExtractingFromData');

// form.addEventListener("submit",function(event){
//     event.preventDefault();

//     let input = document.querySelector("#ExtractingFromData2");
//     console.dir(input);
//     console.log(input.value);

// });

// let form2 = document.querySelector("#ExtractingData");

// form2.addEventListener("submit",function(event){
//     event.preventDefault();
//     console.dir(form2);

//     // let user = document.querySelector("#user");
//     // let pass = document.querySelector("#pass");

//     let user = this.elements[0]; //form2.elements[0]
//     let pass = this.elements[1];

//     console.log(user.value);
//     console.log(pass.value);

//     alert(`Hi ${user.value}, your password is set to ${pass.value}`);
// });


// more events 
// **************************************************************************************************************


let form = document.querySelector("#MoreEvents");

form.addEventListener("submit",function(event){
    event.preventDefault();
});

let user = document.querySelector("#user1");

user.addEventListener("change",function(){
    console.log("input changed");
    console.log("final value = ",this.value);
});

let pass = document.querySelector("#pass1");


pass.addEventListener("input",function(){
    console.log("input changed");
    console.log("final value = ",this.value);
});


// text editor js code below

let input = document.querySelector("#text");
let p = document.querySelector("#MoreEventsP");

input.addEventListener("input",function(){
    console.log(input.value);
    p.innerText = input.value;
});