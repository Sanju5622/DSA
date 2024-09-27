import java.util.*;

public class MergeSort{

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements in array:");

        int n = sc.nextInt();


        int [] arr= new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Given array:");
        printarr(arr);


        sort(arr,0,arr.length-1);

        System.out.println("\nSorted Array:");
        printarr(arr);
    }

    public static  void merge(int [] arr,int left,int middle,int right)
    {
        // to find the size of the subarrays
        int s1 = middle - left+1;
        int s2 = right - middle;

        //temp Array

        int []a = new int[s1];
        int []b = new int[s2];

        //copy values to the temp Array

        for(int i = 0;i<s1;i++)

            a[i]= arr[left+i];
        for(int j =0;j<s2;j++)

            b[j]=arr[middle+1+j];


        int i =0,j=0;

        int k = left;

        while(i<s1 && j<s2)
        {
            if(a[i]<=b[j])
            {
                arr[k]=a[i];
                i++;
            }
            else
            {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while(i<s1)
        {
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<s2)
        {
            arr[k]=b[j];
            j++;
            k++;
        }


    }

    public static void sort (int[]arr,int left,int right)
    {
        if(left<right)
        {
            int middle = (left+right)/2;

            sort(arr,left,middle);
            sort(arr,middle+1,right);

            merge(arr,left,middle,right);
        }
    }

    public static void printarr(int []arr)
    {
        int n = arr.length;
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
