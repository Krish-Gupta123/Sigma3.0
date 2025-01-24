// print numbers from n to 1 (Decreasing order)

// public class recursion1 {

// public static void printDec(int n) {
// if (n == 0)//base case
// {
// return;
// }
// System.out.println(n);
// printDec(n - 1);//recursion
// }

// public static void main(String[] args) {
// int n = 10;
// printDec(n);
// }
// }

// **********************************************************************************************************

// print numbers from 1 to n (Increasing order)

// public class recursion1 {

// public static void printDec(int n) {
// if (n == 0)// base case
// {
// return;
// }
// printDec(n - 1);// recursion
// System.out.println(n);

// }

// public static void main(String[] args) {
// int n = 10;
// printDec(n);
// }
// }

// **********************************************************************************************************

// print factorial of a number n
// TC = O(n) and SC = O(n)

// public class recursion1 {

// public static int factorial(int n) {
// if (n == 1) {
// return 1;
// }

// // return n * factorial(n - 1);// recurison

// // or

// int fn = n * factorial(n - 1);// recursion
// return fn;
// }

// public static void main(String[] args) {
// int n = 5;
// System.out.println(factorial(n));
// }
// }

// **********************************************************************************************************

// print sum of first n natural numbers
// TC = O(n) and SC = O(n)

// public class recursion1 {

// public static int calcSum(int n) {
// if (n == 1)// base case
// {
// return 1;
// }

// // return n + calcSum(n - 1); // recursion

// // or

// int Snm1 = calcSum(n - 1);//Snm1 = S n minus 1
// int Sn = n + Snm1;
// return Sn;
// }

// public static void main(String[] args) {
// int n = 5;
// System.out.println(calcSum(n));
// }
// }

// **********************************************************************************************************

// print Nth fibonacci number
// TC = O(2^n) and SC = O(n)

// public class recursion1 {

// public static int fibo(int n) {
// if (n == 0 || n == 1)// base case
// {
// return n;
// }

// // return fibo(n - 1) + fibo(n - 2);

// // or

// int fnm1 = fibo(n - 1);// fnm1 = f(n minus 1)
// int fnm2 = fibo(n - 2);// fnm2 = f(n minus 2)
// int fn = fnm1 + fnm2;
// return fn;
// }

// public static void main(String[] args) {
// int n = 5;
// System.out.println(fibo(n));
// }
// }

// OR OR OR OR OR OR OR OR OR OR

// fibonacci series iterative approach
// TC = O(n) and SC = O(1)

// public class recursion1 {
// public static void main(String[] args) {

// int n = 5;
// int f0 = 0;
// int f1 = 1;
// int curr = 0;
// for (int i = 2; i <= n; i++) {
// curr = f0 + f1;
// f0 = f1;
// f1 = curr;
// }

// System.out.println(curr);
// }
// }

// **********************************************************************************************************

// check if array is sorted or not
// TC = O(n) and SC = O(n)

// public class recursion1 {

// public static boolean isSorted(int[] arr, int i) {
// if (i == arr.length - 1)// base case
// {
// return true;
// }

// if (arr[i] > arr[i + 1]) {
// return false;
// }
// return isSorted(arr, i + 1);
// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4 };
// System.out.println(isSorted(arr, 0));
// }
// }

// **********************************************************************************************************

// find the first occurance of an element in an array
// TC = O(n) and SC = O(n)

// public class recursion1 {

// public static int firstOccurance(int[] arr, int target, int i) {
// if (i == arr.length) {
// return -1;
// }

// if (arr[i] == target) {
// return i;
// }

// return firstOccurance(arr, target, i + 1);
// }

// public static void main(String[] args) {
// int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
// System.out.println(firstOccurance(arr, 5, 0));
// }
// }

// **********************************************************************************************************

// find the last occurance of an element in an array

// first occurance ka code bhi likh sakte recursion ka upar wala ....... index
// last wala pass karke main func mai aur i-1 kardo recursion mai i+1 ke jagah

// public class recursion1 {

// public static int lastOccurance(int[] arr, int key, int i) {
// if (i == arr.length)//base case
// {
// return -1;
// }

// int index = lastOccurance(arr, key, i + 1);

// if (index == -1 && arr[i] == key) //index == -1 basically yeh bol rha hai ke
// agar index == -1 tabhi he compare karo key ko uska current element ke sath
// aur agar equal hai key aur arr[i] toh uske i ke value index variable mai
// daldo taaki wapas aage compare na kare
// {
// return i;
// }

// return index;
// }

// public static void main(String[] args) {
// int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
// System.out.println(lastOccurance(arr, 5, 0));
// }
// }

// **********************************************************************************************************

// print x^n
// TC = O(n) and SC = O(n)

// public class recursion1 {

// public static int power(int x, int n) {
// if (n == 0) {
// return 1;
// }

// int xnm1 = power(x, n - 1);// xnm1 = x (n minus 1)
// int xn = x * xnm1;
// return xn;

// // or

// // return x * power(x, n - 1);
// }

// public static void main(String[] args) {
// System.out.println();// apna terminal mai output mai extra numbers aate hai
// isliye likha hai yeh bas
// System.out.println(power(2, 10));
// }
// }

// OR OR OR OR OR OR OR OR OR

// public class recursion1 {

// public static int power(int x, int n) {
// if (n == 0) {
// return 1;
// }

// int halfPowerSq = power(x, n / 2) * power(x, n / 2);

// // n is odd
// if (n % 2 != 0) {
// halfPowerSq = x * halfPowerSq;
// }

// return halfPowerSq;
// }

// public static void main(String[] args) {
// System.out.println();// apna terminal mai output mai extra numbers aate hai
// isliye likha hai yeh bas
// System.out.println(power(2, 10));
// }
// }

// OR OR OR OR OR OR OR OR OR

// public class recursion1 {

// public static int power(int x, int n) {
// if (n == 0) {
// return 1;
// }

// int halfPower = power(x, n / 2);
// int halfPowerSq = halfPower * halfPower;

// // n is odd
// if (n % 2 != 0) {
// halfPowerSq = x * halfPowerSq;
// }

// return halfPowerSq;
// }

// public static void main(String[] args) {
// System.out.println();// apna terminal mai output mai extra numbers aate hai
// isliye likha hai yeh bas
// System.out.println(power(2, 10));
// }
// }