// // backtracking - arrays
// public class backtracking {

// public static void printArr(int[] arr) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void changeArr(int[] arr, int index, int val) {
// if (index == arr.length) {
// printArr(arr);
// return;
// }

// arr[index] = val;
// changeArr(arr, index + 1, val + 1);
// arr[index] = arr[index] - 2; // backtracking
// }

// public static void main(String args[]) {
// int arr[] = new int[5];
// changeArr(arr, 0, 1);
// printArr(arr);
// }

// }

// //
// ****************************************************************************************************************
// // find subSets of a string
// public class backtracking {

// // By String

// public static void subSets(String newStr, int idx, String str) {
// if (idx == str.length()) {
// if (newStr.length() == 0) {
// System.out.println("null");
// } else {
// System.out.println(newStr);
// }
// return;
// }

// // yes choice
// subSets(newStr + str.charAt(idx), idx + 1, str);

// // no choice
// subSets(newStr, idx + 1, str);
// }

// // or
// // By StrinBuilder

// public static void subSets2(StringBuilder newStr, int idx, String str) {
// if (idx == str.length()) {
// if (newStr.length() == 0) {
// System.out.println("null");
// } else {
// System.out.println(newStr);
// }
// return;
// }

// // including current character
// subSets2(newStr.append(str.charAt(idx)), idx + 1, str);
// newStr.deleteCharAt(newStr.length() - 1); // backtrack .... deleteing last
// character

// // excluding current character
// subSets2(newStr, idx + 1, str);
// }

// public static void main(String args[]) {
// System.out.println("By String");
// subSets("", 0, "abc");

// System.out.println("By Stringbuilder");
// subSets2(new StringBuilder(""), 0, "abc");

// }

// }

// //
// ****************************************************************************************************************
// // find all permutations of a string

// public class backtracking {

// public static void findPermutations(String str, String ans) {
// //base case
// if (str.length() == 0) {
// System.out.println(ans);
// }

// //recursion
// for (int i = 0; i < str.length(); i++) {
// char curr = str.charAt(i);
// String newstr = str.substring(0, i) + str.substring(i + 1);
// findPermutations(newstr, ans + curr);
// }
// }

// public static void main(String args[]) {
// findPermutations("abc", "");
// }

// }

// //
// ****************************************************************************************************************
// // n Queens

// public class backtracking {

// static int count = 0;

// public static void printArr(char[][] arr) {
// System.out.println("-----------N queens--------------");

// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }

// public static boolean isSafe(char[][] arr, int row, int col) {

// // vertical up (column const)
// for (int i = row - 1; i >= 0; i--) {
// if (arr[i][col] == 'Q') {
// return false;
// }
// }

// // left diagonal (row -- , col --)
// for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
// if (arr[i][j] == 'Q') {
// return false;
// }
// }

// // right diagonal
// for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
// if (arr[i][j] == 'Q') {
// return false;
// }
// }

// return true;
// }

// public static void nQueens(char[][] arr, int row) {
// if (row == arr.length) {
// printArr(arr);
// count++;
// return;
// }

// for (int i = 0; i < arr.length; i++) {
// if (isSafe(arr, row, i)) {
// arr[row][i] = 'Q';
// nQueens(arr, row + 1);
// arr[row][i] = '.';
// }
// }

// }

// public static void initialization(int n) {
// char[][] arr = new char[n][n];
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// arr[i][j] = '.';
// }
// }

// nQueens(arr, 0);

// }

// public static void main(String args[]) {
// initialization(4);
// System.out.println("Total no of sol : " + count);
// }

// }

// // or *************************************************
// // if want to print only one sol

// public class backtracking {

// public static void printArr(char[][] arr) {
// System.out.println("-----------N queens--------------");

// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }

// public static boolean isSafe(char[][] arr, int row, int col) {

// // vertical up (column const)
// for (int i = row - 1; i >= 0; i--) {
// if (arr[i][col] == 'Q') {
// return false;
// }
// }

// // left diagonal (row -- , col --)
// for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
// if (arr[i][j] == 'Q') {
// return false;
// }
// }

// // right diagonal
// for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
// if (arr[i][j] == 'Q') {
// return false;
// }
// }

// return true;
// }

// public static boolean nQueensPrintOneSol(char[][] arr, int row) {
// if (row == arr.length) {
// printArr(arr);
// return true;
// }

// for (int i = 0; i < arr.length; i++) {
// if (isSafe(arr, row, i)) {
// arr[row][i] = 'Q';
// if (nQueensPrintOneSol(arr, row + 1)) {
// return true;
// }
// arr[row][i] = '.';
// }
// }

// return false;

// }

// public static void initialization(int n) {
// char[][] arr = new char[n][n];
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// arr[i][j] = '.';
// }
// }

// nQueensPrintOneSol(arr, 0);

// }

// public static void main(String args[]) {
// initialization(5);
// }

// }

// //****************************************************************************************************************
// // grid ways

// public class backtracking {

// public static int gridWays(int row, int col, int m, int n) {
// if (row == m - 1 && col == n - 1) {
// return 1;
// }
// if (row == m || col == n) {
// return 0;
// }

// return gridWays(row + 1, col, m, n) + gridWays(row, col + 1, m, n);
// }

// public static void main(String args[]) {

// int m = 3, n = 3;
// System.out.println("total no of ways " + gridWays(0, 0, m, n));
// }
// }

// // ********************************************
// // grid ways optimised approach Mathematically ...........for explanation
// refer notes
// // note : bina notes refer kiye code ka concept nhi samjega

// public class backtracking {

// public static int factorial(int n) {
// int fact = 1;
// for (int i = 1; i <= n; i++) {
// fact = fact * i;
// }

// return fact;
// }

// public static int gridWays(int m, int n) {
// int totalMoves = m - 1 + n - 1;
// int identicalMoves1 = m - 1;
// int identicalMoves2 = n - 1;

// int totalWays = factorial(totalMoves) / (factorial(identicalMoves1) *
// factorial(identicalMoves2));

// return totalWays;
// }

// public static void main(String args[]) {

// int m = 3, n = 3;
// System.out.println("total no of ways : " + gridWays(m, n));

// }

// }

// //
// ****************************************************************************************************************
// // sudoko solver

// public class backtracking {

// public static void printArr(int[][] arr) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }

// public static boolean isSafe(int[][] arr, int row, int col, int digit) {

// for (int i = 0; i < arr.length; i++) {
// if (arr[i][col] == digit) {
// return false;
// }

// if (arr[row][i] == digit) {
// return false;
// }
// }

// int sr = (row / 3) * 3;
// int sc = (col / 3) * 3;

// for (int i = sr; i < sr + 3; i++) {
// for (int j = sc; j < sc + 3; j++) {
// if (arr[i][j] == digit) {
// return false;
// }
// }
// }

// return true;
// }

// public static boolean sudokoSolver(int[][] arr, int row, int col) {
// if (row == arr.length) {
// row = 0;
// col = col + 1;
// }

// if (col == arr.length) {
// return true;
// }

// if (arr[row][col] != 0) {
// return sudokoSolver(arr, row + 1, col);
// }

// for (int i = 1; i <= arr.length; i++) {
// if (isSafe(arr, row, col, i)) {
// arr[row][col] = i;
// if (sudokoSolver(arr, row + 1, col)) {
// return true;
// }
// arr[row][col] = 0;
// }
// }

// return false;
// }

// public static void main(String args[]) {

// int[][] sudoko = {
// { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
// { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
// { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
// { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
// { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
// { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
// { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
// { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
// { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
// };

// if (sudokoSolver(sudoko, 0, 0)) {
// System.out.println("solution exist");
// printArr(sudoko);
// } else {
// System.out.println("Solution does not exist");
// }
// }

// }
