// question 1
// public class practiceSet {
// public static void main(String args[]) {
// int[][] arr = { { 4, 7, 8 }, { 8, 8, 7 } };
// int count = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[0].length; j++) {
// if (arr[i][j] == 7) {
// count++;
// }
// }
// }
// System.out.println("count = " + count);
// }

// }
// ************************************************************************************************************
// question 2

// public class practiceSet {
// public static void main(String args[]) {
// int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
// int sum = 0;

// if (arr.length <= 1) {
// System.out.println("2nd row doesnot exist");

// } else {
// for (int j = 0; j < arr[0].length; j++) {
// sum += arr[1][j];
// }
// System.out.println("sum of 2nd row = " + sum);
// }

// }

// }

// ************************************************************************************************************
// question 3

// public class practiceSet {

// public static void transpose(int[][] arr) {
// int n = arr.length;// no of rows
// int m = arr[0].length;// no of cols
// int[][] transpose = new int[m][n];

// for (int i = 0; i < m; i++) {
// for (int j = 0; j < n; j++) {
// transpose[i][j] = arr[j][i];
// }
// }
// printArr(transpose);
// }

// public static void printArr(int[][] arr) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[0].length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }

// }

// public static void main(String args[]) {
// int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

// System.out.println("previous matrix : ");
// printArr(arr);

// System.out.println("tranposed matrix : ");
// transpose(arr);

// }

// }
