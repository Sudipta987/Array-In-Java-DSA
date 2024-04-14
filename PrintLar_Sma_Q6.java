//Q6 : W.A.P to print the Largest number and the smallest number in an Array.
package Java.Array;
import java.util.Scanner;
public class PrintLar_Sma_Q6 {
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
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<n;i++) {
            if(largest<arr[i]) {
                largest=arr[i];
            }
            if(smallest>arr[i]) {
                smallest=arr[i];
            }
        }
        System.out.println("So the Largest  number in the Array is : "+largest);
        System.out.println("And the Smallest number in the Array is : "+smallest);
        
        sc.close();
    }
}
 