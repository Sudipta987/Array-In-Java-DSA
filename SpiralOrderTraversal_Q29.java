//Q29 : W.A.P to return all Elements of the matrix in spiral order.
package Java.Array;
import java.util.Scanner;
public class SpiralOrderTraversal_Q29 {
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
        System.out.println("Now the Spiral Order of the Matrix is : ");
        printSpiralOrder(mat, r, c);
        sc.close();
    }
    public static void printSpiralOrder(int mat[][],int r,int c) {
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        while(topRow<=bottomRow && leftCol<=rightCol) {
            // topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol;j++) {
                System.out.print(mat[topRow][j]+"\t");
            }
            topRow++;
            //rightCol -> topRow to bottomRow
            if(topRow<=bottomRow) {
            for(int i=topRow;i<=bottomRow;i++) {
                System.out.print(mat[i][rightCol]+"\t");
            }
        }
            rightCol--;
            //bottomRow -> rightCol to leftCol
            if(leftCol<=rightCol) {
            for(int j=rightCol;j>=leftCol;j--) {
                System.out.print(mat[bottomRow][j]+"\t");
            }
        }
            bottomRow--;
            //leftCol -> bottomRow to topRow
            if(topRow<=bottomRow) {
            for(int i=bottomRow;i>=topRow;i--) {
                System.out.print(mat[i][leftCol]+"\t");
            }
        }
            leftCol++;
        }
    }
}
