def factorial(n):
    if (n == 1 or n == 0):
        return 1
    else:
        return (n * factorial(n-1))


num = int(input("Enter any number for factorial.."))

if num < 0:
    print("Sorry, factorial does not exist for negative numbers")
else:
    print("Factorial of ",num," :",factorial(num))