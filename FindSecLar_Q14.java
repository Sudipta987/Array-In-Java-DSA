//Q14 : W.A.P to find the second largest element in the given Array .
package Java.Array;
import java.util.Scanner;
public class FindSecLar_Q14 {
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
        
      
        System.out.println("So the Largest  number in the Array is : "+findMax(arr));
        System.out.println("And the Second largest number in the Array is : "+findSecMax(arr));
        sc.close();
    }
    public static int findMax(int arr[]) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
    public static int findSecMax(int arr[]) {
        int n=arr.length;
        
        int max=findMax(arr);
        for(int i=0;i<n;i++) {
            if(arr[i]==max) {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secMax=findMax(arr);
        return secMax;
    }

}
