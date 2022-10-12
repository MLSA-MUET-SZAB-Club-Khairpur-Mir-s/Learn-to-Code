String reverse(String s) {
  //creating object for string buffer
  StringBuffer sb = new StringBuffer();
  for (int i = s.length - 1; i >= 0; i--) {
    //taking reverse string
    sb.write(s[i]);
  }
  return sb.toString();
}

main() {
  //printing reverse string
  print(reverse('SoftwareEngineer'));
}
