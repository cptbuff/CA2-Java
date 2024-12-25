// Repo link: https://github.com/cptbuff/CA2-Java.git

package taskone;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author FrancisK
 */
public class TaskOne {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter size:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // user input as size
        boolean hasRepeated = false; // used later to track if a number has repeated

        //  takes user input as array based on size
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements: ");
        
        for(int i=0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }               
                
        System.out.println("You entered: ");
        for(int i=0; i < size; i++) {
            System.out.println(array[i]);
        }
                
        //scans inputs for repeated numbers. max = highest number in array
        int max = Arrays.stream(array).max().getAsInt(); // finds max value in the array
        //counting how many times each input appears in the array
        for (int i = 0; i <= max; i++) {
            int target = i;
            int count = 0;

            for (int num : array) {
                if (num == target) {
                    count++;       
                }
            }
        if (count > 1) { // without this we are told all the numbers in between that aren't included in the array
            System.out.println("First repeated element = " + target + " repeated  " + count + " times ");
            hasRepeated = true;
            break;
            }
        } if (!hasRepeated) {
                System.out.println("No repeated elements!");
        }
        
        scanner.close();
     
    }
}
