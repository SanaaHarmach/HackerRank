/*
Drawing Book
A teacher asks the class to open their books to a page number. A student can either start turning pages from the front of the book or from the back of the book. 
They always turn pages one at a time. When they open the book, page 1 is always on the right side.
When they flip page 1, they see pages 2 and 3. Each page except the last page will always be printed on both sides. 
The last page may only be printed on the front, given the length of the book. If the book is , pages long, and a student wants to turn to page p, 
what is the minimum number of pages to turn? They can start at the beginning or the end of the book.

Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page p.

Function Description
Complete the pageCount function in the editor below.
pageCount has the following parameter(s):

   int n: the number of pages in the book
   int p: the page number to turn to
   
Returns

   int: the minimum number of pages to turn
   
Input Format

The first line contains an integer n, the number of pages in the book.
The second line contains an integer, p, the page to turn to.
   
Sample Input 0

   6
   2

Sample Output 0

   1

Sample Input 1

   5
   4

Sample Output 1

   0



*/


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    
    static int pageCount(int n, int p) {
        int totalPageTurnCountFromFront = n/2;
        int targetPageTurnCountFromFront = p/2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront -  targetPageTurnCountFromFront;
    return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
