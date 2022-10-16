from turtle import Turtle

class Separator(Turtle):
    def __init__(self):
        super().__init__()
        self.color("white")
        self.penup()
        self.goto(0,-350)
        self.left(90)
        self.pendown()
        for _ in range(20)  :
           self.penup()
           self.forward(20)
           self.pendown()
           self.forward(20)
    
        
            