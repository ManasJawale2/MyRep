def Average(a, b):
    print ((a+b)/2)
Average(3, 6)

# We can even have default arguments
def add(a=5, b=2):
    print (a+b)
add() # a=5, b=2
add(3) # a = 3, b=2
add(b=5) # a=5, b=5
add(b=5, a=2) # b=5, a=2
add(3, 5) # a=5, b=3
# These all statments will return no errors

def sum(*numbers):
    sum = 0
    for i in numbers:
        sum+=i
    print (sum)

sum(3, 5, 4, 6, 7, 7, 6, 7, 8, 7, 8, 678 , 5)

def about(**about):
    print ("Hi! My name is", about["name"], "I am", about["age"], "Years old.\n"+"I live in", about["address"]+"\nI study in", about["standerd"], "class.")
about(name="Manas Pankaj Jawale", age=11, standerd=5, address="Varangaon, Bhusawal, Jalgaon, Maharastra, India, Asia")

# If we want to return a value instead of a print
def sum5(a, b):
    return a+b
c = sum5(3, 5)
print(c)

