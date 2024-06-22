//Q28 : W.A.P to return the first n rows of Pascal's Triangle.
//NOTE: In pascal's triangle , each number is the sum of the two numbers directly above .
package Java.Array;
import java.util.Scanner;
public class PascalTriangle_Q28 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the Triangle : ");
        int size=sc.nextInt();
        int ans[][]=pascal(size);
        System.out.println("Now the Pascal's Triangle is : ");
       print2DArray(ans);
        
        sc.close();
    }
    public static int[][] pascal (int n) {
        int tri[][]=new int[n][];       //Jagged Array
        for(int i=0;i<n;i++) {
            tri[i]=new int[i+1];
        }
        for(int j=0;j<n;j++) {
            for(int k=0;k<=j;k++) {
                if(j==k||(k==0)) {
                    tri[j][k]=1;
                }else{
                    tri[j][k]=tri[j-1][k]+tri[j-1][k-1];
                }

            }
        }
        return tri;        
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
