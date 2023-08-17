import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = new int[20];

        System.out.println("Enter the no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to search :");
        int key = sc.nextInt();
        int target = binarySearch(arr, 0, n-1, key);
    if(target!=-1)
        System.out.println(("element found at "+ (target+1)));
        else
            System.out.println("element not found");

    }


    static int binarySearch(int[] arr, int start, int end, int key) {
        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                return binarySearch(arr, start, mid - 1, key);
            } else {
                return binarySearch(arr, mid + 1, end, key);
            }
        }
        return -1; // Key not found
    }
}

