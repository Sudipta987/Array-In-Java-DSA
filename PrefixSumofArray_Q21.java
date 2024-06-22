//Q21 : W.A.P to return the prefix sum/running sum in the same array without creating a new Array.
package Java.Array;
import java.util.Scanner;
public class PrefixSumofArray_Q21 {
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
        findPrefixSum(arr);
        System.out.println("Now the Array with Prefix Sum is : ");
        printArr(arr);
        sc.close();
    }
    public static void findPrefixSum(int arr[]) {
        int n=arr.length;
        for(int i=1;i<n;i++) {
            arr[i]=arr[i-1]+arr[i];
        }
    }
    public static void printArr(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
