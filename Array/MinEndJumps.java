import java.util.Scanner;

public class MinEndJumps {
    static int minJumps(int arr[])
    {
        if (arr.length <= 1)
            return 0;

        // Return -1 if not possible to jump
        if (arr[0] == 0)
            return -1;

        // initialization
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        // Start traversing array
        for (int i = 1; i < arr.length; i++) {
            // Check if we have reached 
// the end of the array
            if (i == arr.length - 1)
                return jump;

            // updating maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            // we use a step to get to the current index
            step--;

            // If no further steps left
            if (step == 0) {
                // we must have used a jump
                jump++;

                // Check if the current 
// index/position or lesser index
                // is the maximum reach point 
// from the previous indexes
                if (i >= maxReach)
                    return -1;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                step = maxReach - i;
            }
        }

        return -1;
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
        
        System.out.println(minJumps(arr));
        
        sc.close();
    }

    
}
