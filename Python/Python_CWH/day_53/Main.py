# map filter and reduce

# def Cube(x):
    # return x**3

# print(Cube(8))

from functools import reduce


l = [5, 2, 9, 5, 4 ,2 ,12, 7, 1, 21,1 ,12,1 ,1,214]
print(l)
# newl = []
# for item in l:
#     newl.append(cube(item))
# so loooooooooooooonnnnnnnnnnnnnnnnnngggggggggggggggggggg



# MAP
newl = list(map(lambda x: x**3, l))
print(newl)


# FILTER
def filterfunc(a):
    return a>4

newl2 = list(filter(filterfunc, l))
print(newl2)


# REDUCE
newl3 = reduce(lambda x,y: x*y, l)
print(newl3)