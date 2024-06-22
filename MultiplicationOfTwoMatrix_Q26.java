//Q26 : W.A.P to  display Multiplication of two Matrices entered by the user.
/* Fundamental Logic 
 *  a00 a01 a02 a03     *   b00 b01 b02             c00 c01 c02     [2*4]   [4*3]=[2*3]
 *  a10 a11 a12 a13         b10 b11 b12     =       c10 c11 c12
 *                          b20 b21 b22
 *                          b30 b31 b32     
 *  
 * c00=a00*b00 + a01*b10 + a02*b20 + a03*b3 
 * 
 * c02=a00*b02 + a01*b12 + a02*b22 + a03*b322
 */

package Java.Array;
import java.util.Scanner;
//Print 2D Array
public class MultiplicationOfTwoMatrix_Q26 {
    public static void printArr(int arr[][],int row,int col) {
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row(r1) and col(c1) of Matrix1: ");
        int r1=sc.nextInt(),c1=sc.nextInt();
        int mat1[][]=new int[r1][c1];
        
        System.out.println("Enter the inputs of Matrix1's Elements : ");
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++) {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the size of row(r2) and col(c2)  of Matrix2: ");
        int r2=sc.nextInt(),c2=sc.nextInt();
        int mat2[][]=new int [r2][c2];
        System.out.println("Enter the inputs of Matrix2's Elements : ");
        for(int i=0;i<r2;i++) {
            for(int j=0;j<c2;j++) {
                mat2[i][j]=sc.nextInt();
            }
        }
        multiplicationOfMatrices(mat1,r1,c1,mat2,r2,c2);
        sc.close();
    }
    //Multiplication method
    public static void multiplicationOfMatrices(int mat1[][],int r1,int c1,int mat2[][],int r2,int c2) {
        if(c1!=r2) {
            System.out.println("Multiplication for this "+r1+"*"+c1+"&"+r2+"*"+c2+" square Matrices is not possible ");
            return;
        }
        int ans[][]=new int[r1][c2];
       for(int i=0;i<r1;i++) {
        for(int j=0;j<c2;j++) {
            for(int k=0;k<c1;k++) {
                ans[i][j]+=mat1[i][k]*mat2[k][j];
            }
        }
       }
       System.out.println("Multiplication of two Matrices : ");
       printArr(ans, r1, c2); 
    }
  
    }

