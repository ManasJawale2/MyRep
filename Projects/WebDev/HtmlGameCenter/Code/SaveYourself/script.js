let player = document.getElementById("player")

let playerX = 500 + "px"
let playerY = 200 + "px"

player.style.top = playerY
player.style.left = playerX


document.addEventListener('keydown', event => {
    var key = event.key
    if (key == 'w') {
        console.log(playerY.length)
        playerY = toString(Number(playerY.substring(0, playerY.length-2)) - 1) + "px"
        player.style.top = playerY
        console.log("forward", playerY)
    }
})