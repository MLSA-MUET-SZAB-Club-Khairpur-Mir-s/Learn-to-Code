from turtle import Turtle,Screen
STARTING_POSITION = [(0,0),(-20,0),(-40,0)]
MOVE_DISTANCE = 20

UP =90
DOWN =270
LEFT =180
RIGHT =0
class Snake:
    def __init__(self):
        self.segment = []
        self.create_snake()
        self.head = self.segment[0]
    def create_snake(self):
       for position in STARTING_POSITION:
              self.add_segment(position)
    
    def add_segment(self,position):
           t = Turtle("square")
           t.color('white')
           t.penup()
           t.goto(position)
           
           self.segment.append(t)   
    def extent_segment(self):
           self.add_segment(self.segment[-1].position())
    def move(self):
        for seg_num in range(len(self.segment)-1,0,-1):
                 new_x = self.segment[seg_num-1].xcor()
                 new_y = self.segment[seg_num-1].ycor()
                 self.segment[seg_num].goto(new_x,new_y)
        self.head.speed('fastest')
        self.head.forward(MOVE_DISTANCE)
        
    def up(self):
        if self.head.heading() != DOWN:
            self.head.setheading(UP)
        
    def down(self):
        if self.head.heading() != UP:
           self.head.setheading(DOWN)
    def left(self):
        if self.head.heading() != RIGHT:
            self.head.setheading(LEFT)
    def right(self):
        if self.head.heading() != LEFT:
            self.head.setheading(RIGHT)
            
        
        
        
