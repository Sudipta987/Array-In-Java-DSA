//Q11 : W.A.P to Transpose of a Matrix .
package Java.Array;
import java.util.Scanner;
public class TransposeMatrix_Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row & col: ");
        int row=sc.nextInt(),col=sc.nextInt();
        int mat[][]=new int [row][col];
        System.out.println("Enter the Matrix  Elements: ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        int transMat[][]=new int[col][row];
        for(int i=0;i<col;i++) {
            for(int j=0;j<row;j++) {
                transMat[i][j]=mat[j][i];
            }
        }
        System.out.println("Now Transpose of the Matrix is : ");
        for(int i=0;i<col;i++) {
            for(int j=0;j<row;j++) {
                System.out.print(transMat[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
