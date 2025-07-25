import java.util.Scanner;
import java.util.Arrays;
public class Colrev {
    public static void column(int r,int c,int mat[][])
    {
         for(int j=0;j<c;j++)
        {
            int top=0;int bottom=r-1;
            while(top<=bottom)
            {
             int temp= mat[top][j];
             mat[top][j]=mat[bottom][j];
             mat[bottom][j]=temp;
             top++;
             bottom--;

            }
        }
        for(int i=0;i<mat.length;i++)
        {
            System.out.println(Arrays.toString(mat[i]));
        }
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
        column(r, c, mat);

    }
}
