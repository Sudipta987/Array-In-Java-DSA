//Q13 : W.A.P to Find the Unique number in a given +Ve Array where all the elements are being repeated twice with one value being  Unique .
package Java.Array;
import java.util.Scanner;
public class ArrayManipulation_Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,2,3,1};
        System.out.println("Elements of the Array are: ");
        printArr(arr);
        System.out.println("Now the Unique Element is : "+findUnique(arr));

        sc.close();
    }
    public static int findUnique(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]==arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int uIdx=-1;
        for(int i=0;i<n;i++) {
            if(arr[i]!=-1) {
                uIdx=arr[i];
            }
        }
        return uIdx;
    }
    public static void printArr(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
