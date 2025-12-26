// // *******************************************************
// // 1. Activity Selection Problem

// //case 1 : where its already sorted based on end time
// ************************************

// // import java.util.*;

// public class greedyAlgo { //O(n)
// public static void main(String args[]) {
// int start[] = { 1, 3, 0, 5, 8, 5 };
// int end[] = { 2, 4, 6, 7, 9, 9 };

// int maxAct = 0;
// ArrayList<Integer> ans = new ArrayList<>();
// ans.add(0);
// maxAct++;
// int lastEnd = end[0];

// for (int i = 1; i < end.length; i++) {
// if (start[i] >= lastEnd) {
// maxAct++;
// lastEnd = end[i];
// ans.add(i);
// }

// }

// System.out.println("Maximum Activities : " + maxAct);

// for (int i = 0; i < ans.size(); i++) {
// System.out.print("A" + ans.get(i) + " ");
// }

// }
// }

// //case 2 : where its not sorted based on end time
// ************************************

// import java.util.*;

// public class greedyAlgo { // O(nlog(n))
// public static void main(String args[]) {
// int start[] = { 1, 3, 0, 5, 8, 5 };
// int end[] = { 2, 4, 6, 7, 9, 9 }; // yaha lene ke liye yeh array le liya
// lekin non sorted bhi daal doge toh koi
// // dikkat nhi hai

// int activities[][] = new int[end.length][3];

// for (int i = 0; i < end.length; i++) {
// activities[i][0] = i;// index
// activities[i][1] = start[i]; // start time
// activities[i][2] = end[i]; // end time
// }

// Arrays.sort(activities, Comparator.comparingInt(o -> o[2])); // sort based on
// end time

// int maxAct = 0;
// ArrayList<Integer> ans = new ArrayList<>();
// int lastEnd = activities[0][2];
// ans.add(activities[0][0]);
// maxAct++;

// for (int i = 1; i < activities.length; i++) {
// if (lastEnd <= activities[i][1]) {
// maxAct++;
// lastEnd = activities[i][2];
// ans.add(activities[i][0]);
// }
// }

// System.out.println("Maximum Activities : " + maxAct);

// for (int i = 0; i < ans.size(); i++) {
// System.out.print("A" + ans.get(i) + " ");
// }

// }
// }

// // *******************************************************
// // Fractional Knapsack Problem

// import java.util.*;

// public class greedyAlgo {
// public static void main(String args[]) {
// int[] val = { 60, 100, 120 };
// int[] weight = { 10, 20, 30 };
// int W = 50; // total capacity of knapsack
// int value = 0;

// double ratio[][] = new double[val.length][2];

// for (int i = 0; i < val.length; i++) {
// ratio[i][0] = i; // index
// ratio[i][1] = val[i] / (double) weight[i]; // value per weight
// }

// // ascending order
// Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

// for (int i = val.length - 1; i >= 0; i--) {
// int idx = (int) ratio[i][0];

// if (weight[idx] <= W) {
// value += val[idx];
// W -= weight[idx];
// } else {
// value += W * ratio[i][1];
// break;
// }
// }

// System.out.println("Maximum value in Knapsack = " + value);
// }
// }

// // *******************************************************
// // Minimum Absoulte Difference Sum

// import java.util.*;

// public class greedyAlgo { // O(n (log(n)))
// public static void main(String args[]) {
// int arr1[] = { 4, 1, 8, 7 };
// int arr2[] = { 2, 3, 6, 5 };

// Arrays.sort(arr1);
// Arrays.sort(arr2);

// int minAbsSum = 0;

// for (int i = 0; i < arr1.length; i++) {
// minAbsSum += Math.abs(arr1[i] - arr2[i]);
// }

// System.out.println("Minimum Absolute Difference Sum : " + minAbsSum);
// }
// }

// // *******************************************************
// // Maximum length chain of pairs

// import java.util.*;

// public class greedyAlgo {
// public static void main(String args[]) { // O(nlog(n))
// int pairs[][] = { { 5, 24 }, { 39, 60 }, { 15, 28 }, { 27, 40 }, { 50, 90 }
// };

// Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

// int maxChain = 1;
// int LastEnd = pairs[0][1];

// for (int i = 1; i < pairs.length; i++) {
// if (LastEnd < pairs[i][0]) {
// maxChain++;
// LastEnd = pairs[i][1];
// }
// }

// System.out.println("Maximum length chain of pairs : " + maxChain);
// }
// }

// // *******************************************************
// // Indian Coins Problem

// import java.util.*;

// public class greedyAlgo {
// public static void main(String args[]) {
// Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
// Arrays.sort(coins, Comparator.reverseOrder());
// int amount = 590;
// int countOfCoins = 0;
// ArrayList<Integer> list = new ArrayList<>();

// for (int i = 0; i < coins.length; i++) {
// if (coins[i] <= amount) {
// while (coins[i] <= amount) {
// amount -= coins[i];
// countOfCoins++;
// list.add(coins[i]);
// }
// }
// }

// for (int i = 0; i < list.size(); i++) {
// System.out.print(list.get(i) + " ");
// }
// System.out.println("\nTotal coins used : " + countOfCoins);
// }
// }

// // *******************************************************
// // Job Sequencing Problem

// import java.util.*;

// public class greedyAlgo {

// static class Job {
// int id;
// int profit;
// int deadline;

// public Job(int i, int d, int p) {
// id = i;
// deadline = d;
// profit = p;

// }
// }

// public static void main(String args[]) {
// int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

// ArrayList<Job> jobs = new ArrayList<>();
// int maxDeadline = 0;

// for (int i = 0; i < jobInfo.length; i++) {
// jobs.add(new Job(i + 1, jobInfo[i][0], jobInfo[i][1]));
// maxDeadline = Math.max(maxDeadline, jobInfo[i][1]);
// }

// int[] slot = new int[maxDeadline + 1];
// Arrays.fill(slot, -1); // 1 based indexing
// Collections.sort(jobs, (a, b) -> b.profit - a.profit);
// int maxProfit = 0;

// for (Job job : jobs) {
// for (int i = job.deadline; i > 0; i--) {
// if (slot[i] == -1) {
// slot[i] = job.id;
// maxProfit += job.profit;
// break;
// }
// }
// }

// System.out.println("Maximum Profit : " + maxProfit);
// for (int i = 1; i < maxDeadline; i++) {
// if (slot[i] != -1) {
// System.out.print(slot[i] + " ");
// }
// }

// }
// }

// // *******************************************************
// // chocolate problem

// import java.util.*;

// public class greedyAlgo {
// public static void main(String args[]) {
// Integer costVer[] = { 2, 1, 3, 1, 4 };
// Integer costHor[] = { 4, 1, 2 };

// Arrays.sort(costVer, Comparator.reverseOrder());
// Arrays.sort(costHor, Comparator.reverseOrder());

// int h = 0; // pointer for costHor
// int v = 0; // pointer for costVer
// int hp = 1; // no of horizontal pieces
// int vp = 1; // No of vertical pieces
// int cost = 0;

// while (h < costHor.length && v < costVer.length) {
// if (costVer[v] <= costHor[h]) { // horizontal cut
// cost += costHor[h] * vp;
// h++;
// hp++;
// } else { // vertical cut
// cost += costVer[v] * hp;
// vp++;
// v++;
// }
// }

// while (v < costVer.length) {// vertical cut
// cost += costVer[v] * hp;
// vp++;
// v++;
// }

// while (h < costHor.length) {// horizontal cut
// cost += costHor[h] * vp;
// hp++;
// h++;
// }

// System.out.println("min cost of cuts = " + cost);
// }
// }
