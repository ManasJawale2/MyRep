# function is used to do something by using just one line
# we use def keyword to make a function
def HelloWorld():
    print ("Hello World!")
HelloWorld()
# print ("Hello World") can be saved in a method
a = 2
b = 1
absq = a**2 + b**2 + 2*a*b
print (absq)
# We can even return a value
# to find a value tons of times
def absquare(a, b):
    return a**2 + b**2 + 2*a*b
print (absquare(a, b))

def compare(a, b):
    if a>b:
        return "A is greator than B"
    else:
        return "B is greator than A"

print (compare(a, b))

def wait():
    pass
# pass says to python that i will make this function later

# We can use function argument

