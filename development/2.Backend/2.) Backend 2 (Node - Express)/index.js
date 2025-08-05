// // ***********************************************************************************************
// // Getting started with express & Handling request



// const express = require('express');
// const app = express();

// // console.dir(app);

// let port = 8080; // 3000

// app.listen(port ,() => {
//     console.log(`app is listening on port ${port}`);
// })

// app.use((req,res) => {
//     console.log("request received");
// })



// // ***********************************************************************************************
// // Sending a response


// const express = require('express');
// const app = express();

// // console.dir(app);

// let port = 8080; // 3000

// app.listen(port ,() => {
//     console.log(`app is listening on port ${port}`);
// })

// app.use((req,res) => {
//     // console.log(req);
//     console.log("request received");

//     // res.send("this is a basic response");

//     // res.send({
//     //         name:"apple",
//     //         color:"red",
//     //     })

//     let code = "<h1>fruits</h1> <ul> <li>apple</li> <li>orange</li> </ul>"
//     res.send(code);

// })



// // ***********************************************************************************************
// // Routing

// const express = require('express');
// const app = express();

// let port = 8080;

// app.listen(port , () => {
//     console.log(`app is listening on port ${port}`);
// })

// app.get('/',(req,res) => {
//     res.send("hello , you are on root path");
// })

// app.get('/apple',(req,res)  => {
//     res.send("you contacted apple path");
// })

// app.get('/orange',(req,res)  => {
//     res.send("you contacted orange path");
// })


// app.post('/',(req,res) => {
//     res.send("you sent a post request to root");
// })

// // yeh jo teen line ka code neeche comment out kiya tha yeh purane express ke version mai chalta tha abhi newer version mai nhi chalta (*) wala wildcard character hame app.use ka istemal karna padta hai
// // app.get('*',(req,res) => {
// //     res.send("this path does not exist");
// // })
// app.use((req,res) => {
//     res.status(404).send("this path does not exist");
// })


// // Note : app.use wali jo req hai jismai hum undefined wali path ke liye path not exist print karwa rhe hai woh sabse last mai he likhna agar uske baad koi path ka response likha hai toh woh execute he nhi hoga uss path pe path does not exist he dikhaega



// // ***********************************************************************************************
// // Installing Nodemon

//  above routing ke code mai he changes karke dekha server khud se restart ho rha tha code save karte he



// // ***********************************************************************************************
// // Path Parameters


// const express = require('express');
// const app = express();

// let port = 8080;

// app.listen(port,() => {
//     console.log(`app is listening on port ${port}`);
// })

// app.get('/',(req,res) => {
//     res.send("hello , i am root");
// })

// app.get('/:username',(req,res) => {
//     console.log(req.params);
//     res.send("hello , i am root 2");
// })

// // app.get('/:username/:id',(req,res) => {
// //     console.log(req.params);
// //     res.send("hello , i am root 3");
// // })

// app.get('/:username/:id',(req,res) => {
//     let {username ,id } = req.params;
//     let htmlstr = `<h1>welcome to the page of @${username} with id ${id}</h1>`;
//     res.send(htmlstr);
// })

// // ***********************************************************************************************
// // Query Strings

// const express = require('express');
// const app = express();

// let port = 8080;

// app.listen(port,() => {
//     console.log(`app is listening on port ${port}`);
// })

// app.get('/',(req,res) => {
//     res.send("hello , i am root");
// })

// // app.get('/search',(req,res) => {
// //     console.log(req.query);
// //     res.send("no results")
// // })

// // app.get('/search',(req,res) => {
// //     let {q} = req.query;
// //     res.send(`<h1>search results for query : ${q}</h1>`);
// // })


// app.get('/search',(req,res) => {
//     let {q} = req.query;
//     if(!q)
//     {
//         res.send("nothing searched");
//     }
//     res.send(`<h1>search results for query : ${q}</h1>`)
// })
// // ek query ke liye ek he response de sakte hai isliye jab query string empty ho tab nothing search print kardega aur wahi end ho jaega aur search results for query wali line tak jaega he nhi kyuki ek query ka ek he response print kar sakte