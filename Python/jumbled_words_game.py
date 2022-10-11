# A jumbled words game by Andro .
 

import random
 
 

def choose():
    
    words = ['rainbow', 'computer', 'science', 'programming',
             'mathematics', 'player', 'condition', 'reverse',
             'water', 'board', 'andro','made','aman']
 
    
    pick = random.choice(words)
 
    return pick
 
 
def jumble(word):
    random_word = random.sample(word, len(word))
    jumbled = ''.join(random_word)
    return jumbled

def play():
    pl1=input("enter 1st player name \n ")
    pl2=input("enter 2nd player name \n")
    pt1=0
    pt2=0
    turn=0
    while(1):
        act_word= choose()
        jum_word= jumble(act_word)
        print("the word is\n",jum_word)
        if turn%2==0:
            print("player\t",pl1,"\tits your turn")
            guess_word=input("Enter your guess\n")
            if guess_word==act_word:
                pt1=pt1+1
                print("Your point is",pt1,"\n")
                turn=turn+1
            else:
                print("Your point is",pt1,"better luck next time \n The actual word is  ",act_word,"\n")
                conti=int(input("enter 1 to continue And 0 to exit\n"))
                if conti==0:
                    print(pl1, "your point is" ,pt1,"\n",pl2,"your point is ",pt2,"\nthanks for playing this shit game")
                    break
        else:
            print("player\t",pl2,"\tits your turn")
            guess_word=input("Enter your guess\n")
            if guess_word==act_word:
                pt2=pt2+1
                print("Your point is",pt2,"\n")
                turn=turn+1
            else:
                print("Your point is",pt2,"better luck next time\nThe actual word is  ",act_word,"\n")
                conti=int(input("enter 1 to continue And 0 to exit\n"))
                if conti==0:
                    print(pl1, "your point is" ,pt1,"\n",pl2,"your point is ",pt2,"\nthanks for playing this shit game")
                    break
play()