//Q25 : W.A.P to display transpose of Matrix entered by the user(In-place).
//* NOTE : This is applicable for only Square or Digonal Matrices.
package Java.Array;
import java.util.Scanner;
public class AdvTransposeMatrix_Q25 {
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
        inPlaceTranspose(mat, r, c); 
        System.out.println("Now the Transpose Matrix is: "); 
        printArr(mat, r, c);      
        sc.close();
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
}
