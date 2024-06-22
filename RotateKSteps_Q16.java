//Q16 : W.A.P to Rotate the given array 'a' by k steps, where k is non-negative. *NOTE: k can be greater than n as well .
package Java.Array;
import java.util.Scanner;
public class RotateKSteps_Q16 {
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
        System.out.println("Enter the value of Rotate K: ");
        int k=sc.nextInt();
        int ans[]=rotate(arr,k);
        System.out.println("Array after Rotation: ");
        printArr(ans);

        sc.close();
    }
    public static void printArr(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static int[] rotate(int arr[],int k) {
        int n=arr.length;
        k=k%n;
        int j=0;
        int ans[]=new int[n];
        for(int i=n-k;i<n;i++) {
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++) {
            ans[j++]=arr[i];
        }
        return ans;
    }
}
