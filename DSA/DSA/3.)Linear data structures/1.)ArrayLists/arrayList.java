// performing operations in array list

// import java.util.ArrayList;

// public class arrayList {
// public static void main(String args[]) {

// ArrayList<Integer> list = new ArrayList<>();

// list.add(2);
// list.add(3);
// list.add(4);
// list.add(5);

// System.out.println(list);

// System.out.println(list.get(2));

// list.remove(1);
// System.out.println(list);

// list.set(2, 10);
// System.out.println(list);

// System.out.println(list.contains(4));
// System.out.println(list.contains(100));
// }
// }

// ******************************************************************************************************
// print arraylist by for loop

// import java.util.ArrayList;

// public class arrayList {
// public static void main(String args[]) {
// ArrayList<Integer> list = new ArrayList<>();

// list.add(1);
// list.add(2);
// list.add(3);
// list.add(4);
// list.add(5);

// for (int i = 0; i < list.size(); i++) {
// System.out.print(list.get(i) + " ");
// }

// }
// }

// ******************************************************************************************************
// print reverse of a arraylist

// import java.util.ArrayList;

// public class arrayList {
// public static void main(String args[]) {

// ArrayList<Integer> list = new ArrayList<>();

// list.add(1);
// list.add(2);
// list.add(3);
// list.add(4);
// list.add(5);

// for (int i = list.size() - 1; i >= 0; i--) {
// System.out.print(list.get(i) + " ");
// }

// }
// }

// ******************************************************************************************************
// find maximum number in the arraylist

// import java.util.ArrayList;

// public class arrayList {
// public static void main(String args[]) {

// ArrayList<Integer> list = new ArrayList<>();

// list.add(2);
// list.add(5);
// list.add(1);
// list.add(9);
// list.add(4);

// int max = Integer.MIN_VALUE;

// for (int i = 0; i < list.size(); i++) {
// // if (max < list.get(i)) {
// // max = list.get(i);
// // }

// max = Math.max(max, list.get(i));

// }

// System.out.println("Max Element : " + max);
// }
// }

// ******************************************************************************************************
// swap two numbers in an arraylist

// import java.util.*;

// public class arrayList {

// public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
// int temp = list.get(idx1);
// list.set(1, list.get(idx2));
// list.set(idx2, temp);
// }

// public static void main(String args[]) {

// ArrayList<Integer> list = new ArrayList<>();

// list.add(2);
// list.add(5);
// list.add(1);
// list.add(9);
// list.add(4);

// System.out.println(list);

// swap(list, 2, 4);

// System.out.println(list);
// }
// }

// ******************************************************************************************************
// sorting in arraylist

// import java.util.*;

// public class arrayList {
// public static void main(String args[]) {

// ArrayList<Integer> list = new ArrayList<>();

// list.add(2);
// list.add(5);
// list.add(1);
// list.add(9);
// list.add(4);

// System.out.println(list);

// Collections.sort(list); // ascending
// System.out.println(list);

// Collections.sort(list, Collections.reverseOrder());//descending
// System.out.println(list);

// }
// }

// ******************************************************************************************************
// multidimensional arraylist

// import java.util.ArrayList;
// import java.util.Arrays;

// public class arrayList {
// public static void main(String args[]) {

// ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

// ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3));
// ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(4, 5, 6));
// ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(7, 8, 9));

// matrix.add(row1);
// matrix.add(row2);
// matrix.add(row3);

// System.out.println(matrix);

// System.out.println(matrix.get(0));
// System.out.println(matrix.get(1));

// System.out.println(matrix.get(0).get(1));

// matrix.get(1).set(2, 10);

// System.out.println(matrix);

// // iterating over the elements
// for (ArrayList<Integer> row : matrix) {
// for (Integer element : row) {
// System.out.print(element + " ");
// }
// System.out.println();
// }

// // adding element to specific rows
// matrix.get(0).add(4);

// System.out.println(matrix);

// // addng a new row
// matrix.add(new ArrayList<>(Arrays.asList(10, 11, 12)));
// System.out.println(matrix);

// }

// }

// ******************************************************************************************************
// list.add(new ArrayList<>(Arrays.asList(10,11,12)) ); ...... add ya remove
// elements is allowed
// list.add(Arrays.asList(10,11,12) ); ........... add ya remove elements are
// not allowed
// diff between above two statements
// code below ..................................................................

// import java.util.*;

// public class arrayList {
// public static void main(String args[]) {
// List<List<Integer>> list = new ArrayList<>();

// // creates a mutable array list
// list.add(new ArrayList<>(Arrays.asList(10, 11, 12)));
// list.get(0).add(13);// works fine
// System.out.println(list);

// // creates an immutable arrayList
// list.add(Arrays.asList(20, 21, 22));
// // list.get(1).add(23); // throws error
// System.out.println(list);
// }
// }

// ******************************************************************************************************
// create
// 1 , 2
// 3 , 4

// import java.util.*;

// public class arrayList {
// public static void main(String args[]) {
// ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

// ArrayList<Integer> list1 = new ArrayList<>();
// list1.add(1);
// list1.add(2);
// mainList.add(list1);

// ArrayList<Integer> list2 = new ArrayList<>();
// list2.add(3);
// list2.add(4);
// mainList.add(list2);

// for (int i = 0; i < mainList.size(); i++) {
// ArrayList<Integer> currlist = mainList.get(i);
// for (int j = 0; j < currlist.size(); j++) {
// System.out.print(currlist.get(j) + " ");
// }
// System.out.println();
// }

// }
// }

// *********************************************************************************************************

// create :
// list1 : 1 2 3 4 5
// list2 : 2 4 6 8 10
// list3 : 3 6 9 12 15

// import java.util.*;

// public class arrayList {
// public static void main(String args[]) {

// ArrayList<Integer> list1 = new ArrayList<>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>();

// for (int i = 1; i <= 5; i++) {
// list1.add(i * 1);
// list2.add(i * 2);
// list3.add(i * 3);
// }
// System.out.println(list1);
// System.out.println(list2);
// System.out.println(list3);
// }
// }

// ********************************************************************************************************

// container with most water
// brute fore approach ....O(n2)

// import java.util.*;

// public class arrayList {

// public static int storeWater(ArrayList<Integer> height) {

// int max = Integer.MIN_VALUE;

// for (int i = 0; i < height.size(); i++) {
// for (int j = i + 1; j < height.size(); j++) {
// int width = j - i;
// int height_of_tower = Math.min(height.get(i), height.get(j));
// int area = height_of_tower * width;
// max = Math.max(max, area);
// }
// }

// return max;

// }

// public static void main(String args[]) {
// ArrayList<Integer> height = new ArrayList<>();
// // 1,8,6,2,5,4,8,3,7

// height.add(1);
// height.add(8);
// height.add(6);
// height.add(2);
// height.add(5);
// height.add(4);
// height.add(8);
// height.add(3);
// height.add(7);

// System.out.println(storeWater(height));

// }

// }

// ******************************************************************************************************

// conatiner with most water
// 2 pointer approach

// import java.util.*;

// public class arrayList {

// public static int storeWater(ArrayList<Integer> height) {
// int lp = 0;// left pointer
// int rp = height.size() - 1;// right pointer
// int max = Integer.MIN_VALUE;

// while (lp < rp) {
// int width = rp - lp;
// int height_of_tower = Math.min(height.get(lp), height.get(rp));
// int area = height_of_tower * width;
// max = Math.max(max, area);

// if (height.get(lp) > height.get(rp)) {
// rp--;
// } else {
// lp++;
// }
// }
// return max;
// }

// public static void main(String args[]) {

// ArrayList<Integer> height = new ArrayList<>();
// // 1,8,6,2,5,4,8,3,7

// height.add(1);
// height.add(8);
// height.add(6);
// height.add(2);
// height.add(5);
// height.add(4);
// height.add(8);
// height.add(3);
// height.add(7);

// System.out.println(storeWater(height));

// }
// }

// ******************************************************************************************************
// pair sum-1
// list = [1,2,3,4,5,6] , target = 5
// brute force ..... O(n2)

// import java.util.*;

// public class arrayList {

// public static boolean pairSum1(ArrayList<Integer> list, int target) {
// for (int i = 0; i < list.size(); i++) {
// for (int j = i + 1; j < list.size(); j++) {
// if (list.get(i) + list.get(j) == target) {
// return true;
// }
// }
// }

// return false;
// }

// public static void main(String args[]) {
// ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
// int target = 5;

// System.out.println(pairSum1(list, target));

// }
// }

// **********************************************************************************************************

// pair sum - 1
// two pointer approach
// list = [1,2,3,4,5,6] , target = 5

// import java.util.*;

// public class arrayList {

// public static boolean pairSum1(ArrayList<Integer> list, int target) {

// int lp = 0; // left pointer
// int rp = list.size() - 1; // right pointer

// while (lp < rp) {

// //case 1
// if (list.get(lp) + list.get(rp) == target) {
// return true;

// //case 2
// } else if (list.get(lp) + list.get(rp) > target) {
// rp--;
// }

// //case 3
// else {
// lp++;
// }

// }

// return false;
// }

// public static void main(String args[]) {
// ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
// int target = 5;

// System.out.println(pairSum1(list, target));

// }
// }

// ******************************************************************************************************

// Pair Sum - 2
// brute force mai pair sum 1 wala he same code hai nested loop wala
// 2 pointer approch se kiya hai neeche ....... O(n)

// import java.util.*;

// public class arrayList {

// public static boolean pairSum2(ArrayList<Integer> list, int target) {

// int bp = -1;// breaking point
// int n = list.size();

// for (int i = 0; i < list.size(); i++) {
// if (list.get(i) > list.get(i + 1)) {
// bp = i;
// break;
// }
// }

// int lp = bp + 1; // left pointer
// int rp = bp; // right pointer

// while (lp != rp) {

// // case 1
// if (list.get(lp) + list.get(rp) == target) {
// return true;

// // case 2
// } else if (list.get(lp) + list.get(rp) > target) {
// rp = (n + rp - 1) % n;
// }

// // case 3
// else {
// lp = (lp + 1) % n;
// }

// }

// return false;
// }

// public static void main(String args[]) {
// ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 6, 8, 9));
// int target = 16;

// System.out.println(pairSum2(list, target));

// }
// }
