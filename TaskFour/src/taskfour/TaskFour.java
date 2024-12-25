// Repo LInk: https://github.com/cptbuff/CA2-Java.git

package taskfour;

import java.util.Scanner;

/**
 *
 * @author FrancisK
 */
public class TaskFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter matrix size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); //sets
        int rows = size;
        int cols = size;
        int[][] array2D = new int[rows][cols];
        int top = 0, bottom = size - 1, left = 0, right = size - 1;



        // Takes user input as array based on size
        int[] a = new int[size];
        System.out.println("Enter " + size + " elements for array a: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        
        // Takes user input as array based on size
        int[] b = new int[size];
        System.out.println("Enter " + size + " elements for array b: ");
        for (int j = 0; j < size; j++) {
            System.out.println("Element " + (j + 1) + ": ");
            b[j] = scanner.nextInt();
        }
        
        // create matrix from user defined arrays 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = a[i] * b[j];
            }
        }
        
        // print matrix
        System.out.println();
        System.out.println("2D Array contents:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        
        //prints spiral array based on matrix
        System.out.println();
        System.out.println("Spiral Array:");

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(array2D[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(array2D[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(array2D[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(array2D[i][left] + " ");
                }
                left++;
            }
        }
    }
}