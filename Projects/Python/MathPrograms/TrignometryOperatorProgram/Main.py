from math import *;

print ('Hello User!')

print ('Use the following rules to show which trignometric ratio do you want:\n -c for cos \n -s for sin \n -t for tan \n -cs for coses \n -ct for cot\n -sc for sec')

TrignometricRatio = input('Enter a code by above instructions for telling us which trignometric ratio do you want: ')
angle = int(input("Enter the theta: "))
if angle > 180:
    print ('Theta should be greator than 180')
    angle = int(input("Enter the Theta Again: "))
match TrignometricRatio:
    case 'c':
        print ("The value of", 'cos', angle, 'is', cos(angle))
    case 's':
        print ("The value of", 'sin', angle, 'is', sin(angle))
    case 't':
        print ("The value of", 'tan', angle, 'is', tan(angle))