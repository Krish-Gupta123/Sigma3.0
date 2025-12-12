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


// // Redirect 👇
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
//     res.redirect("/posts");
// })

// app.listen(port,() =>{
//     console.log("Listening on port : 8080");
// })



// // Show Route 👇
// // ***********************************************************************************************

// const express = require("express");
// const app = express();
// const port = 8080;
// const path = require('path');

// app.use(express.urlencoded({ extended: true }));

// app.set("view engine", "ejs");
// app.set('views', path.join(__dirname, 'views'));

// app.use(express.static(path.join(__dirname, "public")));

// let posts = [
//     {
//         id: '1a',
//         username: "apnacollege",
//         content: "I am a content creator",
//     },

//     {
//         id: '2b',
//         username: "shradha khapra",
//         content: "Hardwork is the key to success",
//     },

//     {
//         id: '3c',
//         username: "krish gupta",
//         content: "i got selected for my first intenship !",
//     }
// ]


// app.get('/posts', (req, res) => {
//     res.render('index.ejs', { posts });
// })

// app.get('/posts/new', (req, res) => {
//     res.render('new.ejs');
// })

// app.post('/posts', (req, res) => {
//     let { username, content } = req.body;
//     posts.push({ username, content });
//     res.redirect("/posts");
// })

// app.get('/posts/:id', (req, res) => {
//     let { id } = req.params;
//     let post = posts.find(p => p.id === id);
//     res.render('show.ejs', { post });
// })

// app.listen(port, () => {
//     console.log("Listening on port 8080");
// })


// // Creating Ids (UUID) 👇
// // ***********************************************************************************************
// const express = require("express");
// const app = express();
// const port = 8080;
// const path = require('path');
// const { v4: uuidv4 } = require('uuid');

// app.use(express.urlencoded({ extended: true }));

// app.set("view engine", "ejs");
// app.set('views', path.join(__dirname, 'views'));

// app.use(express.static(path.join(__dirname, "public")));

// let posts = [
//     {
//         id: uuidv4(),
//         username: "apnacollege",
//         content: "I am a content creator",
//     },

//     {
//         id: uuidv4(),
//         username: "shradha khapra",
//         content: "Hardwork is the key to success",
//     },

//     {
//         id: uuidv4(),
//         username: "krish gupta",
//         content: "i got selected for my first intenship !",
//     }
// ]


// app.get('/posts', (req, res) => {
//     res.render('index.ejs', { posts });
// })

// app.get('/posts/new', (req, res) => {
//     res.render('new.ejs');
// })

// app.post('/posts', (req, res) => {
//     let { username, content } = req.body;
//     let id = uuidv4();
//     posts.push({ id, username, content });
//     res.redirect("/posts");
// })

// app.get('/posts/:id', (req, res) => {
//     let { id } = req.params;
//     let post = posts.find(p => p.id === id);
//     res.render('show.ejs', { post });
// })

// app.listen(port, () => {
//     console.log("Listening on port 8080");
// })


// // Update Route 👇
// // ***********************************************************************************************

// const express = require('express');
// const app = express();
// const port = 8080;
// const path = require('path');
// const { v4: uuidv4 } = require('uuid');

// app.use(express.urlencoded({ extended: true }));

// app.set('view engine', 'ejs');
// app.set('views', path.join(__dirname, 'views'));

// app.use(express.static(path.join(__dirname, "public")));

// let posts = [
//     {
//         id: uuidv4(),
//         username: "apnacollege",
//         content: "I am a content creator",
//     },

//     {
//         id: uuidv4(),
//         username: "shradha khapra",
//         content: "Hardwork is the key to success",
//     },

//     {
//         id: uuidv4(),
//         username: "krish gupta",
//         content: "i got selected for my first intenship !",
//     }
// ]

// app.get('/posts', (req, res) => {
//     res.render('index.ejs', { posts });
// });

// app.get('/posts/new', (req, res) => {
//     res.render('new.ejs');
// })

// app.post('/posts', (req, res) => {
//     let { username, content } = req.body;
//     let id = uuidv4();
//     posts.push({ id, username, content });
//     res.redirect('/posts');
// })

// app.get('/posts/:id', (req, res) => {
//     let { id } = req.params;
//     let post = posts.find(p => p.id === id);
//     res.render('show.ejs', { post });
// })

// app.patch('/posts/:id', (req, res) => {
//     let { id } = req.params;
//     let newContent = req.body.content;
//     let post = posts.find(p => p.id === id);
//     post.content = newContent;
//     console.log(post);
//     res.send('Patch request working');
// })

// app.listen(port, () => {
//     console.log('Listening on port 8080');
// })


// // Edit Route 👇
// // ***********************************************************************************************


// const express = require('express');
// const app = express();
// const port = 8080;
// const path = require('path');
// const { v4: uuidv4 } = require('uuid');
// var methodOverride = require('method-override')

// app.use(express.urlencoded({ extended: true }));
// app.use(methodOverride('_method'))

// app.set('view engine', 'ejs');
// app.set('views', path.join(__dirname, 'views'));

// app.use(express.static(path.join(__dirname, "public")));

// let posts = [
//     {
//         id: uuidv4(),
//         username: "apnacollege",
//         content: "I am a content creator",
//     },

//     {
//         id: uuidv4(),
//         username: "shradha khapra",
//         content: "Hardwork is the key to success",
//     },

//     {
//         id: uuidv4(),
//         username: "krish gupta",
//         content: "i got selected for my first intenship !",
//     }
// ]

// app.get('/posts', (req, res) => {
//     res.render('index.ejs', { posts });
// });

// app.get('/posts/new', (req, res) => {
//     res.render('new.ejs');
// })

// app.post('/posts', (req, res) => {
//     let { username, content } = req.body;
//     let id = uuidv4();
//     posts.push({ id, username, content });
//     res.redirect('/posts');
// })

// app.get('/posts/:id', (req, res) => {
//     let { id } = req.params;
//     let post = posts.find(p => p.id === id);
//     res.render('show.ejs', { post });
// })

// app.patch('/posts/:id', (req, res) => {
//     let { id } = req.params;
//     let newContent = req.body.content;
//     let post = posts.find(p => p.id === id);
//     post.content = newContent;
//     console.log(post);
//     res.redirect('/posts');

// })

// app.get('/posts/:id/edit', (req, res) => {
//     let { id } = req.params;
//     let post = posts.find(p => p.id === id);
//     res.render('edit.ejs', { post });
// })

// app.listen(port, () => {
//     console.log('Listening on port 8080');
// })



// Destroy Route 👇
// ***********************************************************************************************

const express = require('express');
const app = express();
const port = 8080;
const path = require('path');
const { v4: uuidv4 } = require('uuid');
var methodOverride = require('method-override')

app.use(express.urlencoded({ extended: true }));
app.use(methodOverride('_method'));

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

app.use(express.static(path.join(__dirname, "public")));

let posts = [
    {
        id: uuidv4(),
        username: "apnacollege",
        content: "I am a content creator",
    },

    {
        id: uuidv4(),
        username: "shradha khapra",
        content: "Hardwork is the key to success",
    },

    {
        id: uuidv4(),
        username: "krish gupta",
        content: "i got selected for my first intenship !",
    }
]

app.get('/posts', (req, res) => {
    res.render('index.ejs', { posts });
})

app.get('/posts/new', (req, res) => {
    res.render('new.ejs');
})

app.post('/posts', (req, res) => {
    let { username, content } = req.body;
    let id = uuidv4();
    posts.push({ id, username, content });
    res.redirect('/posts');
})

app.get('/posts/:id', (req, res) => {
    let { id } = req.params;
    let post = posts.find(p => p.id === id);
    res.render('show.ejs', { post });
})

app.get('/posts/:id/edit', (req, res) => {
    let { id } = req.params;
    let post = posts.find(p => p.id === id);
    res.render('edit.ejs', { post });
})

app.patch('/posts/:id', (req, res) => {
    let { id } = req.params;
    let newContent = req.body.content;
    let post = posts.find(p => p.id === id);
    post.content = newContent;
    console.log(post);
    res.redirect('/posts');
})

app.delete('/posts/:id', (req, res) => {
    let { id } = req.params;
    posts = posts.filter(p => p.id !== id);
    res.redirect('/posts');
})

app.listen(port, () => {
    console.log('Listening on port 8080');
})