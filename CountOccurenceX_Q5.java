//Q5 : W.A.P to find How many times does a number 'X' occurs in an Array.
package Java.Array;
import java.util.Scanner;
public class CountOccurenceX_Q5 {
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
        System.out.println("Enter the Searching number: ");
        int  x=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++) {
            if(arr[i]==x) {
                count++;
            }
        }
        System.out.println("The number "+x+" occurs in the Array is : "+count+" times");
        sc.close();
    }
}
