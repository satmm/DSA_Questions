import java.util.Scanner;

public class inseting_element_in_the_sorted_array {
    public static void main(String[] args) {
        int [] arr = new int[20];
        int i;
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        System.out.println("enter the array elements :");
        for ( i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements are :");
        for (i=0;i<n ;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("enter the new element to insert in the array :");
        int newelement = sc.nextInt();
        enterelementforsortedarray(arr,n,newelement);
    }
    static void enterelementforsortedarray(int[] arr, int n, int newElement) {
        int i = n - 1;

        // Shift elements to make space for the new element
        while (i >= 0 && arr[i] > newElement) {
            arr[i + 1] = arr[i];
            i--;
        }

        // Insert the new element at the correct position
        arr[i + 1] = newElement;

        n++; // Increase the size of the array

        System.out.println("Array after inserting the new element:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
