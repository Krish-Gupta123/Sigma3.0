// code to input the 2d matrix and do linear search in it for a particular key

// import java.util.Scanner;

// public class practice {
//     public static void printArray(int[][] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 System.out.print(arr[i][j] + " ");

//             }
//             System.out.println();
//         }
//     }

//     public static void inputArray(int[][] arr) {
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 arr[i][j] = sc.nextInt();
//             }

//         }
//     }

//     public static boolean linearSearch(int[][] arr, int key) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 if (arr[i][j] == key) {
//                     System.out.print("element found at row " + i + " and col " + j);
//                     return true;
//                 }
//             }

//         }
//         System.out.println("key not found");
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[][] = new int[3][3];
//         System.out.println("input your 2d matrix of size 3 x 3 ");
//         inputArray(arr);
//         System.out.println("matrix you enetered : ");
//         printArray(arr);
//         linearSearch(arr, 5);

//         sc.close();
//     }
// }

// *******************************************************************************************************************
// spiral matrix printing

// import java.util.Scanner;

// public class practice {

//     public static void main(String[] args) {

//         int[][] matrix = {
//         { 1, 2, 3, 4 },
//         { 5, 6, 7, 8 },
//         { 9, 10, 11, 12 },
//         { 13, 14, 15, 16 }
//         };

//         int startRow = 0;
//         int endRow = matrix.length - 1;
//         int startCol = 0;
//         int endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {
//             for (int i = startCol; i <= endCol; i++) {
//                 System.out.print(matrix[startRow][i] + " ");

//             }
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");

//             }
//             for (int i = endCol - 1; i >= startCol; i--) {
//                 System.out.print(matrix[endRow][i] + " ");

//             }
//             for (int i = endRow - 1; i >= startRow + 1; i--) {
//                 System.out.print(matrix[i][startCol] + " ");

//             }
//             startRow++;
//             startCol++;
//             endCol--;
//             endRow--;
//         }

//     }
// }

// //*******************************************************************************************************************

//diagonals sum of 2d matrix
// import java.util.Scanner;

// public class practice {
//     public static void bruteForce(int arr[][]) {// O(n2)
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 if (i == j || i + j == arr.length - 1) {
//                     sum += arr[i][j];
//                 }
//             }
//         }

//         System.out.println("diagonals sum = " + sum);
//     }

//     public static void optimizedSol(int arr[][]) { // O(n)
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i][i];
//             if (i != arr.length - 1 - i) {

//                 sum += arr[i][arr.length - 1 - i];

//             }
//         }
//         System.out.println("diagonals sum = " + sum);
//     }

//     public static void main(String[] args) {
//         int[][] arr = {
//                 { 1, 2, 3 },
//                 { 4, 5, 6 },
//                 { 7, 8, 9 }
//         };
//         bruteForce(arr);
//         optimizedSol(arr);
//     }
// }

// //*******************************************************************************************************************

// // search for a key element in sorted rowsise 2d matrix
// import java.util.Scanner;

// public class practice {
//     public static void printArray(int[][] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 System.out.print(arr[i][j] + " ");

//             }
//             System.out.println();
//         }
//     }

//     public static int[] passingRow(int[][] arr, int key) {
//         for (int row = 0; row < arr.length; row++) {
//             int col = search(arr[row], 26);
//             if (col != -1) {
//                 return new int[] { row, col };
//             }
//         }
//         return new int[] { -1, -1 };
//     }

//     public static int search(int[] arr, int key) {
//         int si = 0;
//         int ei = arr.length - 1;

//         while (si <= ei) {
//             int mid = si + (ei - si) / 2;
//             if (key == arr[mid]) {
//                 return mid;
//             } else if (key > arr[mid]) {
//                 si = mid + 1;
//             } else {
//                 ei = mid - 1;
//             }

//         }
//         return -1;// key not found
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

//         System.out.println("array : ");
//         printArray(arr);

//         int[] result = passingRow(arr, 29);
//         if (result[0] == -1) {
//             System.out.println("element not found");
//         } else {
//             System.out.println("element found at row : " + result[0] + " and " + " col : " + result[1]);
//         }
//         sc.close();
//     }
// }

// //*******************************************************************************************************************

// passing only row matrix or col matrix from a 2d array
// import java.util.Scanner;

// public class practice {

// public static void printArray(int[][] arr) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[0].length; j++) {
// System.out.print(arr[i][j] + " ");

// }
// System.out.println();
// }
// }

// public static void printRowMatrix(int[] arr) {
// for (int value : arr)// for each loop
// {
// System.out.print(value + " ");
// }
// System.out.println();
// }

// public static void printColMatrix(int[] arr) {
// for (int value : arr)// for each loop
// {
// System.out.print(value + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, {
// 32, 33, 39, 50 } };

// System.out.println("array : ");
// printArray(arr);

// System.out.println("row matrix passing : ");
// // passing only row matrix
// for (int i = 0; i < arr[0].length; i++) {
// printRowMatrix(arr[i]);
// }

// // passing only col matrix
// int row = arr.length;
// int cols = arr[0].length;

// System.out.println("col matrix passing : ");
// for (int i = 0; i < cols; i++)

// {
// int[] colArray = new int[cols];
// for (int j = 0; j < row; j++) {
// colArray[j] = arr[j][i];

// }
// printColMatrix(colArray);
// }
// sc.close();
// }
// }

// *********************************************************************************************************

// search for a key element in sorted colsise 2d matrix
// import java.util.Scanner;

// public class practice {
//     public static void printArray(int[][] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 System.out.print(arr[i][j] + " ");

//             }
//             System.out.println();
//         }
//     }

//     public static int[] passingCol(int[][] arr, int key) {
//         for (int col = 0; col < arr[0].length; col++) {
//             int row = search(arr, 29, col);
//             if (row != -1) {
//                 return new int[] { row, col };
//             }
//         }
//         return new int[] { -1, -1 };
//     }

//     public static int search(int[][] arr, int key, int col) {
//         int si = 0;
//         int ei = arr.length - 1;

//         while (si <= ei) {
//             int mid = si + (ei - si) / 2;
//             if (key == arr[mid][col]) {
//                 return mid;
//             } else if (key > arr[mid][col]) {
//                 si = mid + 1;
//             } else {
//                 ei = mid - 1;
//             }

//         }
//         return -1;// key not found
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

//         System.out.println("array : ");
//         printArray(arr);

//         int[] result = passingCol(arr, 29);
//         if (result[0] == -1) {
//             System.out.println("element not found");
//         } else {
//             System.out.println("element found at row : " + result[0] + " and " + " col : " + result[1]);
//         }
//         sc.close();
//     }
// }
// *******************************************************************************************************
// array sorted both row wise and col wise
//note one element can occur only one time
// stair case search(most optimized sol)
//nb mai rightmost top corner element ka code likha hai yaha mai leftmost bottom corner element
import java.util.Scanner;

public class practice {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static boolean stairCaseSearch(int[][] arr, int key) {
        int row = arr.length - 1;
        int col = 0;

        while (row >= 0 && col < arr[0].length) {
            if (key == arr[row][col]) {
                System.out.println("key found at ( " + row + " , " + col + " )");
                return true;
            } else if (key < arr[row][col]) {
                row--;
            } else {
                col++;
            }

        }
        System.out.println("element not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        printArray(arr);
        stairCaseSearch(arr, 38);
        sc.close();
    }
}