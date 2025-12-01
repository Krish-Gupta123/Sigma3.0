// // valid parentheses
// //
// ***********************************************************************************************

// import java.util.*;

// public class stacksPart2 {

// public static boolean isValid(String str) { // O(n)
// Stack<Character> s = new Stack<>();

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);

// // opening
// if (ch == '(' || ch == '{' || ch == '[') {
// s.push(ch);
// }

// // closing
// else {
// if (s.isEmpty()) {
// return false;
// }
// if ((s.peek() == '(' && ch == ')') ||
// (s.peek() == '{' && ch == '}') ||
// (s.peek() == '[' && ch == ']')) {

// s.pop();
// } else {
// return false;
// }
// }
// }

// if (s.isEmpty()) {
// return true;
// } else {
// return false;
// }
// }

// public static void main(String args[]) {
// String str = "()({})[]";
// System.out.println(isValid(str));
// }

// }

// // duplicate parentheses
// //
// ***********************************************************************************************

// import java.util.*;

// public class stacksPart2 { // O(n)

// public static boolean isDuplicate(String str) {
// Stack<Character> s = new Stack<>();

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);

// // closing
// if (ch == ')') {
// int count = 0;
// while (s.peek() != '(') {
// s.pop();
// count++;
// }

// if (count < 1) {
// return true; // duplicate
// } else {
// s.pop(); // opening pair
// }
// } else {
// s.push(ch); // opening pair and other operators/operands
// }
// }

// return false;

// }

// public static void main(String args[]) {
// String str = "((a+b)+(c+d))";
// System.out.println(isDuplicate(str));
// }
// }

// // Max Rectangular Area in Histogram
// //
// ***********************************************************************************************

// import java.util.*;

// public class stacksPart2 { // O(n) .... optimized

// public static void maxArea(int heights[]) {
// int maxArea = 0;
// int nsr[] = new int[heights.length];
// int nsl[] = new int[heights.length];

// Stack<Integer> s = new Stack<>();

// // next smaller right O(n)
// for (int i = heights.length - 1; i >= 0; i--) {
// while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
// s.pop();
// }

// if (s.isEmpty()) {
// nsr[i] = heights.length;
// } else {
// nsr[i] = s.peek();
// }

// s.push(i);
// }

// // next smaller left O(n)
// s = new Stack<>();

// for (int i = 0; i < heights.length; i++) {
// while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
// s.pop();
// }

// if (s.isEmpty()) {
// nsl[i] = -1;
// } else {
// nsl[i] = s.peek();
// }
// s.push(i);
// }

// // calculate area O(n)
// for (int i = 0; i < heights.length; i++) {
// int height = heights[i];
// int width = nsr[i] - nsl[i] - 1;
// int area = height * width;

// maxArea = Math.max(maxArea, area);
// }

// System.out.println("Max area = " + maxArea);

// }

// public static void main(String args[]) {
// int[] arr = { 2, 1, 5, 6, 2, 3 };
// maxArea(arr);
// }
// }