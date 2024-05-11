# I am going to make a Program 
# which will solve our Qs about Arthematic Based Qs
from timer import *;

def Start():
    N1 = int(input("Enter 1st Number: "))
    N2 = int(input("Enter 2nd Number: "))
    operator = input("Enter Arthmetic Operator you want to use: ")
    print (DoOperation(operator, N1, N2))

def ReStart():
    N1 = int(input("Enter 1st Number: "))
    N2 = int(input("Enter 2nd Number: "))
    operator = input("Enter Arthmetic Operator you want to use: ")
    print (DoOperation(operator, N1, N2))
    ReStart();

def DoOperation(operator, N1, N2):
    result = 0
    wordoperator = None
    match operator:
        case '+':
            result = N1+N2
            print ("Addition of", N1, "And", N2, "is", result)
            ReStart()
        case '-':
            result = N1-N2
            print ("Subtraction of", N1, "And", N2, "is", result)
            ReStart()
        case '*':
            result = N1*N2
            print ("Multiplication of", N1, "And", N2, "is", result)
            ReStart()
        case '/':
            result = N1/N2
            print ("Division of", N1, "And", N2, "is", result)
            ReStart()
        case '%':
            result = N1%N2
            print ("Reminder of Division of", N1, "And", N2, "is", result)
            ReStart()
        case '^':
            result = N1**N2
            print (N1, "to the power", N2, "is", result)
            ReStart()
        case '?':
            print ("Support: \n+:   Add\n-:   Subtract\n*:  Product\n/:   Divide\n%:    reminder\n^:    Power/Exponential")
            ReStart();
        case 'Exit':
            print ("Exiting The Program..")
            exit()
    

Start()
