// tilling problem

// public class recursion2 {

// public static int tillingProblem(int n) {

// // base case
// if (n == 1 || n == 2) {
// return n;
// }
// // return tillingProblem(n - 1) + tillingProblem(n - 2);

// // or

// // kaam
// // vertical choice
// int fm1 = tillingProblem(n - 1);

// // horizontal choice
// int fm2 = tillingProblem(n - 2);

// int totWays = fm1 + fm2;

// return totWays;
// }

// public static void main(String[] args) {
// int n = 4;
// System.out.println();
// System.out.println(tillingProblem(n));
// }
// }

// *****************************************************************************************************************

// remove duplicated in a String

// public class recursion2 {

// public static void removeDuplicates(String str, StringBuilder newstr,
// boolean[] map, int n) {
// if (n == str.length()) {
// System.out.println(newstr);
// return;
// }

// char character = str.charAt(n);
// int index = character - 'a';

// if (map[index] == true) {
// removeDuplicates(str, newstr, map, n + 1);
// } else {
// map[index] = true;
// removeDuplicates(str, newstr.append(character), map, n + 1);
// }

// // System.out.println(newstr);

// }

// public static void main(String[] args) {
// String str = "appnnacollege";
// System.out.println();
// removeDuplicates(str, new StringBuilder(""), new boolean[26], 0);
// }
// }

// or

// public class recursion2 {

// public static void removeDuplicates(String str, String newstr, boolean[] map,
// int n) {
// if (n == str.length()) {
// System.out.println(newstr);
// return;
// }

// char character = str.charAt(n);
// int index = character - 'a';

// if (map[index] == true) {
// removeDuplicates(str, newstr, map, n + 1);
// } else {
// map[index] = true;
// removeDuplicates(str, newstr + character, map, n + 1);
// }

// // for dry run uncomment below line
// // System.out.println(newstr);

// }

// public static void main(String[] args) {
// String str = "appnnacollege";
// System.out.println();
// removeDuplicates(str, new String(""), new boolean[26], 0);
// }
// }
// ********************************************************************************************************************

// friends pairing problem

// public class recursion2 {

// public static int friendsPairing(int n) {
// if (n == 1 || n == 2) // base case
// {
// return n;
// }
// // return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);

// // or

// // choices
// int fm1 = friendsPairing(n - 1); // single

// int fm2 = friendsPairing(n - 2); // pair
// int pairWays = (n - 1) * fm2;

// // total possible ways
// int totWays = fm1 + pairWays;

// return totWays;

// }

// public static void main(String[] args) {
// System.out.println(friendsPairing(3));
// }
// }

// *******************************************************************************************************************

// binary string problem

// public class recursion2 {

// public static void binaryStrings(int n, int lastPlace, String str) {
// if (n == 0) {
// System.out.println(str);
// return;
// }
// binaryStrings(n - 1, 0, str + "0");
// if (lastPlace == 0) {
// binaryStrings(n - 1, 1, str + "1");
// }
// }

// public static void main(String[] args) {
// binaryStrings(3, 0, new String(""));
// }
// }

// Note : agar upar ke same code ko stringBuilder se karte toh hame last ka
// digit delete bhi karna padta jaise jiase backtrack hote aur voh thoda complex
// ho jata isliye string se kiya hai