import java.util.Scanner;

/**
 * MatchesRequired
 */
public class MatchesRequired {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StringBuilder output = new StringBuilder();
    // Scanner
    int q = input.nextInt();
    for (int i = 1; i <= q; i++) {
      int given = input.nextInt();
      // System.out.println(given);
      output.append(getRemainingMatches(given)).append('\n');
    }
    input.close();
    System.out.println(output);
  }

  static int getRemainingMatches(int given) {
    int totalSum = given - (given / 2);
    // System.out.println(totalSum);
    // System.out.println(totalSum-(given/2));
    int required = 0;

    if (totalSum == 1)
      required = 1+1;
    else
      required = totalSum - (given / 2);

    return required;
  }
}
