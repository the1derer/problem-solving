package topcoder;

// BEGIN CUT HERE

// package topcoder;
// END CUT HERE
import java.util.*;
public class ColorWheel {
  public String describePair(String color1, String color2) {
    String[] colors = {"Yellow", "Green", "Blue", "Purple", "Red", "Orange"};
    int position1 = findposition(color1, colors);
    int position2 = findposition(color2, colors);
    System.out.println(position1); 
    System.out.println(position2); 

    int difference = position1 - position2;
    if(difference==-1 || difference==1) return "Adjecent";
    else if(difference==-3 || difference==3) return "Complementary";
    else if(difference==0) return "Same";
    else return "None";

  }

  public static int findposition(String color, String[] colors) {
    for(int i=0; i<colors.length; i++) {
      if(colors[i].equals(color)) { return i;}
      // else i++;
    }
    return 0;
  }
  // public static void main(String[] args) {
  // 	ColorWheel temp = new ColorWheel();
  // System
  // 	System.out.println(temp.describePair(String color1, String color2));
  // }
}
