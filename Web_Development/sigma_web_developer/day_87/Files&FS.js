const fs = require('fs');
console.log('starting');
// fs.writeFileSync("Manas.js", "let a = 34)
//its bad ^
fs.writeFile("Manas2.py", "a = \"Manas\"", () => {
    console.log('done');
    fs.readFile("Manas2.py", (error, data) => {
        console.log(error, data.toString())
    })
})
fs.appendFile("Manas2.py", "\nprint(\"Hi!\")", (e, d) => {
    console.log('done');
})
console.log('ending')
// let a = require('fs').readFile('Manas2.txt');
// console.log(a);
