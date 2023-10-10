String reverse(String s) {
  //creating object for string buffer
  StringBuffer sb = new StringBuffer();
  for (int j = s.length - 1; j >= 0; j--) {
    //taking reverse string
    sb.write(s[i]);
  }
  return sb.toString(); // it will return the string
}

main() {
  //printing reverse string
  print(reverse('SoftwareEngineer'));
}
