
import java.util.*;

public class MaxMin{

    /* Class Pair is used to return two values from getMinMax() */
    static class Pair {
 
        int min;
        int max;
    }
 
    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;
        /* If array has even number of elements then 
    initialize the first two elements as minimum and 
    maximum */
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            } else {
                minmax.min = arr[0];
                minmax.max = arr[1];
            }
            i = 2;
            /* set the starting index for loop */
        } /* If array has odd number of elements then 
    initialize the first element as minimum and 
    maximum */ else {
            minmax.min = arr[0];
            minmax.max = arr[0];
            i = 1;
            /* set the starting index for loop */
        }
 
        /* In the while loop, pick elements in pair and 
     compare the pair with max and min so far */
        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                }
                if (arr[i + 1] < minmax.min) {
                    minmax.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > minmax.max) {
                    minmax.max = arr[i + 1];
                }
                if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
            i += 2;
            /* Increment the index by 2 as two 
               elements are processed in loop */
        }
 
        return minmax;
    }

    static void PrintArray(int arr[], int n){
        for(int i=0;i<n;i++)
        
            System.out.print(arr[i]+" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int n;
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter No. of Elements in Array:");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        arr[i]=sc.nextInt();  
        }  

        System.out.println("Array is:");
        PrintArray(arr, n);
        

        Pair minmax = getMinMax(arr, n);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

        
        sc.close();
    }

}

