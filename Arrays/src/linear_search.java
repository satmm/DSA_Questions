import java.util.Scanner;

public class linear_search
{
    public static void main(String[] args) {
        int[] arr = new int[20];
        Boolean flag =false;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. array elements ");
        int n = sc.nextInt();
        System.out.println("enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the key element to search");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i]==key) {
                System.out.println("key element found at " + (i + 1) + " Position");
                 flag=true;
                 break;
            }

        }
        if(!flag)
            System.out.println("element not found");
    }
}
