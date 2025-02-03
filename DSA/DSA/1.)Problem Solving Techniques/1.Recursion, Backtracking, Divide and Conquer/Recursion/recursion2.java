//tilling problem

// public class recursion2 {

//     public static int tillingProblem(int n) {

//         // base case
//         if (n == 1 || n == 2) {
//             return n;
//         }
//         // return tillingProblem(n - 1) + tillingProblem(n - 2);

//         // or

//         // kaam
//         // vertical choice
//         int fm1 = tillingProblem(n - 1);

//         // horizontal choice
//         int fm2 = tillingProblem(n - 2);

//         int totWays = fm1 + fm2;

//         return totWays;
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println();
//         System.out.println(tillingProblem(n));
//     }
// }

// *****************************************************************************************************************

// remove duplicated in a String

// public class recursion2 {

//     public static void removeDuplicates(String str, StringBuilder newstr, boolean[] map, int n) {
//         if (n == str.length()) {
//             System.out.println(newstr);
//             return;
//         }

//         char character = str.charAt(n);
//         int index = character - 'a';

//         if (map[index] == true) {
//             removeDuplicates(str, newstr, map, n + 1);
//         } else {
//             map[index] = true;
//             removeDuplicates(str, newstr.append(character), map, n + 1);
//         }

//         // System.out.println(newstr);

//     }

//     public static void main(String[] args) {
//         String str = "appnnacollege";
//         System.out.println();
//         removeDuplicates(str, new StringBuilder(""), new boolean[26], 0);
//     }
// }

// or

// public class recursion2 {

// public static void removeDuplicates(String str, String newstr, boolean[] map,
// int n) {
// if (n == str.length()) {
// System.out.println(newstr);
// return;
// }

// char character = str.charAt(n);
// int index = character - 'a';

// if (map[index] == true) {
// removeDuplicates(str, newstr, map, n + 1);
// } else {
// map[index] = true;
// removeDuplicates(str, newstr + character, map, n + 1);
// }

// // for dry run uncomment below line
// // System.out.println(newstr);

// }

// public static void main(String[] args) {
// String str = "appnnacollege";
// System.out.println();
// removeDuplicates(str, new String(""), new boolean[26], 0);
// }
// }
// ********************************************************************************************************************

// friends pairing problem

public class recursion2 {

    public static int findIntegers(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int lastdigit = 0;
            boolean res = true;
            while (i > 0) {
                int current = i & 1;
                i = i >> 1;
                if (lastdigit == 1 && current == 1) {
                    res = false;
                    lastdigit = current;
                    break;
                }

                lastdigit = current;
            }
            if (res == true) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findIntegers(5));
    }
}

// *******************************************************************************************************************

// binary string problem

// public class recursion2{

// public static void main(String[] args)
// {

// }
// }
