# Getters and Setters

class MyClass:
    def __init__(self, value):
        self._value = value
    def show(self):
        print(f"It is {self._value}")
    
    @property
    def ten_value(self):
        return 10*self._value

    @ten_value.setter
    def ten_value(self, nv):
        self._value = nv/10

obj = MyClass(10)
print(obj.ten_value)
obj.show()
obj.ten_value = 10
obj.show()