matrix1 = [[1, 2, 3],
          [4, 5, 6],
          [7, 8, 9]]

def transpose_mat(matrix):
    for i in range(3):
        for j in range(i+1,3):
            matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        # matrix[0][i], matrix[1][i], matrix[2][i]=matrix[i][0], matrix[i][1], matrix[i][2]
        
    print(matrix)
print(transpose_mat(matrix1))

# output:-
# [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
