import 'package:starter/binary_search.dart';

void main() {
  final list = [1, 5, 15, 17, 19, 22, 24, 31, 105, 150];

  final search31 = list.indexOf(31);
  final binarySearch31 = list.binarySearch(31);

  print('indexOf: $search31');
  print('binarySearch: $binarySearch31');
}
