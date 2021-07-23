import java.util.*;

public class Kadane{
    static int largestsubarraysum(int arr[],int n){
        int curr_max=arr[0];
        int max_so_far=arr[0];

        for(int i=1;i<n;i++)
        {
            curr_max=Math.max(arr[i],curr_max+arr[i]);
            max_so_far=Math.max(max_so_far,curr_max);
        }
        return max_so_far;
    }

    static void PrintArray(int[] arr, int n ){
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

    }

    public static void main(String args[]){
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

       System.out.println(largestsubarraysum(arr,n));

       sc.close();
   }
    }
