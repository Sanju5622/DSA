import java.util.*;

 public class SelectionSort
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("No of elements:");
        int n = sc.nextInt();
        
        int []num =new int[n];
        System.out.print("Elements of the array:");
        for(int i =0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        
        System.out.print("Original array:");
         for (int nums : num) {
            System.out.print(nums + " ");
        }
        System.out.println();
        
        // Sort the array
        selectionsort(num);
        
        System.out.print("Sorted Array:");
        for (int nums : num) {
            System.out.print(nums + " ");
        }
    }
    
    public static void selectionsort(int []num)
    {
        int s = num.length;
        
        for(int i =0;i<s-1;i++)
        {
             int minIndex = i; 
            for(int j=i+1;j<s;j++)
            {
                if(num[j]<num[minIndex])
                {
                     minIndex = j;
                }
            }
              int temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;
        }
    }
}
