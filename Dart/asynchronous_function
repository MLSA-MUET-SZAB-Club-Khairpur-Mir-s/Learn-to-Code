import 'dart:async';

Future<String> fetchData() async {
  await Future.delayed(Duration(seconds: 2));

  return "Data fetched successfully!";
}

void main() {
  print("Start of the program");
  fetchData().then((result) {
    print(result);
  }).catchError((error) {
    print("Error: $error");
  });

  print("End of the program");
}
