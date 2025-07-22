// // Using Axios
// //************************************************************************************************************************************

// let url = "https://catfact.ninja/fact";

// async function getFacts(){
//     try{
//         let res = await axios.get(url);
//         return res.data.fact;
//     }
//     catch(e)
//     {
//         console.log("Error : ",e);
//         return "No fact returned";
//     }
// }
// console.log(getFacts());


// let btn = document.querySelector("#btn1");

// btn.addEventListener("click", async () => {
//     let fact =  await getFacts();
//     console.log(fact);  
//     let p = document.querySelector("#result");
//     p.innerText = fact;  
// })

// // DogPictures API
// // ************************************************************************************************************************************

// let url2 = "https://dog.ceo/api/breeds/image/random";

// async function getImage(){
//     try{
//         let res = await axios.get(url2);
//         console.log(res);
//         return res.data.message;
//     }
//     catch(e)
//     {
//         console.log("Error : ",e);
//         return "/";
//     }
// }
// console.log(getImage());


// let btn = document.querySelector("#btn2");

// btn.addEventListener("click", async () => {
//     let link =  await getImage();
//     // console.log(link);
//     let img = document.querySelector("#image");
//     img.setAttribute("src",link);  
//     console.log(link);
      
// })




// // Sending Headers with API requests 
// // ************************************************************************************************************************************

// const url = "https://icanhazdadjoke.com/";

// async function getJokes(){
//     try{
//         const config = {headers: {Accept : "application/json"} };
//         let res = await axios.get(url,config);
//         console.log(res.data);
//     }
//     catch(e)
//     {
//         console.log("Error : ",e);
//     }
// }

// console.log(getJokes());




// // Activity Using Query Strings
// // ************************************************************************************************************************************

// let url = "http://universities.hipolabs.com/search?country=";

// // let country = "india";

// let btn = document.querySelector("#btn3");

// btn.addEventListener("click",async() => {
//     let country = document.querySelector("#inp").value;
//     console.log(country)
//     let collegeArr = await getColleges(country);
//     show(collegeArr)
// });

// function show(collegeArr){

//     let list = document.querySelector("#list");
//     list.innerText="";

//     for(col of collegeArr)
//     {   
//         console.log(col.name);
        
//         let li = document.createElement("li");
//         li.innerText = col.name;
//         list.appendChild(li);
//     }
// }

// async function getColleges(country){
//     try{
//         let res = await axios.get(url+country);
//         return res.data;
//     }
//     catch(e){
//         console.log("error : ",e);
//         return [];
//     }

// }


// // Note : mam ne as a hw problem bola tha ke hume above code ke jaisa he aisa code likhna hai same api use karke jismai state wise universities search kar sake lekin maine api ke github mai dekha yaha khali country wise ya word wise search kar sakte ... word wise matlab  word input karenge woh university ke naam mai kahi bich mai ya start ya end mai aa rha hoga par state wise search karna possible nhi hai confirmed by gpt also
