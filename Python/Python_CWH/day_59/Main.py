# Decorators and @ syntax

def greet(fx):
    def mfx():
        print ("Good morning")
        fx()
        print("Thanks for using this function")
    return mfx

@greet
def Hello():
    print ("Hello World!")


Hello()
