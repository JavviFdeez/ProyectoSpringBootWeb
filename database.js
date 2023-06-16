const mysql = require('mysql');

const connection = mysql.createConnection({
    host: 'Conexion',
    user: 'root',
    password: '',
    database: 'formula1bd'
});

module.exports = connection;
