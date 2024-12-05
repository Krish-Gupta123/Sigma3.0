// question 1 
// public class practiceSet {

//     public static boolean question1Approch1(int arr[]) {

//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 5 };
//         System.out.println(question1Approch1(arr));
//     }

// }

//*************************************************************************************************************

//question 2 
// public class practiceSet {

//     public static int arrToBePassed(int arr[], int target) {
//         int min = minimumElementInArray(arr);
//         if (target >= arr[min] && target <= arr[arr.length - 1]) {
//             return question2(arr, target, min, arr.length - 1);
//         } else {
//             return question2(arr, target, 0, min - 1);
//         }
//     }

//     public static int minimumElementInArray(int arr[]) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end)

//         {
//             int mid = (start + end) / 2;
//             if (mid > 0 && arr[mid] < arr[mid] - 1) {
//                 return mid;
//             } else if (arr[mid] >= arr[start] && arr[mid] > arr[end]) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }

//         }
//         return start;// yeh nhi samja start kyu likha yaha
//     }

//     public static int question2(int arr[], int key, int start, int end) {

//         while (start <= end) {
//             int mid = (start + end) / 2;

//             if (arr[mid] == key) {
//                 return mid;
//             } else if (arr[mid] > key) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
//         int key = 0;
//         System.out.println(arrToBePassed(arr, key));
//     }

// }

// *********************************************************************************************************
//question 3

// public class practiceSet {

//     public static int maxProfitOptimizedSol(int arr[]) {
//         int buyPrice = arr[0];
//         int profit = 0;
//         int mx = 0;
//         for (int i = 1; i < arr.length; i++) {
//             if (buyPrice < arr[i]) {
//                 profit = arr[i] - buyPrice;
//                 mx = Math.max(profit, mx);
//             } else {
//                 buyPrice = arr[i];
//             }

//         }
//         return mx;
//     }

//     public static int maxProfitBruteForceApproach(int arr[]) {
//         int profit = 0;
//         int mx = 0;
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[i]) {
//                     profit = arr[j] - arr[i];
//                     mx = Math.max(mx, profit);
//                 }
//             }
//         }
//         return mx;
//     }

//     public static void main(String args[]) {
//         int arr[] = { 7, 1, 5, 3, 6, 4 };

//         System.out.println(maxProfitOptimizedSol(arr));
//         // System.out.println(maxProfitBruteForceApproach(arr));
//     }
// }

//*********************************************************************************************************
//question 4

public class practiceSet {
    public static int trappedWaterApproch1(int height[]) {
        int width = 1;

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int totalWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            totalWater += (waterLevel - height[i]) * width;
        }
        return totalWater;
    }

    public static int trappedWaterOptimizedApproch(int height[]) {
        int n = height.length;
        int width = 1;
        int start = 0;
        int end = n - 1;
        int totalWater = 0;
        int leftMax = height[start];
        int rightMax = height[end];

        while (start < end) {
            if (leftMax < rightMax) {
                start++;
                leftMax = Math.max(leftMax, height[start]);
                totalWater += (leftMax - height[start]) * width;

            } else {
                end--;
                rightMax = Math.max(rightMax, height[end]);
                totalWater += (rightMax - height[end]) * width;
            }

        }
        return totalWater;
    }

    public static void main(String args[]) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappedWaterApproch1(height));
        System.out.println(trappedWaterOptimizedApproch(height));

    }
}

// *********************************************************************************************************
// question 5(ghanta nhi samja question 5 .....question he nhi samja kya bhok
// rha hai kutta)
// (chat gpt sol hai niche )

// import java.util.ArrayList;
// import java.util.Arrays;

// public class practiceSet {
// public static void main(String args[]) {
// int arr[] = { -1, 0, 1, 2, -1, -4 };
// Arrays.sort(arr); // Sort the array to make it easier to handle duplicates
// ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

// for (int i = 0; i < arr.length - 2; i++) {
// // Skip duplicates for the first element
// if (i > 0 && arr[i] == arr[i - 1])
// continue;

// int j = i + 1;
// int k = arr.length - 1;

// while (j < k) {
// int sum = arr[i] + arr[j] + arr[k];
// if (sum == 0) {
// ArrayList<Integer> list = new ArrayList<>();
// list.add(arr[i]);
// list.add(arr[j]);
// list.add(arr[k]);
// mainList.add(list);

// // Skip duplicates for the second and third elements
// while (j < k && arr[j] == arr[j + 1])
// j++;
// while (j < k && arr[k] == arr[k - 1])
// k--;

// j++;
// k--;
// } else if (sum < 0) {
// j++;
// } else {
// k--;
// }
// }
// }

// System.out.print(mainList);
// }
// }
