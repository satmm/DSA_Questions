import java.util.Arrays;
import java.util.Scanner;

public class adding_element_in_middle_array {
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

            System.out.println("enter the new element to add :");
            int newelement = sc.nextInt();
            System.out.println("enter the position to insert the element");
            int pos = sc.nextInt();
            add_element(arr , newelement,pos,n);
            n++;
            for (i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }

    }

    static void add_element(int[]arr , int newelement , int pos,int n)
    {
        for (int i=n-1;i>=pos;i--)
        {
            arr[i+1]=arr[i];

        }
        arr[pos]=newelement;
    }
}
