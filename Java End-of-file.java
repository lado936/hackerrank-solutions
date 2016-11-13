import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int linenumber=1;
        Scanner scan=new Scanner(System.in);
        while (scan.hasNextLine()){
            String line=scan.nextLine();
            System.out.println(linenumber + " "+line);
            linenumber++;
        }
    }
}
