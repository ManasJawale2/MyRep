# Local vs Global Vars
from calendar import c


x = 4
print (x)

def X():
    x = 5
    # y = 1
    print (f"{x} is local")

print (f"{x}, is global")
X()
# print (f"{y} is not acceseble")

# To change Global var

def ChangeX():
    global x
    x = 45
    y = 6
    print (f"{x} is changed globally and \n{y} is still local")

ChangeX()
print (x)