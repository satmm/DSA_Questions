import java.util.Scanner;

public class Find_ceeling_of_theElement_using_linear_search {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,22,44,45,56};
        System.out.println("Enter one  Element ");
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        int index = findcieling(arr,ele,0,arr.length);
        System.out.println(arr[index]);
    }
    static int findcieling(int[]arr , int ele,int low , int high)
    {
        if(ele<arr[low])
            return low;
        for (int i = low; i < high; i++) {
            if(arr[i]==ele)
            return i;

             if (arr[i]<ele && arr[i+1]>=ele) {
                return i+1;
            }

        }
        return -1;
    }
}
