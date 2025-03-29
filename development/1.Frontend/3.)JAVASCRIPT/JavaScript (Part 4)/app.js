//Note : ek ek topic ke code ko uncomment karke run karna

//for loop ............................................................................................................................

// for(let i = 1 ; i<= 5 ; i++)
// {
//     console.log(i);
// }

// for(let i = 5; i>=1;i--)
// {
//     console.log(i);
// }

// for(let i = 10; i>=1;i = i-3)
//     {
//         console.log(i);
//     }


// print odd numbers  ......................................................................................................................


// for (let i = 1;i<=15 ; i = i+2)
// {
//     console.log(i)
// }

// console.log("backwards")
// for(let i = 15;i>= 1 ; i = i-2)
// {
//     console.log(i);
// }


// print even numbers ...........................................................................................................

// for(let i = 2; i<= 10 ; i=i+2) {
//     console.log(i);
// }

// console.log("backwards")

// for(let i = 10 ; i>= 2 ; i=i-2)
// {
//     console.log(i);
// }

//infinite loops ..............................................................................................................

//refer infinite loops image from images folder 
//jan muchke run nhi kar rha kyuki run karte he laptop lag karne lag jata


//multiplication table....................................................................................................


// console.log("table of 5");
// for(let i = 5;i<= 50 ; i= i+5)
// {
//     console.log(i);
// }

// console.log("table of 4");
// for(let i  = 4 ; i<=40 ;i= i+4)
// {
//     console.log(i)
// }

//***************************************************************************************
// Note: prompt mai jo bhi input lete hai hum woh string mai store hota hai isliye hame usse number ww mai convert karne ke liye parseInt() func ko use karna padega jo string ko number mai convert karne ke liye kaam aata hai

// let n  = prompt("enter a number : ");
// n = parseInt(n);

// for(let i = n ; i<= n*10; i = i+n)
// {
//     console.log(i);
// }

// ********************************************************************


//nested for loop **************************************************************************************

// for(let i = 1 ; i<= 3 ; i++)
// {console.log(`outer loop ${i}`);
//     for (let j = 1  ; j <= 3 ;j++)
//     {
//         console.log(j);
//     }
// }


//while loop *********************************************************************************************

// let i = 1;

// while(i<=5)
// {
//     console.log(i);
//     i++;
// }

// console.log(`backwards`)
// let j = 5;

// while(j>=1)
// {
//     console.log(j);
//     j--;
// }

// console.log('odd numbers');

// let m = 1;
// while(m<20)
// {
//     console.log(m);
//     m = m+2;
// }


// favorite movie guessing game **************************************************************************************************************************


// const favMovie = 'avator'

// let guess = prompt("guess my favourite movie : ");

// while((guess != favMovie) && (guess != 'quit'))
// {
//     guess = prompt("wrong guess! plase try again")
// }

// if(guess == favMovie)
// {
//     console.log("congrats! correct guess");
// }
// else{
//     console.log("you quitted the game");
// }

//break keyword ******************************************************************************************************************

// let i = 1;

// while(i <= 5)
// {
//     if(i==3)
//     {
//         break;
//     }
//     console.log(i);
//     i++;
// }

// fav movie guessing game using break ***********************************************************

// const favMovie = 'avator'

// let guess = prompt("guess my favourite movie : ");

// while(guess != favMovie)
// {   if(guess == 'quit')
//     {
//         console.log("you quitted the game");
//         break;
//     }

//     guess = prompt("wrong guess! plase try again");
// }

// if(guess == favMovie)
// {
//     console.log("congrats! correct guess");
// }

//loops with array *********************************************************************************************************************

// let fruits = ["apple","banana","mango","litchi","orange"];
// fruits.push("pineapple");

// for(let i = 0; i< fruits.length;i++)
// {
//     console.log(i,fruits[i]);
// }

// console.log("even");
// for(let i = 0; i< fruits.length;i = i+2)
//     {
//         console.log(i,fruits[i]);
//     }

// console.log("odd");
// for(let i = 1; i< fruits.length;i = i+2)
//     {
//         console.log(i,fruits[i]);
//     }

// console.log("backwards")
// for(let i = fruits.length-1; i>=0;i--)
// {
//     console.log(i,fruits[i]);
// }


//nested loops with arrays

// let arr = [["ironman","thor","wonder women"],["superman","hulk","thunder man"]];

// for(let i = 0 ; i<arr.length;i++)
// {
//     // console.log(`list #${i}`);
//         console.log(i,arr[i],arr[i].length);
//     {
//         for(let j = 0 ; j<arr[0].length;j++)
//         {
//             // console.log(arr[i][j]);
//             console.log(`j = ${j} , ${arr[i][j]}`);
//         }
//     }
// }


// let student = [["aman",97],["krish",100],["harsh",98]];

// for(let i = 0 ; i<student.length;i++)
// {
//     console.log(`details of student : #${i+1}`);
//     for(let j= 0 ; j<student[i].length;j++){
//         console.log(student[i][j]);
//     }
// }


// for of loop ****************************************************************************************************************

// let fruits = ["apple","banana","litchi","mango","orange"];

// for(fruit of fruits)
// {
//     console.log(fruit);
// }

// for(char of "apnacollege")
// {
//     console.log(char);
// }

//nested for of loop ******************************************************************************************************

// let heroes = [["ironman","thor","wonder women"],["superman","hulk","thunder man"]];

// for(hero of heroes)
// {
//     for(Name of hero)
//     {
//         console.log(Name);
//     }
// }


