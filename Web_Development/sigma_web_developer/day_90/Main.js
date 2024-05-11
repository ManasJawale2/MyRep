// Copy this whenever using expressjs

const express = require('express')
const app = express()
const port = 3000

// app.use(express.static("public"))

// Middleware 1
app.use((req, res, next) => {
    console.log("Logged")
    res.send("Middleware 1")
    // next()
})

// Middleware 2
app.use((req, res, next) => {
    console.log("Logged 2nd")
    next()
})

app.get('/about', (req, res) => {
    res.send("About web")
})

app.get('/content', (req, res) => {
    res.send("Content")
})
app.get('/', (req, res) => {
    res.send('Hello World!')
})


app.listen(port, ()=>{
    console.log(`Example app on port ${port}`);
})

