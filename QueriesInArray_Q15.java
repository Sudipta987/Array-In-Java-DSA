//Q15 : W.A.P to check if given number is present in the array or not .*NOTE: value of the elements in the array  is <(10^5) .
package Java.Array;
import java.util.Scanner;
public class QueriesInArray_Q15 {
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
        System.out.println("Enter the number of Queries: ");
        int q=sc.nextInt();
        int frqArr[]=new int[(int)Math.pow(10,3)];
        for(int j=0;j<n;j++) {
            frqArr[arr[j]]++;
        }
        int count=1;
        int tempQ=Integer.MIN_VALUE;
        while(count<=q) {
            System.out.println("Enter the Query: ");
            tempQ=sc.nextInt();
            if(frqArr[tempQ]>0) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            count++;
        }
        sc.close();
    }
}
