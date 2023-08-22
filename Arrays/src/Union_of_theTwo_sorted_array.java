import java.util.Scanner;

public class Union_of_theTwo_sorted_array {
    public static void main(String[] args) {
        int arr1[] = new int[20];
        int arr2[] = new int[20];
        System.out.println("Enter the number of elements on Array-1 :");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("enter the array elements :");
        for (int i = 0; i < n1; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the number elements in Array-2 :");
        int n2 = sc.nextInt();
        System.out.println("enter the array elements :");
        for (int i = 0; i < n2; i++) {
            arr2[i]=sc.nextInt();
        }
        printunion(arr1,n1,arr2,n2);
    }
    static void printunion(int[] arr1 , int n1 , int[] arr2 , int n2)
    {
        int i=0,j=0;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j])
            {
                System.out.println(arr1[i++]);
            }
            else if(arr2[j]<arr1[i])
            {
                System.out.println(arr2[j++]);
            }
            else {
                System.out.println(arr2[j]);
                i++;
                j++;
            }
        }
        while (i<n1)
            System.out.println(arr1[i++]);
        while (j<n2)
            System.out.println(arr2[j++]);
    }

}
