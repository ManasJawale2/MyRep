# Tuples can't be changed
tup = (1, 3, 43, 'Green', True, 1.0)
# tup[1] = 67 <= throws an error
print (type(tup), tup)
print (tup[0])

# To check the tuple
countrys = ("India", "India", "India", "UK", "Germany")
if "India" in countrys:
    print ("India is here😃😃")
if ("USA" in countrys):
    print ("Including USA😲😲")
else:
    print ("Except USA😟😟")

# 0 1 2 3 4 5
# 1 3 34 Green True 1.0
# n y y y y n
tup2 = tup[1:4]
print (tup2)
print (tup2[1:])
print (tup2[:4])
l = [78, 89, 78]
tl = (4, 65 ,5, 7, 6, 6, 5, 2, 3 ,4)
# tuple methods
# list(countrys)
print (list(countrys))
print (tuple(l))
print (countrys.count("India"))
print (countrys.index("Germany"))
print (tl.index(5, 6, 65))