void main() {

  List<int> numbers = [1, 2, 3, 4, 5];

  List<int> doubledNumbers = numbers.map((int number) {
    return number * 2;
  }).toList(); // Convert the result back to a list

  print("Original numbers: $numbers");
  print("Doubled numbers: $doubledNumbers");
}
