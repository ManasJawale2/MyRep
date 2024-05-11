# Lambda functions

def appl(fx, v):
    return 5 + fx(v)

# def double(x):
#     return x*2

double = lambda x: x*2
sum = lambda x,y,z: x+y+z

print(double(5))
print(sum(20, 21 ,21))

print(appl(lambda x: x**3, 8))