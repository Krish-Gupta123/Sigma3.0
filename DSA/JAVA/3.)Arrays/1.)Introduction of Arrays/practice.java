// ARRAYS(PART 1)

// calculating length of an array

// public class practice {
// public static void main(String args[]) {
// int arr[] = new int[50];
// int arr2[] = { 1, 2, 3, 4, 5 };

// System.out.println(arr.length);
// System.out.println(arr2.length);
// }
// }

// **************************************************************************************************************

// calculating percentage of an student with 3 subject marks phy , chem amd math
// import java.util.*;

// public class practice {
// public static void main(String args[]) {
// int marks[] = new int[100];
// Scanner sc = new Scanner(System.in);

// System.out.println("enter marks of phy, chem and maths : ");
// marks[0] = sc.nextInt();
// marks[1] = sc.nextInt();
// marks[2] = sc.nextInt();

// System.out.println("Total percentage : " + (marks[0] + marks[1] + marks[2]) /
// 3 + "%");

// sc.close();
// }
// }

// **************************************************************************************************************

// passing arrrays to functions(arrays are always pass by reference)

// public class practice {
// public static void update(int numbers[]) {
// for (int i = 0; i < numbers.length; i++) {
// numbers[i] = numbers[i] + 5;
// }
// }

// public static void main(String args[]) {
// int numbers[] = { 60, 65, 98 };
// update(numbers);

// for (int i = 0; i < numbers.length; i++) {
// System.out.println(numbers[i]);
// }
// }
// }

// **************************************************************************************************************
// linear search

// public class practice {
// public static int linearSearch(int numbers[], int key)

// {
// for (int i = 0; i < numbers.length; i++) {
// if (numbers[i] == key) {
// return i;
// }
// }
// return -1;
// }

// public static void main(String args[]) {
// int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
// int key = 10;

// int index = linearSearch(arr, key);

// if (index == -1) {
// System.out.print("elemnt not found");
// } else {
// System.out.println("element found at index : " + index);
// }
// }
// }

// **************************************************************************************************************

// find smallest element in the array

// public class practice {
// public static void smallest(int numbers[]) {
// int small = Integer.MAX_VALUE;

// for (int i = 0; i < numbers.length; i++) {
// if (small > numbers[i]) {
// small = numbers[i];
// }
// }

// System.out.print("smallest element of array is : " + small);
// }

// public static void main(String args[]) {
// int numbers[] = { 2, 4, 3, 1, 6, 7 };
// smallest(numbers);
// }
// }

// **************************************************************************************************************

// binary search

// public class practice {

// public static int binarySearch(int numbers[], int key) {
// int n = numbers.length;
// int start = 0;
// int end = n - 1;

// while (start <= end) {
// int mid = (start + end) / 2;

// if (numbers[mid] == key) {
// return mid;
// } else if (numbers[mid] < key) {
// start = mid + 1;
// } else {
// end = mid - 1;
// }

// }
// return -1;

// }

// public static void main(String args[]) {
// int numbers[] = { 2, 4, 6, 8, 10, 12 };
// int key = 10;
// int index = binarySearch(numbers, key);

// if (index == -1) {
// System.out.print("elemnt not found");
// } else {
// System.out.println("element found at index : " + index);
// }

// }
// }

// **************************************************************************************************************

// reverse an array

// public class practice {
// public static void reverse(int arr[]) {
// int first = 0;
// int last = arr.length - 1;
// while (first < last)

// {
// //swapping
// int temp = arr[first];
// arr[first] = arr[last];
// arr[last] = temp;

// first++;
// last--;
// }
// }

// public static void main(String args[]) {
// int arr[] = { 2, 5, 3, 10, 6 };
// reverse(arr);

// // printing reversed array
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// or

// public class practice {
// public static void reverse(int arr[]) {

// for (int first = 0, last = arr.length - 1; first < last; first++, last--) {
// // swapping
// int temp = arr[first];
// arr[first] = arr[last];
// arr[last] = temp;

// }
// }

// public static void main(String args[]) {
// int arr[] = { 2, 5, 3, 10, 6 };
// reverse(arr);

// // printing reversed array
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// or
// unpreferable method as it takes extra spaces

// public class practice {
// public static void reverse(int arr[], int arr2[]) {
// for (int i = 0, j = arr.length - 1; i < arr2.length; i++, j--) {
// arr2[i] = arr[j];
// }
// }

// public static void main(String args[]) {
// int arr[] = { 2, 5, 3, 10, 7 };
// int arr2[] = new int[arr.length];

// reverse(arr, arr2);

// // printing reversed array
// for (int i = 0; i < arr2.length; i++) {
// System.out.print(arr2[i] + " ");
// }
// }
// }

// ****************************************************************************************************************

// print pairs of array

// public class practice {
// public static void printPairs(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// System.out.print("(" + arr[i] + "," + arr[j] + ")");
// }
// System.out.println();
// }
// }

// public static void main(String args[]) {
// int arr[] = { 2, 4, 8, 10, 12, 14 };
// printPairs(arr);
// }
// }

// ****************************************************************************************************************

// print subarrays

// public class practice {
// public static void printsubarrays(int numbers[]) {
// int ts = 0; // total subpairs
// for (int i = 0; i < numbers.length; i++) {
// for (int j = i; j < numbers.length; j++) {
// for (int k = i; k <= j; k++) {
// System.out.print(numbers[k] + " ");// printing subarrays
// }
// ts++;
// System.out.println();
// }
// System.out.println();
// }
// System.out.print("total subpairs = " + ts);
// }

// public static void main(String args[]) {
// int num[] = { 2, 4, 6, 8, 10 };
// printsubarrays(num);
// }
// }

// **************************************************************************************************************

// print sum of subarrays(hw)

// public class practice {
// public static void printSubarrays(int numbers[]) {
// for (int i = 0; i < numbers.length; i++) {
// for (int j = i; j < numbers.length; j++) {
// int sum = 0;
// for (int k = i; k <= j; k++) {
// System.out.print(numbers[k] + " ");
// sum = sum + numbers[k];

// }
// System.out.print("sum = " + sum);
// System.out.println();
// }
// System.out.println();
// }
// }

// public static void main(String args[]) {
// int numbers[] = { 1, 2, 3, 4, 5 };
// printSubarrays(numbers);
// }
// }

// **************************************************************************************************************
// **************************************************************************************************************
// **************************************************************************************************************
// **************************************************************************************************************
// **************************************************************************************************************

// ARRAYS(PART 2)

// Max Subarray Sum(BRUTE FORCE)

// public class practice {
// public static void brute(int number[]) {
// int currSum = 0;
// int maxSum = Integer.MIN_VALUE;
// for (int i = 0; i < number.length; i++) {
// for (int j = i; j < number.length; j++) {
// currSum = 0;
// for (int k = i; k <= j; k++) {
// currSum += number[k];

// }
// System.out.print(currSum + " ");
// if (maxSum < currSum) {
// maxSum = currSum;
// }

// }
// }
// System.out.println("Max sum of subarray : " + maxSum);
// }

// public static void main(String args[]) {
// int numbers[] = { 2, 4, 6, 8, 10 };
// brute(numbers);
// }
// }

// **************************************************************************************************************
// Max Subarray Sum(PREFIX SUM)
// public class practice {
// public static void prefix(int arr[]) {
// int prefix[] = new int[arr.length];
// prefix[0] = arr[0];

// int currSum = 0;
// int maxSum = Integer.MIN_VALUE;

// for (int i = 1; i < prefix.length; i++) {
// prefix[i] = arr[i] + prefix[i - 1];
// }

// for (int i = 0; i < prefix.length; i++) {
// int start = i;
// for (int j = i; j < prefix.length; j++) {
// int end = j;
// currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
// System.out.print(currSum + " ");
// if (maxSum < currSum) {
// maxSum = currSum;
// }
// }

// }
// System.out.println();
// System.out.println("Max sum of subarray : " + maxSum);
// }

// public static void main(String args[]) {
// int numbers[] = { 2, 4, 6, 8, 10 };
// prefix(numbers);
// }
// }

// **************************************************************************************************************

// Max Subarray Sum(KADANE'S METHOD)

// public class practice {
// public static void kadane(int numbers[]) {
// int currSum = 0;
// int maxSum = Integer.MIN_VALUE;

// for (int i = 0; i < numbers.length; i++) {
// currSum = currSum + numbers[i];
// if (currSum < 0) {
// currSum = 0;
// }
// maxSum = Math.max(maxSum, currSum);

// }
// System.out.println("max sum = " + maxSum);
// }

// public static void main(String args[]) {
// int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
// kadane(numbers);
// }
// }

// or*************************************************************

// Max Subarray Sum(KADANE'S METHOD)
// (for all negative elements present in our array)
// (HW)

// public class practice {
// public static void kadanes(int numbers[]) {
// int currSum = 0;
// int maxSum = Integer.MIN_VALUE;

// for (int i = 0; i < numbers.length; i++) {
// currSum += numbers[i];
// if (currSum > maxSum) {
// maxSum = currSum;
// }

// if (currSum < 0) {
// currSum = 0;
// }

// }
// System.out.print("max element : " + maxSum);

// }

// public static void main(String args[]) {
// int numbers[] = { -3, -1, -6, -4, -10 };
// kadanes(numbers);
// }
// }

// **************************************************************************************************************
// Trapping RainWater
// public class practice {
// public static void trapingRainWater(int height[]) {
// int leftMax[] = new int[height.length];

// leftMax[0] = height[0];
// for (int i = 1; i < height.length; i++) {
// leftMax[i] = Math.max(height[i], leftMax[i - 1]);
// }

// int rightMax[] = new int[height.length];

// rightMax[height.length - 1] = height[height.length - 1];
// for (int j = height.length - 2; j >= 0; j--) {
// rightMax[j] = Math.max(height[j], rightMax[j + 1]);
// }

// int trappedWater = 0;
// int width = 1;// given in question
// for (int i = 0; i < height.length; i++) {
// int waterLevel = Math.min(leftMax[i], rightMax[i]);
// trappedWater += (waterLevel - height[i]) * width;
// }

// System.out.println("total water trapped = " + trappedWater);
// }

// public static void main(String args[]) {
// int numbers[] = { 4, 2, 0, 6, 3, 2, 5 };
// trapingRainWater(numbers);
// }
// }

// or
// (optimized solution)

// public class practice

// {
// public static int trapingRainWater(int arr[])

// {
// int n = arr.length;
// int left = 0;
// int right = n - 1;
// int leftMax = arr[0];
// int rightMax = arr[n - 1];
// int trappedWater = 0;

// while (left < right) {
// if (leftMax < rightMax) {
// left++;
// leftMax = Math.max(leftMax, arr[left]);
// trappedWater += leftMax - arr[left];

// } else {
// right--;
// rightMax = Math.max(rightMax, arr[right]);
// trappedWater += rightMax - arr[right];

// }

// }
// return trappedWater;

// }

// public static void main(String args[]) {
// int numbers[] = { 4, 2, 0, 6, 3, 2, 5 };
// System.out.println(trapingRainWater(numbers));
// }

// }

// **************************************************************************************************************
// Buy and Sell Stocks

// import java.util.*;

// public class practice {
// public static void RainWater(int numbers[]) {
// int profit = 0;
// int buyprice = Integer.MAX_VALUE;
// int max = 0;
// for (int i = 0; i < numbers.length; i++) {
// if (buyprice < numbers[i]) {
// profit = numbers[i] - buyprice;
// max = Math.max(max, profit);
// } else {
// buyprice = numbers[i];
// }

// }
// System.out.print("max profit = " + max);

// }

// public static void main(String args[]) {
// int numbers[] = { 7, 1, 5, 3, 6, 4 };
// RainWater(numbers);
// System.out.print("hello");

// }
// }

// **************************************************************************************************************
