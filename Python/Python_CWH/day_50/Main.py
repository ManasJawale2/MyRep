# Read, ReadLines and Other Methods

# f = open("D:\Code\src\Python\Python_CWH\day_50\MyFile.txt", 'r')
# while True:
#     line = f.readline()
#     if not line:
#         print (line, type(line))
#         break
#     m1 = line.split(".")[0]
#     m2 = line.split(".")[1]
#     # m2 = line.split(".")[2]
#     print (m1)
#     print (m2)
#     print (line)
# f.close()

f = open("D:\Code\src\Python\Python_CWH\day_50\MyFile.txt", 'w')
lines = ["line 1\n", "line 2\n", "line 3\n"]
f.writelines(lines)
f.close()