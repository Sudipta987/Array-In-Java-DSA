//Q17 : W.A.P to Rotate the given array 'a' by k steps, where k is non-negative without using extra array. *NOTE: k can be greater than n as well .
package Java.Array;
import java.util.Scanner;
public class RotateKSteps_1_Q17 {
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
        rotate(arr,k);
        System.out.println("Array after Rotation: ");
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
    public static void rotate(int arr[],int k) {
        int n=arr.length;
        k=k%n;
        revArr(arr,0,n-k-1);
        revArr(arr, n-k, n-1);
        revArr(arr, 0, n-1);
       
    }
    public static void revArr(int arr[],int i,int j) {
        while(i<j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int arr[],int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
