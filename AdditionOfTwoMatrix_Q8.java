//Q8 : W.A.P to Addition  of two Matrix.
package Java.Array;
import java.util.Scanner;
public class AdditionOfTwoMatrix_Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row & col: ");
        int row=sc.nextInt(),col=sc.nextInt();
        int mat1[][]=new int [row][col];
        int mat2[][]=new int [row][col];
        int result[][]=new int [row][col];
        System.out.println("Enter the Matrix 1 Elements: ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Matrix 2 Elements: ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("After performing Addition of two matrices the result is : ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
