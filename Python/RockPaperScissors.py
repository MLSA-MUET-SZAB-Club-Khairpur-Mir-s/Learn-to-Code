import random


print("Rules of Rock,Paper and Scissors game: \n"
        +"Rock vs Scissors --> Rock wins \n"
        +"Scissors vs Paper --> Scissors wins \n"
        +"Paper vs Rock --> Paper wins \n")
name = input("Enter user name: ")
while True:
    print("Enter your choice:  1.Rock 2.Paper 3.Scissors \n")
    choice = int(input(name+"'s turn: "))  #Taking input from user
    while choice>3 or choice<1:
        choice = int(input("Enter valid input!: "))
        
    if choice == 1:
        selected_choice = 'Rock'
    elif choice == 2:
        selected_choice = 'Paper'
    else:
        selected_choice = 'Scissor'
        
    print(name+"'s choice is: "+selected_choice)
    print("\n Bot's turn......")
    
    bot_choice = random.randint(1,3)
    
    while bot_choice == choice:
        bot_choice = random.randint(1,3)
        
    if bot_choice == 1:
        selected_bot_choice = 'Rock'
    elif bot_choice == 2:
        selected_bot_choice = 'Paper'
    else:
        selected_bot_choice = 'Scissors'
        
    print("Bot's choice: "+selected_bot_choice)
    print(selected_choice+" Vs "+selected_bot_choice)
    
    #Winning Condition:
    if choice == bot_choice:
        print("***Both the players selected {choice}.It,s a tie!***")
        
    elif choice == 1:
        if bot_choice == 3:
            print("***Rock smashes scissors!"+name+" wins!***")
        else:
            print("***Paper covers Rock! Bot wins!***")
            
    elif choice == 2:
        if bot_choice == 1:
            print("***Paper covers rock!"+name+" wins!***")
        else:
            print("***Scissors cuts paper! Bot wins!***")
            
    elif choice == 3:
        if bot_choice == 2:
            print("***Scissors cut paper!"+name+" wins!***")
        else:
            print("***Rock smashes scissors!Bot wins!***")
    
    play_again = input("Want to play the game again?(y/n):")
    if play_again.lower() != "y":
        break
    
print("\n THANK YOU FOR PLAYING THE GAME! \n HOPE YOU ENJOYED THE GAME!")
          