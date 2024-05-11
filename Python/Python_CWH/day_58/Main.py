# Contructure helps us in initializing variables

# Fo ex:
# a = Preson()
# a.name = "Manas"
# a.age = 11
# ...
# This is so long way

# so we use contructor


class Person:
    name = "Sujal"
    age = 16

    def __init__(self, name, age) -> None:
        self.name = name
        self.age = age
        print (f"Hi! I am {self.name}")
    def info(self):
        print (f"Name:  {self.name}\nAge:   {self.age}")


a = Person("Manas", 11)
b = Person("Sujal", 16)
c = Person("Kirtesh", 8)
a.info()
b.info()
c.info()
