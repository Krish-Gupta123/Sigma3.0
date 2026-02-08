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

// // Index Route 👇
// // **********************************************************

// const express = require('express');
// const app = express();
// const mongoose = require('mongoose');
// const path = require('path');
// const Chat = require('./models/chat.js');

// app.set('views', path.join(__dirname, 'views'));
// app.set('view engine', 'ejs');
// app.use(express.urlencoded({ extended: true }));
// app.use(express.static(path.join(__dirname, 'public')));


// main()
//     .then(() => {
//         console.log("connection successful");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
// }

// // index route

// app.get('/chats', async (req, res) => {
//     let chats = await Chat.find({});
//     res.render('index.ejs', { chats });
// })

// app.get('/', (req, res) => {
//     res.send('root working well');
// })


// app.listen('8080', () => {
//     console.log('server is listening on port 8080');
// })


// // New Route 👇
// // **********************************************************

// const express = require('express');
// const app = express();
// const mongoose = require('mongoose');
// const path = require('path');
// const Chat = require('./models/chat.js');

// app.set('views', path.join(__dirname, 'views'));
// app.set("view engine", 'ejs');
// app.use(express.urlencoded({ extended: true }));
// app.use(express.static(path.join(__dirname, 'public')));

// main()
//     .then(() => {
//         console.log("connection successful");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
// }

// app.get('/', (req, res) => {
//     res.send("root working well");
// })

// //index route
// app.get('/chats', async (req, res) => {
//     let chats = await Chat.find({});
//     res.render('index.ejs', { chats });
// })

// //new route
// app.get('/chats/new', (req, res) => {
//     res.render('new.ejs');
// })

// // create route


// app.listen('8080', () => {
//     console.log('server is listening on port 8080');
// })


// // Create Route 👇
// // **********************************************************

// const express = require('express');
// const app = express();
// const mongoose = require('mongoose');
// const path = require('path');
// const Chat = require('./models/chat.js');

// app.set('views', path.join(__dirname, 'views'));
// app.set("view engine", 'ejs');
// app.use(express.urlencoded({ extended: true }));
// app.use(express.static(path.join(__dirname, 'public')));

// main()
//     .then(() => {
//         console.log("connection successful");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
// }

// app.get('/', (req, res) => {
//     res.send("root working well");
// })

// //index route
// app.get('/chats', async (req, res) => {
//     let chats = await Chat.find({});
//     res.render('index.ejs', { chats });
// })

// //new route
// app.get('/chats/new', (req, res) => {
//     res.render('new.ejs');
// })

// // create route
// app.post('/chats', (req, res) => {
//     let { from, to, msg } = req.body;
//     let newChat = new Chat({
//         from: from,
//         to: to,
//         msg: msg,
//         createdAt: new Date(),
//     });

//     newChat
//         .save()
//         .then((res) => {
//             console.log("chat was saved");
//         })
//         .catch((err) => {
//             console.log(err);
//         })

//     res.redirect('/chats');
// });

// app.listen('8080', () => {
//     console.log('server is listening on port 8080');
// })


// // Using Date 👇
// // **********************************************************

// same code as above just changes in index.ejs


// // Edit Route 👇
// // **********************************************************

// const express = require('express');
// const app = express();
// const mongoose = require('mongoose');
// const path = require('path');
// const Chat = require('./models/chat.js');

// app.set('views', path.join(__dirname, 'views'));
// app.set("view engine", 'ejs');
// app.use(express.urlencoded({ extended: true }));
// app.use(express.static(path.join(__dirname, 'public')));

// main()
//     .then(() => {
//         console.log("connection successful");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
// }

// app.get('/', (req, res) => {
//     res.send("root working well");
// })

// //index route
// app.get('/chats', async (req, res) => {
//     let chats = await Chat.find({});
//     res.render('index.ejs', { chats });
// })

// //new route
// app.get('/chats/new', (req, res) => {
//     res.render('new.ejs');
// })

// // create route
// app.post('/chats', (req, res) => {
//     let { from, to, msg } = req.body;
//     let newChat = new Chat({
//         from: from,
//         to: to,
//         msg: msg,
//         createdAt: new Date(),
//     });

//     newChat
//         .save()
//         .then((res) => {
//             console.log("chat was saved");
//         })
//         .catch((err) => {
//             console.log(err);
//         })

//     res.redirect('/chats');
// });

// //edit route

// app.get('/chats/:id/edit', async (req, res) => {
//     let { id } = req.params;
//     let chat = await Chat.findById(id);
//     res.render('edit.ejs', { chat });
// })

// app.listen('8080', () => {
//     console.log('server is listening on port 8080');
// })

// // Update Route 👇
// // **********************************************************

// const express = require('express');
// const app = express();
// const mongoose = require('mongoose');
// const path = require('path');
// const Chat = require('./models/chat.js');
// const methodOverride = require('method-override');

// app.set('views', path.join(__dirname, 'views'));
// app.set("view engine", 'ejs');
// app.use(express.urlencoded({ extended: true }));
// app.use(express.static(path.join(__dirname, 'public')));
// app.use(methodOverride('_method'))

// main()
//     .then(() => {
//         console.log("connection successful");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
// }

// app.get('/', (req, res) => {
//     res.send("root working well");
// })

// //index route
// app.get('/chats', async (req, res) => {
//     let chats = await Chat.find({});
//     res.render('index.ejs', { chats });
// })

// //new route
// app.get('/chats/new', (req, res) => {
//     res.render('new.ejs');
// })

// // create route
// app.post('/chats', (req, res) => {
//     let { from, to, msg } = req.body;
//     let newChat = new Chat({
//         from: from,
//         to: to,
//         msg: msg,
//         createdAt: new Date(),
//     });

//     newChat
//         .save()
//         .then((res) => {
//             console.log("chat was saved");
//         })
//         .catch((err) => {
//             console.log(err);
//         })

//     res.redirect('/chats');
// });

// //edit route

// app.get('/chats/:id/edit', async (req, res) => {
//     let { id } = req.params;
//     let chat = await Chat.findById(id);
//     res.render('edit.ejs', { chat });
// })

// app.listen('8080', () => {
//     console.log('server is listening on port 8080');
// })

// // update route

// app.put('/chats/:id', async (req, res) => {
//     let { msg: newMsg } = req.body;
//     let { id } = req.params;
//     console.log(newMsg);
//     let updatedChat = await Chat.findByIdAndUpdate(id,
//         { msg: newMsg },
//         { runValidators: true, new: true });

//     console.log(updatedChat);
//     res.redirect('/chats');

// })


// // Destroy Route 👇
// // ***********************************************************


const express = require('express');
const app = express();
const path = require('path');
const Chat = require('./models/chat.js');
const mongoose = require('mongoose');
const methodOverride = require('method-override')


app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');
app.use(express.urlencoded({ extended: true }));
app.use(express.static(path.join(__dirname, 'public')));
app.use(methodOverride('_method'))



main()
    .then(() => {
        console.log('connection successful');
    })
    .catch(err => console.log(err));

async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
}

app.get('/', (req, res) => {
    res.send('root working well');
})


// index route
app.get('/chats', async (req, res) => {
    let chats = await Chat.find({});
    res.render('index.ejs', { chats });
})

//new route
app.get('/chats/new', (req, res) => {
    res.render('new.ejs');
})

//create route
app.post('/chats', (req, res) => {
    let { from, to, msg } = req.body;
    let newChat = new Chat({
        from: from,
        to: to,
        msg: msg,
        createdAt: new Date(),
    });

    newChat
        .save()
        .then((res) => {
            console.log("chat was saved");
        })
        .catch((err) => {
            console.log(err);
        })

    res.redirect('/chats');
})

// edit route
app.get('/chats/:id/edit', async (req, res) => {
    let { id } = req.params;
    let chat = await Chat.findById(id);
    res.render('edit.ejs', { chat });
})

//update route
app.put('/chats/:id', async (req, res) => {
    let { id } = req.params;
    let { msg: newMsg } = req.body;
    console.log(newMsg);
    let updatedChat = await Chat.findByIdAndUpdate(id, { msg: newMsg }, { runValidators: true, new: true });

    console.log(updatedChat);
    res.redirect('/chats');
})

//delete route
app.delete('/chats/:id', async (req, res) => {
    let { id } = req.params;
    let deletedChat = await Chat.findByIdAndDelete(id);
    console.log(deletedChat);
    res.redirect('/chats');
})

app.listen('8080', () => {
    console.log('server listening on port 8080');
})