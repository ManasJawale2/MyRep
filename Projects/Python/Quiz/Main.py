def AskQuestion(Question,rightanswer, **options ):
    print (Question,"?")
    print ("a)", options['op0'], "   b)", options['op1'])
    print ("c)", options['op2'], "   d)", options['op3'])
    answer = input("Enter Your answer here: ")
    checkAnswer(answer, rightanswer)

def checkAnswer(useranswer, rightanswer):
    if useranswer == rightanswer:
        print ("Right Answer! You won $13,000")
    else:
        print ("You lose🥲  Goodluck NextTime🍀")

    

AskQuestion("Who was the prime miniter from 2014 to 2024+", 'b', op0="Indra Gandhi", op1="Narendra Modi", op2="Rahul Gandhi", op3="Kejriwal")



