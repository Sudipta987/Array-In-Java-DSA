//Q20 : W.A.P to return an Array of the Squares of each number sorted in Non-Decreasing Order.(Given Array is in Non-Decreasing Order).
package Java.Array;
import java.util.Scanner;
public class SortArrayBySquare_Q20 {
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
        int ans[]=sortBtSquare(arr);
        System.out.println("Now the Sorted Array is : ");
        printArr(ans);
        sc.close();
    }
    public static int [] sortBtSquare(int arr[]) {
        int n=arr.length;
        int left=0,right=n-1;
        int ans []=new int[n];
        int k=n-1;
        while(left<=right) {
            if(Math.abs(arr[left])>Math.abs(arr[right])) {
                ans[k--]=arr[left]*arr[left];
                left++;
            }else{
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void printArr(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
