elements=["fire", "wind", "water"]

print("Using for loop... in")
for e in elements:
    #this will print all the elements
    print(e)

print("\nUsing range()")
for i in range(2):
    #this will give you index
    print(i)
print("\nWith enumerates")
for i,e in enumerate(elements):
    #this will give you both
    print(i,e)
#--------------------------------------------    
i=0;
while(i!=len(elements)):
    print(i, elements[i])
    i=i+1
