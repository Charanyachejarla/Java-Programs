import java.util.*;
public class Diagonal {
    public static int maxmin(int r,int c,int mat[][])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j || i+j==r-1)
                {
                    if(mat[i][j]<min)
                    {
                        min=mat[i][j];
                    }
                }
                
                else if(mat[i][j]>max){
                    max=mat[i][j];
                }
            }
        }
        return max-min;
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
        int res=maxmin(r, c, mat);
        System.out.println(res);
       
    }
}
