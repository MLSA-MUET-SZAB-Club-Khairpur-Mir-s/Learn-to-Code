import time
from turtle import Screen
from player import Player
from car_manager import CarManager
from scoreboard import Scoreboard

screen = Screen()
screen.setup(width=600, height=600)
screen.tracer(0)

player = Player() 
car_manager =CarManager()
scoreboard = Scoreboard()

screen.listen()
screen.onkey(player.go_up,"Up")
screen.onkey(player.go_down,"Down")

game_is_on = True
while game_is_on:
    time.sleep(0.1)
    screen.update()

    car_manager.create_car()
    car_manager.move_car()
    
    #detect turtle collision with car
    for car in car_manager.all_car:
        if car.distance(player)<20:
            game_is_on = False
            scoreboard.game_over()


    #detect successfull crossing
    if player.is_finished():
       player.go_to_start()
        player.go_to_end()
       car_manager.level_up()
       scoreboard.increase_level()
      
screen.exitonclick()
