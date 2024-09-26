import java.util.*;

public class BinarySearch
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = sc.nextInt();

        int [] a = new int[n];
        System.out.println("Enter the elements of the array (sorted):");
        for(int i =0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Element need to be search:");
        int target = sc.nextInt();

        int result=binarysearch(a,target);

        if(result==-1)
        {
            System.out.println("no not found ");
        }
        else{
            System.out.println("no found at index: "+result);
        }
        sc.close();
    }

    public static int binarysearch(int [] a, int target)
    {
        int left = 0;
        int right = a.length-1;


        while(left <= right)
        {
            int m = left+(right-left)/2;

            if(a[m]==target)
            {
                return m;
            }
            if(a[m]<target)
            {
                left= m+1;
            }
            else{
                right = m-1;
            }
        }
        return -1;
    }
}
