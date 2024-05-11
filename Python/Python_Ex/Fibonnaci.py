length = int(input('Enter How long your fibonnaci should go: '))
n1, n2 = 0, 1
newn = 0
count = 0
arr = []
if length <= 0:
    length = int(input('Please enter a positive integer: '))
elif length == 1:
    length = int(input('Please enter any else number: '))
else:
    print('That\'s it!')
    while count<length:
        print(n1)
        arr.append (n1)
        newn = n1+n2
        n1 = n2
        n2 = newn
        count+=1
print(arr)
