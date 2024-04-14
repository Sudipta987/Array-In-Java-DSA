//Q3 : W.A.P to Reverse an Array .
package Java.Array;
import java.util.Scanner;
public class ReverseArray_Q3 {
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
        reverseArray(arr);
        System.out.println("After Reversing the Array, the Present Array is : ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
    public static void reverseArray(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n/2;i++) {
            int first=arr[i];
            int last=arr[n-1-i];
            arr[i]=last;
            arr[n-1-i]=first;
        }
    }
}
