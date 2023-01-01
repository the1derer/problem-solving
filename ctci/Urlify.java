package ctci;

import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.IntStream;

public class Urlify {

    public static String stack(String str) {
        Stack<Character> stack = new Stack<>();

        IntStream.range(0, str.length()).forEach(i -> {

            if (str.charAt(i) == ' ') {
                // if (stack.peek() == ' ')
                //     stack.pop();
                // else {
                    stack.push('%');
                    stack.push('2');
                    stack.push('0');
                // }
            } else {
                stack.push(str.charAt(i));
            }
        });
        StringBuffer urlString = new StringBuffer();

        stack.stream().forEach(i -> urlString.append(i));

        return urlString.toString();
    }

    public static void main(String[] args) {
        String checkString = "Mr John Smith";

        long startTime = System.nanoTime();
        System.out.println("Using Brute Force: " + stack(checkString));
        long stopTime = System.nanoTime();
        System.out.println("Time taken :" + (stopTime - startTime) / 1000);
    }
}
