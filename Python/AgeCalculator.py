def AgeCalculator(y, m ,d):
  import datetime #importing the date time module using python
  #
  today = datetime.datetime.now().date() #taking today’s date by using the datetime.now() method of the datetime module
  dob = datetime.date(y, m, d)
  age = int((today-dob).days / 365)
  print("age = "+age)
AgeCalculator(2001, 10, 1)
//theek aa bas
