import java.util.Scanner;
public class Inserting_element_in_the_begining_of_the_array {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements before adding new elements:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the number of new elements to add at the beginning:");
        int numNewElements = sc.nextInt();
        int newElements[] = new int[numNewElements];
        System.out.println("Enter the new elements to add:");
        for (i = 0; i < numNewElements; i++) {
            newElements[i] = sc.nextInt();
        }

        // Shift existing elements to make space for the new elements
        for (i = n - 1; i >= 0; i--) {
            arr[i + numNewElements] = arr[i];
        }

        // Add the new elements at the beginning of the array
        for (i = 0; i < numNewElements; i++) {
            arr[i] = newElements[i];
        }

        n += numNewElements; // Update the number of elements

        System.out.println("Array elements after adding new elements at the beginning:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    }


