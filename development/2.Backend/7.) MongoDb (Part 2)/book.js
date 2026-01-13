// // Schema Validations
// // *******************************************************************

// const mongoose = require('mongoose');

// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch((err) => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/amazon');
// }

// const bookSchema = new mongoose.Schema({
//     title: {
//         type: String,
//         required: true
//     },
//     author: {
//         type: String,
//     },
//     price: {
//         type: Number
//     }
// })

// const Book = mongoose.model('Book', bookSchema);

// let Book1 = new Book({
//     title: "How to kill a mocking bird",
//     author: "Harper Lee",
//     price: "299"
// })
// Book1.save()
//     .then((res) => {
//         console.log(res);
//     })
//     .catch((err) => {
//         console.log(err);
//     })


// // SchemaType Options
// // *******************************************************************
// const mongoose = require('mongoose');

// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch((err) => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/amazon');
// }

// const bookSchema = new mongoose.Schema({
//     title: {
//         type: String,
//         required: true,
//         maxlength: 20
//     },
//     author: {
//         type: String,
//     },
//     price: {
//         type: Number,
//         min: [1, "Price must be at least 1"],
//     },
//     discount: {
//         type: Number,
//         default: 0
//     },
//     category: {
//         type: String,
//         enum: ['fiction', 'non-fiction']
//     },
//     genre: [String]
// })

// const Book = mongoose.model('Book', bookSchema);

// let Book1 = new Book({
//     title: "munna bhai mbbs",
//     price: 1000,
//     category: 'fiction',
//     genre: ['drama', 'action', 'comedy']
// })
// Book1.save()
//     .then((res) => {
//         console.log(res);
//     })
//     .catch((err) => {
//         console.log(err);
//     })


// Validation in Updation & Errors
// *******************************************************************

const mongoose = require('mongoose');

main()
    .then(() => {
        console.log("connection successfull");
    })
    .catch((err) => console.log(err));

async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/amazon');
}

const bookSchema = new mongoose.Schema({
    title: {
        type: String,
        required: true,
        maxlength: 20
    },
    author: {
        type: String,
    },
    price: {
        type: Number,
        min: [1, "Price must be at least 1, samjha karo lala!"],
    },
    discount: {
        type: Number,
        default: 0
    },
    category: {
        type: String,
        enum: ['fiction', 'non-fiction']
    },
    genre: [String]
})

const Book = mongoose.model('Book', bookSchema);

Book.findByIdAndUpdate('6966045af0c0d96d7e4ed5d1', { price: -100 }, { runValidators: true })
    .then((res) => {
        console.log(res);
    })
    .catch((err) => {
        console.log(err.errors.price.properties.message);
    })