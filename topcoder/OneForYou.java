package topcoder;

// Did not submit
// BEGIN CUT HERE

// package topcoder;
// END CUT HERE
import java.util.*;
public class OneForYou {
  public long coinCount(long N) {
    int start = 2;
    long copyN = N;
    long numberOfRounds = 0;
    for(long i=0; i<N; i++) {
      copyN = copyN - (i+2);
      numberOfRounds = i+1;
    }
    return ((numberOfRounds*numberOfRounds/2));
  }
}
