// // What is Mongoose?
// // *******************************************************************

// refer notes

// // Installation & Setup
// // *******************************************************************

// const mongoose = require('mongoose');

// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/test');
// }


// // Schema
// // *******************************************************************

// const mongoose = require('mongoose');

// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/test');
// }

// const userSchema = new mongoose.Schema({
//     name: String,
//     email: String,
//     age: Number
// });

// // Models
// // *******************************************************************

// const mongoose = require('mongoose');
// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/test');
// }

// const userSchema = new mongoose.Schema({
//     name: String,
//     email: String,
//     age: Number
// });

// // const User = mongoose.model('User', userSchema);
// const Employee = mongoose.model('Employee', userSchema);

// // Insert in Mongoose
// // *******************************************************************

// const mongoose = require('mongoose');
// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/test');
// }

// const userSchema = new mongoose.Schema({
//     name: String,
//     email: String,
//     age: Number
// });

// const User = mongoose.model('User', userSchema);
// // const Employee = mongoose.model('Employee', userSchema);

// // const user1 = new User({
// //     name: 'Adam',
// //     email: 'adam@yahoo.in',
// //     age: 48,
// // });

// // user1.save();

// const user2 = new User({
//     name: 'Eve',
//     email: 'eve@yahoo.in',
//     age: 48
// });

// user2.save()
//     .then((res) => {
//         console.log(res);
//     })
//     .catch((err) => {
//         console.log(err);
//     })

// // Insert Multiple
// // *******************************************************************

// const mongoose = require('mongoose');

// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/test');
// }

// const userSchema = new mongoose.Schema({
//     name: String,
//     email: String,
//     age: Number
// })

// const User = mongoose.model('User', userSchema);

// User.insertMany([
//     { name: 'Tony', email: 'tony@gmail.com', age: 50 },
//     { name: 'Peter', email: 'peter@gmail.com', age: 30 },
//     { name: 'Bruce', email: 'bruce@gmail.com', age: 40 }
// ]).then((res) => {
//     console.log(res);
// })

// // Find in Mongoose
// // *******************************************************************

// const mongoose = require('mongoose');

// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/test');
// }

// const userSchema = new mongoose.Schema({
//     name: String,
//     email: String,
//     age: Number
// })

// const User = mongoose.model('User', userSchema);

// // // ek ek user.find wale command ko uncomment karke alag alag run karna hai
// // User.find({})
// //     .then((res) => {
// //         console.log(res);
// //     })
// //     .catch((err) => {
// //         console.log(err);
// //     })


// // User.find({ age: { $gte: 47 } })
// //     .then((res) => {
// //         console.log(res);
// //     })
// //     .catch((err) => {
// //         console.log(err);
// //     })

// // User.find({ age: { $gt: 48 } })
// //     .then((res) => {
// //         console.log(res[0].name);
// //     })
// //     .catch((err) => {
// //         console.log(err);
// //     })

// // User.findOne({ _id: '69637b4f88233b51588f4f17' })
// //     .then((res) => {
// //         console.log(res);
// //     })
// //     .catch((err) => {
// //         console.log(err);
// //     })

// User.findById('69637b4f88233b51588f4f17')
//     .then((res) => {
//         console.log(res);
//     })
//     .catch((err) => {
//         console.log(err);
//     })



// // Update in Mongoose
// // *******************************************************************

// const mongoose = require('mongoose');

// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch(err => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/test');
// }

// const userSchema = new mongoose.Schema({
//     name: String,
//     email: String,
//     age: Number
// })

// const User = mongoose.model('User', userSchema);

// User.updateOne({ name: "Bruce" }, { age: 45 })
//     .then((res) => {
//         console.log(res);
//     })
//     .catch((err) => {
//         console.log(err);
//     })

// User.updateMany({ age: { $gt: 48 } }, { age: 55 })
//     .then((res) => {
//         console.log(res);
//     })
//     .catch((err) => {
//         console.log(err);
//     })

// // FindAndUpdate
// // *******************************************************************

// const mongoose = require('mongoose');

// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch((err) => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/test');
// }

// const userSchema = new mongoose.Schema({
//     name: String,
//     email: String,
//     age: Number
// })

// const User = mongoose.model('User', userSchema);

// // User.findOneAndUpdate({ name: 'Bruce' }, { age: 42 }, { new: true })
// //     .then((res) => {
// //         console.log(res);
// //     })
// //     .catch((err) => {
// //         console.log(err);
// //     })


// User.findByIdAndUpdate('69637b4f88233b51588f4f17', { age: 80 }, { new: true })
//     .then((res) => {
//         console.log(res);
//     })
//     .catch((err) => {
//         console.log(err);
//     })



// // Delete in Mongoose
// // *******************************************************************

// const mongoose = require('mongoose');

// main()
//     .then(() => {
//         console.log("connection successfull");
//     })
//     .catch((err) => console.log(err));

// async function main() {
//     await mongoose.connect('mongodb://127.0.0.1:27017/test');
// }

// const userSchema = new mongoose.Schema({
//     name: String,
//     email: String,
//     age: Number
// })

// const User = mongoose.model('User', userSchema);

// User.deleteMany({ age: { $gt: 47 } }).then((res) => {
//     console.log(res);
// })

// // Schema Validations
// // *******************************************************************

// refer book.js

// // SchemaType Options
// // *******************************************************************

// refer book.js

// // Validation in Updation & Errors
// // *******************************************************************

// refer book.js