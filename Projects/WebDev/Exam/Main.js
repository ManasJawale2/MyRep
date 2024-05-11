const express = require("express")
const app = express()
const port = 3000

app.use(express.static('templates'))

app.get('/', (req, res)=>{
    res.sendFile('templates/Home.html', {root:__dirname})
}).get('/paper', (req, res) => {
    res.sendFile('templates/Exam.html', {root: __dirname})
}).get('/answer', (req, res) => {
    res.sendFile('templates/Answers.html', {root:__dirname})
}).listen(port, ()=>{
    console.log(`The website is visible on ${port}`)
})