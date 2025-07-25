import java.util.Scanner;


public class Diagonaldiff {
    public static int diff(int r,int c,int mat[][])
    {int diagonal1=0;
        int diagonal2=0;
        for(int i=0;i<r;i++)
        {
            
            for(int j=0;j<c;j++)
            {
               if(i==j)
               {
                diagonal1+=mat[i][j];
               }
                if(i+j==r-1){
                 diagonal2+=mat[i][j];
               }
            }
            
        }
        
       return diagonal2-diagonal1;
        
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
        int res=diff(r, c, mat);
      System.out.print(res);
    }
}
