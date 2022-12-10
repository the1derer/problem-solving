import java.util.Scanner;


public class RobotProgram {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int testCases = input.nextInt();

    for(int test=1; test <= testCases; test++) {
      int x = input.nextInt();
      int y = input.nextInt();

      // System.out.println(x+y);

      System.out.println(stepsRequired(x, y));
    }   
  }

  public static int stepsRequired(int x, int y) {
      int xInitial = 0;
      int yInitial = 0;

      if(x<y) {
        int temp = x;
        x = y;
        y = temp;
      }

      int steps = 0;

      boolean bool = true;

      // TODO: Don't know why I replaced AND with OR here.
      while(xInitial != x || yInitial != y) {
        if(bool) {
          if(xInitial<x) {xInitial++; steps++;}
          else steps++;
          bool = false;
          // System.out.println("This is how x progress:"+ xInitial);
          continue;
        }

        else {
          if(yInitial<y) { yInitial++; steps++; }
          else steps++;
          bool = true;
          // System.out.println("This is how y progress:"+ yInitial);
          continue;
        }
      }

      return steps;

  }
}
