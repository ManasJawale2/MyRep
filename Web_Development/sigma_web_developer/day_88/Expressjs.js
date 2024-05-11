// const http = require('node:http');
// const hostname = '127.0.0.1';
// const port = 3000;

// const server = http.createServer((req, res) => {
//     res.statusCode = 200;
//     res.setHeader('Content-type', "text/html");
//     res.end('Hi');
// });
// server.listen(port, hostname, () => {
//     console.log(`Server running at http://${hostname}:${port}/`)
// });

const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => {
    res.send('Hello World5')
})

app.get('/about', (req, res) => {
    res.send('Hello World5')
})

app.listen(port, ()=>{
    console.log(`Example app on port ${port}`);
})

