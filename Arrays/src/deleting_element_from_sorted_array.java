import java.util.Scanner;

public class deleting_element_from_sorted_array {
    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println("enter the number of elements :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the element to be deleted :");
        int key = sc.nextInt();
        System.out.println("array before deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }

        n=delete(arr,n,key);
        System.out.println("\narray after deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    static int delete(int[] arr , int n , int key)
    {
        int pos = binarysearch(arr,0,n,key);
        if(pos==-1)
        {
            System.out.println("element not found");
            return n ;
        }
        else
        {
            for (int i = pos; i < n; i++) {
                arr[i]=arr[i+1];
            }
        }
        return n-1;
    }


    static int binarysearch(int[] arr, int first, int last, int key) {
        if (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == key)
                return mid;
            else if (key < arr[mid])
                return binarysearch(arr, first, mid - 1, key);
            else
                return binarysearch(arr, mid + 1, last, key);
        }
        return -1;
    }
}
