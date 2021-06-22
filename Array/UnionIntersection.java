import java.util.HashSet;
import java.util.Scanner;
public class UnionIntersection {
    static void PrintArray(int arr[], int n){
        for(int i=0;i<n;i++)
        
            System.out.print(arr[i]+" ");
        System.out.println(" ");
    }

    static void printUnion(int arr1[],int arr2[],int n,int m)
    {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<n;i++)
        hs.add(arr1[i]);

        for(int i=0;i<m;i++)
        hs.add(arr2[i]);

        System.out.println(hs);

    }

    static void printIntersection(int arr1[],int arr2[],int n,int m)
    {
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<n;i++)
        hs.add(arr1[i]);

        for(int i=0;i<m;i++)
        if(hs.contains(arr2[i]))
        System.out.print(arr2[i]+" ");
        

    }


    public static void main(String[] args) {
        int n,m;
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter No. of Elements in First Array:");
        n=sc.nextInt();
        int[] arr1 = new int[n];
        
        System.out.println("Enter the elements of the first array: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        arr1[i]=sc.nextInt();  
        }  
        System.out.println("Enter No. of Elements in Second Array:");
        m=sc.nextInt();
        int[]arr2=new int[m];
        System.out.println("Enter the elements of the second array: ");  
        for(int i=0; i<m; i++)  
        {  
        //reading array elements from the user   
        arr2[i]=sc.nextInt();  
        }  
        System.out.println("First Array is:");
        PrintArray(arr1, n);
        System.out.println("Second Array is:");
        PrintArray(arr2, m);
        

        System.out.println("Union of two arrays is : ");
        printUnion(arr1, arr2,n,m);
        
        System.out.println("Intersection of two arrays is : ");
        printIntersection(arr1, arr2,n,m);
        sc.close();
    }
}
