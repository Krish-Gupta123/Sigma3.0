//Note : ek ek subtopic ke code ko uncomment karke run karna

// object literals ****************************************************************************************************

// const student = {
//     name : "Krish",
//     age : 23,
//     marks : 94.4
// };

// const item = {
//     pric : 100.99,
//     dicount : 50,
//     colors : ["red","pink"]
// };

// console.log(student);
// console.log(item);

// creating a post ***************************************************************************************************

// const post = {
//     username : "@krishGupta",
//     content : "this is my first post",
//     likes : 50,
//     repost : 5,
//     tags : ["@apnacollege","@coding"]
// };

// console.log(post);

// Get values ********************************************************************************************************

// const post = {
//     username : "@krishGupta",
//     content : "this is my first post",
//     likes : 50,
//     repost : 5,
//     tags : ["@apnacollege","@coding"]
// };

// console.log(post);

// console.log(post["content"]);//yaha key ko string ke format mai likhte
// console.log(post["likes"]);
// console.log(post.content);// dot operator automatically converts key into string
// console.log(post.likes);
// console.log(post.repost);
// console.log(post.username);
// console.log(post.tags);
// console.log(post.tags[0]);


// // difference between two ways to access key values

// let prop = "repost";
// console.log(post[prop]);
// console.log(post.prop);

// // object ke values ko access karne ke 2 methods hai ek toh -------objectName.keyName--------- jisse dot operator ke through acces access karna bolte hai aur ek ------------objectName["keyName"]---------- wale method se kar sakte hai lekin main difference dono mai yeh hai ke agar koi key ko kisse variable mai store karte hai toh usse dot operator ke help se uss variable ka value kabhi access nhi kar sakte objectName[variableName] wale method se he uski  value access kar sakte for example refer above image


//conversion in get values  *******************************************************************************


// //js automatically converts objects keys to string
// //even if we made a number as a key the number will be converted to string

// const obj = {
//     1: "a",
//     2: "b",
//     true : "c",
//     null : "d",
//     undefined : "e"
// }

// //automatically converts numbers  into string betfore accessing key values
// console.log(obj[1]);
// console.log(obj[2]);
// console.log(obj[true]);
// console.log(obj[null]);
// console.log(obj[undefined]);

// //dot operator does not convert numbers to string therefor gives error to keys which are numbers and we cant access values of keys which are in number format 

// // console.log(obj.1); // throws error
// console.log(obj.true);
// console.log(obj.null);
// console.log(obj.undefined);

//Add / Update values ***********************************************************************************************


// const student = {
//     name : "Krish",
//     age : 23,
//     marks : 94.4,
//     city : "Delhi"
// };

// console.log(student);
// console.log(student.city);
// student.city = "mumbai";
// console.log(student.city);
// student.gender = "female";
// student.marks = "A";

// console.log(student);

// student.marks = [91,90,87,96];

// console.log(student);

// // console.log(delete student.marks); //deleting a property

// console.log(student);

// //note : kabhi bhi object ko expand karoge toh woh latest wala he dikhaega jaise last mai humne marks property ko delete kiya toh object uske upar kahi bhi print karwa lo tumko marks dikhega usmai lekin jab usse expand karoge tab marks wala property he hi dikhega

// //in conclusion : whenever you expand any object it shows the updated object only even if object is updated after printing object 


//Nested obejcts **********************************************************************************************

// const classInfo = {

//     aman : {
//         grade : "A+",
//         city : "mumbai"
//     },

//     shradha : {
//         grade : "A",
//         city : "delhi"
//     },

//     karan : {
//         grade : "O",
//         city : "Pune"
//     }
// };

// console.log(classInfo);
// console.log(classInfo.aman);
// console.log(classInfo.shradha);
// console.log(classInfo.shradha.city);

// // classInfo.shradha.city = "gurgaon";
// // classInfo.shradha.profession = "teacher";

// console.log(classInfo.shradha.city);
// console.log(classInfo.shradha);


//Array of objects ***************************************************************************************************

// const classInfo = [

//      {
//         name : "aman",
//         grade : "A+",
//         city : "mumbai"
//     },

//      {
//         name : "shradha",
//         grade : "A",
//         city : "delhi"
//     },

//      {
//         name : "karan",
//         grade : "O",
//         city : "Pune"
//     }
// ];

// console.log(classInfo);

// console.log(classInfo[0]);
// console.log(classInfo[1]);
// console.log(classInfo[2]);
// console.log(classInfo[1].name);
// console.log(classInfo[1].grade);
// console.log(classInfo[1].city);


// // classInfo[1].city = "gurgaon";
// // classInfo[1].gender = "female";


// console.log(classInfo[1]);



//Math Objects ****************************************************************************************

// console.log(Math);
// console.log(Math.PI);
// console.log(Math.E);
// console.log(Math.abs(12));//takes modulus of number i.e. +ve number
// console.log(Math.abs(-12));
// console.log(Math.abs(-12.5));
// console.log(Math.pow(2,3));//calculates power
// console.log(Math.pow(2,5));
// console.log(Math.floor(5));//round off to nearest smallest number
// console.log(Math.floor(5.5));
// console.log(Math.floor(5.99999999999));
// console.log(Math.floor(-5));
// console.log(Math.floor(-5.5));
// console.log(Math.ceil(5));//round off to nearest largest number
// console.log(Math.ceil(5.5));
// console.log(Math.ceil(5.000001));
// console.log(Math.ceil(-5));
// console.log(Math.ceil(-5.5));

//Random integers ***************************************************************************************

// console.log(Math.random());
// console.log(Math.random());
// console.log(Math.random());
// console.log(Math.random());
// console.log(Math.random());
// console.log(Math.random());


// //generate random number from 1 to 10

// console.log(Math.floor((Math.random()*10))+1);
// console.log(Math.floor((Math.random()*10))+1);
// console.log(Math.floor((Math.random()*10))+1);
// console.log(Math.floor((Math.random()*10))+1);
// console.log(Math.floor((Math.random()*10))+1);
// console.log(Math.floor((Math.random()*10))+1);
// console.log(Math.floor((Math.random()*10))+1);
// console.log(Math.floor((Math.random()*10))+1);
// console.log(Math.floor((Math.random()*10))+1);
// console.log(Math.floor((Math.random()*10))+1);
// console.log(Math.floor((Math.random()*10))+1);

// // Note: Math.random() kabhi bhi 0 se 1 ke bich mai number generate karega lekin kabhi bhi 1 nhi karega toh jab hum multiply by 10 karte hai tab hame range hamesha 0 se 9 tak ka he aaega kyuki woh 1 kabhi generate karega he nhi toh 1 * 10 = 10 kabhi aaega he nhi isliye hum last mai plus 1 karte hai taaki hamara range 0 se 9 tak na hoke 1 se 10 tak ho jae


// practice question *******************************************************************************************

// //generate random number between 1 tp 100 ---------------------------------------------

// // note : Math.ceil() wale mai bas ek loop hole hai agar number 0.0000000000000 generate hota hai toh original number roundoff hoke 1 nhi hoga aur 0 aaejaega but uska chance bohot kam laga meko isliye maine or karke likh diya lekin possiblity hai error hai

// console.log("by Math.floor()");


// console.log(Math.floor(Math.random()*100) + 1);
// console.log(Math.floor(Math.random()*100) + 1);
// console.log(Math.floor(Math.random()*100) + 1);
// console.log(Math.floor(Math.random()*100) + 1);
// console.log(Math.floor(Math.random()*100) + 1);
// console.log(Math.floor(Math.random()*100) + 1);
// console.log(Math.floor(Math.random()*100) + 1);


// //or
// console.log("by Math.ceil()");

// console.log(Math.ceil(Math.random()*100));
// console.log(Math.ceil(Math.random()*100));
// console.log(Math.ceil(Math.random()*100));
// console.log(Math.ceil(Math.random()*100));
// console.log(Math.ceil(Math.random()*100));
// console.log(Math.ceil(Math.random()*100));

// //generate random number between 1 to 5-----------------------------------------------

// console.log("by Math.floor()");

// console.log(Math.floor(Math.random()*5) + 1);
// console.log(Math.floor(Math.random()*5) + 1);
// console.log(Math.floor(Math.random()*5) + 1);
// console.log(Math.floor(Math.random()*5) + 1);
// console.log(Math.floor(Math.random()*5) + 1);
// console.log(Math.floor(Math.random()*5) + 1);
// console.log(Math.floor(Math.random()*5) + 1);


// //or
// console.log("by Math.ceil()");

// console.log(Math.ceil(Math.random()*5));
// console.log(Math.ceil(Math.random()*5));
// console.log(Math.ceil(Math.random()*5));
// console.log(Math.ceil(Math.random()*5));
// console.log(Math.ceil(Math.random()*5));
// console.log(Math.ceil(Math.random()*5));

// //generate random numbers between 21 to 25 .......................extra

// console.log("21 to 25");

// console.log(Math.floor(Math.random()*5) + 21);
// console.log(Math.floor(Math.random()*5) + 21);
// console.log(Math.floor(Math.random()*5) + 21);
// console.log(Math.floor(Math.random()*5) + 21);
// console.log(Math.floor(Math.random()*5) + 21);