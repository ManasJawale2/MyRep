l = [3, 5, 7, "Harry", 1.0, True]
#    0  1  2  3        4    5
print (l)
print (type(l))
print (l[0])
# A list can contain different types of vars without any problem
# It can also add one more index using append
print (l[len(l)-3])
if 7 in l:
    print("Contains 7")
print (l[:])
print (l[1:])
print (l[1:-1])
print (l[0:4:2])# => l[0] l[2] l[4]
for i in range (len(l)):
    print (l[i])

lst = [i for i in range(50) if i%2==0]
print (lst)

arr = [34, 56 , 45, 34]
print (arr)
arr.append(7)# => 34 56 45 34 7
print (arr)
arr.reverse()
print (arr)
arr.reverse()
print (arr.index(34))
print (arr.count(3))
m = arr
m[0] = 32
print (m)
print (arr)
n = arr.copy()
print (n)
arr.insert(1, 745)
print (arr)
arr.extend(n)
print (arr)
