import java.util.Scanner;

public class Sort012 {
    static void PrintArray(int arr[], int n){
        for(int i=0;i<n;i++)
        
            System.out.print(arr[i]+" ");
        System.out.println(" ");
    }

    static  void sortarray(int arr[],int n){
        int i=0,c0=0,c1=0,c2=0;

        for(i=0;i<n;i++)
        {
            switch(arr[i])
            {
                case 0: 
                c0++;
                break;

                case 1:
                c1++;
                break;

                case 2:
                c2++;
                break;
            }
        }
        i=0;
        while(c0>0)
        {
            arr[i++]=0;
            c0--;
        }
        while(c1>0)
        {
            arr[i++]=1;
            c1--;
        }
        while(c2>0)
        {
            arr[i++]=2;
            c2--;
        }

        PrintArray(arr, n);
    }
        public static void main(String[] args) {
        int n;
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter No. of Elements in Array:");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:(only 0,1,2) ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        arr[i]=sc.nextInt();  
        }  

        System.out.println("Array is:");
        PrintArray(arr, n);
        sc.close();

        System.out.println("The sorted Array is:");
        sortarray(arr,arr.length);
        

        
    }

    
}
