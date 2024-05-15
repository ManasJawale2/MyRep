const express = require('express')
const app = express()
const port = 3000

app.use(express.static('Code'))
app.use(express.static('Code/TicTacToe'))
app.use(express.static('Code/SaveYourself'))

app.get('/', (req, res)=>{
    res.sendFile('Code/Home.html', {root:__dirname})
})

app.get('/TicTacToe', (req, res)=>{
    res.sendFile('Code/TicTacToe/Index.html', {root:__dirname})
    res.sendFile('Code/TicTacToe/style.css', {root:__dirname})
})

app.get('/SaveYourSelf', (req, res)=>{
    res.sendFile('Code/SaveYourSelf/Index.html', {root:__dirname})
})

app.listen(port, ()=>{
    console.log(`port: ${port}`)
})
