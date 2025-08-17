// // What is Templating 👇
// // *******************************************************************************************************

// const express = require("express");
// const app = express();

// let port = 8080;

// app.listen(port,() => {
//     console.log(`listening on port ${port}`);
// });




// // Using EJS👇
// //****************************************************************************************************

// const express = require("express");
// const app = express();

// let port = 8080;

// app.set("view engine","ejs");


// app.get("/",(req,res) => {
//     res.render("home.ejs");
// })

// app.get("/hello",(req,res) => {
//     res.send("hello");
// })

// app.listen(port,() => {
//     console.log(`listening on port ${port}`);
// });


// // Views Directory👇
// // ****************************************************************************************************
// // when we run from 2.) Backend folder i.e. parent folder we have to define views folder path 

// const express = require("express");
// const app = express();
// const path = require("path");

// let port = 8080;

// app.set("view engine","ejs");
// app.set("views",path.join(__dirname,("/views")));


// app.get("/",(req,res) => {
//     res.render("home.ejs");
// })

// app.get("/hello",(req,res) => {
//     res.send("hello");
// })

// app.listen(port,() => {
//     console.log(`listening on port ${port}`);
// });


// // Interpolation Syntax👇
// // ****************************************************************************************************

// const express = require("express");
// const app = express();
// const path = require("path");

// let port = 8080;

// app.set("view engine","ejs");
// app.set("views",path.join(__dirname,("/views")));


// app.get("/",(req,res) => {
//     res.render("home2.ejs");
// })

// app.get("/hello",(req,res) => {
//     res.send("hello");
// })


// app.listen(port,() => {
//     console.log(`listening on port ${port}`);
// });



// // Passing data to EJS👇
// // ****************************************************************************************************

// const express = require("express");
// const app = express();
// const path = require("path");

// let port = 8080;

// app.set("view engine","ejs");
// app.set("views",path.join(__dirname,("/views")));

// app.get("/",(req,res) => {
//     res.render("home2.ejs");
// })


// app.get("/rolldice",(req,res) => {
//     let diceVal = Math.floor(Math.random()*6) + 1;
//     // res.render("rolldice.ejs",{num : diceVal});
//     // res.render("rolldice.ejs",{diceVal : diceVal});
//     res.render("rolldice.ejs",{diceVal});
    
// })

// app.listen(port,() => {
//     console.log(`listening on port ${port}`);
// });


// // Instagram EJS👇
// // ****************************************************************************************************

// const express = require("express");
// const app = express();
// const path = require("path");

// let port = 8080;

// app.set("view engine","ejs");
// app.set("views",path.join(__dirname,("/views")));


// app.get("/",(req,res) => {
//     res.render("home2.ejs");
// })

// app.get("/ig/:username",(req,res) => {
//     let {username} = req.params;
//    res.render("instagram.ejs",{username});
// })

// app.listen(port,() => {
//     console.log(`listening on port ${port}`);
// });



// // Conditional Statements👇
// // ****************************************************************************************************

// const express = require("express");
// const app = express();
// const path = require("path");

// let port = 8080;

// app.set("view engine","ejs");
// app.set("views",path.join(__dirname,("/views")));


// app.get("/",(req,res) => {
//     res.render("home2.ejs");
// })

// app.get("/rolldice",(req,res)=>{
//     let diceVal = Math.floor(Math.random()*6) + 1;
//     res.render("rolldice2.ejs",{diceVal});
// })

// app.listen(port,() => {
//     console.log(`listening on port ${port}`);
// });

// // Loops👇
// // ****************************************************************************************************

// const express = require("express");
// const app = express();
// const path = require("path");

// let port = 8080;

// app.set("view engine","ejs");
// app.set("views",path.join(__dirname,"/views"));

// app.get("/",(req,res) => {
//     res.render("home2.ejs");
// })

// app.get("/ig/:username",(req,res) => {
//     const followers = ["krish","harsh","elvish","john"];
//     let {username} = req.params;
//     res.render("instagram2.ejs",{username,followers});
// })


// app.listen(port,() => {
//     console.log(`listening on port ${port}`);
// })


// // Instagram page with EJS👇
// // ****************************************************************************************************

// const express = require("express");
// const app = express();
// const path = require("path");

// let port = 8080;

// app.set("view engine","ejs");
// app.set("views",path.join(__dirname,"/views"));

// app.get("/",(req,res) => {
//     res.render("home2.ejs");
// })

// app.get("/ig/:username",(req,res) => {
//     let {username} = req.params;
//     const instaData = require("./data.json");
//     const data = instaData[username];
//     console.log(data);

//     if(data){
//     res.render("instagram3.ejs",{data});
//     }else{
//     res.render("error.ejs");
//     }

// })

// app.listen(port,() => {
//     console.log(`listening on port ${port}`);
// })



// // Serving Static files👇
// // ****************************************************************************************************

// const express = require("express");
// const app = express();
// const path = require("path");

// let port = 8080;

// app.use(express.static(path.join(__dirname,"/public/js")));
// app.use(express.static(path.join(__dirname,"/public/css")));
// app.set("view engine","ejs");
// app.set("views",path.join(__dirname,"/views"));

// app.get("/",(req,res) => {
//     res.render("home2.ejs");
// })

// app.get("/ig/:username",(req,res) => {
//     let {username} = req.params;
//     const instaData = require("./data.json");
//     const data = instaData[username];
//     console.log(data);

//     if(data){
//     res.render("instagram4.ejs",{data});
//     }else{
//     res.render("error.ejs");
//     }

// })

// app.listen(port,() => {
//     console.log(`listening on port ${port}`);
// })



// Includes👇
// ****************************************************************************************************

const express = require("express");
const app = express();
const path = require("path");

let port = 8080;

app.use(express.static(path.join(__dirname,"/public/js")));
app.use(express.static(path.join(__dirname,"/public/css")));
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));

app.get("/",(req,res) => {
    res.render("home2.ejs");
})

app.get("/ig/:username",(req,res) => {
    let {username} = req.params;
    const instaData = require("./data.json");
    const data = instaData[username];
    console.log(data);

    if(data){
    res.render("instagram5.ejs",{data});
    }else{
    res.render("error.ejs");
    }

})

app.listen(port,() => {
    console.log(`listening on port ${port}`);
})


