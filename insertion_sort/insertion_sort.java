import java.util.*;
class InsertionSort
{
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
 
    /* A function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Main method
    public static void main(String args[])
    {        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");

        int n=sc.nextInt();
        int arr[]=new int[n];
	    System.out.println("Enter elements");
	    


    for(int i=0;i<n;i++)
    {					//for reading array
        arr[i]=sc.nextInt();

    }
 
        InsertionSort ob = new InsertionSort();        
        ob.sort(arr);
         
        printArray(arr);
    }
}
}
