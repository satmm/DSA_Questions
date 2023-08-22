public class union_of_two_arrray_elements_handling_duplicate {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 2, 3};
        int[] arr2 = {2, 3, 4, 5};
        UnionArray(arr1,arr2);
    }


    static void UnionArray(int[] arr1 , int[] arr2)
    {
        int m = arr1[arr1.length-1];
        int n = arr2[arr2.length-1];

        int max =0;

        if (m>n)
        {
            max = m;
        }
        else {
            max = n;
        }

        int[] unique_element_array = new int[max+1];

        System.out.println(arr1[0]);

        ++ unique_element_array[arr1[0]];

        for (int i = 1; i <arr1.length ; i++) {
            if(arr1[i]!=arr1[i-1]){
                System.out.println(arr1[i]);
                ++ unique_element_array[arr1[i]];
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if(unique_element_array[arr2[j]]==0)
            {
                System.out.println(arr2[j]);
                ++ unique_element_array[arr2[j]];
            }
        }

    }

}



