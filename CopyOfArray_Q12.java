//Q12 : W.A.P to Copy an Array using various Methods .
package Java.Array;
import java.util.Scanner;
import java.util.Arrays;
public class CopyOfArray_Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
       /* int arr_2[]=arr;
        
        */
      /* int arr_2[]=arr.clone();        //Methoe arr.clone();
      */
      //    int arr_2[]=Arrays.copyOf(arr,arr.length);    //Method Arrays.copyOf(arr,idx);
      int arr_2[]=Arrays.copyOfRange(arr,2,5);      //Method Array.copyOfRange(arr,beg,end);
        arr_2[0]=0;
        arr_2[1]=0;
        
         System.out.println("Elements of the arr : ");
        printArr(arr);
        System.out.println("Elements of the arr_2 : ");
        printArr(arr_2);
        sc.close();
    }
    public static void printArr(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}