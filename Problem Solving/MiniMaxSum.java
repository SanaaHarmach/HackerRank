/*
Mini-Max Sum
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example
arr=[1,3,5,7,9]
The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. The function prints

    16 24
    
Function Description
Complete the miniMaxSum function in the editor below.
miniMaxSum has the following parameter(s):

    arr: an array of 5 integers
    
Print
Print two space-separated integers on one line: the minimum sum and the maximum sum of 4 of 5 elements.

Input Format
A single line of five space-separated integers.

Output Format
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

     1 2 3 4 5
     
Sample Output

     10 14
     
Explanation

The numbers are 1, 2, 3, 4, and 5. Calculate the following sums using four of the five integers:

1. Sum everything except 1, the sum is 2+3+4+5=14.
2. Sum everything except 2, the sum is 1+3+4+5=13.
Sum everything except 3, the sum is 1+2+4+5=12.
Sum everything except 4, the sum is 1+2+3+5=11.
Sum everything except 5, the sum is 1+2+3+4=10.

Hints: Beware of integer overflow! Use 64-bit Integer.

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum=0, maxSum=0;
        int i,j;
        for(i=0, j=arr.length-1;i<arr.length-1;i++,j--){
            minSum+=arr[i];
            maxSum+=arr[j];
        }
        
        System.out.println(minSum +" "+ maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
