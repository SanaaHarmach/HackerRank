/*
Arrays-DS
An array is a type of data structure that stores elements of the same type in a contiguous block of memory. 
In an array, A, of size N, each memory location has some unique index, i (where 0<=i<N), that can be referenced as A[i] or Ai.
Reverse an array of integers.

Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.
Example
A=[1,2,3]
Return [3,2,1].

Fuction Description
Complete the function reverseArray in the editor below.
reverseArray has the following parameter(s):

    int A[n]: the array to reverse
    
Returns

    int[n]: the reversed array

Input Format

The first line contains an integer, N, the number of integers in A.
The second line contains N space-separated integers that make up A.

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static int[] reverseArray(int[] a) {
        int temp;
        for(int i=0;i<a.length/2; i++){
            
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
            
        }
        
        return a;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
