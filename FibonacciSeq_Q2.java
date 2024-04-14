//Q2 : W.A.P to Print Fibonacci Sequence using Array. 
package Java.Array;
import java.util.Scanner;
public class FibonacciSeq_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        printFibonacci(arr);
        System.out.println("Now the Fibonacci Sequence is : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
    public static void printFibonacci(int arr[]) {
        int n=arr.length;
        arr[0]=0;
        arr[1]=1;
        for(int  i=2;i<n;i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
    }
}
