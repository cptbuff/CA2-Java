// Repo Link: https://github.com/cptbuff/CA2-Java.git

package tasktwo;

import java.util.Scanner;

/**
 *
 * @author FrancisK
 */
public class TaskTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter 2D array size:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // user input as size
        int rowA = size;
        int rowB = size;
        int[][] array2D = new int[rowA][rowB];

        // Takes user input as array based on size
        int[] a = new int[size];
        System.out.println("Enter " + size + " elements for array a: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        int[] b = new int[size];
        System.out.println("Enter " + size + " elements for array b: ");
        for (int j = 0; j < size; j++) {
            System.out.println("Element " + (j + 1) + ": ");
            b[j] = scanner.nextInt();
        }

        // Populate the 2D array with multiplied values
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < rowB; j++) {
                array2D[i][j] = a[i] * b[j]; // Multiply corresponding elements
            }
        }

        // Print the 2D array
        System.out.println("2D Array contents:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < rowB; j++) {
                System.out.print(array2D[i][j] + " "); // Print each element in the row
            }
            System.out.println(); // Move to the next row
        }
    }
}
