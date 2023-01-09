package hackerrank.prepare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdIO2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuffer outStr = new StringBuffer();

        String str = "";
        while((str = input.readLine()) != null) {
            outStr.append(str).append("\n");
        }

        System.out.println(outStr);
    }
}