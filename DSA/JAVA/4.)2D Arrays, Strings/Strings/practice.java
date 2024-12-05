// input in string

// import java.util.*;

// public class practice {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// String str, str2;
// System.out.print("enter the string : ");
// str = sc.next();// takes input only of one word

// sc.nextLine();
// // The issue in your code arises because of the way the Scanner class handles
// // input. When sc.next() is called, it reads a single word and leaves the
// // newline character in the input buffer. When sc.nextLine() is subsequently
// // called, it reads the remainder of the line, which is just the newline
// // character left over from the previous input.

// // To fix this, you can consume the leftover newline character after the
// // sc.next() call by adding an extra sc.nextLine() call. Here's the corrected
// // version of your code:

// System.out.println(str);
// System.out.print("enter the string : ");
// str2 = sc.nextLine();// takes input of whole line

// System.out.println(str2);

// sc.close();

// }
// }

// ***************************************************************************************************************
// length() func for String

// import java.util.*;

// public class practice {
// public static void main(String[] args) {

// String str = "Krish Gupta";
// System.out.println(str.length());
// Scanner sc = new Scanner(System.in);
// String str2;

// System.out.print("enter the string : ");
// str2 = sc.nextLine();// takes input of whole line

// System.out.println(str2);
// System.out.println(str2.length());
// sc.close();

// }
// }

// ***************************************************************************************************************
// String concatenation

// import java.util.*;

// public class practice {
// public static void main(String[] args) {

// String firstName = "Krish";
// String lastName = " Gupta";

// String fullName = firstName + lastName;// string concatenation

// System.out.println(fullName);

// }
// }

// ***************************************************************************************************************
// String charAt Method

// import java.util.*;

// public class practice {
// public static void main(String[] args) {

// String firstName = "Krish";
// System.out.println(firstName.charAt(0));
// System.out.println(firstName.charAt(4));
// //System.out.println(firstName.charAt(6));

// }
// }

// ***************************************************************************************************************
// printing whole string using charAt() method

// import java.util.*;

// public class practice {

// public static void printLetters(String str) {
// for (int i = 0; i < str.length(); i++) {
// System.out.print(str.charAt(i) + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {

// String name = "Krish Gupta";
// printLetters(name);

// }
// }

// ***************************************************************************************************************
// check if a string is palindrome.....(INTUIT)
// eg:- "racecar","noon,"madam";

// import java.util.*;

// public class practice {
// public static boolean isPalindrome(String str) {
// int start = 0;
// int end = str.length() - 1;
// while (start <= end) {
// if (str.charAt(start) != str.charAt(end)) {
// return false;
// }
// start++;
// end--;
// }
// return true;
// }

// public static void main(String[] args) {
// String str = "moon";
// boolean result = isPalindrome(str);
// if (result) {
// System.out.print("given string is palindrome");

// } else {
// System.out.print("given string is not a palindrome");
// }
// }
// }

// (or)
// ***********************************************************************************************

// import java.util.*;

// public class practice {
// public static boolean isPalindrome(String str) {
// for (int i = 0; i < str.length() / 2; i++) {
// int n = str.length();

// if (str.charAt(i) != str.charAt(n - 1 - i)) {
// return false;// not a palindrome
// }
// }
// return true;
// }

// public static void main(String[] args) {
// String str = "racecar";
// boolean result = isPalindrome(str);
// if (result) {
// System.out.print("given string is palindrome");

// } else {
// System.out.print("given string is not a palindrome");
// }
// }
// }

// ***************************************************************************************************************
// Given a route containing 4 directions(E,W,N,S) find the shortest path to
// reach destination
// "WNEENESENNN"

// import java.util.*;

// public class practice {
// public static void shortestPath(String str) {
// int x2 = 0;
// int y2 = 0;
// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) == 'N') {
// y2++;
// } else if (str.charAt(i) == 'S') {
// y2--;
// } else if (str.charAt(i) == 'W') {
// x2--;
// } else if (str.charAt(i) == 'E') {
// x2++;
// } else {
// System.out.println("pls put a valid direction");
// return;
// }
// }
// double shortestDistance = Math.sqrt((x2 * x2) + (y2 * y2));// note x1 and y1
// are 0,0 as it starts from origin
// // formula for shortest path : sqroot((x2-x1)(x2-x1) + (y2-y1)(y2-y1))

// shortestDistance = (float)shortestDistance;

// System.out.println("shortest path = " + shortestDistance);

// }

// public static void main(String[] args) {
// String str = "WNEENESENNN";
// shortestPath(str);
// }
// }

// ***************************************************************************************************************
// (==)eqaul to operator VS (.equals) comparision

// part 1
// import java.util.*;

// public class practice {
// public static void main(String[] args) {
// String str1 = "Krish Gupta";
// String str2 = "Krish Gupta";
// String str3 = new String("Krish Gupta");

// if (str1 == str2)// (==) operator compares only address
// {
// System.out.println("str1 and str2 are equal");
// }

// if (str1 == str3)// (==) operator compares only address
// {
// System.out.println("str1 and str3 are equal");
// }
// }
// }

// part 2

// import java.util.*;

// public class practice {
// public static void main(String[] args) {
// String str1 = "Krish Gupta";
// String str2 = "Krish Gupta";
// String str3 = new String("Krish Gupta");

// if (str1.equals(str3))// (.equals) operator first compares address if address
// not equal the compares
// // character by character....and since it compares character by character if
// // required therefore .equals is considerd as a very heavy function
// {
// System.out.println("ya ya str1 and str3 are equal");
// }
// }
// }

// ***************************************************************************************************************
// java string intern method

// import java.util.*;

// public class practice {
// public static void main(String[] args) {
// String str1 = "hello";
// String str2 = new String("hello");

// String str1Intern = str1.intern();
// String str2Intern = str2.intern();

// System.out.println(str1Intern);
// System.out.println(str2Intern);
// if (str1Intern == str2Intern)// note :- intern method string pool/intern pool
// ke andar jo value store hoti
// // hai string ke usse access karta hai aur agar (str1Intern == str2Intern)
// agar
// // equal ho jate hai matlab intern pool mai jo string ka value jaha store hai
// // waha ka address same hai . becoz dono ke bich mai (==) operator hai jo
// // address compare karta hai.....agar ans true ho jata hai toh hamari pehli
// ke
// // baat prove ho jati hai isse ke string agar new keyword se banaya toh main
// // func mai new address mai banke store hota hai par indirectly voh new
// address
// // bhi intern pool ke normal existing string pe he point karta hai
// {
// System.out.println("they are equal");
// }

// }
// }

// ***************************************************************************************************************
// StringBuffer ...used to create mutable string

// import java.util.*;

// public class practice {
// public static void main(String[] args) {
// StringBuffer str = new StringBuffer("hi");//O(n)
// System.out.println(str);
// str.append("yyy");
// System.out.println(str);
// str.append("hi");
// System.out.println(str);
// //working
// //intern pool
// //"hi"
// //"hiyyy"
// //"hiyyyhi"
// //agar "hi" ayr "hiyyy" ko kisi aur ne point nhi kiya jaldi toh garbage
// collect ghar se uthwa lega unko
// }
// }

// ***************************************************************************************************************
// string functions :- substring

// import java.util.*;

// public class practice {

// // using string
// public static String substring(int si, int ei, String str) {// strings
// concatenation(+) are not thread safe
// String substr = "";
// for (int i = si; i < ei; i++) {
// substr += str.charAt(i);
// }
// return substr;
// }

// // using stringbuffer
// public static StringBuffer bufferSubstring(int si, int ei, String str) {//
// string buffer is thread safe
// StringBuffer substr = new StringBuffer("");
// for (int i = si; i < ei; i++) {
// substr.append(str.charAt(i));
// }
// return substr;
// }

// public static void main(String[] args) {
// String str = "Krish Gupta";

// // using inbuilt func
// System.out.println(str.substring(4, 8));// inbuilt func to print substring

// // using strings
// System.out.println(substring(4, 8, str));// user defined function

// // using string buffer
// System.out.println(bufferSubstring(4, 8, str));// user defined function

// }
// }

// ***************************************************************************************************************
// print largest string

// question :- for a given set of strings , print the largest
// string(lexicographic) .
// "apple", "mango", "banana"

// import java.util.*;

// //lexicographic matlab basically dictionary mai jaise hote hai words waise
// jaise koi b se chalu ho rha hai aur koi d se toh d se chalu hone wali string
// badi hai
// public class practice {

// public static String largestString(String arr[]) {
// String largest = arr[0];
// for (int i = 1; i < arr.length; i++) {
// if (largest.compareTo(arr[i]) < 0) {
// largest = arr[i];
// }
// }
// return largest;

// }

// public static void main(String[] args) {
// String fruits[] = { "apple", "mango", "banana" };
// System.out.println(largestString(fruits));
// }
// }

// ***************************************************************************************************************
// StringBuilder vs strings

// import java.util.*;

// public class practice {

// public static void usedString()// using strings
// {
// String str = "";
// for (char i = 'a'; i <= 'z'; i++) {
// str += i;
// }
// System.out.println(str);
// }

// public static void usedStringBuilder()// using stringbuilder
// {
// StringBuilder str = new StringBuilder();
// for (char i = 'a'; i <= 'z'; i++) {
// str.append(i);
// }
// System.out.println(str);
// }

// public static void main(String[] args) {
// usedString();// O(n2)
// // no of times string copies previous string = n
// // string length = m
// // TC = O(m x n) , i.e O(n2)..approx
// usedStringBuilder();// O(n)
// }
// }

// ***************************************************************************************************************
// Convert letters to uppercase..<CODE_NATTION>
// for a given string convert each of the first letter of each word to uppercase
// "hi i am shradha"

// import java.util.*;

// public class practice {

// public static void uppercase(String str) {
// StringBuffer newstr = new StringBuffer();
// newstr.append(Character.toUpperCase(str.charAt(0)));

// for (int i = 1; i < str.length(); i++) {
// if (str.charAt(i) == ' ') {
// newstr.append(str.charAt(i));
// i++;
// newstr.append(Character.toUpperCase(str.charAt(i)));
// } else {
// newstr.append(str.charAt(i));
// }
// }
// System.out.println(newstr);

// }

// public static void main(String[] args) {
// String str = "hi i am shradha";
// uppercase(str);
// }
// }

// ***************************************************************************************************************
// string compression...(AMAZON)
// "aaabbcccdd" = "a3b2c3d2"
// "abc" = "abc"..corect way
// "abc" = "a1b1c1"..wrong way ...yeh decompression hogaya string mai

// import java.util.*;

// public class practice {

// public static void compressUsingStringBuilder(String str) {
// StringBuilder newstr = new StringBuilder();
// for (int i = 0; i < str.length(); i++) {
// int count = 1;
// while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
// count++;
// i++;
// }
// newstr.append(str.charAt(i));
// if (count > 1) {
// newstr.append(count);
// }

// }
// System.out.println(newstr);

// }

// public static void compressUsingString(String str) {
// String newstr = "";
// for (int i = 0; i < str.length(); i++) {
// int count = 1;
// while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
// count++;
// i++;
// }
// newstr += str.charAt(i);
// if (count > 1) {
// newstr += count;
// }

// }
// System.out.println(newstr);

// }

// public static void main(String[] args) {
// // String str = "aaaabbcccdd";
// String str = "bbacddd";
// compressUsingString(str);// unoptimized code
// compressUsingStringBuilder(str);// optimized code...(saves time internally)
// }
// }
