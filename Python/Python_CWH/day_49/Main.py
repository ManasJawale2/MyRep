# File IO
# python File IO is built in or made officially by python
# just like panda

f = open("D:\Code\src\Python\Python_CWH\day_49\Manas.txt")
text = f.read()
print (text, end="\n\n")
f = open("D:\Code\src\Python\Python_CWH\day_49\Manas.txt", "rt")
text = f.read()
print (text, end="\n\n")
f = open("D:\Code\src\Python\Python_CWH\day_49\Manas.txt", "rb")
text = f.read()
print (text, end="\n\n")
f = open("D:\Code\src\Python\Python_CWH\day_49\Sujal.txt", "w")
f.write("Name:  Sujal Pankaj Jawale\n")
f.write("Age:   16-17")
f.write("Class: 12th Technical")
print (text, end="\n\n")
# f.close()

with open('D:\Code\src\Python\Python_CWH\day_49\Myfile.txt', 'w'):
    f.write("Hey! I am inside with")

f.close()