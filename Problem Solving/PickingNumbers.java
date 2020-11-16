/*
Picking Numbers

Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to .

Example
a = [1,1,2,2,4,4,5,5,5]
There are two subarrays meeting the criterion: [1,1,2,2] and [4,4,5,5,5]. The maximum length subarray has 5 elements.

Function Description
Complete the pickingNumbers function in the editor below.
pickingNumbers has the following parameter(s):

      int a[n]: an array of integers
      
Returns

      int: the length of the longest subarray that meets the criterion

Input Format

The first line contains a single integer n, the size of the array a.
The second line contains n space-separated integers, each an a[i].

Sample Input 0

       6
       4 6 5 3 3 1
       
Sample Output 0

       3
       
Sample Input 1

       6
       1 2 2 3 1 2
       
Sample Output 1

       5

*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int pickingNumbers(List<Integer> a) {
        int max=0;
        for(int i=0; i<a.size(); i++){
            int temp=0;
            Collections.sort(a);
            for(int j=i; j<a.size(); j++){
                if(Math.abs(a.get(i) - a.get(j)) <= 1)
                {
                    temp++;
                }
                else
                    break;
            }
            if(temp>max)
            max=temp;
            
            
        }
        return max;
        
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
