import java.util.*;
public class Xmatrix {
    public static boolean xmatrix(int r,int c,int mat[][])
    {   
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                /*if(mat[i][i]==0)
                {
                    return false;
                }
               if(mat[i][r-i-1]==0)
                {
                    return false;
                }*/
                if(i==j || i+j==r-1)
                {
                    if(mat[i][j]==0)
                    {
                        return false;
                    }
                }
                else if(mat[i][j]!=0)
                {
                    return false;
                }

            }
        }
        return true;
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
    boolean res=xmatrix(r, c, mat);
    System.out.println(res);
   }}
