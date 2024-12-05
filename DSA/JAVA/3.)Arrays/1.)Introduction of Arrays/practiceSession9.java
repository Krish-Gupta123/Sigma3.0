// Container with most water problem

// with brute force method(O(n^2))

// public class practiceSession9 {
// public static void containerWithMaxWater(int height[]) {

// int maxArea = Integer.MIN_VALUE;
// for (int i = 0; i < height.length; i++) {
// for (int j = i + 1; j < height.length; j++) {
// int breadth = j - i;
// int length = Math.min(height[i], height[j]);
// int area = breadth * length;
// maxArea = Math.max(area, maxArea);

// }
// }
// System.out.print("Max area = " + maxArea);

// }

// public static void main(String args[]) {
// int numbers[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
// containerWithMaxWater(numbers);

// }
// }

// or

// two pointer approch(O(n))

// public class practiceSession9 {
// public static void containerWithMaxWater(int height[]) {
// int left = 0;
// int right = height.length - 1;

// int maxArea = Integer.MIN_VALUE;

// while (left < right)//(sir ne <= use kiya tha yaha par voh galat hai khali <
// aaega) {
// int length = Math.min(height[left], height[right]);
// int breadth = right - left;
// int area = length * breadth;
// maxArea = Math.max(maxArea, area);

// if (height[left] <= height[right]) {
// left++;
// } else {
// right--;
// }

// }
// System.out.print("Max area = " + maxArea);
// }

// public static void main(String args[]) {

// int numbers[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
// containerWithMaxWater(numbers);
// }

// }

// ***********************************************************************************************************

// lonely numbers in array list

// import java.util.ArrayList;
// import java.util.Arrays;

// public class practiceSession9 {
// public static ArrayList<Integer> lonelyNumbers(int arr[]) {

// ArrayList<Integer> list = new ArrayList<>();
// Arrays.sort(arr);// O(nlogn);

// for (int i = 0; i < arr.length; i++) {
// if (i == 0) {
// if (arr[i] != arr[i + 1] && arr[i] + 1 != arr[i + 1]) {
// list.add(arr[i]);
// }
// } else if (i == arr.length - 1) {
// if (arr[i] != arr[i - 1] && arr[i] - 1 != arr[i - 1]) {
// list.add(arr[i]);
// }
// } else {
// if (arr[i] != arr[i + 1] && arr[i] + 1 != arr[i + 1] && arr[i] != arr[i - 1]
// && arr[i] - 1 != arr[i - 1]) {
// list.add(arr[i]);
// }
// }
// }
// return list;
// }

// public static void main(String args[]) {

// int numbers[] = { 10, 6, 5, 8 };
// System.out.println(lonelyNumbers(numbers));
// }

// }
