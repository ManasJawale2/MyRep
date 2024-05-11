# Sets don't have items with same value
s = {2, 5, 43, 5, 5, "Cambri", 'Cambri'}
# as 5 is repeated s = {2, 5, 43, "Cambri", 'Cambri'}
# Then Cambri is repeated s = {2, 43, 'Cambri', 5}
print (s)
es = set()
print (es)

s.add(53)
print (s)
s.remove(5)
print (s)
es = {5, 7, 3, 5, 7, 2}
print (s.union(es))
print ("Intersection:")
print (s.intersection(es))
print ("Difference:")
print (s.difference(es))
print ("Symmetric Difference:")
print (s.symmetric_difference(es))
s.intersection_update(es)
print (s)
s = {2, 5, 43, 5, 5, "Cambri", 'Cambri'}
s.difference_update(es)
print ("Difference Update:")
print (s)
s = {2, 5, 43, 5, 5, "Cambri", 'Cambri'}
s.symmetric_difference_update(es)
print ("Symetric Difference Update:")
print (s)
s = {2, 5, 43, 5, 5, "Cambri", 'Cambri'}
s.update(es)
# Update and union are same except union returns and update changes
print ("Update:")
print (s)
s = {2, 5, 43, 5, 5, "Cambri", 'Cambri'}
print (s.isdisjoint(es))
print (es.issuperset(s))
print (es.issubset(s))
s.add(34)
print (s)
s.discard(34)
print (s)
items = s.pop()
print (items)
# del s destroyed
s.clear()
print (s)
s = {2, 5, 43, 5, 5, "Cambri", 'Cambri'}
if 2 in s:
    print ("2 is in the set s")
else:
    print ("2 is in the set s")