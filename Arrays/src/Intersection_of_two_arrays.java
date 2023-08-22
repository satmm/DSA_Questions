public class Intersection_of_two_arrays {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,6,7,8,99};
        int[] arr2 = {2,3,4,5,66,77,99};
        int m = arr1.length;
        int n = arr2.length;

      intersection(arr1,arr2,m,n);

    }
    static  void intersection(int[]arr1,int[] arr2,int m ,int n)
    {
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(arr1[i]<arr2[j])
                i++;
            else if (arr2[j]<arr1[i]) {
                j++;
            }
            else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }
}
