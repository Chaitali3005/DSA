import java.util.*;

public class MinHeight {
    static void PrintArray(int arr[], int n){
        for(int i=0;i<n;i++)
        
            System.out.print(arr[i]+" ");
        System.out.println(" ");
    }

    public static int getMinDiff(int[] arr,int n,int k){
        if (n == 1)
        return 0;

        // Sort all elements
        Arrays.sort(arr);

        // Initialize result
        int ans = arr[n-1] - arr[0];

        // Handle corner elements
        int small = arr[0] + k;
        int big = arr[n-1] - k;
        int temp = 0;
        
        if (small > big)
        {
            temp = small;
            small = big;
            big = temp;
        }

        // Traverse middle elements
        for (int i = 1; i < n-1; i ++)
        {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            // If both subtraction and addition
            // do not change diff
            if (subtract >= small || add <= big)
                continue;

            // Either subtraction causes a smaller
            // number or addition causes a greater
            // number. Update small or big using
            // greedy approach (If big - subtract
            // causes smaller diff, update small
            // Else update big)
            if (big - subtract <= add - small)
                small = subtract;
            else
                big = add;
        }

        return Math.min(ans, big - small);
    
    }
    public static void main(String[] args) {
        int n,k;
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter No. of Elements in Array:");
        n=sc.nextInt();
        System.out.println("Enter value of K:");
        k=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        arr[i]=sc.nextInt();  
        }  

        System.out.println("Array is:");
        PrintArray(arr, n);

        System.out.println("Minimum Difference is: "+getMinDiff(arr,n,k));
        


        sc.close();
    }
}
