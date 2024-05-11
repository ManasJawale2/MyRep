from math import *;
a = int(input("Enter no1\n"))
b = int(input("Enter no2\n"))
str = input("Enter operator symbol to choose the action and R/ for reminder and sqr for square root:\n")
N = 0;
match str:
    case "*":
        print(a*b)
    case "+":
        print(a+b)
    case "-":
        print(a-b)
    case "/":
        print(a/b)
    case "^":
        print(pow(a, b))
    case "R/":
        print(a%b)
    case "!":
        c = input("This function requires only one number. So select the number you want\n1 for no 1 and 2 for no2\n")
        match c:
            case "1":
                for i in range(0, a+1) :
                    N += i
                print(N)
            case "2":
                for i in range(0, b+1) :
                    N += i
                print(N)
    