// Note : ek ek part ko uncomment karke run karna ......pura file ek sath mat run karna

//question 1 ***********************************************************************************

// let arr = [4,9,6,8,4,3,2,11,58];
// let num  = 5;


// // elements larger than a number num
// function question1(arr,num)
// {
//     for(let i = 0;i<arr.length;i++)
//     {
//         if(arr[i]> num)
//         {
//             console.log(arr[i]);
//         }
//     }
// }

// question1(arr,num);


//question 2 ***********************************************************************************

// let str = "abcdabcdefgggh";


// // function to get string with all unique elements
// function uniqueString(str)
// {
// let ans = "";
//     for(let i = 0 ; i<str.length ; i++)
//     {
//         if(ans.indexOf(str[i]) == -1)
//         {
//             //if current character is not added, then add it in ans.
//             //Otherwise it is a duplicate.
//             ans += str[i];
//         }
//     }
//     return ans;
// }

// console.log(uniqueString(str));



//question 3 ***********************************************************************************

// let country = ["Australia" ,"Germany" ,"United States Of America" , "India"];

// function countries(country)
// {
//     let max = 0;
//     for(let i = 0 ; i< country.length ; i++)
//     {
//         if(country[max].length < country[i].length)
//         {
//             max = i;
//         }
        
//     }
//     console.log(country[max]);
// }

// countries(country)

//question 4 ***********************************************************************************

// let str = "apnacollege"

// function countVowels(str)
// {
//     let count = 0;
//     for(let i = 0;i<str.length;i++)
//     {
//         if((str[i] == 'a') || (str[i] == 'e') || (str[i] == 'i') || (str[i] == 'o') || (str[i] == 'u'))
//         {
//             count++;
//         }
//     }
//     return count;
// }

// console.log(countVowels(str));


//question 5 ***********************************************************************************
//solution sheet mai galat diya hai ans apun ka sahi hai


// let start = 3;
// let end = 10;

// function random(start,end)
// {
//     console.log(Math.floor(Math.random() * (end-start+1)) + start);
// }


// random(start,end);