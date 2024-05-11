const express = require('express')
const app = express()
const port = 3000
const blog = require('./router/blog')
const shop = require('./router/shop')

app.get('/', (req, res) => {
    res.send('Hello User !')
})

app.post('/', (req, res) => {
    res.send('Hello World Post!')
})

app.put('/', (req, res) => {
    res.send('Hello World Put!')
})

app.get('/index', (req, res) => {
    console.log('Hey it\'s a index');
    res.sendFile('templates/Mypage.html', {root: __dirname})
})

app.get('/api', (req, res) => {
    res.json({name: ["Manas", "Sujal", "Kushal"], age: [11, 17, 12]})
})

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})

app.use(express.static("public"))
app.use('/blog', blog)
app.use('/shop', shop)