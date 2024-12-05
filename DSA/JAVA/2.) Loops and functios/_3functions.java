// factorial

// public class _3functions {
// public static int factorial(int n) {
// int fact = 1;
// for (int i = 1; i <= n; i++) {
// fact = fact * i;
// }
// return fact;
// }

// public static void main(String[] args) {
// System.out.print(factorial(5));
// }
// }

// ******************************************************************************************************************

// binomial coefficient
// nCr = n!/(r!*(n-r)!)

// public class _3functions {
// public static int factorial(int n) {
// int fact = 1;
// for (int i = 1; i <= n; i++) {
// fact = fact * i;
// }
// return fact;
// }

// public static int binomialCoefficient(int n, int r) {
// int n_fact = factorial(n);
// int r_fact = factorial(r);
// int nmr_fact = factorial(n - r);

// int nCr = n_fact / (r_fact * nmr_fact);
// return nCr;
// }

// public static void main(String[] args) {
// System.out.print(binomialCoefficient(5, 2));
// }
// }

// ******************************************************************************************************************

// function overloading

// using parameters

// public class _3functions {
// public static int add(int a, int b) {
// return a + b;
// }

// public static int add(int a, int b, int c) {
// return a + b + c;
// }

// public static void main(String args[]) {
// System.out.println(add(2, 4));
// System.out.print(add(5, 4, 3));
// }
// }

// using datatypes

// public class _3functions {
// public static int add(int a, int b) {
// return a + b;
// }

// public static float add(float a, float b) {
// return a + b;
// }

// public static void main(String args[]) {
// System.out.println(add(2, 4));
// System.out.print(add(5.4f, 4.1f));
// }
// }

// ******************************************************************************************************************

// prime no
// (unoptimized way)

// public class _3functions {
// public static boolean prime(int n) {
// boolean isPrime = true;

// for (int i = 2; i <= n - 1; i++) {
// if (n % i == 0) {
// isPrime = false;
// break;
// }

// }
// return isPrime;
// }

// public static void main(String args[]) {
// System.out.print(prime(12));
// }
// }

// prime no
// (optimized way )
// (****************************************IMP FOR INTERVIEWS N ALL
// **********************************************)

// public class _3functions {
// public static boolean prime(int n) {
// boolean isPrime = true;

// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// isPrime = false;
// break;
// }

// }
// return isPrime;
// }

// public static void main(String args[]) {
// System.out.print(prime(11));
// }
// }

// ****************************************************************************************

// prime no in range

// public class _3functions {
// public static boolean prime(int n) {

// // corner case
// boolean isPrime = true;
// if (n == 2) {
// isPrime = true;
// }

// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// isPrime = false;
// break;
// }

// }
// return isPrime;
// }

// public static int primeInRange(int num) {

// for (int i = 2; i <= num; i++) {
// if (prime(i)) {
// System.out.print(i + " ");
// }

// }
// return 0;

// }

// public static void main(String args[]) {
// primeInRange(100);
// }
// }

// ***************************************************************************************************************

// binary to decimal code

// public class _3functions {
// public static int binaryToDecimal(int num) {
// int power = 0;
// int decimal = 0;
// int ld;

// while (num > 0) {
// ld = num % 10;
// num = num / 10;
// decimal = decimal + (ld * (int) Math.pow(2, power));
// power++;
// }
// return decimal;
// }

// public static void main(String args[]) {
// System.out.print(binaryToDecimal(101));
// }
// }

// ***********************************************************************************************

// decimal to binary code

// public class _3functions {
// public static int decimalToBinary(int num) {
// int power = 0;
// int binary = 0;

// while (num > 0) {
// int rem = num % 2;
// num = num / 2;
// binary = binary + (rem * (int) Math.pow(10, power));
// power++;
// }
// return binary;
// }

// public static void main(String args[]) {
// System.out.print(decimalToBinary(8));
// }
// }