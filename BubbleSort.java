import java.util.*;

public class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("No of elements in array:");
        int n = sc.nextInt();

        int []nums = new int[n];

        System.out.println("Elements of the array:");
        for(int i =0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }

        System.out.print("original array:");
        for(int num:nums)
        {
            System.out.print(num+" ")  ;
        }

        System.out.println();
        bubblesort(nums);

        System.out.print("Sorted array:");
        for(int num:nums)
        {
            System.out.print(num+" ");
        }



    }

    public static void bubblesort(int []nums)
    {
        int s=nums.length;
        boolean swapped;

        for(int i=0;i<s-1;i++)
        {
            swapped = false;
            for(int j =0;j<s-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                    swapped=true;

                }
            }
            if(!swapped)
                break;
        }
    }

}
