//basic print function
console.log("Hello World!")

//variables
var a = 5;
a += 1;
let b = 6;
let c = "Manas";
let _a = "Sujal";//ok👍
// 55a = "Roshan" //no🚫

//output
console.log(a+b)
console.log("Ow yeah its working!!!")
console.log(c)
console.log(typeof a, typeof b, typeof c)

//variables
// const a1 = 5;
// a1 = a1 + 1; not allowed
{
    //it can print something but cannot change its value for public access
    let a = 66
    console.log(a);
}
console.log(a)//see this is not changeable

/*there are two types of variables :-

    primitive variables
        number
        string
        boolean

*/

let x= "Manas bhai";
let y= 22;
let z= 3.55;
const za = true;
let zb = undefined;
let zc = null;

console.log(x, y, z, za, zb, zc)
console.log(typeof x, typeof y, typeof z, typeof za, typeof zb, typeof zc)

let o = {//this is a variable containing values
    "name": "Manas",
    "Jobname" : undefined,
    "Age" : "10",
}
console.log(o.name, o.Jobname, o.Age)// we can use varname.? to access its value
