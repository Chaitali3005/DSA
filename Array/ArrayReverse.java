package Array;

import java.util.*;
class ArrayReverse{

    static void PrintArray(int arr[], int n){
        for(int i=0;i<n;i++)
        
            System.out.print(arr[i]+" ");
        System.out.println(" ");
    }

    static void Reverse(int arr[], int start, int end){
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        Reverse(arr, start+1, end-1);
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

        Reverse(arr,0,n-1);

        System.out.println("Reversed Array is:");
        PrintArray(arr, n);
        
        sc.close();
    }
}