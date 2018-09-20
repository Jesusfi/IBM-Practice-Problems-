import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution2 {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int countQueries []  = new int[queries.length];
        HashMap<String, Integer> stringCount= new HashMap<String, Integer>(); 
        
        for(int i = 0; i < strings.length; i++){
            String currentString = strings[i];
            if(stringCount.containsKey(currentString)){
                int tempCounter = stringCount.get(currentString);
                tempCounter++; 
                stringCount.put(currentString,tempCounter); 
            }else{
                stringCount.put(currentString,1);
            }
        }
        for(int j = 0; j < queries.length; j++){
            if(stringCount.containsKey(queries[j])){
                countQueries[j] = stringCount.get(queries[j]);
            }else{
                countQueries[j] = 0; 
            }
        }

// this was the first successful attempt with time complexity of O(s*q)
//     for(int i = 0; i < queries.length; i++){
//         int counter = 0; 
//         for(int j = 0; j < strings.length; j++){
//             if(queries[i].equals(strings[j])){
//                 counter++; 
//             }
//         }
//         countQueries[i] = counter;  
        
//     }
        return countQueries;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
