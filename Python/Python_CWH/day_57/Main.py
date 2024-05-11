class Person:
    name = "Manas"
    occupation = None
    netwroth = 700
    def info(self):
        # self -> obj from where method is called
        print (f"{self.name}\n{self.netwroth}\n{self.occupation}")
a = Person()
a.info()
a.netwroth = 720
a.info()
