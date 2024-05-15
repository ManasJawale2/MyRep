let box = document.querySelectorAll('.box')
let isX = true;
let isO = !isX;
box.forEach(boxes => {
    boxes.addEventListener('click', ()=>{
        let isOccupied = boxes.innerHTML != ''
        if (isO) {
            if (isOccupied) {
                alert("The box is already occupied")
                return
            }
            boxes.innerHTML = 'O'
            isX = !isX
            isO = !isO
        }
        else {
            if (isOccupied) {
                alert("The box is already occupied")
                return
            }
            boxes.innerHTML = 'X'
            isX = !isX
            isO = !isO
        }
        let isAllOccupied = 
        box[0].innerHTML != '' && 
        box[1].innerHTML != '' &&
        box[2].innerHTML != '' &&
        box[3].innerHTML != '' &&
        box[4].innerHTML != '' &&
        box[5].innerHTML != '' &&
        box[6].innerHTML != '' &&
        box[7].innerHTML != '' &&
        box[8].innerHTML != ''
        // check if on of player has won
        if (isAllOccupied) {
            alert ("All boxes are occupied!")
        }
        /*
            X O X
            O X O
            O O X
        */
        if (box[0].innerHTML == 'X' && box[4].innerHTML == 'X' && box[8].innerHTML == 'X') {
            alert ("Player X has won!!")
            window.location.reload()
        }
        /*
            X X X
            O X O
            O O O
        */
        else if (box[0].innerHTML == 'X' && box[1].innerHTML == 'X' && box[2].innerHTML == 'X') {
            alert ('Player X has won!!')
            window.location.reload()
        }
        /*
            X N N
            X N N
            X N N
        */
        else if (box[0].innerHTML == 'X' && box[3].innerHTML == 'X' && box[6].innerHTML == 'X') {
            alert ('Player X has won!!')
            window.location.reload()
        }
        /*
            N X N
            N X N
            N X N
        */
        else if (box[1].innerHTML == 'X' && box[4].innerHTML == 'X' && box[8].innerHTML == 'X') {
            alert ('Player X has won!!')
            window.location.reload()
        }
        /**
         *  N N X
         *  N N X
         *  N N X
        */
        else if (box[2].innerHTML == 'X' && box[5].innerHTML == 'X' && box[9].innerHTML == 'X') {
            alert ('Player X has won!!')
            window.location.reload()
        }
        /**
         *  N N X
         *  N X N
         *  X N N
        */
        else if (box[2].innerHTML == 'X' && box[4].innerHTML == 'X' && box[6].innerHTML == 'X') {
            alert ('Player X has won!!')
            window.location.reload()
        }
        /**
         *  N N N
         *  X X X
         *  N N N
        */
        else if (box[3].innerHTML == 'X' && box[4].innerHTML == 'X' && box[5].innerHTML == 'X') {
            alert ('Player X has won!!')
            window.location.reload()
        }
        /**
         *  N N N
         *  N N N
         *  X X X
        */
        else if (box[6].innerHTML == 'X' & box[7].innerHTML == 'X' && box[8].innerHTML == 'X') {
            alert ('Player X has won!!')
            window.location.reload()
        }
        /*
            X O X
            O X O
            O O X
        */
        if (box[0].innerHTML == 'X' && box[4].innerHTML == 'X' && box[8].innerHTML == 'X') {
            alert ("Player X has won!!")
            window.location.reload()
        }
        /*
            X X X
            O X O
            O O O
        */
        else if (box[0].innerHTML == 'O' && box[1].innerHTML == 'O' && box[2].innerHTML == 'O') {
            alert ('Player O has won!!')
            window.location.reload()
        }
        else if (box[0].innerHTML == 'O' && box[3].innerHTML == 'O' && box[6].innerHTML == 'O') {
            alert ('Player O has won!!')
            window.location.reload()
        }
        else if (box[1].innerHTML == 'O' && box[4].innerHTML == 'O' && box[8].innerHTML == 'O') {
            alert ('Player O has won!!')
            window.location.reload()
        }
        else if (box[2].innerHTML == 'O' && box[5].innerHTML == 'O' && box[9].innerHTML == 'O') {
            alert ('Player O has won!!')
            window.location.reload()
        }
        else if (box[2].innerHTML == 'O' && box[4].innerHTML == 'O' && box[6].innerHTML == 'O') {
            alert ('Player O has won!!')
            window.location.reload()
        }
        else if (box[3].innerHTML == 'O' && box[4].innerHTML == 'O' && box[5].innerHTML == 'O') {
            alert ('Player O has won!!')
            window.location.reload()
        }
        else if (box[6].innerHTML == 'O' & box[7].innerHTML == 'O' && box[8].innerHTML == 'O') {
            alert ('Player O has won!!')
            window.location.reload()
        }
    })
})