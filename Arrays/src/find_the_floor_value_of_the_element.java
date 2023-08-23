import java.util.Scanner;

public class find_the_floor_value_of_the_element {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,22,33,44,67};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter one element :");
        int key = sc.nextInt();
       int index = floorValue(arr,key);
        if(index==-1)
            System.out.println("key not found");
        else
            System.out.println(arr[index]);
    }
    static int floorValue(int[]arr,int key){
        if(key<arr[0])
            return -1;
        if(key>=arr[arr.length-1])
        {
            return arr.length-1;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>key)
            return (i-1);
        }
        return -1;
    }

}
