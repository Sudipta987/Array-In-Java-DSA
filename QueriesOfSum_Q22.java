//Q22 : W.A.P to Answer q Queries where you need to print the sum of values in a given range of indices from l to r(both included).
// NOTE : The values of l and r in queries follow 1-based indexing.
package Java.Array;
import java.util.Scanner;
public class QueriesOfSum_Q22 {
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
        prefix[1]=arr[1];
        for(int i=2;i<n;i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size+1];
        System.out.println("Enter the Array Elements: ");
        int n=arr.length;
        for(int i=1;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int ans[]=findPrefixSum(arr);
        printArr(ans);
        System.out.println("Enter the number of Queries q: ");
        int q=sc.nextInt();
        int i=1;
        while(i<=q) {                               // (q-->0) { } also a valid condition 
            System.out.println("Query No: "+i);
            System.out.println("Enter the value of l & r(l<=r): ");
            int l=sc.nextInt(),r=sc.nextInt();
            int sum=ans[r]-ans[l-1];
            System.out.println("Sum of values in a given range of "+l+"-"+r+" is = "+sum);
            i++;
        }

       
        sc.close();
    }

   
}
