// question 1 ***************************************************************************

//mouseout
let button = document.querySelector("#btnq1");

let p =document.querySelector("#pq1");

button.addEventListener("mouseout",function(){
    alert("mouse out");
});

p.addEventListener("mouseout",function(){
    alert("mouse out");
});

//keypress

let inputq1 = document.querySelector("#q1input");

inputq1.addEventListener("keypress",function(event){
    console.log("key pressed : ",event.key);
})

//scroll

window.addEventListener("scroll",function(){
    console.log("page is scrolling .......");
});

//load

window.addEventListener("load",function(){
    console.log("page fully loaded");
});

// question 2 ***********************************************************************************

let btn = document.createElement("button")

btn.innerText = "click me"

function changeColor(){
    this.style.backgroundColor = "green";
}
btn.addEventListener("click",changeColor);
let question3 = document.querySelector("#question3");
document.body.insertBefore(btn,question3);


// question 3 *******************************************************************************

let h2 = document.querySelector("#q3h2");

let input = document.querySelector("#q3input");

input.addEventListener("input",function(){
    
    let cleaned = input.value.replace(/[^a-zA-Z ]/g,"");
    h2.innerText = cleaned;
    
});