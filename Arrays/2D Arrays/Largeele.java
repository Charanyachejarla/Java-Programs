import java.util.*;
public class Largeele {

    public static int large(int r,int c,int mat[][])
    {
       
        int max=mat[0][0];
        int min=mat[0][0];
        for(int i=0;i<r;i++)
        {

            for(int j=0;j<c;j++)
            {
                
                if(mat[i][j]>max)
                {
                    max=mat[i][j];

                }
                if(mat[i][j]<min)
                {
                    min=mat[i][j];
                }

            }
        }
        return max+min;
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
       int res=large(r, c, mat);
       System.out.println(res);
    }
}
