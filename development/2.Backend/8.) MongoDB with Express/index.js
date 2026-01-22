// // Basic Set Up 👇
// // **********************************************************

// const express = require('express');
// const app = express();
// const mongoose = require('mongoose');
// const path = require('path');

// app.set('views', path.join(__dirname, 'views'));
// app.set('view engine', 'ejs');
// app.use(express.urlencoded({ extended: true }));


// main()
//     .then(() => {
//         console.log("connection successful");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
// }

// app.get('/', (req, res) => {
//     res.send('root working well');
// })

// app.listen('8080', () => {
//     console.log('server is listening on port 8080');
// })




// // Creating our Model (Chat) 👇
// // **********************************************************

// // refer chat.js also of modules
// const express = require('express');
// const app = express();
// const mongoose = require('mongoose');
// const path = require('path');
// const Chat = require('./models/chat.js');

// app.set('views', path.join(__dirname, 'views'));
// app.set('view engine', 'ejs');
// app.use(express.urlencoded({ extended: true }));


// main()
//     .then(() => {
//         console.log("connection successful");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
// }

// app.get('/', (req, res) => {
//     res.send('root working well');
// })

// const chat1 = new Chat({
//     from: 'priya',
//     to: 'rahul',
//     msg: 'send me your notes',
//     createdAt: new Date()
// });

// chat1.save()
//     .then((res) => {
//         console.log(res);
//     })

// app.listen('8080', () => {
//     console.log('server is listening on port 8080');
// })



// // Initialize Database 👇
// // **********************************************************

// refer init.js

// Index Route 👇
// **********************************************************

const express = require('express');
const app = express();
const mongoose = require('mongoose');
const path = require('path');
const Chat = require('./models/chat.js');

app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');
app.use(express.urlencoded({ extended: true }));
app.use(express.static(path.join(__dirname, 'public')));


main()
    .then(() => {
        console.log("connection successful");
    })
    .catch(err => console.log(err));

async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
}

// index route

app.get('/chats', async (req, res) => {
    let chats = await Chat.find({});
    res.render('index.ejs', { chats });
})

app.get('/', (req, res) => {
    res.send('root working well');
})


app.listen('8080', () => {
    console.log('server is listening on port 8080');
})


// New Route 👇
// **********************************************************



// Create Route 👇
// **********************************************************



// Using Date 👇
// **********************************************************



// Edit Route 👇
// **********************************************************


// Update Route 👇
// **********************************************************



// Destroy Route 👇

