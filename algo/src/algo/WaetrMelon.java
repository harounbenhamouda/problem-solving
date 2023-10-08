package algo;

import java.util.Scanner;

public class WaetrMelon {
    public static boolean MenichInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException excep) {
            return false;
        }
    }
      
    public static void main(String args[]) {
        String x="123";
      
        System.out.println(MenichInt(x));
    }
}