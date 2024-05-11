def add(a, b):
    return a+b

def dif(a, b):
    if a>b:
        return a-b
    else:
        return b-a

def product(a, b):
    return a*b

def divide(a, b):
    return a/b

def power(a, b):
    i = 1
    for i in range (b):
        i *= a
    return i

def getPerCentage(total, value):
    return value/total * 100

def getValue(total, percentage):
    if percentage>100:
        return
    return percentage/100 *total

def getTotal(percentage, value):
    if percentage>100:
        return
    return (value + percentage) * 100

def getFactors(n):
    factors = [1]
    for i in range (n):
        if n%i==0:
            factors.append(i)
    factors.append(n)
    return factors

def isPrime(n):
    return len(getFactors(n)) <= 2

def isComposite(n):
    return len(getFactors(n)) > 2

def getCommonFactors(a, b):
    factorsA = set(getFactors(a))
    factorsB = set(getFactors(b))
    return list(factorsA.intersection(factorsB))

def getHCF(a, b):
    divisiors = getCommonFactors(a, b)
    divisiors.remove(1)
    pass