package topcoder;

// BEGIN CUT HERE

// package topcoder;
// END CUT HERE
import java.util.*;
public class OverallScores {
	public int findWinner(int N, int[] scores) {
    	int[] score = new int[N];
      int numberOfRounds = (int) scores.length/N;
        
        int maxTotalIndex = 0;
        int maxTotal = 0;

      for(int i=0; i<N; i++) {

        int candidateTotal =0;

        for(int j=1; j<=numberOfRounds; j=j+N) {
          candidateTotal += scores[j];
        }

        if(candidateTotal>maxTotal) {
          maxTotal = candidateTotal;
          maxTotalIndex = i+1;
        }
      }

      return maxTotalIndex;
	}
	// public static void main(String[] args) {
	// 	OverallScores temp = new OverallScores();
	// 	System.out.println(temp.findWinner(int N, int[] scores));
	// }
}
