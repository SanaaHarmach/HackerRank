/*
Divisible Sum Pairs
You are given an array of n integers, ar=[ar[0],ar[1], ..., ar[n-1]], and a positive integer, k. Find and print the number of  pairs where  and  +  is divisible by .
For example, ar=[1,2,3,4,5,6] and k=5. Our three pairs meeting the criteria are [1,4], [2,3] and [4,6].

Function Description
Complete the divisibleSumPairs function in the editor below. It should return the integer count of pairs meeting the criteria.
divisibleSumPairs has the following parameter(s):

n: the integer length of array 
ar: an array of integers
k: the integer to divide the pair sum by

Input Format

The first line contains 2 space-separated integers, n and k.
The second line contains n space-separated integers describing the values of ar=[ar[0],ar[1], ..., ar[n-1]].

Output Format
Print the number of (i,j) pairs where i<j and a[i] + a[j] is evenly divisible by k.

Sample Input

6 3
1 3 2 6 1 2

Sample Output

 5
 
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count=0;
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar.length; j++){
                if((i<j) && ((ar[i]+ar[j])%k==0))
                  count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
