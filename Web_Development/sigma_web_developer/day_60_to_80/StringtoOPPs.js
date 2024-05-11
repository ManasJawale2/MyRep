console.log("hi")
//Strings can store abcdefghijklmnopqrstuvwxyz0123456789`-=[]\;',./*!@#$%^&*(){}|:"<>?ABCDEFGHIJKLMNOPQRSTUVWXYZ
let a = "Manas";//that's a string
console.log(a.charAt(1))//gets char at given index
/*
* It goes from 0 to length of String
* | M A N A S
* |-0-1-2-3-4->
*     A      <-*/
console.log(a.endsWith("s"));//return true nor false if ends with given char
console.log(a.toLowerCase())//returns String with all Lower case charactors
console.log(a.toUpperCase())//returns same but except all upper case charactors
console.log(a.slice(3, 4))//returns a string from n1 int to n2 index of given string
/*|M A N A S
* |0-1-2-3-4->
*        A S <- returns*/
//Arrays
let arr = ["Manas", 90, 2]//arrays are the sets of variables which can contain a string nor int boolean etx
let b = [5, 5, 5]//it could contain similar type of vars or different
console.log(arr);
console.log(b[1]);
for(let i=0;i<=arr.length;i++) {
    console.log(arr[i])
}
//Async Await
function doSomething()
{
    return new Promise(resolve => {
        setTimeout(() => {
            resolve("The action is done now!");
        }, 200);
        //this action happens after everything
    })
}

async function doing() {
    console.log('Now doing something..');
    const data = await doSomething();
    console.log(data);
}

doing().then(r => {
    console.log('Error')
});

//To search an element from html
//we can use getelementbyid
//document.getElementbyid wants a string with a
let ele = document.getElementById("green");
ele.style.backgroundColor = "#00ff00";

//We can even find childrens or parents of any element
let ele2 = document.getElementById("c");
console.log(ele2.childNodes);
ele2.remove();//removes the element

//To find Parent
console.log(ele2.parentNode)

//We can search DOM using queryselector getElementByClassname
let eles = document.getElementsByClassName("class1");
for (let i = 0; i < eles.length; i++) {
    eles[i].style.backgroundColor = "#003300"
}
//queryselector is more good than getElementbyClassname
document.querySelector(".class2").style.backgroundColor = "#a130b2"

//We can add Actions to buttons using
// addEventListener
let btn = document.getElementById("btn1");
//Make sure that the element is a button
//now to addListener
let btncondition = false;
btn.addEventListener("click", () => {
    switch (btncondition) {
        case false:
            eles[0].innerHTML = 'Thanks for clicking' +
                ' the bottom button!';
            console.log('Thanks for clicking me!')
            btncondition = true
            break;
        case true:
            eles[0].innerHTML = '';
            btncondition = false;
    }
});

//contextmenu -rightclick wheel -mousewheel
//keydown -keyboard buttons
//etc.........................................

//error handling

//oops creates a class
class Animal {
    name;
    constructor(name) {
        this._name = name;
    }//contructor is action which happens when
    // the object is created


    get name() {
        return this._name;
    }//getter and setters

    set name(value) {
        this._name = value;
    }
}

let obj = Animal("Tiger");//you can even use
// all methods of a class in another class
// without copy paste using extends