//Q1 : W.A.P to count how  many odd numbers present in an Array 
package Java.Array;
import java.util.Scanner;
public class CountOddN_Q1{
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
        System.out.println("The Number of Odd numbers present in the Array is : "+countOdd(arr));

        sc.close();
    }
    public static int  countOdd(int arr[]) {
        int count=0,n=arr.length;
        for(int i=0;i<n;i++) {
            if(arr[i]%2!=0) {
                count++;
            }
        }
        return count;
    }
}