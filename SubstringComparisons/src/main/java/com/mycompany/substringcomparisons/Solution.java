package com.mycompany.substringcomparisons;

/**
 *
 * @author lilith
 */
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = null;
        String largest = null;

        for (int i = 0; i < s.length() - k + 1; i++) {
            String str = s.substring(i, i + k);

            if (smallest == null || str.compareTo(smallest) < 0) {
                smallest = str;
            }
            if (largest == null || str.compareTo(largest) > 0) {
                largest = str;
            }

        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
