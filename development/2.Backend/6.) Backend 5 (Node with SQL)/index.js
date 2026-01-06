// // Using Faker 👇 ******************************************************************

// const { faker } = require('@faker-js/faker');


// let createRandomUser = () => {
//     return {
//         userId: faker.string.uuid(),
//         username: faker.internet.username(),
//         email: faker.internet.email(),
//         password: faker.internet.password(),

//     };
// }

// console.log(createRandomUser());


// // MySQL Package 👇 ******************************************************************

// const mysql = require('mysql2');

// // create the connection
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123'
// });

// try {
//     connection.query("SHOW TABLES", (err, result) => {
//         if (err) throw err;
//         console.log(result);
//     });
// }
// catch (err) {
//     console.log(err);
// }

// connection.end();

// // refer notes too



// // Using SQL from CLI 👇  *******************************************************************************

// refer notes(schema.sql wali file use karna sikha hai)

// // CREATE Table user 👇  *******************************************************************************

// const mysql = require('mysql2');

// // create a connection
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123'
// });

// try {
//     connection.query("SHOW TABLES", (err, result) => {
//         if (err) throw err;
//         console.log(result);
//         console.log(result.length);
//         console.log(result[0]);
//         console.log(result[1]);
//     });
// }
// catch (err) {
//     console.log(err);
// }

// connection.end();


// INSERT INTO user 👇  *******************************************************************************

// const mysql = require('mysql2');

// // create a connection
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123'
// });

// // //Inserting new data
// // let q = "INSERT INTO user (id,username , email , password) VALUES (?, ?, ?, ?)";
// // let user = ["123", "123_newuser", "abc@gmail.com", "abc"];


// // try {
// //     connection.query(q, user, (err, result) => {
// //         if (err) throw err;
// //         console.log(result);
// //     });
// // }
// // catch (err) {
// //     console.log(err);
// // }

// // connection.end();


// const mysql = require('mysql2');

// //create a connection
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123'
// });

// let q = "INSERT INTO user (id, username, email, password) VALUES ?";
// let user = [["123b", "123_newuserb", "abc@gmail.comb", "abcb"],
// ["123c", "123_newuserc", "abc@gmail.comc", "abcc"]
// ]

// try {
//     connection.query(q, [user], (err, result) => {
//         if (err) throw err;
//         console.log(result);
//     })

// }
// catch (err) {
//     console.log(err);
// }

// connection.end();

// // Insert in Bulk 👇  *******************************************************************************

// const mysql = require('mysql2');
// const { faker } = require('@faker-js/faker');

// //create a connection
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123'
// });

// let getRandomUser = () => {
//     return [
//         faker.string.uuid(),
//         faker.internet.username(),
//         faker.internet.email(),
//         faker.internet.password(),
//     ]
// }

// let q = "INSERT INTO user (id, username, email, password) VALUES ?";

// let data = [];

// for (let i = 1; i <= 100; i++) {
//     data.push(getRandomUser());
// }

// try {
//     connection.query(q, [data], (err, result) => {
//         if (err) throw err;
//         console.log(result);
//     })

// }
// catch (err) {
//     console.log(err);
// }

// connection.end();


// // Routing 👇  *******************************************************************************
// refer notes

// // Home Route 👇  *******************************************************************************

// const mysql = require('mysql2');
// const { faker } = require('@faker-js/faker');
// const express = require('express');
// const app = express();

// // // create a connection
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123'
// });

// app.get('/', (req, res) => {
//     let q = `SELECT count(*) FROM USER`;
//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;
//             console.log(result[0]);
//             console.log(result[0]['count(*)']);
//             res.send(result[0]);
//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send('some error occured in DB');
//     }
// })

// app.listen('8080', () => {
//     console.log('Server is listening on port 8080');
// });


// // Add Template 👇  *******************************************************************************

// const express = require('express');
// const app = express();
// const path = require('path');
// const mysql = require('mysql2');
// const { faker } = require('@faker-js/faker');

// app.set('view engine', 'ejs');
// app.set('views', path.join(__dirname, '/views'));

// // Create the connection to database
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123',
// });


// app.get('/', (req, res) => {
//     let q = 'SELECT count(*) FROM user';
//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;
//             console.log(result[0]['count(*)']);
//             let count = result[0]['count(*)'];
//             res.render('home.ejs', { count });
//         })
//     }
//     catch (err) {
//         res.send("Some error occured in database");
//         console.log(err);
//     }
// });

// app.listen('8080', () => {
//     console.log('Server is listening on port 8080');
// });


// // Show Route 👇  *******************************************************************************

// const express = require('express');
// const app = express();
// const path = require('path');
// const mysql = require('mysql2');
// const { faker } = require('@faker-js/faker');

// app.set('view engine', 'ejs');
// app.set('views', path.join(__dirname, '/views'));

// // Create the connection to database
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123',
// });


// app.get('/', (req, res) => {
//     let q = 'SELECT count(*) FROM user';
//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;
//             console.log(result[0]['count(*)']);
//             let count = result[0]['count(*)'];
//             res.render('home.ejs', { count });
//         })
//     }
//     catch (err) {
//         res.send("some error occured in db");
//         console.log(err);
//     }
// })

// // show user
// app.get('/user', (req, res) => {
//     let q = 'SELECT * FROM user';
//     try {
//         connection.query(q, (err, users) => {
//             if (err) throw err;
//             res.render('showusers.ejs', { users });
//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send("Some error occured in DB");
//     }
// })

// app.listen('8080', () => {
//     console.log('Server is listening on port 8080');
// })


// // Edit Route 👇  *******************************************************************************

// const express = require('express');
// const app = express();
// const path = require('path');
// const mysql = require('mysql2');
// const methodOverride = require('method-override');

// app.use(methodOverride('_method'))
// app.use(express.urlencoded({ extended: true }));
// app.set('view engine', 'ejs');
// app.set('views', path.join(__dirname, '/views'));

// // Create the connection to database
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123',
// });

// app.get('/', (req, res) => {
//     let q = 'SELECT count(*) FROM user';
//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;
//             console.log(result[0]['count(*)']);
//             let count = result[0]['count(*)'];
//             res.render('home.ejs', { count });
//         })
//     }
//     catch (err) {
//         res.send("some error occuren in DB");
//         console.log(err);
//     }
// })

// // show users
// app.get('/users', (req, res) => {
//     let q = 'SELECT * from user';
//     try {
//         connection.query(q, (err, users) => {
//             if (err) throw err;
//             res.render('showusers.ejs', { users });
//         })
//     }
//     catch (err) {
//         res.send('Some error occured in DB');
//         console.log(err);
//     }
// })

// // edit
// app.get('/user/:id/edit', (req, res) => {
//     let { id } = req.params;
//     let q = `SELECT * FROM user WHERE id = '${id}'`;

//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;
//             console.log(result);
//             console.log(result[0]);

//             let user = result[0];
//             res.render('edit.ejs', { user });
//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send("some error occured in DB");
//     }
// })

// //update
// app.patch('/user/:id', (req, res) => {
//     res.send("updated");
// })

// app.listen('8080', () => {
//     console.log('Server is listening on port 8080');
// })



// // Update Route 👇 *******************************************************************************

// const express = require('express');
// const app = express();
// const path = require('path');
// const mysql = require('mysql2');
// const methodOverride = require('method-override');

// app.use(express.urlencoded({ extended: true }));
// app.use(methodOverride('_method'));
// app.set('view engine', 'ejs');
// app.set('views', path.join(__dirname, '/views'))


// // create the connection to database
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123'
// });


// app.get('/', (req, res) => {
//     let q = 'SELECT count(*) FROM user';
//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;
//             console.log(result[0]['count(*)']);
//             let count = result[0]['count(*)'];
//             res.render('home.ejs', { count });
//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send("Some error occured in DB");
//     }
// })

// // show users
// app.get('/users', (req, res) => {
//     let q = 'SELECT * FROM user';
//     try {
//         connection.query(q, (err, users) => {
//             if (err) throw err;
//             res.render('showusers.ejs', { users });
//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send('some error occured in DB');
//     }
// })

// // edit

// app.get('/user/:id/edit', (req, res) => {
//     let { id } = req.params;
//     let q = `SELECT * FROM user WHERE id = '${id}'`;

//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;

//             console.log(result);
//             console.log(result[0]);

//             let user = result[0];
//             res.render('edit.ejs', { user });

//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send('Some error occured in DB');
//     }
// })

// // update
// app.patch('/user/:id', (req, res) => {
//     let { id } = req.params;
//     let { password: formPassword, username: newUsername } = req.body;
//     let q = `SELECT * FROM user WHERE id = '${id}'`;

//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;
//             let user = result[0];

//             if (formPassword != user.password) {
//                 res.send("Wrong Password !!!");
//             }
//             else {
//                 let q = `UPDATE user SET username='${newUsername}' WHERE id='${id}'`;
//                 connection.query(q, (err, result) => {
//                     if (err) throw err;
//                     res.redirect('/users');
//                 })
//             }
//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send("Some error occured in DB");
//     }
// })


// app.listen('8080', () => {
//     console.log('server is listening on port : 8080')
// })


// //  hw of add user and delete user
// // add user ****************************************************************************************

// const express = require('express');
// const app = express();
// const path = require('path');
// const mysql = require('mysql2');
// const methodOverride = require('method-override');
// const { v4: uuidv4 } = require("uuid");


// app.use(express.urlencoded({ extended: true }));
// app.use(methodOverride('_method'));
// app.set('view engine', 'ejs');
// app.set('views', path.join(__dirname, '/views'))


// // create the connection to database
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     database: 'sql_n_nodejs',
//     password: 'Krish@123'
// });


// app.get('/', (req, res) => {
//     let q = 'SELECT count(*) FROM user';
//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;
//             console.log(result[0]['count(*)']);
//             let count = result[0]['count(*)'];
//             res.render('home.ejs', { count });
//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send("Some error occured in DB");
//     }
// })

// // show users
// app.get('/users', (req, res) => {
//     let q = 'SELECT * FROM user';
//     try {
//         connection.query(q, (err, users) => {
//             if (err) throw err;
//             res.render('showusers.ejs', { users });
//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send('some error occured in DB');
//     }
// })

// // edit

// app.get('/user/:id/edit', (req, res) => {
//     let { id } = req.params;
//     let q = `SELECT * FROM user WHERE id = '${id}'`;

//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;

//             console.log(result);
//             console.log(result[0]);

//             let user = result[0];
//             res.render('edit.ejs', { user });

//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send('Some error occured in DB');
//     }
// })

// // update
// app.patch('/user/:id', (req, res) => {
//     let { id } = req.params;
//     let { password: formPassword, username: newUsername } = req.body;
//     let q = `SELECT * FROM user WHERE id = '${id}'`;

//     try {
//         connection.query(q, (err, result) => {
//             if (err) throw err;
//             let user = result[0];

//             if (formPassword != user.password) {
//                 res.send("Wrong Password !!!");
//             }
//             else {
//                 let q = `UPDATE user SET username='${newUsername}' WHERE id='${id}'`;
//                 connection.query(q, (err, result) => {
//                     if (err) throw err;
//                     res.redirect('/users');
//                 })
//             }
//         })
//     }
//     catch (err) {
//         console.log(err);
//         res.send("Some error occured in DB");
//     }
// })

// //add user
// app.get('/users/add', (req, res) => {
//     res.render('addUser.ejs');
// })

// // post new user
// app.post('/users/new', (req, res) => {
//     let { password: password, confirmPass: confirmPassword, username, email } = req.body;

//     if (password != confirmPassword) {
//         res.send("password didnt match");
//     }
//     else {
//         let id = uuidv4();
//         let q = `INSERT INTO user (id,username,email,password) VALUES ('${id}' , '${username}' , '${email}' , '${password}')`;

//         try {
//             connection.query(q, (err, result) => {
//                 if (err) throw err;
//                 console.log('new user added successfully');
//                 res.redirect('/users');
//             })
//         }
//         catch (err) {
//             console.log(err);
//             res.send("some error occured in DB");
//         }
//     }
// })


// app.listen('8080', () => {
//     console.log('server is listening on port : 8080')
// })



// delete user ****************************************************************************************

const express = require('express');
const app = express();
const path = require('path');
const mysql = require('mysql2');
const methodOverride = require('method-override');
const { v4: uuidv4 } = require("uuid");


app.use(express.urlencoded({ extended: true }));
app.use(methodOverride('_method'));
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, '/views'))


// create the connection to database
const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    database: 'sql_n_nodejs',
    password: 'Krish@123'
});


app.get('/', (req, res) => {
    let q = 'SELECT count(*) FROM user';
    try {
        connection.query(q, (err, result) => {
            if (err) throw err;
            console.log(result[0]['count(*)']);
            let count = result[0]['count(*)'];
            res.render('home.ejs', { count });
        })
    }
    catch (err) {
        console.log(err);
        res.send("Some error occured in DB");
    }
})

// show users
app.get('/users', (req, res) => {
    let q = 'SELECT * FROM user';
    try {
        connection.query(q, (err, users) => {
            if (err) throw err;
            res.render('showusers.ejs', { users });
        })
    }
    catch (err) {
        console.log(err);
        res.send('some error occured in DB');
    }
})

// edit

app.get('/user/:id/edit', (req, res) => {
    let { id } = req.params;
    let q = `SELECT * FROM user WHERE id = '${id}'`;

    try {
        connection.query(q, (err, result) => {
            if (err) throw err;

            console.log(result);
            console.log(result[0]);

            let user = result[0];
            res.render('edit.ejs', { user });

        })
    }
    catch (err) {
        console.log(err);
        res.send('Some error occured in DB');
    }
})

// update
app.patch('/user/:id', (req, res) => {
    let { id } = req.params;
    let { password: formPassword, username: newUsername } = req.body;
    let q = `SELECT * FROM user WHERE id = '${id}'`;

    try {
        connection.query(q, (err, result) => {
            if (err) throw err;
            let user = result[0];

            if (formPassword != user.password) {
                res.send("Wrong Password !!!");
            }
            else {
                let q = `UPDATE user SET username='${newUsername}' WHERE id='${id}'`;
                connection.query(q, (err, result) => {
                    if (err) throw err;
                    res.redirect('/users');
                })
            }
        })
    }
    catch (err) {
        console.log(err);
        res.send("Some error occured in DB");
    }
})

//add user
app.get('/users/add', (req, res) => {
    res.render('addUser.ejs');
})

// post new user
app.post('/users/new', (req, res) => {
    let { password: password, confirmPass: confirmPassword, username, email } = req.body;

    if (password != confirmPassword) {
        res.send("password didnt match");
    }
    else {
        let id = uuidv4();
        let q = `INSERT INTO user (id,username,email,password) VALUES ('${id}' , '${username}' , '${email}' , '${password}')`;

        try {
            connection.query(q, (err, result) => {
                if (err) throw err;
                console.log('new user added successfully');
                res.redirect('/users');
            })
        }
        catch (err) {
            console.log(err);
            res.send("some error occured in DB");
        }
    }
})

//delete user
app.get('/user/:id/delete', (req, res) => {
    let { id } = req.params;
    let q = `SELECT * FROM user WHERE id = '${id}'`;

    try {
        connection.query(q, (err, result) => {
            if (err) throw err;
            let user = result[0];

            res.render('deleteUser.ejs', { user });
        })
    }
    catch (err) {
        console.log(err);
        res.send("Some error occured in DB");
    }
})


// delete user
app.delete('/delete/:id', (req, res) => {
    let { id } = req.params;
    let q = `SELECT * FROM user WHERE id = '${id}'`;
    let { password } = req.body;

    try {
        connection.query(q, (err, result) => {
            if (err) throw err;
            let user = result[0];
            if (password != user.password) {
                res.send("incorrect password");
            }
            else {
                let p = `DELETE FROM user WHERE id='${id}'`;
                connection.query(p, (err, result) => {
                    if (err) throw err;
                    res.redirect('/users');
                })
            }
        })
    }
    catch (err) {
        console.log(err);
        res.send("some error opccured in DB");
    }
})

app.listen('8080', () => {
    console.log('server is listening on port : 8080')
})