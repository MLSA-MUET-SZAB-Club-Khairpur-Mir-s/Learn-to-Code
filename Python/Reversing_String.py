#def reverse(s):
#	str = ""
#	for i in s:
#		str = i + str
#	return str

#s = "FahadUmar"

#print("The original string is : ", end="")
#print(s)

#print("The reversed string(using loops) is : ", end="")
#print(reverse(s))
#-----------------------------------------------------------
def reverse(str):
    return str[::-1]


cin=str(input("Enter Your Name : "))

print("Entered String is :", cin)
print("Reversed String is :", reverse(cin))

