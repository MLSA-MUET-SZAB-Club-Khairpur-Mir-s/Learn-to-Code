def AgeCalculator(y, m ,d):
  import datetime #importing the date time module using python
  # This is A agg calculator program
  today = datetime.datetime.now().date() #taking today’s date by using the datetime.now() method of the datetime module
  dob = datetime.date(y, m, )
  age = int((today-dob).days / 365)
  print("age = "+age)
AgeCalculator(2001, 10, 1)

