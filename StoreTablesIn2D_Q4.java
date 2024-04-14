//Q4 : W.A.P to Create a 2D Array , Storing the table of 2 & 3 .
package Java.Array;
import java.util.Scanner;
public class StoreTablesIn2D_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of  the row :(Enter default col=10): ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int table[][]=new int[row][col];
        System.out.println("Enter table n&m, which you want ot store: ");
        int n=sc.nextInt(),m=sc.nextInt();
        storeTable(table,n,m);
        for(int i=0;i<row;i++) {
            System.out.println((i+1)+"'s Tabel is : ");
            for(int j=0;j<col;j++) {
                System.out.print(table[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void storeTable(int table[][],int n,int m) {
        for(int i=0;i<table.length;i++) {
        for(int j=0;j<10;j++) {
            if(i==0) {
            table[i][j]=(j+1)*n;
            }else if(i==1) {
                table[i][j]=(j+1)*m;
            }
        }
    }
    }
}
