from turtle import Turtle,Screen
from paddle import Paddle
from ball import Ball
from scoeboard import Scoreboard
from separater import Separator
import time
screen = Screen()
screen.bgcolor("black")
screen.setup(width = 800, height =600 )
screen.title("Pong")
screen.tracer(0)

r_paddle = Paddle((350,0))
l_paddle = Paddle((-350,0))
ball = Ball()


screen.listen()
screen.onkey(r_paddle.go_up,"Up")
screen.onkey(r_paddle.go_down,"Down")

screen.onkey(l_paddle.go_up,"w")
screen.onkey(l_paddle.go_down,"s")

scoreboard = Scoreboard()
separator = Separator()

is_game_on = True
while is_game_on:
    time.sleep(ball.move_speed)
    screen.update()
    ball.move()
    #Detect the ball
    if ball.ycor() >280 or ball.ycor()<-280:
        ball.bounce_y()
    
    #Detect Collision with R paddle
    if ball.distance(r_paddle)<50 and ball.xcor()>320 or ball.distance(l_paddle) < 50 and ball.xcor()<-320:
        ball.bounce_x()
    
    #Detect Right paddle misses
    if ball.xcor()>380 :
        ball.reset_position()
        scoreboard.l_point()
        
    #Detect Left  paddle misses
    if ball.xcor()<-380:
        ball.reset_position()
        scoreboard.r_point()
        















screen.exitonclick()