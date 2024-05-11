a = input("Enter the number: ")

try:
    for i in range (1, 11):
        if i == 1 :
            print (f"Printing multiplicaition table of {a}")
        print (f"{int(a)} x {i} = {i*int(a)}")
except ValueError as e:
    print (e)

def intput(str):
    try:
        i = int(input(str))
        return i
    except Exception as e:
        intput(str)
    finally:
        print ("Code runned succesfully")

print (intput("Enter a number: "))

i = int(input("Enter a number: "))

if i < 1000 and i > 5:
    raise ValueError("Please enter a n between 1000 and 5")

print ("End of program..")