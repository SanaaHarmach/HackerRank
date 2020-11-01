/*
2D Array - DS

Given a 6x6 2D Array, arr:

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    
An hourglass in A is a subset of values with indices falling in this pattern in arr's graphical representation:

    a b c
      d
    e f g
    
There are 16 hourglasses in arr. An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum. The array will always be 6x6.

Example
arr=

    -9 -9 -9  1 1 1 
     0 -9  0  4 3 2
    -9 -9 -9  1 2 3
     0  0  8  6 6 0
     0  0  0 -2 0 0
     0  0  1  2 4 0
     
The 16 hourglass sums are:

    -63, -34, -9, 12, 
    -10,   0, 28, 23, 
    -27, -11, -2, 10, 
      9,  17, 25, 18
      
The highest hourglass sum is 28 from the hourglass beginning at row 1, column 2:

    0 4 3
      1
    8 6 6

Function Description
Complete the function hourglassSum in the editor below.
hourglassSum has the following parameter(s):

  int arr[6][6]: an array of integers
  
Returns

  int: the maximum hourglass sum
  
Input Format

Each of the 6 lines of inputs arr[i] contains 6 space-separated integers arr[i][j].

Constraints
  -9 <= arr[i][j] <= 9
   0 <= i,j <= 5

Output Format

Print the largest (maximum) hourglass sum found in .

Sample Input

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 2 4 4 0
    0 0 0 2 0 0
    0 0 1 2 4 0
    
Sample Output

    19

Explanation

arr contains the following hourglasses:

    1 1 1    1 1 0    1 0 0    0 0 0       
      1        0        0        0
    1 1 1    1 1 0    1 0 0    0 0 0
    
    0 1 0    1 0 0    0 0 0    0 0 0
      1        1        0        0
    0 0 2    0 2 4    2 4 4    4 4 0
    
    1 1 1    1 1 0    1 0 0    0 0 0       
      0        2        4        4
    0 0 0    0 0 2    0 2 0    2 0 0
    
    0 0 2    0 2 4    2 4 4    4 4 0
      1        0        2        0
    0 0 1    0 1 2    1 2 4    2 4 0
    

The hourglass with the maximum sum (19) is:

    2 4 4
      2
    1 2 4

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int hourglassSum(int[][] a) {
        int sum = Integer.MIN_VALUE;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                int temp = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] 
                           + a[i+2][j+1] + a[i+2][j+2];
                if (temp>sum)
                   sum = temp;
            }
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


