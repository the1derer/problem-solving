package ctci;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Questions/Assumptions:
 * 1. Both the string are of equal length.
 * 2. 
 */
public class CheckPermutation {
    public static boolean bruteForce(String str1, String str2) { // Time: O(N * (N + N)) = O(N^2) || Space: O(1)
        for (int i = 0; i < str1.length(); i++) {

            char temp = str1.charAt(i);
            int countIn1 = 0, countIn2 = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == temp)
                    ++countIn1;
            }

            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == temp)
                    ++countIn2;
            }

            if (countIn1 != countIn2)
                return false;
        }
        return true;
    }

    public static boolean hashMap(String str1, String str2) { // Time: O(N * 1) = O(N) || Space: O(2N)
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
            map1.put(str2.charAt(i), map1.getOrDefault(str2.charAt(i), 0) + 1);
        }

        return map1.equals(map2);
    }

    public static boolean sortedString(String str1, String str2) { // Time: O(N log N) || Space: O(1)
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        for (int i = 0; i < str1.length(); i++) {
            if (charArr1[i] != charArr2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String checkString1 = "abcdefghijklmnop"; // input.nextLine();
        String checkString2 = (new StringBuffer(checkString1)).reverse().toString();

        long startTime = System.nanoTime();
        System.out.println("Using Brute Force: " + bruteForce(checkString1, checkString2));
        long stopTime = System.nanoTime();
        System.out.println("Time taken :" + (stopTime - startTime) / 1000);

        startTime = System.nanoTime();
        System.out.println("Using Sorted String: " + sortedString(checkString1, checkString2));
        stopTime = System.nanoTime();
        System.out.println("Time taken :" + (stopTime - startTime) / 1000);

        startTime = System.nanoTime();
        System.out.println("Using HashMap: " + hashMap(checkString1, checkString2));
        stopTime = System.nanoTime();
        System.out.println("Time taken :" + (stopTime - startTime) / 1000);
    }
}
