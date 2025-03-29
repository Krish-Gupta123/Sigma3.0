//NOTE : EK EK TOPIC KA CODE UNCOMMENT KARKE RUN KARNA SAB EK SATH MAT UNCOMMENT KARNA KYUKI VARIABLE KE NAAM SAME HAI

//trim method.........................................

//note : trim() removes only leading and trailing spaces but keeps spaces inside the string.  trim se khali starting ke aur last ke spaces nikalti hai beech ke waise ke waise he rehti hai



// let msg = "    hel   lo ";
// console.log(msg.trim());

// let password = prompt("enter your password : ");
// console.log(typeof(password));
// let newPassword = password.trim();
// console.log(password);
// console.log(newPassword);


//strings are immutable......................................

// let str = "    jai shree ram     "
// console.log(str.trim());
// console.log(str);


//string methods .....................................

// let string = "Apna College";
// console.log(string.toUpperCase());
// console.log(string.toLowerCase());

// console.log(string.indexOf("College"));
// console.log(string.indexOf("college"));
// console.log(string.indexOf("d"));
// console.log(string.indexOf("a"));



//method chaining  ................................................

// let msg = "       hello       ";
// let newMsg = msg.trim().toUpperCase();
// console.log(newMsg);


// method slicing ..................................................

// let msg = "apnacollege";
// console.log(msg.slice(4,msg.length));
// console.log(msg.slice(4,6));
// console.log(msg.slice(-3));
// console.log(msg.slice(1));

// replace and repeat method................................................................

// let str = "ilovecoding"
// console.log(str.replace("love","do"));
// console.log(str.replace("o","x"));

// let msg = "apnaapnaapna apna";
// console.log(msg.replace("apna","college"));

// let fruit  = "mango";
// console.log(fruit.repeat(5));
// console.log(fruit.repeat(3));

//practice question 1..............................................................

//question 1...................
// let msg = "help!";
// console.log(msg.trim().toUpperCase());

// //question 2 ..................
// let Name = "ApnaCollege"
// console.log(Name.slice(4,9));
// console.log(Name.indexOf("na"));
// console.log(Name.replace("Apna","Our"));

// //question 3.................

// let newStr = Name.slice(4).replace("l","t");
// console.log(newStr.replace("l","t"));

// //or

// console.log(Name.slice(4).replace("l","t").replace("l","t"));




//arrays started ..............................................................................................

// let students = ["ram","hanuman","laxman","krish"];
// console.log(typeof(students));

// let nums = [2,4,6,8];
// console.log(nums);

// let Name = "krish";

// console.log(Name[0]);
// console.log(nums[0]);
// console.log(nums[1]);
// console.log(nums[2]);
// console.log(nums[3]);
// console.log(nums[4]);

// console.log(nums.length);
// console.log(typeof(nums));

// let info = ["adam bhai",17,32.7]; //mixed array
// let newArr = [];//empty array

// console.log(info);
// console.log(newArr);
// console.log(newArr[0]);

// console.log(info.length);
// console.log(newArr.length);
// console.log([].length);
// console.log([1,2,3,4].length);
// console.log(info[0]);
// console.log(info[0][0]);
// console.log(info[0].length)


//arrays are mutable .........................................................................................

// let fruits = ['mango','apple','lichi'];
// console.log(fruits);
// fruits[0] = 'banana';
// console.log(fruits);
// fruits[1] = 'pineapple';
// console.log(fruits);
// fruits[10] = 'papaya'
// console.log(fruits);
// console.log(fruits[5]);


//arrays method ..................................................................

// let cars = ['audi','bmw','mercedes','xuv'];
// console.log(cars.push('gwagon')); // return length
// cars.push('ferari');
// console.log(cars);
// console.log(cars.pop());//returns deleted element
// cars.pop();
// console.log(cars);


// console.log(cars.unshift("toyota")); // returns length
// cars.unshift('porsche');
// console.log(cars);
// console.log(cars.shift());// returns deleted element
// console.log(cars);


// //bohot he simple way mai rough idea lag jaega kaise work karta yeh sab real life mai
// let followers = ['a','b','c'];
// let blocked = followers.shift();
// console.log(followers);
// console.log(blocked);


//practice question 2.........................................................................................................


// let months = ['january','july','march','august'];

// months.shift();
// months.shift();
// console.log(months);
// months.unshift('june');
// months.unshift('july');
// console.log(months);


// arrays method .................................................................................................



//includes and indexOf method ..........................


// let primary = ['red','yellow','blue'];

// console.log(primary.indexOf('yellow'));
// console.log(primary.indexOf('green'));
// console.log(primary.indexOf('Yellow'));

// console.log(primary.includes('red'));
// console.log(primary.includes('orange'));


//Concatenation and reverse ..............................

// let primary = ['red','yellow','blue'];
// let secondary = ['orange','green','violet'];

// console.log(primary.concat(secondary));
// console.log(primary);
// console.log(primary.reverse()); // chances original primary array
// console.log(primary);


//slice method ...............................

// let colors = ['red','yellow','blue','orange','pink','white'];

// console.log(colors.slice());
// console.log(colors.slice(2));
// console.log(colors.slice(3,5)); //last index excluded
// console.log(colors.slice(-3));
// console.log(colors.slice(-7));
// console.log(colors.slice(colors.length));
// console.log(colors.slice(colors.length -2));


//splice method ....................
// Note : slice method array aur string ke copy banake usmai change karta hai lekin splice method original array mai changes karta hai

// let colors = ['red','yellow','blue','orange','pink','white'];

// console.log(colors.splice(4));
// console.log(colors.splice(0,1));
// console.log(colors);
// console.log(colors.splice(0,1,'black','grey'));
// console.log(colors);


// let cars = ['xuv','bmw','xuv','maruti'];
// console.log(cars.splice(3));
// console.log(cars);
// console.log(cars.splice(0,1));
// console.log(cars);
// cars.push("maruti");
// cars.push("ferari");
// console.log(cars);
// console.log(cars.splice(1,2));
// console.log(cars);
// console.log(cars.splice(0,0,'toyota','xuv','maruti'));
// console.log(cars);
// console.log(cars.splice(1,0,'mercedes'));
// console.log(cars);
// console.log(cars.splice(1,1,'gwagon'));
// console.log(cars);


//sort method ...............................

// let cars = ['toyota','gwagon','xuv','maruti','bmw','ferari'];
// console.log(cars.sort());

// let chars = ['b','d','e','a'];
// console.log(chars.sort());

// let marks = [99,89,67,42,100];
// console.log(marks.sort());


//practice question 3 ..............................................................................................................

// let start = ['january','july','march','august'];
// console.log(start.splice(0,2,'july','june'));
// console.log(start);

// let lang = ['c','c++','html','javascript','python','java','c#','sql'];
// console.log(lang.reverse().indexOf('javascript'))


//array references .......address in memory..................................................................................


// //imagine hum is mai 2 array banate hai ek arr1 karke aur ek arr2 karke toh jo arr1 aur arr2 hai woh khali apne andar ke 1st element ka address store karta hai same as java aur arr1 aur arr2 ko hum reference bulate hai abb samjo humne arr1 maj ek element 4 store kiya aur arr2 mai bhi 4 store kiya toh value dono ka same hai lekin jab hum arr1 == arr2 ya arr1 ===arr2 karte hai tab woh address check karta hai aur address dono ka alag hai kyuki dono bana alag alag jagah pe hai memeory mai isliye false return hota hai ans mai
// console.log("name" == "name");
// console.log("name" === "name");
// console.log([1] == [1]); //compares address where each array is made 
// console.log([1] === [1]);
// console.log([] == []);
// console.log([] === []);





// //Note: yeh wale case mai arrcopy mai arr ko assign kiya hai matlab arrcopy mai arr mai jo address stored hai wohi address arrcopy mai mai store ho jaega hume pura array store karne ke jarurat nhi hai sidha equal to reference ka naam likh dene ka address store ho jata hai abb since arrcopy aur arr dono mai same adoress stored hai toh hum kisse bhi ek mai koi bhi change karenge toh woh www change dono mai reflect hoga
// let arr = ['a','b','c'];
// let arrcopy = arr;

// console.log(arr == arrcopy);
// console.log(arr === arrcopy);

// arr.push('d');

// console.log(arr);
// console.log(arrcopy);

// arrcopy.pop();

// console.log(arrcopy);
// console.log(arr);



// constant array .................................................................................................................................

// Note: koi variable ko const banate hai toh usse change nhi kar sakte lekin agar koi array ko const www banate hai toh usmai hum sab operations kar sakte jaise shift unshift push pop bas uss array mai kisse aur ka reference store nhi kar sakte jaise 2 array hai arr1 aur arr2 aur arr1 const hai toh usmai arr1= arr2 nhi kar sakte

// const arr = [1,2,3];

// console.log(arr);
// console.log(arr.push(4));
// console.log(arr);
// console.log(arr.pop());
// console.log(arr);
// // arr = [1,2,3];  // gives error since we cant assign new address to constant array
// cars = ['audi','bmw','ferari'];
// // arr = cars;  // gives error since we cant assign new address to constant array



// nested arrays...........................................................................................................................

// let nums = [[2,4],[3,6],[4,8]];
// console.log(nums);

// console.log(nums.length);
// console.log(nums[0]);
// console.log(nums[0].length);
// console.log(nums[0][0]);
// console.log(nums[1][1]);
// console.log(nums[1][2]);
// console.log(nums[2][0]);




//practice question 4 .................................................................................................................................
//isse bas ek rough idea lagega tic tac toe ke code ka 

// let game = [['X',null,'O'],[null,'X',null],['O',null,'X']];
// console.log(game);
// console.log(game[0]);
// console.log(game[0][1]);
// game[0][1] = 'O';
// console.log(game);