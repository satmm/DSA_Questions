import java.util.Scanner;

public class delete_element_from_array {
    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println("enter the number of eleements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] =  sc.nextInt();
        }
        System.out.println("eneter the element to delete");
        int key = sc.nextInt();
        System.out.println("array before deletion :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        delete(arr,n-1,key);
        System.out.println("array after deletion :");
        for (int i = 0; i < n-1; i++) {
            System.out.println(arr[i]);
        }
    }
    static  void delete(int[] arr , int n , int key)
    {
        int pos = search(arr,n,key);
        if(pos==-1)
        {
            System.out.println("element not found !!!!");
            return;
        }
        else
            for (int i = pos; i <=n; i++) {
                arr[i]=arr[i+1];

            }
    }
    static int search(int[] arr , int n , int key)
    {
        for (int i = 0; i <= n; i++) {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
