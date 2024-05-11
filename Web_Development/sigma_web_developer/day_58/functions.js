
console.log("Hi its me Manas")
console.log("Hi its me Manas")
//changing manas to someone else will took a lot if we have same 400 lines

//so we use function

function Introduction(name) {
    console.log("Hi! My name is " + name);
}

Introduction("Manas")
Introduction("Prallat")
Introduction("Sujal")

function sum(a, b, c = 4) {
    console.log(a, b, c);//a and b are undefined in this f but c has a default value
    return a+b+c
}

const func1 = (x)=> {
    console.log("Im arrow function " + x)
}// this variable is carrying it's own made function

console.log("addition of 34 and 36 including 3 as default is", sum(34, 36));
sum(45, 54)
func1(34)