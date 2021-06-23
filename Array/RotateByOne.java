import java.util.*;

public class RotateByOne {

    static void PrintArray(int arr[], int n){
        for(int i=0;i<n;i++)
        
            System.out.print(arr[i]+" ");
        System.out.println(" ");
    }

    static void rotate(int arr[], int n){
        int i,x;
        x=arr[n-1];
        for(i=n-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=x;

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

        rotate(arr,n);
        PrintArray(arr,n);

    sc.close();
    }
}
