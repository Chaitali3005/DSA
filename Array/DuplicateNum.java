import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNum {
    static void PrintArray(int arr[], int n){
        for(int i=0;i<n;i++)
        
            System.out.print(arr[i]+" ");
        System.out.println(" ");
    }

    static int duplinumarr(int[] arr)
    {
        Set<Integer> seen=new HashSet<Integer>();
        for(int n:arr)
        {
            if(seen.contains(n))
            return n;
        seen.add(n);
        }
        
        return -1;
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
        
        System.out.println(duplinumarr(arr));
        
        sc.close();
    }  
}
