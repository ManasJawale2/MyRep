// Copy this whenever using expressjs

const express = require('express')
const app = express()
const port = 3000

// app.use(express.static("public"))
// Middleware 1
app.use((req, res, next)=> {
    console.log('m1');
    next()
})

app.get('/', (req, res) => {
    res.send('Hello World!')
})
app.get('/about', (req, res) => {
    res.send("About web")
})

app.get('/content', (req, res) => {
    res.send("Content")
})

app.listen(port, ()=>{
    console.log(`Example app on port ${port}`);
})

