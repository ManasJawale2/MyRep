# Running a same function inside the same function called recuirsion
def Factorial(n):
    '''Factorial(n) => (n)*(n-1)*(n-2)...(n-(n-1))'''
    # 5 * (4 * (3 * (2 * (1))))
    if n==1 or n==0:
        return 1
    else:
        return n * Factorial(n-1)
    

print (Factorial(5))

def Fibonnaci(length):
    pass