/*
Cats and a Mouse

Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
You are given q queries in the form of x, y, and z representing the respective positions for cats A and B, and for mouse C. Complete the function  to return the appropriate answer to each query, which will be printed on a new line.

   If cat A catches the mouse first, print Cat A.
   If cat B catches the mouse first, print Cat B.
   If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.

Example

   x=2
   y=5
   z=4

The cats are at positions 2 (Cat A) and 5 (Cat B), and the mouse is at position 4. Cat B, at position  will arrive first since it is only 1 unit away while the other is 2 units away. Return 'Cat B'.

Function Description
Complete the catAndMouse function in the editor below.
catAndMouse has the following parameter(s):

  int x: Cat A's position
  int y: Cat B's position
  int z: Mouse C's position

Returns
  string: Either 'Cat A', 'Cat B', or 'Mouse C'
  
Input Format
The first line contains a single integer, q, denoting the number of queries.
Each of the q subsequent lines contains three space-separated integers describing the respective values of x (cat A's location), y (cat B's location), and z (mouse C's location).

Sample Input 0

     2
     1 2 3
     1 3 2
     
Sample Output 0

     Cat B
     Mouse C

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static String catAndMouse(int x, int y, int z) {
        if(Math.abs(z-x)<Math.abs(z-y))
            return "Cat A";
        
        else if(Math.abs(z-x)>Math.abs(z-y))
            return "Cat B";
        
        else 
            return "Mouse C";
 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}


