import java.util.Scanner;
import java.util.Arrays;

public class Binary {
    public static void binary(int r,int c,int mat[][])
    {
        int count[]=new int[r];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=mat[i][j]%2;
                 System.out.print(mat[i][j]+" ");
                 if(mat[i][j]==1)
                 {
                    count[i]++;
                 }
                 
            }
            System.out.println();
           
        }
 System.out.print(Arrays.toString(count));
        
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
    binary(r, c, mat);
}
}
