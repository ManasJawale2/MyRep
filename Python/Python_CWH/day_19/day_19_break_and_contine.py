# break can stop a loop by our own mind
for i in range (1, 33):
    print ("HI! its me", i)
    if i==20:
        break

print ("Loop ko chodkar me nikal gaya")

# We can skip a iteration using continue
n = int(input("From : "))
n1 = int(input("To: "))
length = int(input("Enter how long should table go: "))
for i in range (n, n1+1):
        if i%10==0:
            print  ("Skipped the iteration due to its multiple of 10")
            continue
        for j in range (1, length+1):
            print (i, "x", j, "=", i*j)

# We can even make our own do while loop buy break and continue
i = 0
while True: #makes a infinite loop
    print (i)
    i+=1
    if i%100 == 0:
        break
