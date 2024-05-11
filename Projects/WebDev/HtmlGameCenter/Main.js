const express = require('express')
const app = express()
const port = 3000

app.use(express.static('Code'))
.get('/', (req, res)=>{
    res.sendFile('Code/Home.html', {root:__dirname})
    
})
.listen(port, ()=>{
    console.log(`port: ${port}`)
})