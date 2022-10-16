from turtle import Screen
from snake import Snake
from food import Food
from scoreboard import Scoreboard
import time
s =Screen()
s.setup(600,600)
s.bgcolor('black')
s.title("Snake Game")
s.tracer(0)


snake = Snake()
food = Food()
scoreboard = Scoreboard()
s.listen()
s.onkey(snake.up,"Up")
s.onkey(snake.down,"Down")
s.onkey(snake.left,"Left")
s.onkey(snake.right,"Right")



is_game_on = True
while is_game_on:
    s.update()
    time.sleep(0.1)
    snake.move()
    
    
#Detect Collision with food
    if snake.head.distance(food) < 15:
        food.refresh()
        snake.extent_segment()
        scoreboard.increase_score()
        
#Detect Collision with Wall
    if snake.head.xcor() > 300 or snake.head.xcor() < -300 or snake.head.ycor() > 300 or snake.head.ycor() < -290:
        is_game_on = False
        scoreboard.is_game_over()
        
        
#Detect Collision with tail
    for segment in snake.segment[1:]:
    
        if snake.head.distance(segment) <10:
            
            is_game_on = False
            scoreboard.is_game_over()
s.exitonclick()