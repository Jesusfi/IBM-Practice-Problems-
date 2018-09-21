import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        //An array that will hold numbers that need to be shifted
        int [] sliceA = new int [d]; 
        //initialized a counter to keep track of the index of a seperate from the loop 
        int counter = 0; 
        
        //Go through array 'a' and decide in which array each number goes
        for(int i = 0; i < a.length; i++){
            //if the number is in range of the ones to be rotated then place in into array 'sliceA' 
            if(i < d){
                sliceA[i] = a[i];
            }else{
                //else update the front of array 'a' to hold that value 
                a[counter] = a[i];
                //increase the counter
                counter++; 
            }
            
        }
        //Go through array 'sliceA' and put the values back into array 'a'
        for(int k = 0; k < sliceA.length; k++){
            //use the counter to find the position that where the values will be inputed 
            a[counter] = sliceA[k]; 
            //increase the counter
            counter++;  
        }
    //return the array 
    return a; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
