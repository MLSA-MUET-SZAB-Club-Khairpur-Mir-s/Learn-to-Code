//program to print even numbers upto 100

/*
there are 2 ways either we can increment by 2 by starting from 2
or, just use conditional statement to check if number divided by 2 gives 0 as a remainder then it is even print it
else dont print it.
*/

void main() {
  int num;
  print('Even Numbers : ');
  for (num = 1; num <= 100; num++) {
    if(num % 2 == 0){
      print('$num');
    }
  }
}
