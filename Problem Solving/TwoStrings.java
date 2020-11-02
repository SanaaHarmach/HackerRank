/*
Two Strings

Given two strings, determine if they share a common substring. A substring may be as small as one character.
For example, the words "a", "and", "art" share the common substring . The words "be" and "cat" do not share a substring.

Function Description
Complete the function twoStrings in the editor below. It should return a string, either YES or NO based on whether the strings share a common substring.
twoStrings has the following parameter(s):

      s1, s2: two strings to analyze.

Input Format
The first line contains a single integer p, the number of test cases.
The following p pairs of lines are as follows:
- The first line contains string s1.
- The second line contains string s2.

Output Format
For each pair of strings, return YES or NO.

Sample Input

       2
       hello
       world
       hi
       world
       
Sample Output

       YES
       NO
       
Explanation
We have  pairs to check:

1. s1 = "hello",s2 = "world". The substrings "o" and "l" are common to both strings.
2. s2 = "hi",s2 = "world". s1 and s2 share no common substrings.

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String twoStrings(String s1, String s2) {
        String [] array1 = s1.split("");
        String [] array2 = s2.split("");
        
        Set<String> set1 = new HashSet();
        Collections.addAll(set1,array1);
        
        Set<String> set2 = new HashSet();
        Collections.addAll(set2,array2);
        
        boolean result = Collections.disjoint(set1,set2);
        if(result)
            return "NO";
            
        else
            return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
