// 1.) merge sort for array of strings

// public class practiceSet {
// public static void printArr(String[] arr) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void mergeSort(String[] arr, int si, int ei) {
// // base case
// if (si >= ei) {
// return;
// }

// // kaam
// int mid = si + (ei - si) / 2; // (si+ei)/2
// mergeSort(arr, si, mid);// left part
// mergeSort(arr, mid + 1, ei);// right part
// merge(arr, si, mid, ei);
// }

// public static void merge(String[] arr, int si, int mid, int ei) {
// int k = 0; // iterator for temp array
// int i = si; // iterator for left part
// int j = mid + 1; // iterator for right part
// String[] temp = new String[ei - si + 1];

// while (i <= mid && j <= ei) {
// if (isAlphabeticallySmaller(arr[i], arr[j])) {
// temp[k] = arr[j];
// j++;
// } else {
// temp[k] = arr[i];
// i++;
// }
// k++;
// }

// // left part
// while (i <= mid) {
// // temp[k] = arr[i];
// // i++;
// // k++;

// // or

// temp[k++] = arr[i++];
// }

// // right part
// while (j <= ei) {
// temp[k++] = arr[j++];
// }

// // copy temp to original array
// for (k = 0, i = si; i <= ei; i++, k++) {
// arr[i] = temp[k];
// }
// }

// //return true if str2 appears before str1
// static boolean isAlphabeticallySmaller(String str1, String str2) {
// if (str1.compareTo(str2) < 0) {
// return false;
// }
// return true;
// }

// public static void main(String[] args) {
// String arr[] = { "sun", "earth", "mars", "mercury" };
// mergeSort(arr, 0, arr.length - 1);
// printArr(arr);

// }
// }

// or
// ....................................................................................

// public class practiceSet {
// public static void printArr(String[] arr) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static String[] mergeSort(String[] arr, int si, int ei) {
// // base case
// if (si >= ei) {
// String[] a = { arr[si] };
// return a;
// }

// // kaam
// int mid = si + (ei - si) / 2; // (si+ei)/2
// String[] arr1 = mergeSort(arr, si, mid);// left part
// String[] arr2 = mergeSort(arr, mid + 1, ei);// right part
// String[] arr3 = merge(arr1, arr2);

// return arr3;
// }

// public static String[] merge(String[] arr1, String[] arr2) {
// int k = 0; // iterator for temp array
// int i = 0; // iterator for left part
// int j = 0; // iterator for right part

// int m = arr1.length;
// int n = arr2.length;

// String[] temp = new String[m + n];

// while (i < m && j < n) {
// if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
// temp[k] = arr2[j];
// j++;
// } else {
// temp[k] = arr1[i];
// i++;
// }
// k++;
// }

// // left part
// while (i < m) {
// // temp[k] = arr[i];
// // i++;
// // k++;

// // or

// temp[k++] = arr1[i++];
// }

// // right part
// while (j < n) {
// temp[k++] = arr2[j++];
// }

// // returning merged array of strings
// return temp;
// }

// // return true if str2 appears before str1
// static boolean isAlphabeticallySmaller(String str1, String str2) {
// if (str1.compareTo(str2) < 0) {
// return false;
// }
// return true;
// }

// public static void main(String[] args) {
// String arr[] = { "sun", "earth", "mars", "mercury" };
// String[] a = mergeSort(arr, 0, arr.length - 1);
// System.out.println("bhai bhai");
// printArr(a);

// }
// }

// *****************************************************************************************************************

// 2.) find the element that appears majority times(more than length/2 times
// ...given in q's) in an array;

// brute force approach .... O(n2)

// public class practiceSet {

// public static int majorityElement(int[] arr) {
// int majorityCount = arr.length / 2;

// for (int i = 0; i < arr.length - 1; i++) {
// int count = 0;
// for (int j = 0; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// count++;
// }
// }
// if (count > majorityCount) {
// return arr[i];
// }

// }
// return -1;
// }

// ................................................................................................................

// optimised approach (by divide and conquer) ........ O(nlogn)

// public class practiceSet {

// public static int countInRange(int[] nums, int target, int lo, int hi) {
// int count = 0;
// for (int i = lo; i <= hi; i++) {
// if (nums[i] == target) {
// count++;
// }
// }
// return count;
// }

// public static int majorityElementRec(int[] nums, int lo, int hi) {

// //base case ; the only element in an array of size 1 is the mojority element
// if (lo == hi) {
// return nums[lo];
// }

// //recurion on left and right halves of this slice
// int mid = lo + (hi - lo) / 2;

// int left = majorityElementRec(nums, lo, mid);
// int right = majorityElementRec(nums, mid + 1, hi);

// //if the two halves agree on the majority element , return it
// if (left == right) {
// return left;
// }

// //otherwise count mojority element and return the "winner"
// int leftCount = countInRange(nums, left, lo, hi);
// int rightCount = countInRange(nums, right, lo, hi);

// return leftCount > rightCount ? left : right;

// }

// public static int majorityElement(int[] nums) {
// return majorityElementRec(nums, 0, nums.length - 1);
// }

// public static void main(String[] args) {
// int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
// System.out.println(majorityElement(nums));
// }
// }

// .....................................................................................................................

// most optimised approach ..... (TC = O(n) , SC = O(1) )

// //works only if majority element occurs more than length/2 times
// public class practiceSet {

// public static int majorityElement(int[] nums) {
// int candidate = 0;
// int count = 0;

// for (int i = 0; i < nums.length; i++) {
// if (count == 0) {
// candidate = nums[i];
// }

// if (nums[i] == candidate) {
// count++;
// } else {
// count--;
// }
// }
// return candidate;
// }

// public static void main(String[] args) {
// int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
// System.out.println(majorityElement(nums));

// }
// }

// ****************************************************************************************************

// 3.) find the inversion count in the array

// brute force approach .... O(n2)

// public class practiceSet {

// public static int inversionCount(int[] arr) {
// int invCount = 0;

// for (int i = 0; i < arr.length - 1; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] > arr[j]) {
// invCount++;
// }
// }
// }
// return invCount;
// }

// public static void main(String[] args) {
// int[] arr = { 1, 20, 6, 4, 5 };
// System.out.println("Inversion Count = " + inversionCount(arr));
// }
// }

// ..........................................................................................................

// optimised approach by divide and conquer ............ O(nlogn)

// public class practiceSet {

// public static void countInversions(int[] arr, int si, int ei) {
// // base case
// if (si >= ei) {
// return;
// }

// // kaam
// int mid = si + (ei - si) / 2; // (si+ei)/2
// countInversions(arr, si, mid);// left part
// countInversions(arr, mid + 1, ei);// right part
// merge(arr, si, mid, ei);
// }

// static int count = 0;

// public static void merge(int[] arr, int si, int mid, int ei) {
// int k = 0; // iterator for temp array
// int i = si; // iterator for left part
// int j = mid + 1; // iterator for right part
// int[] temp = new int[ei - si + 1];

// while (i <= mid && j <= ei) {
// if (arr[i] > arr[j]) {
// temp[k] = arr[j];
// count += ((mid + 1) - i);// mid+1 is length of left subarray
// j++;
// } else {
// temp[k] = arr[i];
// i++;
// }
// k++;
// }

// // left part
// while (i <= mid) {
// // temp[k] = arr[i];
// // i++;
// // k++;

// // or

// temp[k++] = arr[i++];
// }

// // right part
// while (j <= ei) {
// temp[k++] = arr[j++];
// }

// // copy temp to original array
// for (k = 0, i = si; i <= ei; i++, k++) {
// arr[i] = temp[k];
// }
// }

// public static void main(String[] args) {
// int arr[] = { 1, 20, 6, 4, 5 };
// countInversions(arr, 0, arr.length - 1);
// System.out.println("Inversion Count = " + count);

// }
// }

// .................................................................................................
// OR .... SAME HE HAI UPAR WALE JAISE HE BAS THODA UPAR NICHE CODE LIKHA HAI
// CONCEPT SAME HAI

// public class practiceSet {
// public static int merge(int arr[], int left, int mid, int right) {
// int i = left, j = mid, k = 0;
// int invCount = 0;
// int temp[] = new int[(right - left + 1)];
// while ((i < mid) && (j <= right)) {
// if (arr[i] <= arr[j]) {
// temp[k] = arr[i];
// k++;
// i++;
// } else {
// temp[k] = arr[j];
// invCount += (mid - i);
// k++;
// j++;
// }
// }

// while (i < mid) {
// temp[k] = arr[i];
// k++;
// i++;
// }

// while (j <= right) {
// temp[k] = arr[j];
// k++;
// j++;
// }

// for (i = left, k = 0; i <= right; i++, k++) {
// arr[i] = temp[k];
// }

// return invCount;
// }

// private static int mergeSort(int arr[], int left, int right) {
// int invCount = 0;

// if (right > left) {
// int mid = (right + left) / 2;
// invCount = mergeSort(arr, left, mid);
// invCount += mergeSort(arr, mid + 1, right);
// invCount += merge(arr, left, mid + 1, right);
// }
// return invCount;
// }

// public static int getInversions(int arr[]) {
// int n = arr.length;
// return mergeSort(arr, 0, n - 1);
// }

// public static void main(String args[]) {
// int arr[] = { 1, 20, 6, 4, 5 };
// System.out.println("Inversion Count = " + getInversions(arr));
// }
// }