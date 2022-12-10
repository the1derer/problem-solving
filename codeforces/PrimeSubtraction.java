// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * PrimeSubtraction
 */
public class PrimeSubtraction {

  public static void main(String[] args) throws Exception {
    // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    Scanner input = new Scanner(System.in);
    StringBuilder output = new StringBuilder();

    // int t = Integer.parseInt(input.readLine());
    int t = input.nextInt();

    for (int i = 0; i < t; i++) {

      long x = input.nextLong();
      long y = input.nextLong();

      output.append(isPossible(x, y)).append('\n');
    }
    System.out.println(output);
  }

  static String isPossible(long x, long y) {
    // BigInteger difference = BigInteger.valueOf(x-y);
    return x - y == 1 ? "NO" : "YES";
  }
}
