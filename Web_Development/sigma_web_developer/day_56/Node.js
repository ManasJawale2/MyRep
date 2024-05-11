//now we are learning about conditionals and expressions in javascr
//and special thanks to Tabnine AI for this help
console.log("Hi!, Now i am learning about conditionals and expressions in javascript")
let age = 45;
let grace = 2;

console.log(age+grace)

//if else statements
if((age-grace)>18) {
    console.log("You can drive car as you have age above 18")
}
else {
    console.log("You cannot drive car as you have age below 18")
}

//some different operators
console.log(age+grace)
console.log(age-grace)
console.log(age*grace)
console.log(age*grace)
console.log(age/grace)
console.log(age**grace)
console.log(age%grace)

//some assignment operators
let x = 10;
let y = 5;
y += x;
console.log(y);
y -= x;
console.log(y);
y*= x;
console.log(y);
y/= x;
console.log(y);
y%= x;
console.log(y);
y**= x;
console.log(y);

let a = 10;
let b = 24;

if(a==b) {
    console.log("A is greator than b");
}

else {
    console.log("A is Smaller than b")
}

if(age==grace) {
    console.log("age==grace");
}
else if(age>grace) {
    console.log("age>grace")
}

else if(age<grace) {
    console.log("age<grace")
}

else {
    console.log("age!=grace");
}

let c = a > b ? /*If a is bigger than b*/(a+b) : /*if a is not bigger than b*/(b-a);//if a>b do a-b if wont so b-a
console.log(c);
