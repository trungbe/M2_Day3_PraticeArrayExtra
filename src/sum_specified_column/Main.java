package sum_specified_column;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {8, 7, 6}, {7, 9, 19}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter col: " );
        int col = sc.nextInt();
        sumCol(arr, col);
        System.out.println("Sum col " + col + " is: " + sumCol(arr, col));


    }

    public static int sumCol(int[][] arr, int col) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum;
    }
}

