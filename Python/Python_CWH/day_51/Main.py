# Seek() and tell() and other functions

from locale import currency
import locale


with open('D:\Code\src\Python\Python_CWH\day_51\Manas.txt', 'r') as f:
    print (type(f))

    f.seek(20)

    print(f.tell())
    data = f.read(42)
    print (data)

with open("D:\Code\src\Python\Python_CWH\day_51\hello.txt", 'w') as f:
    f.write("Hello Moto!")
    f.truncate(5)

print(currency(15, True, False, False))