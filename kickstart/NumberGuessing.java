package kickstart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberGuessing {
  public static void solve(BufferedReader bufferedReader, int a, int b) throws IOException {
    int m = (a + b) / 2;
    System.out.println(m);
    String s = bufferedReader.readLine();
    // String s = bufferedReader.next();
    if (s.equals("CORRECT")) {
      return;
    } else if (s.equals("TOO_SMALL")) {
      solve(bufferedReader, m + 1, b);
    } else {
      solve(bufferedReader, a, m - 1);
    }
  }

  public static void main(String args[]) throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    // Scanner bufferedReader = new Scanner(System.in);
    int T = Integer.parseInt(bufferedReader.readLine());
    // int T = bufferedReader.nextInt();
    for (int ks = 1; ks <= T; ks++) {
      String[] aAndbStrings = bufferedReader.readLine().split(" ");
      // int a = bufferedReader.nextInt();
      // int b = bufferedReader.nextInt();
      // int n = bufferedReader.nextInt();
      int a = Integer.parseInt(aAndbStrings[0]);
      int b = Integer.parseInt(aAndbStrings[1]);
      int n = Integer.parseInt(bufferedReader.readLine());
      solve(bufferedReader,a+1 , b);
    }
  }
}
