// question 1
// ********************************************************************************************************

// import java.util.ArrayList;

// public class practiceSet {

// public static boolean isMonotonicArrayList(ArrayList<Integer> list) {
// boolean MonotonicInc = true;
// boolean MonotonicDec = true;

// for (int i = 0; i < list.size() - 1; i++) {
// if (list.get(i) > list.get(i + 1)) {
// MonotonicInc = false;

// }

// if (list.get(i) < list.get(i + 1)) {
// MonotonicDec = false;

// }
// }

// return MonotonicInc || MonotonicDec;

// }

// public static void main(String args[]) {
// ArrayList<Integer> list = new ArrayList<>();

// list.add(3);
// list.add(2);
// list.add(2);
// list.add(1);

// System.out.println(isMonotonicArrayList(list));
// }
// }

// question 2
// *********************************************************************************************************
// note jo ek func comment karke incorrect ke naam se likha hai usmai jo
// approach use kiya hai woh galat hai kyuki compulsory nhi ke hame ek number 2
// he baar de possiblity hai ke hame 100 numbers ka array de diya aur ek number
// usmai 4 baar repeat ho rha hai aur incorrect wale func mai yeh possiblity
// check nhi hoti

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;

// public class practiceSet {

// // brute force approch
// public static void isLonely(ArrayList<Integer> list) {
// ArrayList<Integer> lonely = new ArrayList<>();

// for (int i = 0; i < list.size(); i++) {
// boolean num = true;
// for (int j = 0; j < list.size(); j++) {
// if (i == j) {
// continue;
// }
// if (list.get(i) == list.get(j) || list.get(i) == (list.get(j) + 1)
// || list.get(i) == (list.get(j) - 1)) {
// num = false;
// }
// }
// if (num == true) {
// lonely.add(list.get(i));
// }
// }

// System.out.println(lonely);
// }

// // public static void Incorrect(ArrayList<Integer> list) {
// // Collections.sort(list);
// // ArrayList<Integer> lonelyNum = new ArrayList<>();

// // for (int i = 0; i < list.size(); i++) {
// // boolean num = true;
// // if (i == 0) {
// // if (list.get(i) == list.get(i + 1) || list.get(i) + 1 == list.get(i + 1))
// {
// // num = false;
// // }
// // } else if (i == list.size() - 1) {
// // if (list.get(i) == list.get(i - 1) || list.get(i) - 1 == list.get(i - 1))
// {
// // num = false;
// // }
// // }

// // else {
// // if (list.get(i) == list.get(i + 1) || list.get(i) + 1 == list.get(i + 1)
// // || list.get(i) - 1 == list.get(i - 1) || list.get(i) == list.get(i - 1)) {
// // num = false;
// // }
// // }

// // if (num == true) {
// // lonelyNum.add(list.get(i));
// // }
// // }

// // System.out.println(lonelyNum);
// // }

// // optimized approch
// public static void lonelyOptimizedCode(ArrayList<Integer> list) {
// Collections.sort(list);
// ArrayList<Integer> lonelyNum = new ArrayList<>();

// if (list.size() == 1) {
// lonelyNum.add(list.get(0));
// }

// for (int i = 1; i < list.size() - 1; i++) {
// if (list.get(i + 1) > (list.get(i) + 1) && (list.get(i - 1) + 1) <
// list.get(i)) {
// lonelyNum.add(list.get(i));
// }
// }

// if (list.size() > 1) {
// if (list.get(0) + 1 < list.get(1)) {
// lonelyNum.add(list.get(0));
// }
// if ((list.get(list.size() - 1) - 1) > list.get(list.size() - 2)) {
// lonelyNum.add(list.get(list.size() - 1));
// }
// }

// System.out.println(lonelyNum);
// }

// public static void main(String args[]) {
// ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 6, 5, 8));
// isLonely(list);
// lonelyOptimizedCode(list);
// }
// }

// question 3
// *******************************************************************************************************

// import java.util.ArrayList;
// import java.util.Arrays;

// public class practiceSet {

// public static int frequentNum(ArrayList<Integer> list, int key) {

// int[] arr = new int[1001];

// for (int i = 0; i < list.size() - 1; i++) {
// if (list.get(i) == key) {
// arr[list.get(i + 1)]++;
// }
// }

// // finding max count of target

// int max = Integer.MIN_VALUE;
// int target = Integer.MIN_VALUE;

// for (int i = 0; i <= 1000; i++) {
// if (arr[i] > max) {
// max = arr[i];
// target = i;
// }
// }
// return target;

// }

// public static void main(String args[]) {

// ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 100, 200, 1,
// 100));
// int key = 1;
// System.out.println(frequentNum(list, key));

// }
// }

// question 4
// ******************************************************************************************************

// import java.util.ArrayList;

// public class practiceSet {

// public static ArrayList<Integer> isBeautiful(int n) {
// ArrayList<Integer> beautifulArrayList = new ArrayList<>();
// beautifulArrayList.add(1);

// // 2 se n tak isliye gaya kyuki abhi beatifulArrayList mai 1 stored hai toh
// uska
// // size 1 hai already isliye size 2 se start karne ke liye i ko 2 se
// initialize
// // kiya aur size n tak pochne ke liye n tak gaye

// // Note: agar for loop lagate toh time complexity = O(n2) aur agar while loop
// lagate toh time complexity = O(n)
// // for (int i = 2; i <= n; i++) {
// // or
// while(beautifulArrayList.size() <n){
// ArrayList<Integer> temp = new ArrayList<>();

// for (Integer num : beautifulArrayList) {
// // adding even numbers
// if (2 * (num) <= n) {
// temp.add(2 * num);
// }
// }

// for (Integer num : beautifulArrayList) {
// // adding odd numbers
// if (2 * (num) - 1 <= n) {
// temp.add(2 * (num) - 1);
// }

// }
// beautifulArrayList = temp;

// }

// return beautifulArrayList;
// }

// public static void main(String args[]) {

// System.out.println(isBeautiful(5));
// }
// }