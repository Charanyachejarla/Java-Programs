import java.util.Scanner;

public class Toeplitz {
    public static boolean toeplitz(int r,int c,int mat[][])
    {
        for(int i=0;i<r-1;i++)
        {
            for(int j=0;j<c-1;j++)
            { 
                if(mat[i][j]!=mat[i+1][j+1])
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
    boolean res=toeplitz(r, c, mat);
    System.out.println(res);
   
    }
}
