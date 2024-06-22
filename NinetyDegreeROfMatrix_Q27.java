//Q27 : W.A.P to turn a Square Matrix by 90 degrees in a clockwise direction without using any extra space.
package Java.Array;
import java.util.Scanner;
public class NinetyDegreeROfMatrix_Q27 {
    public static void  printArr(int mat[][],int r,int c) {
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row and col of a Matrix: ");
        int r=sc.nextInt(),c=sc.nextInt();
        int mat[][]=new int [r][c];
        System.out.println("Enter the Elements of the Matrix : ");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        rotateByNinetyDegree(mat,r);
        System.out.println("Now the Rotate Matrix is : ");
        printArr(mat, r, c);

        sc.close();
    }
    public static void rotateByNinetyDegree(int mat[][],int n) {
        //step 1 : Transpose the matrix  
        inPlaceTranspose(mat, n, n);
         //step 2 : Reverse each of the row of Transpose matrix
        for(int i=0;i<n;i++) {
            reverseArray(mat[i]);      //NOTE : A New Concept of Array (2D to breaks into 1D Array)
            
        }          
    }
    public static void inPlaceTranspose(int a[][],int r,int c) {
        for(int i=0;i<r;i++) {
            for(int j=i+1;j<c;j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void reverseArray(int arr[]) {
        int i=0,j=arr.length-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
