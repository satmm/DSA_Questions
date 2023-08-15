                /* adding multiple elements at the end of the array */


//import java.util.Scanner;
//public class Inserting_element_at_the_end_of_the_array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i;
//        System.out.println("enter the size of the array");
//        int size = sc.nextInt();
//       int[] arr = new int[size];
//        System.out.println("enter the number of elements");
//        int n = sc.nextInt();
//        System.out.println("enter the array elements");
//        for ( i = 0; i <n; i++) {
//            arr[i]= sc.nextInt();
//        }
//
//        for ( i = 0; i <arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println("Enter the number of new elements :");
//      int newelements = sc.nextInt();
//      n=n+newelements;
//        for ( i = 0; i <newelements; i++) {
//            System.out.println(arr[i]);
//        }
////        int newsize = n+newelements;
////
////        int[] newarray = new int[newsize];
////
////        for (i=0;i<n;i++)
////            newarray[i] =arr[i];
////
////        System.out.println("enter the new elements");
////        for(i=n;i<newsize;i++)
////            newarray[i]= sc.nextInt();
////
////        for ( i = 0; i <newarray.length; i++) {
////            System.out.println(newarray[i]);
////        }
//    }
//}






    /* Another approach */

import java.util.Scanner;

public class Inserting_element_at_the_end_of_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        System.out.println("Array elements before adding new elements:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the number of new elements to add:");
        int numNewElements = sc.nextInt();
        System.out.println("Enter the new elements to add:");
        for (i = n; i < n + numNewElements; i++) {
            arr[i] = sc.nextInt();
        }

        n += numNewElements; // Update the number of elements

        System.out.println("Array elements after adding new elements:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}



                /*      adding a single element at the last index */

//import java.util.Scanner;
//
//public class Inserting_element_at_the_end_of_the_array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i;
//
//        System.out.println("Enter the size of the array:");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        System.out.println("Enter the number of elements:");
//        int n = sc.nextInt();
//        System.out.println("Enter the array elements:");
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//
//        System.out.println("Array elements before adding new elements:");
//        for (i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("enter the new element");
//        int newelement = sc.nextInt();
//        arr[n]=newelement;
//        for (i = 0; i <= n; i++) {
//            System.out.println(arr[i]);
//        }
//
//
//    }
//}
//
