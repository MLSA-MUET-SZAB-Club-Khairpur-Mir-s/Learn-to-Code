a = float(input())
b = float(input())
c = float(input())

if (a >= b) and (a >= c):
	largest_triangle_side = a
elif (b >= c) and (b >= a):
	largest_triangle_side = b
else:
	largest_triangle_side = c

if (largest_triangle_side == a):
	if (b**2 + c**2 == a**2):
		print("YES", end = "")
	else:
		print("NO", end = "")

if(largest_triangle_side == b):
	if(c**2 + a**2 == b**2):
		print("YES", end = "")
	else:
		print("NO", end = "")

if(largest_triangle_side == c):
	if(a**2 + b**2 == c**2):
		print("Yes, it is a right-angled triangle.", end = "")
	else:
		print("No, it is not a right-angled triangle.", end = "")