package codeforces;

import java.util.Scanner;

/**
 * StringsEqualization
 */
public class StringsEqualization {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StringBuilder output = new StringBuilder();
    // Scanner
    int q = input.nextInt();
    for (int i = 1; i <= q; i++) {
      String s = input.next();
      String t = input.next();

      output.append(possibleToEqualize(s, t)).append('\n');
    }
    input.close();
    System.out.println(output);
  }

  static String possibleToEqualize(String s, String t) {
    if (s.length() != t.length())
      return "NO";

    if (s.equals(t))
      return "YES";

    if (s.length() == 1)
      return "NO";

    boolean possible = true;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == t.charAt(i)) {
        continue;
      } else if (s.charAt(i) != t.charAt(i) && i != 0 && i != s.length() - 1) {
        if (s.charAt(i - 1) == t.charAt(i) || s.charAt(i + 1) == t.charAt(i) || s.charAt(i) == t.charAt(i - 1)
            || s.charAt(i) == t.charAt(i + 1))
          continue;
        else if (s.charAt(i - 1) == t.charAt(i - 1) || s.charAt(i + 1) == t.charAt(i + 1)) {
          continue;
        } else {
          possible = false;
          break;
        }
      } else if (s.charAt(i) != t.charAt(i) && i == 0) {
        if (s.charAt(i + 1) == t.charAt(i) || s.charAt(i) == t.charAt(i + 1))
          continue;
        else if (s.charAt(i + 1) == t.charAt(i + 1)) {
          continue;
        } else {
          possible = false;
          break;
        }
      } else if (s.charAt(i) != t.charAt(i) && i == s.length() - 1) {
        if (s.charAt(i - 1) == t.charAt(i) || s.charAt(i) == t.charAt(i - 1))
          continue;
        else if (s.charAt(i - 1) == t.charAt(i - 1)) {
          continue;
        } else {
          possible = false;
          break;
        }
      }
    }

    return possible ? "YES" : "NO";

  }
}
