def AgeCalculator(y, m ,d):
  import datetime #importing the date time module using python
  #
  today = datetime.datetime.now().date() #taking today’s date by using the datetime.now() method of the datetime module
  dob = datetime.date(d, m, y)
  age = int((today-dob).days / 365)
  print("age = "+age)
AgeCalculator(1, 10, 2001)
//theek aa bas
