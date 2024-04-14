//Q10 : W.A.P to Check if the given Array is in Ascending Order or not .
package Java.Array;
import java.util.Scanner;
public class CheckAscending_Q10 {
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
        int sma=arr[0];
        for(int j=1;j<n;j++) {
            if(sma<arr[j]) {
                sma=arr[j];
            }
            else{
                System.out.println("The Array is not in Ascending Order.");
                break;
            }
            if(j==(n-1)) {
                System.out.println("The Array is in Ascending Order.");
            }
        }
        sc.close();
    }
}
