import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k;
        for(int i=1; i<=10; i++) {
            k = N * i;
            System.out.printf("%1$d x %2$d = %3$d\n", N,i,k);
        }
        }

}
