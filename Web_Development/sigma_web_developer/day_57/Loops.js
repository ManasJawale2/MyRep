let a = 90000;
let b = 100000;
//There are different types of loops
    //1st for loop
console.log("There are different types of loops");
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// console.log(a);
// frustuating💢💢
for (let index = 0; index < (b-a); index++) {
    console.log(index);
}
//this does three steps:-
    //1st creates a index var
    //2nd creates a condition on when should the following loop stop
    //3rd adds or subtracts index using ++ and --
//Good👍

let obj = {
    name : "Manas",
    role : "Programmer"
};
//printing this one by one is frustuating too

for (const key in obj) {
    console.log(key);
}
//Good

for (const iterator of "Manas") {
    console.log(iterator);
}
//This prints charector in the given string

//we uses while too
let i = 5;
while(i<10/* way more easier than for loop */) {
    console.log(i);
    i++;
}
//Note: never enter conditions that will go infinite in while loops

//there is a one more type of while loop
do {
    console.log("Bye!!");
    i++
} while (i<20);