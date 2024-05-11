# Inhertance

class Employee:
    def __init__(self, name, id):
        self.name = name
        self.id = id

    def details(self):
        print(f"Name:   {self.name}\nId:     {self.id}")

class Programmer(Employee):
    def showlanguage(self):
        print("The programming language used by employee is Python")

e = Programmer("Manas Jawale", 456)
e.details()
e.showlanguage()
e1 = Employee("Sujal Jawale", 356)
e1.details()

# We can make a class by a class made by a class