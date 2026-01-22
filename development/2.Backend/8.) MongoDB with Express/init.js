const mongoose = require('mongoose');
const Chat = require('./models/chat.js');

main()
    .then(() => {
        console.log("connection successful");
    })
    .catch(err => console.log(err));

async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
}


let allChats = [
    {
        from: "neha",
        to: "preti",
        msg: "send me exam notes",
        createdAt: new Date()
    },
    {
        from: "rohit",
        to: "mohit",
        msg: "teach me js callbacks",
        createdAt: new Date()
    },
    {
        from: "amit",
        to: "sumit",
        msg: "all the best !",
        createdAt: new Date()
    },
    {
        from: "anita",
        to: "ramesh",
        msg: "bring me some fruits",
        createdAt: new Date()
    },
    {
        from: "tony",
        to: "pter",
        msg: "love you 3000",
        createdAt: new Date()
    },
]

Chat.insertMany(allChats);