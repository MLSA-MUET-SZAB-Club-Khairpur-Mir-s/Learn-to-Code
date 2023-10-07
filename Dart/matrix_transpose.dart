
void mattrans(mat) {
  for (int i = 0; i < 3; i++) {
    for (int j = i + 1; j < 3; j++) {
      int temp = mat[i][j];
      
      mat[i][j] = mat[j][i];
      mat[j][i] = temp;
      // (mat1[i][j],mat1[j][i]) = (mat1[j
      // ][i],mat1[i][j]);
    }
  }
  return mat;
}
void main(){
  List<List<int>> mat1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
  ];
  mattrans(mat1);
  print(mat1);
}
