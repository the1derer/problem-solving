

import java.util.Arrays;
// import java.util.BitSet; // Using `BitSet` class increases the time significantly.
import java.util.HashSet;
import java.util.Scanner;

public class IsUnique {

    public static boolean bruteForce(String str) { // Time: O(N * N) || Space: O(1)
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hashSet(String str) { // Time: O(N * 1) || Space: O(N)
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c))
                return false;
        }
        return true;
    }

    public static boolean bitVector(String str) { // Time: O(N * 1) || Space: O(2* Math.pow(2, 16)) => O(1s)
        // BitSet bitVector = new BitSet((int)Math.pow(2, 16));
        boolean[] bitVector = new boolean[(int) Math.pow(2, 16)];
        for (char c : str.toCharArray()) {
            // if(!bitVector.get((int)c)) return false;
            int index = (int) c;
            if (bitVector[index])
                return false;
            else
                bitVector[index] = true;
        }

        return true;
    }

    public static boolean withoutAdditionalDS(String str) { // Time: O (N + (N * log N)) || Space: O(1)
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        for (int i = 0; i < charArr.length - 1; i++) {
            if (charArr[i] != charArr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String you want to check:");
        String checkString = "abcdeflopmnb"; // input.nextLine();

        long startTime = System.nanoTime();
        System.out.println("Using Brute Force: " + bruteForce(checkString));
        long stopTime = System.nanoTime();
        System.out.println("Time taken :" + (stopTime - startTime) / 1000);

        startTime = System.nanoTime();
        System.out.println("Using HashSet: " + hashSet(checkString));
        stopTime = System.nanoTime();
        System.out.println("Time taken :" + (stopTime - startTime) / 1000);

        startTime = System.nanoTime();
        System.out.println("Using BitVector: " + bitVector(checkString));
        stopTime = System.nanoTime();
        System.out.println("Time taken :" + (stopTime - startTime) / 1000);

        startTime = System.nanoTime();
        System.out.println("Using BitVector: " + withoutAdditionalDS(checkString));
        stopTime = System.nanoTime();
        System.out.println("Time taken :" + (stopTime - startTime) / 1000);
    }
}
