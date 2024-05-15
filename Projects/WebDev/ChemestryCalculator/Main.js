const express = require("express")
const { jsonFile } = require("periodic-table")
let port = 3000

let app = express()

app.use(express.static("public"))

app.get('/', (req, res)=>{
    res.sendFile("public/Home/Home.html", {root: __dirname})
})

app.get('/tables', (req, res)=>{
    res.json(require("periodic-table").all())
})
app.listen(port, ()=>{
    console.log(`App on localhost:${port}`)
})
