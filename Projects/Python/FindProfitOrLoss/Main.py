
def Ask():
    str = input("Reason: ")
    if str == "Exit":
        return []
    pol = input("Profit or loss: ")
    v = int(input("How much?\n =>"))
    return [str, pol, v]

def AddToFile(l):
    with open("D:\Code\src\Projects\Python\FindProfitOrLoss\Earnings.txt", 'w') as f:
        f.write(f"Reason: {l[0]}\n")
        f.write(f"Profit or loss: {l[1]}\n")
        f.write(f"Amount: {l[2]}\n")

t = []
while True:
    t.append(Ask())

AddToFile(t)