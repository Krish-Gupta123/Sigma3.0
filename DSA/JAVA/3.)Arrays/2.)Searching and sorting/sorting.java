// bubble sort

// public class sorting

// {
// public static void bubbleSort(int arr[]) {
// for (int i = 0; i < arr.length - 1; i++)// turns
// {
// int turns = i;
// for (int j = 0; j < arr.length - 1 - turns; j++) {
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// }

// public static void printArr(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String args[]) {
// int numbers[] = { 5, 4, 1, 3, 2 };
// bubbleSort(numbers);
// printArr(numbers);
// }
// }
// ***********************************************************************************************************
// selection sort

// public class sorting

// {
// public static void selectionSort(int arr[]) {
// for (int i = 0; i < arr.length - 1; i++)// total no of turns
// {
// int minPos = i;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[minPos] > arr[j]) {
// minPos = j;
// }

// }
// // swapping
// int temp = arr[minPos];
// arr[minPos] = arr[i];
// arr[i] = temp;

// }
// }

// public static void printArr(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String args[]) {
// int numbers[] = { 5, 4, 1, 3, 2 };
// selectionSort(numbers);
// printArr(numbers);
// }
// }
// ***********************************************************************************************************
// insertion sort

// public class sorting

// {
// public static void insertionSort(int arr[]) {
// for (int i = 1; i < arr.length; i++) {
// int curr = arr[i];
// int prev = i - 1;
// while (prev >= 0 && arr[prev] > curr) {
// arr[prev + 1] = arr[prev];
// prev--;
// }

// arr[prev + 1] = curr;
// }
// }

// public static void printArr(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String args[]) {
// int numbers[] = { 5, 4, 1, 3, 2 };
// insertionSort(numbers);
// printArr(numbers);
// }
// }
// ***********************************************************************************************************
// count sort

// public class sorting

// {
// public static void countSort(int arr[]) {
// int max = Integer.MIN_VALUE;

// // finding max element of the array
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }
// }

// // initializing count array
// int count[] = new int[max + 1];
// for (int i = 0; i < arr.length; i++) {
// count[arr[i]]++;
// }

// int j = 0;
// for (int i = 0; i < count.length; i++) {
// while (count[i] > 0) {
// arr[j] = i;
// j++;
// count[i]--;

// }

// }
// }

// public static void printArr(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String args[]) {
// int numbers[] = { 5, 4, 1, 3, 2 };
// countSort(numbers);
// printArr(numbers);
// }
// }
// ***********************************************************************************************************
// inbuilt sort

// import java.util.*;

// public class sorting

// {

// public static void printArr(Integer arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String args[]) {
// int arr[] = { 2, 4, 2, 1, 4, 10, 6 };
// Arrays.sort(arr);// O(n logn)
// printArr(arr);

// int arr2[] = { 2, 5, 6, 6, 3, 2, 4 };
// Arrays.sort(arr2, 2, 5);// O(n logn)
// printArr(arr2);

// reverse order
// Integer arr[] = { 2, 5, 1, 6, 3, 2, 4 };
// Arrays.sort(arr, Collections.reverseOrder());// O(n logn)
// printArr(arr);

// Integer arr2[] = { 2, 5, 1, 6, 3, 2, 4 };
// Arrays.sort(arr2, 2, 5, Collections.reverseOrder());// O(n logn)
// printArr(arr2);
// }
// }
