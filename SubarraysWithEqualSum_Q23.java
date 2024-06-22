//Q23 : W.A.P to Check if we can partition the Array into two Subarrays with Equal Sum.
//More formally, check that the prefix sum of a part of array is equal to the suffix sum of rest of array.
package Java.Array;
import java.util.Scanner;
public class SubarraysWithEqualSum_Q23 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements: ");
        int n=arr.length;
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
       System.out.println("Is Equal Partition Possible : "+equalSumPartition(arr));
        sc.close();
    }
    public static boolean equalSumPartition(int  arr[]) {
        int totalSum=findTotalSum(arr);
        int prefixSum=0;
        for(int i=0;i<arr.length;i++) {
            prefixSum+=arr[i];
            int suffixSum=totalSum-prefixSum;
            if(prefixSum==suffixSum) {
                return true;
            }
        }
        return false;
    }
    public static int findTotalSum(int arr[]) {
        int totalSum=0;
        for(int i=0;i<arr.length;i++) {
            totalSum+=arr[i];
        }
        return totalSum;
    }
}
