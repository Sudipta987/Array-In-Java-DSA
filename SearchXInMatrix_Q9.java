//Q9 : W.A.P to Take a Matrix as input from the user . Search for  a given number X and print the indices at which  it Occurs.
package Java.Array;
import java.util.Scanner;
public class SearchXInMatrix_Q9 {
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
    System.out.println("Enter the Searching number: ");
    int x=sc.nextInt();
    for(int i=0;i<row;i++) {
        for(int j=0;j<col;j++) {
            if(mat[i][j]==x) {
                System.out.println(x+" Occurs at : ("+(i+1)+","+(j+1)+") indices");
            }
        }
    }
    sc.close();
}
}

