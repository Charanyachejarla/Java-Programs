import java.util.Scanner;
import java.util.Arrays;
public class Matrix {
    public static void matrix(int r,int c,int mat[][])
    {
         /*for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }*/
       /* for(int[] row:mat){
            for(int val:row)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }*/
       /* for(int i=0;i<mat.length;i++)
        {
            System.out.println(Arrays.toString(mat[i]));
        }*/ 
       /*  for(int[] row:mat)
        {
            System.out.println(Arrays.toString(row));
        }*/
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
       matrix(r, c, mat);
    }
}
