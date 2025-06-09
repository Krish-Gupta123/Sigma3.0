// // basics

// console.log(window);
// console.log(document);

// console.dir(document);
// console.dir(document.all);

// console.dir(document.all[8]);
// console.dir(document.all[8].innerText);

// console.dir(document.all[9]);
// console.dir(document.all[9].innerText);

// // document.all[9].innerText = "peter parkar";
// // changes h1 heading text

// // document.all[9].innerText = "Iron Man";
// // changes h1 heading text


// ************************************************************************************************************************************
//Selecting elements by id

// document.getElementById("mainImg");//write this is console to get correct output

// let obj = document.getElementById("mainImg");
// console.log(obj); //logs live reference
// // console.dir(obj);


// // console.dir jab console.log ke sath dono ko uncomment karke run karoge tab console.log ka output console.dir wala he aarga kyuki browser shows live reference


// // Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// // document.getElementById("mainImg");
// // let obj = document.getElementById("mainImg");
// // console.log(obj); 
// // console.dir(obj);
// // obj.src
// // obj.tagName
// // obj.id
// // obj.src  = "assets/creation_1.png";
// // document.getElementById("description");
// // console.dir(document.getElementById("description"));
// // console.dir(document.getElementById("abc"));




// ************************************************************************************************************************************
//Selecting elements by class Name



// //Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// // document.getElementsByClassName("oldImg");
// // document.getElementsByClassName("oldImg")[0];
// // document.getElementsByClassName("oldImg")[1];
// // document.getElementsByClassName("abc");


// let smallImgs = document.getElementsByClassName("oldImg");

// for(let i = 0 ; i <smallImgs.length ; i++)
// {
//     console.dir(smallImgs[i]);
// }

// for(let i = 0 ; i <smallImgs.length ; i++)
// {
//     console.dir(smallImgs[i].src);
// }

// //uncomment below loop and run
// for(let i = 0 ; i <smallImgs.length ; i++)
// {   
//     smallImgs[i].src = "assets/spiderman_img.png" 
//     console.log(`value of image ${i} has changed`);
// }



// ************************************************************************************************************************************
//Selecting elements by tag Name


// //Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// document.getElementsByTagName("p");
// document.getElementsByTagName("p")[1].innerText;
// document.getElementsByTagName("p")[0].innerText = "abc";
// document.getElementsByTagName("span")




// ************************************************************************************************************************************
//Selecting elements by Query Selectors

// console.dir(document.querySelector("h1"));
// console.dir(document.querySelector("#description"));
// console.dir(document.querySelector(".oldImg"));
// console.dir(document.querySelectorAll(".oldImg"));
// console.dir(document.querySelector("div a"));
// console.dir(document.querySelectorAll("div a"));



// // Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// // document.querySelector('p');
// // document.querySelector('#myId');
// // document.querySelector('.myClass');
// // document.querySelectorAll('P');



// ************************************************************************************************************************************
//Selecting content in objects



// // Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// // let para = document.querySelector('p');
// // para;
// // console.dir(para);
// // para.innerText;
// // para.innerHTML;
// // para.textContent;
// // para.innerText = "abc";
// // para.innerText = "Hi I am Krish Gupta";
// // para.innerText = "Hi I am <b>Krish Gupta</b>";
// // para.innerHTML = "Hi I am <b>Krish Gupta</b>";
// // let heading = document.querySelector('h1');
// // heading
// // heading.innerHTML = '<u>Spider Man </u>'
// // heading.innerHTML = `<u>${heading.innerText}</b></u>`




// ************************************************************************************************************************************
//Manipulating Attributes


// // Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// // let img = document.querySelector('img');​
// // img.getAttribute('id')
// // img.setAttribute('id','spidermanImg');
// // img.getAttribute('id')
// // img
// // img.setAttribute('src','assets/creation_3.jpeg');
// // img.getAttribute('class');
// // img.setAttribute('class','images');
// // img.getAttribute('class');



// ************************************************************************************************************************************
//Manipulating Style (with style attribute)

// let links = document.querySelectorAll('.box a')


// for(link of links)
// {
//     link.style.color = "green"; //inline style
// }

// // for(let i = 0 ; i <links.length; i++)
// // {
// //     links[i].style.color = "yellow";
// // }





// // Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// // let image =  document.querySelector("img");
// // console.dir(image);
// // image.style
// // let heading = document.querySelector('h1');
// // heading.style;
// // heading.style.color = "green";
// // heading.style.color = "purple";
// // heading.style.backgroundColor = "yellow";
// // let box = document.querySelector('.box');
// // box.style;




// ************************************************************************************************************************************
//classList Property


// // Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// let img = document.querySelector('img');
// img.classList;
// img.classList.add("abc");
// img.classList;


// let heading = document.querySelector('h1');
// heading.classList;
// heading.classList.add("green");
// heading.classList;
// heading.classList.add("underline");
// heading.classList;


// heading.classList.remove('green');
// heading.classList;
// heading.setAttribute('class','green');
// heading.classList;


// heading.classList.contains("underline");
// heading.classList.contains("green");


// heading.classList;
// heading.classList.toggle("green");
// heading.classList;
// heading.classList.toggle("underline");
// heading.classList.toggle("green");
// heading.classList;
// heading.classList.toggle("underline");
// heading.classList;


// // for below code note that css file mai box class ka styling yellowBg class ke pehle likha ho toh he background color change hoga becoz dono classes mai background color ka property dala hai kyuki css cascading mai humne padha hai jo baadmai likhte hai wohi apply hota hai
// let box  =  document.querySelector(".box");
// box.classList;
// box.classList.add("yellowBg");
// box.classList





// ************************************************************************************************************************************
//Navigation on Page


// // Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// let heading = document.querySelector('h4');
// heading.parentElement;​
// heading.children;
// let box = document.querySelector('.box');
// box.children;
// box.childElementCount;
// let ul = document.querySelector('ul');
// ul.parentElement;
// ul.childElementCount;

// ul
// ul.children
// ul.children[0]
// ul.children[1]
// ul.children[2];
// ul.children[2].previousElementSibling;
// ul.children[1].previousElementSibling;
// ul.children[1].nextElementSibling;


// let img = document.querySelector('img');
// img.previousElementSibling;
// img.previousElementSibling.style;
// img.previousElementSibling.style.color = "green";



// ************************************************************************************************************************************
//Adding Elements on Page



// // Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// document.createElement('p');
// let newP = document.createElement('p');
// console.dir(newP);
// newP.innerText = "Hi, I am a new P";
// console.dir(newP);
// let body = document.querySelector('body');
// body.appendChild(newP);



// newP;
// let box =  document.querySelector('.box');
// box.appendChild(newP);
// let btn = document.createElement('button');
// console.dir(btn);
// btn.innerText = "CLick me";
// box.appendChild(btn);



// newP;
// newP.append(" this is appended text");
// newP.append(btn);
// newP.append(" donot click on this button");



// box.prepend(newP);




// let btn = document.createElement('button');
// btn.innerHTML = "NEW BUTTON !!!";
// let p = document.querySelector('p');
// p;
// btn;
// p.insertAdjacentElement('beforebegin',btn);
// p.insertAdjacentElement('afterbegin',btn);
// p.insertAdjacentElement('beforeend',btn);
// p.insertAdjacentElement('afterend',btn);



// ************************************************************************************************************************************
//Removing Elements from Page



// // Note : NEECHE DIYE HUE COMMANDS KO CHROME KE CONSOLE MAI EK EK KARKE RUN KARNA OUTPUT WAHI PE SAHI SE AAEGA

// let body = document.querySelector('body');
// body.removeChild(btn);
// p.insertAdjacentElement('afterend',btn);
// btn.remove();
// body.remove();


