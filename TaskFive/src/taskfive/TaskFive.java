// Repo Link: https://github.com/cptbuff/CA2-Java.git

package taskfive;

import java.util.Scanner;
import java.util.Arrays;

public class TaskFive {

    public static void main(String[] args) {
        System.out.println("Enter array size:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // user input as size

        // Takes user input as array based on size
        int[] a = new int[size];
        System.out.println("Enter " + size + " elements for array a: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        // Bubble sort logic
        int n = a.length;
        boolean swapped;
        int temp;

        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparison
                if (a[j] > a[j + 1]) {
                    // Swap adjacent elements if they are in the wrong order
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred during this pass, array is sorted
            if (!swapped) {
                break;
            }
        }

        // Print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
}
