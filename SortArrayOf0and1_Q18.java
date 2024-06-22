//Q18 : W.A.P to Sort an Array consisting of only 0s and 1s Using Two Pointers.
package Java.Array;
import java.util.Scanner;
public class SortArrayOf0and1_Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements: ");
        int n=arr.length;
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        sortArray(arr);
        System.out.println("Now the sorted Array is : ");
        printArr(arr);
        sc.close();
    }
    public static void printArr(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void swap(int arr[],int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sortArray(int arr[]) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right) {
            if(arr[left]==1&&arr[right]==0) {
                swap(arr,left,right);
                left++;
                right--;
            }if(arr[left]==0) {
                left++;
            }
            if(arr[right]==1) {
                right--;
            }
        }
    }

}
