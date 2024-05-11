async function sleep() {
    return new Promise((resolve, reject)=>{
        setTimeout(() => {
            resolve(45)
        }, 100)
    })
}
(async function main(){
    console.log(a2)
    let a = await sleep();
    console.log(a)
    let b = await sleep();
    console.log(b)

    let [x,y, ...rest] = [1, 5, 7, 4, 7]//7 is
    // not be
    // set to
    // any var but can be with ...
    //this is called destructuring
    console.log(x, y, rest)

    let obj = {
        a1: 1,
        b1: 2,
        c1: 3
    }

    let {a1, b1} = obj;
    console.log(a1, b1);

    let arr = [4, 6, 2];
    console.log(...arr)

    var a2 = 3;//var declares at first
    //it goes on top of function by javascript
    // interpreter
    console.log(sum(3, 5, 2))
})()
//returns a error
const sum = async (a, b, c) => {
    return a+b+c;
}