public class intersection_of_three_arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,12,13,14,15,33,44};
        int[] arr2 = {2,4,5,7,8,9,22,33};
        int[] arr3 = {1,2,3,4,33};
        intersection_of_three_arrays(arr1,arr2,arr3);
    }
    static void intersection_of_three_arrays(int[]arr1,int[]arr2,int[]arr3)
    {
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length && k<arr3.length)
        {
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
            {
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            }
           else if(arr1[i]<arr2[j])
                i++;
            else if (arr2[j]<arr3[k]) {
                j++;
            }
            else
                k++;
        }
    }

}
