import java.util.Scanner;

public class MergeArrayDescending {

    static void mergeArray(int[] arr1,int[] arr2,int n,int m)
    {
       for(int i=0;i<n;i++)
       {
           if(arr1[i]>arr2[0])
           {
               int temp=arr1[i];
               arr1[i]=arr2[0];
               arr2[0]=temp;

               int firstElement=arr2[0];
               int k;
               for(k=1;k<m && arr2[k]<firstElement;k++)
               {
                   arr2[k-1]=arr2[k];
               }
               arr2[k-1]=firstElement;
           }
       } 
       System.out.println("The result is:");
       PrintArray(arr1,n);
       PrintArray(arr2, m);
    }

    static void PrintArray(int arr[], int n){
        for(int i=0;i<n;i++)
        
            System.out.print(arr[i]+" ");
        System.out.println(" ");
    }

    public static void main(String[] args)
	{
        int n=0,m=0;
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter No. of Elements in Array A:");
        n=sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        arr1[i]=sc.nextInt();  
        }  
        
        System.out.println("Enter No. of Elements in Array B:");
        m=sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<m; i++)  
        {  
        //reading array elements from the user   
        arr2[i]=sc.nextInt();  
        }  

        System.out.println("Array A is:");
        PrintArray(arr1, n);
        System.out.println("Array B is:");
        PrintArray(arr2, m);
        
		mergeArray(arr1,arr2,n,m);
        sc.close();
	}
}
