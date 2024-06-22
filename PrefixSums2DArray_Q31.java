//Q31 : W.A.P where given a matrix 'a' return the sum of the rectangle from (l1,r1) to (l2,r2).
package Java.Array;
import java.util.Scanner;
public class PrefixSums2DArray_Q31 {
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
        System.out.println("Enter the Rectangle boundaries(l1,r1) & (l2,r2) : ");
        int l1=sc.nextInt(),r1=sc.nextInt();
        int l2=sc.nextInt(),r2=sc.nextInt();
        System.out.println("Rectangle sum is = "+findSum(mat,l1,r1,l2,r2));
      //  System.out.println("Rectangle sum2 is = "+findSum2(mat,l1,r1,l2,r2));
        System.out.println("Rectangle sum3 is = "+findSum3(mat,l1,r1,l2,r2));

        sc.close();
    }
    //Method 1 : Brute Force
    public static int findSum(int mat[][],int l1,int r1,int l2,int r2) {
        int sum=0;
        for(int i=l1;i<=l2;i++) {
            for(int j=r1;j<=r2;j++) {
                sum+=mat[i][j];

            }
        }
        return sum;
    }
    //Method 2 : pre-calculating the horizontal sum for each row in the Matrix
    public static int findSum2(int mat[][],int l1,int r1,int l2,int r2) {
        int sum=0;
        findPrefixSumMatrixRowWise(mat);
        for(int i=l1;i<=l2;i++) {
            if(r1>=1) {
                sum+=mat[i][r2]-mat[i][r1-1];
            }else{
                sum+=mat[i][r2];
            }
           
        }

        return sum;
    }
    public static void findPrefixSumMatrixRowWise(int mat[][]) {
        int r=mat.length;
        int c=0;
        if(r>0) {
            c=mat[0].length;
        }
        //Traverse horizontally to calculate row-wise prefix sum
        for(int i=0;i<r;i++) {
            for(int j=1;j<c;j++) {
                mat[i][j]+=mat[i][j-1];
            }
        }
    }
    //Method 3 : Prefix sum over columns and rows both 
    public static int findSum3(int mat[][],int l1,int r1,int l2,int r2) {
        int ans=0;
        int sum=0,up=0,left=0,leftUp=0;
        findPrefixSumMatrix(mat);
        sum=mat[l2][r2];
        if(l1>=1) {
        up=mat[l1-1][r2];
        }
        if(r1>=1) {
        left=mat[l2][r1-1];
        }
        if(l1>=1&&r1>=1) {
        leftUp=mat[l1-1][r1-1];
        }
        ans=sum-up-left+leftUp;

        return ans;
    }
    public static void findPrefixSumMatrix(int mat[][]) {       //Calculate Row-wise and column-wise sum
        int r=mat.length;                                       //mat[i][j]=sumRectangle ((0,0),(i,j))
        int c=0;
        if(r>0) {
            c=mat[0].length;
        }
         //Traverse horizontally to calculate row-wise prefix sum
         for(int i=0;i<r;i++) {
            for(int j=1;j<c;j++) {
                mat[i][j]+=mat[i][j-1];
            }
        }
        //Traverse vertically to calculate column-wise sum
        for(int j=0;j<c;j++) {          //fixing column
            for(int i=1;i<r;i++) {      //fixing row
                mat[i][j]+=mat[i-1][j];
            }
        }

    }
}
