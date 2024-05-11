# is vs == operator

a = [6, 5]
b = [6, 5]

# == compares value
# is compares exact location of object in memory

print (a==b, a is b)

a = 5
b = 5
print (a==b, a is b)

print (a is None)