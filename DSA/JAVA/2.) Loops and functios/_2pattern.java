// **************************************************************************************************************

// * * * * *
// * * * * *
// * * * * *
// * * * * *

// public class _2pattern {

// public static void main(String args[]) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= 5; j++) {
// System.out.print(" * ");
// }
// System.out.println();
// }
// }

// }

// ****************************************************************************************************************
// *
// * *
// * * *
// * * * *
// * * * * *

// public class _2pattern {

// public static void main(String args[]) {
// int n = 5;
// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= row; col++) {
// System.out.print(" * ");
// }
// System.out.println();
// }
// }

// }

// or(box pattern)

// public class _2pattern {

// public static void main(String args[]) {
// int n = 5;
// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= n; col++) {
// if (row >= col) {
// System.out.print(" * ");
// }
// }
// System.out.println();
// }
// }

// }
// **************************************************************************************************************

// * * * * *
// * * * *
// * * *
// * *
// *

// public class _2pattern {
// public static void main(String args[]) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print(" * ");
// }
// System.out.println();
// }
// }
// }

// or (box pattern)

// public class _2pattern {

// public static void main(String args[]) {
// int n = 5;
// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= n; col++) {
// if (row + col <= n + 1) {
// System.out.print(" * ");
// }
// }
// System.out.println();
// }
// }

// }

// ***********************************************************************************************

// - - - - *
// - - - * *
// - - * * *
// - * * * *
// * * * * *

// public class _2pattern {
// public static void main(String args[]) {
// int n = 5;

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// for (int k = 1; k <= i; k++) {
// System.out.print(" * ");
// }
// System.out.println();
// }
// }
// }

// or(box pattern)

// public class _2pattern {

// public static void main(String args[]) {
// int n = 5;
// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= n; col++) {
// if (row + col >= n + 1) {
// System.out.print(" * ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// }

// or

// public class _2pattern

// {
// public static void main(String[] args) {

// int n = 5;
// int total_no_of_lines = n;
// int spaces = n - 1;
// int stars = 1;

// int current_no_of_lines = 1;

// while (current_no_of_lines <= total_no_of_lines) {
// for (int i = 1; i <= spaces; i++) {
// System.out.print(" ");
// }

// for (int i = 1; i <= stars; i++) {
// System.out.print(" * ");
// }

// System.out.println();
// spaces--;
// stars++;
// current_no_of_lines++;

// }
// }
// }

// ****************************************************************************************/

// * * * * *
// * * * *
// * * *
// * *
// *

// or(box pattern )

// public class _2pattern {

// public static void main(String args[]) {
// int n = 5;
// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= n; col++) {
// if (col - row >= 0) {
// System.out.print(" * ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// }

// *****************************************************************************************************

// * *
// * *
// *
// * *
// * *

// or (box pattern)

// public class _2pattern {

// public static void main(String args[]) {
// int n = 5;
// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= n; col++) {
// // if (row == col || row + col == n + 1)
// if (row - col == 0 || row + col == n + 1) {
// System.out.print(" * ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// }

// ***************************************************************************************************

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// or (box bracket)

// public class _2pattern {

// public static void main(String args[]) {
// int n = 5;
// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= n; col++) {

// if (row >= col) {
// System.out.print(" " + col + " ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// }

// ******************************************************************************************************

// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

// or (box bracket)

// public class _2pattern {

// public static void main(String args[]) {
// int n = 5;
// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= n; col++) {

// if (row >= col) {
// System.out.print(" " + row + " ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// }

// *************************************************************************************************************

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// or(box bracket)

// public class _2pattern {

// public static void main(String args[]) {
// int n = 5;
// int x = 1;
// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= n; col++) {

// if (row >= col) {

// System.out.print(" " + x + " ");
// x++;
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// }

// ******************************************************************************************************

// hw

// * *
// * *
// * *
// * *
// * *

// public class _2pattern {

// public static void main(String args[]) {
// int n = 5;

// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= n; col++) {

// if (col == 1 || row - col == 1 || row + col == 5) {

// System.out.print(" * ");

// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// }

// ***************************************************************************************************

// A
// B C
// D E F
// G H I J
// K L M N O

// public class _2pattern {
// public static void main(String args[]) {
// int n = 5;
// char ch = 'A';
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(ch);
// ch++;
// }
// System.out.println();
// }
// }
// }

// *******************************************************************************************************

// advanced pattern course question
// Hallow rectangle

// * * * * *
// * - - - *
// * - - - *
// * - - - *
// * * * * *

// public class _2pattern {
// public static void main(String args[]) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n; j++) {
// if (i == 1 || j == 1 || i == n || j == n) {
// System.out.print(" * ");
// } else {
// System.out.print(" - ");
// }
// }
// System.out.println();
// }
// }
// }

// ************************************************************************************************************

// 0 and 1 triangle pattern

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// public class _2pattern {
// public static void main(String args[]) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {

// if ((i + j) % 2 == 0) {
// System.out.print(" 1 ");
// } else {
// System.out.print(" 0 ");
// }

// }
// System.out.println();
// }
// }
// }

// or box bracket

// public class _2pattern {
// public static void main(String args[]) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n; j++) {
// if (i >= j) {

// if ((i + j) % 2 == 0) {
// System.out.print(" 1 ");
// } else {
// System.out.print(" 0 ");
// }
// }
// }
// System.out.println();
// }
// }
// }

// *************************************************************************************************************

// Butterfly pattern

// * - - - - - - - - *
// * * - - - - - - * *
// * * * - - - - * * *
// * * * * - - * * * *
// * * * * * * * * * *
// * * * * * * * * * *
// * * * * - - * * * *
// * * * - - - - * * *
// * * - - - - - - * *
// * - - - - - - - - *
// public class _2pattern {
// public static void main(String args[]) {
// int n = 4;

// for (int i = 1; i <= n; i++) {

// for (int j = 1; j <= i; j++) {

// System.out.print(" * ");
// }

// for (int k = 1; k <= 2 * (n - i); k++)

// {
// System.out.print(" ");
// }

// for (int l = 1; l <= i; l++) {
// System.out.print(" * ");
// }

// System.out.println();
// }

// for (int i = n; i >= 1; i--) {

// for (int j = i; j >= 1; j--) {

// System.out.print(" * ");
// }

// for (int k = 1; k <= 2 * (n - i); k++)

// {
// System.out.print(" ");
// }

// for (int l = i; l >= 1; l--) {
// System.out.print(" * ");
// }

// System.out.println();
// }
// }
// }

// or(only first line perspective)

// public class _2pattern {
// public static void main(String[] args)

// {
// int n = 5;
// int spaces = 2 * n - 2;// (or 2*(n-1))
// int current_no_of_lines = 1;
// int stars = 1;
// int total_no_of_lines = n;

// while (current_no_of_lines <= total_no_of_lines) {
// for (int i = 1; i <= stars; i++) {
// System.out.print(" * ");

// }

// for (int j = 1; j <= spaces; j++) {
// System.out.print(" ");
// }

// for (int k = 1; k <= stars; k++) {
// System.out.print(" * ");
// }

// System.out.println();
// stars++;
// spaces = spaces - 2;
// current_no_of_lines++;
// }

// int stars2 = n;
// int spaces2 = 0;
// int current_no_of_lines2 = 1;

// while (current_no_of_lines2 <= total_no_of_lines) {
// for (int i = 1; i <= stars2; i++) {
// System.out.print(" * ");

// }

// for (int j = 0; j < spaces2; j++) {
// System.out.print(" ");
// }

// for (int k = 1; k <= stars2; k++) {
// System.out.print(" * ");
// }

// System.out.println();
// stars2--;
// spaces2 = spaces2 + 2;
// current_no_of_lines2++;
// }

// }
// }

// or

// public class _2pattern {
// public static void main(String[] args)

// {
// int n = 5;
// int spaces = 2 * n - 2;// (or 2*(n-1))
// int current_no_of_lines = 1;
// int stars = 1;
// int total_no_of_lines = 2 * n;

// while (current_no_of_lines <= total_no_of_lines) {
// for (int i = 1; i <= stars; i++) {
// System.out.print(" * ");

// }

// for (int j = 1; j <= spaces; j++) {
// System.out.print(" ");
// }

// for (int k = 1; k <= stars; k++) {
// System.out.print(" * ");
// }

// System.out.println();
// if (current_no_of_lines < n) {
// stars++;

// spaces = spaces - 2;
// } else if (current_no_of_lines == 5) {

// }

// else {
// stars--;
// spaces = spaces + 2;
// }
// current_no_of_lines++;
// }

// }
// }

// **********************************************************************************************

// solid rhombhus patter

// - - - - * * * * *
// - - - * * * * *
// - - * * * * *
// - * * * * *
// * * * * *

// *******************************************************************************************************

// hollow rhombhus pattern

// - - - - * * * * *
// - - - * - - - *
// - - * - - - *
// - * - - - *
// * * * * *

// **************************************************************************************************************

// diamond pattern

// - - - *
// - - * * *
// - * * * * *
// * * * * * * *
// * * * * * * *
// - * * * * *
// - - * * *
// - - - *

// **************************************************************************************************************

// Number pyramid pattern

// - - - - 1
// - - - 2-- 2
// - - 3-- 3-- 3
// - 4-- 4-- 4-- 4
// 5-- 5-- 5-- 5-- 5

// **************************************************************************************************************

// palindromic pattern with numbers pattern

// - - - - 1
// - - - 2 1 2
// - - 3 2 1 2 3
// - 4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

// **************************************************************************************************************