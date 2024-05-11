# Access Modifiers

# In general, we uses public private and static as access modifiers
# but python don't does like that
class MyClass:
    def __init__(self):
        self.name = "Manas"
        self.__password = 123
        self._about = "I am Manas Pankaj jawale\nI am 11 years old\nI study in 6th standerd"

a = MyClass()
print (a.name) # this is accesseble
# print (a.__password) not accessable
# but it can b accessed with functions
print (a._MyClass__password)
print (a.__dir__())
print (a._about)

