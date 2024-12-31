// merge sort (TC = (O(nlogn)) , SC = (O(n)) )

// public class divideNConquer {

// public static void printArr(int[] arr) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void mergeSort(int[] arr, int si, int ei) {
// // base case
// if (si >= ei) {
// return;
// }

// // kaam
// int mid = si + (ei - si) / 2; //(si+ei)/2
// mergeSort(arr, si, mid);//left part
// mergeSort(arr, mid + 1, ei);//right part
// merge(arr, si, mid, ei);
// }

// public static void merge(int[] arr, int si, int mid, int ei) {
// int k = 0; // iterator for temp array
// int i = si; // iterator for left part
// int j = mid + 1; // iterator for right part
// int[] temp = new int[ei - si + 1];

// while (i <= mid && j <= ei) {
// if (arr[i] > arr[j]) {
// temp[k] = arr[j];
// j++;
// } else {
// temp[k] = arr[i];
// i++;
// }
// k++;
// }

// //left part
// while (i <= mid) {
// // temp[k] = arr[i];
// // i++;
// // k++;

// // or

// temp[k++] = arr[i++];
// }

// //right part
// while (j <= ei) {
// temp[k++] = arr[j++];
// }

// //copy temp to original array
// for (k = 0, i = si; i <= ei; i++, k++) {
// arr[i] = temp[k];
// }
// }

// public static void main(String[] args) {
// int arr[] = { 6, 3, -9, 5, 2, 8 };
// mergeSort(arr, 0, arr.length - 1);
// printArr(arr);

// }
// }

// ***************************************************************************************************************

// Quick Sort ..... (TC = (O(nlogn)) , SC = O(1))

// public class divideNConquer {

// public static void printArr(int[] arr) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void quickSort(int[] arr, int si, int ei) {
// if (si >= ei) {
// return;
// }
// int pivotIndex = partition(arr, si, ei);
// quickSort(arr, si, pivotIndex - 1);
// quickSort(arr, pivotIndex + 1, ei);
// }

// public static int partition(int[] arr, int si, int ei) {
// int pivot = arr[ei];
// int i = si - 1;
// int j = si;
// while (j != ei) {
// if (arr[j] <= pivot) {
// i++;

// // swapping
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }
// j++;
// }
// i++;
// // swapping pivot
// int temp = pivot;
// arr[ei] = arr[i];
// arr[i] = temp;

// return i;
// }

// public static void main(String[] args) {
// int arr[] = { 6, 3, 9, 8, 2, 5 };
// quickSort(arr, 0, arr.length - 1);
// printArr(arr);
// }
// }

// ****************************************************************************************************************

// Search in a rotated sorted array

// public class divideNConquer {

// public static int search(int[] arr, int target, int si, int ei) {
// // base case
// if (si > ei) {
// return -1;
// }

// // kaam
// int mid = si + (ei - si) / 2; // (si+ei)/2

// //case found
// if (arr[mid] == target) {
// return mid;
// }

// // mid on line 1
// if (arr[si] <= arr[mid]) {

// // case a : left
// if (arr[si] <= target && target < arr[mid]) {
// return search(arr, target, si, mid - 1);
// }
// // cse b : right
// else {
// return search(arr, target, mid + 1, ei);
// }
// }

// // mid on line 2
// else {

// // case c : right
// if (arr[mid] < target && target <= arr[ei]) {
// return search(arr, target, mid + 1, ei);
// }
// // case d : left
// else {
// return search(arr, target, si, mid - 1);
// }

// }

// }

// public static void main(String[] args) {
// int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
// int target = 0;// output : 4
// int tarIndx = search(arr, target, 0, arr.length - 1);
// System.out.println(tarIndx);
// }
// }
