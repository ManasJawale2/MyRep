from turtle import *;
from time import *;

bgcolor("cyan")
t = Turtle()
t.width(5)
colors = ["red", "yellow", "blue", "lime"]
widths = [10   , 7.5     , 5     , 2.5   ]
t.speed(10.49)
for i in range (len(colors)):
    match i:
        case 0:
            bgcolor("cyan")
        case 1:
            bgcolor("blue")
        case 2:
            bgcolor("yellow")
        case 3:
            bgcolor("purple")
    t.begin_fill()
    t.color(colors[i])
    t.width(widths[i])
    t.circle(100, 90, 90)
    t.end_fill()
    if i == 3:
        t.color("white")
        t.circle(100, 360, 360)
