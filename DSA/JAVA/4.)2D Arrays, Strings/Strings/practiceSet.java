
// ***************************************************************************************************************
// question 1
// Count how many times lowercase vowels occurred in a String entered by the
// user.

// import java.util.*;

// public class practiceSet {
// public static void main(String[] args) {
// String str = "My name is Krish";
// int count = 0;
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
// count++;
// }

// }
// System.out.println("no of times lowercase vowels occured = " + count);
// }
// }

// *******************************************************************************************************************
// Question 2
// What will be the output of the following code?
// public class practiceSet {
// public static void main(String args[]) {
// String str = "ShradhaDidi";
// String str1 = "ApnaCollege";
// String str2 = "ShradhaDidi";
// System.out.println(str.equals(str1) + " " + str.equals(str2));
// }
// }
// output :- false true

// ******************************************************************************************************************
// Question 3
// What will be the output of the following code?
// public class practiceSet {
// public static void main(String args[]) {
// String str = "ApnaCollege".replace("l", "");
// System.out.println(str);
// }
// }
// output :- ApnaCoege

// ***************************************************************************************************************
// question 4
// determine if 2 strings are anagrams of each other

// import java.util.*;

// public class practiceSet {

// public static boolean isAnagrams(String str1, String str2) {
// if (str1.length() == str2.length()) {
// str1 = str1.toLowerCase();
// str2 = str2.toLowerCase();

// char str1charArr[] = str1.toCharArray();
// char str2charArr[] = str2.toCharArray();

// Arrays.sort(str1charArr);
// Arrays.sort(str2charArr);

// return Arrays.equals(str1charArr, str2charArr);

// } else {
// return false;
// }
// }

// public static void main(String[] args) {
// System.out.println(isAnagrams("race", "care"));
// }
// }
