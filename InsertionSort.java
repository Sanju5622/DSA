import java.util.*;

public class InsertionSort
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of elements in the array:");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.print("Elements of the array:");

        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Original array:");
        printarr(arr);


        insertionsort(arr);

        System.out.println("Sorted array:");

        printarr(arr);



        sc.close();


    }

    public static void insertionsort(int []arr)
    {
        int n =arr.length;
        for(int i =1;i<n;i++)
        {
            int key = arr[i]; // starting value of the array
            int j = i-1;  // inserting the element in a correct position


            while(j >=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void printarr(int []arr)
    {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
