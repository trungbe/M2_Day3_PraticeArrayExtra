package sum_diagonalline_matrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {8, 7, 6}, {7, 9, 19}};
        System.out.println("Sum diagonal line is: " + sumDiagonal(arr));

    }
    public static int sumDiagonal(int [][]arr){
        int sum =0;
        for (int i=0; i<arr.length;i++){
            sum += arr[i][i];
        }
        return sum;
    }
}
