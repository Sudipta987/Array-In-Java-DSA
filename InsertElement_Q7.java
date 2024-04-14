//Q7 : W.A.P to Insert an Element at the end of an Array.
package Java.Array;
import java.util.Scanner;
public class InsertElement_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+(size-1)+" Array Elements: ");
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element that you want to store at the end of the Array: ");
        int end=sc.nextInt();
        arr[n-1]=end;
        System.out.println("Now the Array is : ");
        for(int  i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}
