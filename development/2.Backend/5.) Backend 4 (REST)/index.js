// // What is REST ? 👇
// // ***********************************************************************************************

// no code


// // CRUD Operations 👇
// // ***********************************************************************************************

//  no code

// // Creating RESTful API 👇
// // ***********************************************************************************************

// const express = require('express');
// const app = express();
// const port = 8080;
// const path = require('path');

// app.use(express.urlencoded({extended : true}));

// app.set('view engine','ejs');
// app.set('views',path.join(__dirname,'views'));

// app.use(express.static(path.join(__dirname,"public")));

// app.get("/",(req,res) => {
//     res.send("server working well");
// })

// app.listen(port,() =>{
//     console.log("Listening on port : 8080");
// })


// // Index Route 👇
// // ***********************************************************************************************

// const express = require ('express');
// const app = express();
// const  port = 8080;
// const path = require("path");

// app.use(express.urlencoded({extended:true}));

// app.set("view engine","ejs");
// app.set('views',path.join(__dirname,"views"));

// app.use(express.static(path.join(__dirname,"public")));

// let posts = [
//     {
//         username : "apnacollege",
//         content : "I am a content creator",
//     },

//     {
//         username : "shradha khapra",
//         content : "Hardwork is the key to success",
//     },

//     {
//         username : "krish gupta",
//         content : "i got selected for my first intenship !",
//     }
// ]

// app.get("/posts",(req,res) => {
//     res.render("index.ejs",{posts});
// })

// app.listen(port,()=> {
//     console.log("Listening on port : 8080");
// })

// // Create & New Route 👇
// // ***********************************************************************************************

// const express = require("express");
// const app = express();
// const port = 8080;
// const path = require('path');

// app.use(express.urlencoded({extended:true}));

// app.set("view engine","ejs");
// app.set('views',path.join(__dirname,'views'));

// app.use(express.static(path.join(__dirname,"public")));

// let posts = [
//     {
//         username : "apnacollege",
//         content : "I am a content creator",
//     },

//     {
//         username : "shradha khapra",
//         content : "Hardwork is the key to success",
//     },

//     {
//         username : "krish gupta",
//         content : "i got selected for my first intenship !",
//     }
// ]


// app.get('/posts',(req,res)=> {
//     res.render('index.ejs',{posts});
// })

// app.get('/posts/new',(req,res) => {
//     res.render('new.ejs');
// })

// app.post('/posts',(req,res) => {
//     let {username,content} = req.body;
//     posts.push({username,content});
//     res.send("post req working well");
// })

// app.listen(port,() =>{
//     console.log("Listening on port : 8080");
// })


// Redirect 👇
// ***********************************************************************************************

const express = require("express");
const app = express();
const port = 8080;
const path = require('path');

app.use(express.urlencoded({extended:true}));

app.set("view engine","ejs");
app.set('views',path.join(__dirname,'views'));

app.use(express.static(path.join(__dirname,"public")));

let posts = [
    {
        username : "apnacollege",
        content : "I am a content creator",
    },

    {
        username : "shradha khapra",
        content : "Hardwork is the key to success",
    },

    {
        username : "krish gupta",
        content : "i got selected for my first intenship !",
    }
]

app.get('/posts',(req,res)=> {
    res.render('index.ejs',{posts});
})

app.get('/posts/new',(req,res) => {
    res.render('new.ejs');
})

app.post('/posts',(req,res) => {
    let {username,content} = req.body;
    posts.push({username,content});
    res.redirect("/posts");
})

app.listen(port,() =>{
    console.log("Listening on port : 8080");
})



// Show Route 👇
// ***********************************************************************************************

// Creating Ids (UUID) 👇
// ***********************************************************************************************

// Update Route 👇
// ***********************************************************************************************

// Edit Route 👇
// ***********************************************************************************************

// Destroy Route 👇
// ***********************************************************************************************
