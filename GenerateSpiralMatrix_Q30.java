//Q30 : W.A.P to Generate an n * n matrix filled with elements form 1 to n^2 in spiral Order.
package Java.Array;
import java.util.Scanner;
public class GenerateSpiralMatrix_Q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Square Matrix: ");
        int size=sc.nextInt();
        int mat[][]=new int[size][size];
        printSpiralOrder(mat,size);
        System.out.println("Now the Spiral Order Matrix is : ");
        print2DArray(mat);
        sc.close();
    }
    public static void printSpiralOrder(int mat[][],int n) {
        int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1,curr=1;
        while(topRow<=bottomRow && leftCol<=rightCol) {
            // topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol;j++) {
                mat[topRow][j]=curr;
                curr++;
            }
            topRow++;
            //rightCol -> topRow to bottomRow
            if(topRow<=bottomRow) {
            for(int i=topRow;i<=bottomRow;i++) {
                mat[i][rightCol]=curr;
                curr++;
            }
        }
            rightCol--;
            //bottomRow -> rightCol to leftCol
            if(leftCol<=rightCol) {
            for(int j=rightCol;j>=leftCol;j--) {
                mat[bottomRow][j]=curr;
                curr++;
            }
        }
            bottomRow--;
            //leftCol -> bottomRow to topRow
            if(topRow<=bottomRow) {
            for(int i=bottomRow;i>=topRow;i--) {
                mat[i][leftCol]=curr;
                curr++;
            }
        }
            leftCol++;
        }
    }
  
    public static void print2DArray(int matrix[][]) {           //Printing Jagged Array
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
