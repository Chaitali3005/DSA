import java.util.Scanner;

public class SortNegativePositive {

    static void PrintArray(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        
            System.out.print(arr[i]+" ");
        System.out.println(" ");
    }

    static void sort(int arr[], int n)
    {
        int j=0,temp;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                if(i!=j)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        PrintArray(arr,n);

    }
    public static void main (String args[]){

        System.out.println("Enter Array Length:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
    
        }
        System.out.println("Array is:");
        PrintArray(arr,n);

        System.out.println("Sorted Array is:");
        sort(arr,n);

        sc.close();

    }
    
}
