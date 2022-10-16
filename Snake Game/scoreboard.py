from turtle import Turtle

class Scoreboard(Turtle):
    def __init__(self):
        super().__init__()
        self.score = 0
        self.goto(0,270)
        self.color("white")
        self.write(f"Score = {self.score}", align="center",font =("Arial",18,"normal"))
        self.hideturtle()
        
    def increase_score(self):
        self.score += 1
        self.clear()
        self.write(f"Score = {self.score}", align="center",font =("Arial",18,"normal"))
        
    def is_game_over(self):
        self.goto(0,0)
        self.color("white")
        self.write(f"Game Over", align="center",font =("Arial",18,"normal"))
        self.hideturtle()


        
       
        
    