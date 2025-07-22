// // question 1 ..... rat in a maze problem
// //
// *********************************************************************************************************
// // practice session code

// public class practiceSet {

// public static void recursion(int x, int y, int[][] arr, String ans, int n) {

// if (x < 0 || y < 0 || x >= n || y >= n || arr[x][y] == 0) {
// return;
// }

// if (x == n - 1 && y == n - 1) {
// System.out.println(ans);
// return;
// }

// arr[x][y] = 0;// block

// recursion(x + 1, y, arr, ans + "D", n);
// recursion(x - 1, y, arr, ans + "U", n);
// recursion(x, y + 1, arr, ans + "R", n);
// recursion(x, y - 1, arr, ans + "L", n);

// arr[x][y] = 1;// unblock
// }

// public static void main(String args[])

// {
// int n = 4;
// int mat[][] = {
// { 1, 0, 0, 0 },
// { 1, 1, 0, 1 },
// { 0, 1, 1, 0 },
// { 0, 1, 1, 1 }
// };

// System.out.println();
// recursion(0, 0, mat, "", n);
// }
// }

// // ********************************************************
// // or
// // practice session wale code ko he matrix print karwane mai convert kiya hai

// import java.util.*;

// public class practiceSet {

// public static void printArr(int[][] arr) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }

// public static void recursion(int x, int y, int[][] arr, int[][] sol, int n) {

// if (x < 0 || y < 0 || x >= n || y >= n || arr[x][y] == 0) {
// return;
// }

// if (x == n - 1 && y == n - 1) {
// System.out.println("SOL : ");
// sol[x][y] = 1;
// printArr(sol);
// return;
// }

// arr[x][y] = 0;// block
// sol[x][y] = 1;

// recursion(x + 1, y, arr, sol, n);
// recursion(x - 1, y, arr, sol, n);
// recursion(x, y + 1, arr, sol, n);
// recursion(x, y - 1, arr, sol, n);

// arr[x][y] = 1;// unblock
// sol[x][y] = 0;
// }

// public static void main(String args[])

// {
// int n = 4;
// int mat[][] = {
// { 1, 0, 0, 0 },
// { 1, 1, 0, 1 },
// { 0, 1, 1, 0 },
// { 0, 1, 1, 1 }
// };

// int sol[][] = new int[n][n];

// for (int[] row : sol) {
// Arrays.fill(row, 0);
// }
// recursion(0, 0, mat, sol, n);
// }
// }

// // ********************************************************
// // or
// // Apna college sol sheet code...print only one sol and travels only right
// and down

// public class practiceSet {

// public static void printArr(int[][] arr) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }

// public static boolean isSafe(int[][] maze, int x, int y) {
// return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y]
// == 1);
// }

// public static boolean solveMaze(int[][] maze) {
// int n = maze.length;
// int[][] sol = new int[n][n];

// if (solveMazeUtil(maze, 0, 0, sol) == false) {
// System.out.println("Solution does not exist");
// return false;
// }

// System.out.println("Solution exist : ");
// printArr(sol);
// return true;
// }

// public static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol)
// {

// if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
// sol[x][y] = 1;
// return true;
// }

// if (isSafe(maze, x, y) == true) {

// if (sol[x][y] == 1) {
// return false;
// }
// sol[x][y] = 1;

// if (solveMazeUtil(maze, x + 1, y, sol)) {
// return true;
// }

// if (solveMazeUtil(maze, x, y + 1, sol)) {
// return true;
// }
// sol[x][y] = 0;
// return false;

// }
// return false;
// }

// public static void main(String args[]) {

// int[][] maze = {
// { 1, 0, 0, 0 },
// { 1, 1, 0, 1 },
// { 0, 1, 0, 0 },
// { 1, 1, 1, 1 }
// };

// solveMaze(maze);
// }
// }

// // question 2 ..... Keyboard Combination / Letter Combination Problem
// //
// *********************************************************************************************************

// public class practiceSet {

// static char[][] letters = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, {
// 'g', 'h', 'i' }, { 'j', 'k', 'l' },
// { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x',
// 'y', 'z' } };

// public static void letterCombinations(String str) {

// if (str.length() == 0) {
// System.out.println("");
// return;
// }

// recursion(str, 0, "");

// }

// public static void recursion(String str, int pos, String ans) {
// if (pos == str.length()) {
// System.out.println(ans);
// return;
// }

// char[] nums = letters[Character.getNumericValue(str.charAt(pos))];

// for (int i = 0; i < nums.length; i++) {
// recursion(str, pos + 1, ans + nums[i]);
// }
// }

// public static void main(String args[]) {
// System.out.println();
// letterCombinations("23");
// }
// }

// // More optimised code below by stringbuilder
// // or

// public class practiceSet {

// static char[][] letters = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, {
// 'g', 'h', 'i' }, { 'j', 'k', 'l' },
// { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x',
// 'y', 'z' } };

// public static void letterCombinations(String str) {

// if (str.length() == 0) {
// System.out.println("");
// return;
// }

// recursion(str, 0, new StringBuilder());

// }

// public static void recursion(String str, int pos, StringBuilder ans) {
// if (pos == str.length()) {
// System.out.println(ans.toString());
// return;
// }

// char[] nums = letters[Character.getNumericValue(str.charAt(pos))];

// for (int i = 0; i < nums.length; i++) {
// recursion(str, pos + 1, new StringBuilder(ans).append(nums[i]));
// }
// }

// public static void main(String args[]) {
// System.out.println();
// letterCombinations("24");
// }
// }

// //question 3 ..... Knight's Tour Problem
// //*********************************************************************************************************

// import java.util.*;

// public class practiceSet {

// public static void printArr(int[][] arr) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }

// public static boolean solveKT() {
// int n = 8;
// int board[][] = new int[n][n];

// for (int[] row : board) {
// Arrays.fill(row, -1);
// }

// // not working below array
// // int[] xMove = { 2, 2, -2, -2, 1, 1, -1, -1 };
// // int[] yMove = { 1, -1, 1, -1, 2, -2, 2, -2 };

// // Note : yeh neeche jo order mai xMove aur yMove wala array banaya hai sirf
// // ussi order mai output aa rha hai order change karne pe nhi aa raha pata
// nhi
// // kyu samja he nhi woh
// int[] xMove = { 2, 1, -1, -2, -2, -1, 1, 2 };
// int[] yMove = { 1, 2, 2, 1, -1, -2, -2, -1 };

// // knight starts from cell 0,0
// board[0][0] = 0;

// if (solveKTUtil(0, 0, 1, board, xMove, yMove)) {
// System.out.println(" Solution exist : ");
// printArr(board);
// return true;
// } else {
// System.out.println(" Solution does not exist : ");
// return false;
// }
// }

// public static boolean isSafe(int x, int y, int[][] board) {
// return (x >= 0 && x < board.length && y >= 0 && y < board.length &&
// board[x][y] == -1);
// }

// public static boolean solveKTUtil(int x, int y, int count, int[][] board,
// int[] xMove, int[] yMove) {
// int next_x, next_y;
// if (count == board.length * board.length) {
// return true;
// }

// for (int i = 0; i < 8; i++) {
// next_x = x + xMove[i];
// next_y = y + yMove[i];

// if (isSafe(next_x, next_y, board)) {
// board[next_x][next_y] = count;
// if (solveKTUtil(next_x, next_y, count + 1, board, xMove, yMove)) {
// return true;
// }
// board[next_x][next_y] = -1; // backtracking
// }

// }

// return false;
// }

// public static void main(String args[]) {
// solveKT();
// }
// }