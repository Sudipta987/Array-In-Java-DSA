//Q24 : W.A.P to Find the Prefix Sum and the Suffix Sum of the Array .
package Java.Array;
import java.util.Scanner;
public class FindPrefixAndSuffixSum_Q24 {
    public static void printArr(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static int [] findPrefixSum(int arr[]) {
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static int [] findSuffixSum(int arr[]) {
        int n=arr.length;
        int suffix[]=new int[n];
        suffix[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--) {
            suffix[i]=suffix[i+1]+arr[i];
        }
        return suffix;
    }
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
        int prefix[]=findPrefixSum(arr);
        System.out.println("Now the Prefix sum of the Array is : ");
        printArr(prefix);
        int suffix[]=findSuffixSum(arr);
        System.out.println("Now the Suffix sum of the Array is : ");
        printArr(suffix);
        sc.close();
    }
}
