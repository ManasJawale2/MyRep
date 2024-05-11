print ("Hello User!")

def about(**dic):
    print ("Username:", dic["name"], "\nPassword:", dic["password"], "\nAge:", dic["age"])

name = input ("Enter Your Name: ")
password = input ("Enter Your Password: ")
age = int(input ("Enter Your Age: "))
print ("Generating Profile...")
print ("Done!\n")
about(name=name, password=password, age=age)