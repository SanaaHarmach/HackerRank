/*
Find Digits:
An integer d is a divisor of an integer n if the remainder of n%10=0.
Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

Note: Each digit is considered to be unique, so each occurrence of the same digit should be counted (e.g. for n=111, 1 is a divisor of 111 each time it occurs so the answer is 3).

Function Description
Complete the findDigits function in the editor below. It should return an integer representing the number of digits of d that are divisors of d.
findDigits has the following parameter(s):

  n: an integer to analyze

Input Format
The first line is an integer, t, indicating the number of test cases.
The t subsequent lines each contain an integer, n.

Output Format
For every test case, count the number of digits in n that are divisors of n. Print each answer on a new line.

Sample Input

     2
     12
     1012
     
Sample Output

     2
     3
     
Explanation
The number 12 is broken into two digits, 1 and 2. When 12 is divided by either of those two digits, the remainder is 0 so they are both divisors.
The number 1012 is broken into four digits, 1, 0, 1, and 2. 1012 is evenly divisible by its digits 1, 1, and 2, but it is not divisile by 0 as division by zero is undefined.


*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static int findDigits(int n) {
        int count=0;
        int num=n;
        while(num>0){
            int digit=num%10;
            if(digit!=0 && n%digit==0)
                count++;
            num/=10;
        }
        
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
