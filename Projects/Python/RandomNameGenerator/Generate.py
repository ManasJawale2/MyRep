import os
import random

alp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZāḍēṅḥīl̥ṁṇōær̥śṭūṣñĀḌĒṄḤĪL̥ṀṆŌÆR̥ŚṬŪṢÑ20123456789 "
syl = "!@#$%^&*()-=[]\;',./_+{}|:\"<>?₹̣/'-`~☺☻♥♦♣♠•◘○◙♂♀♪☼►◄↕‼¶§▬↨☻↓→←∟↔▲♣╚"
length = int(input("Enter How Long should name be: "))

typestr = input("Enter Which type of alp should be there\n   -alp  :    Enter random Alphabets and it also includes numbers\n   -syl  :    Enter Random Symbols\nEnter it here:")
i = 0

selected = Exception("Enter a vailed type") if typestr != "alp" and typestr != "syl" else alp if typestr == "alp" else syl if typestr == "syl" else Exception("Invaild")

# match typestr:
#     case "alp":
#         selected = alp
#     case "syl":
#         selected = syl

if type(selected) == Exception:
    raise selected

str = ""

r = random.randint(0, len(selected))

while i < length:
    r = random.randint(0, len(selected))
    str += selected[r]
    i+=1

print (str)