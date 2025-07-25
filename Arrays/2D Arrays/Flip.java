import java.util.Scanner;
public class Flip {
    public static void flip(int r,int c,int mat[][])
    {
        for(int i=0;i<r;i++)
        {
            for(int j=c-1;j>=0;j--)
            {
                if(mat[i][j]==1)
                {
                    
                    System.out.print(0+" ");
                }
                else if(mat[i][j]==0)
                {
                   
                     System.out.print(1+" ");
                }
               // System.out.print(mat[i][j]^1+" ");
            }
            System.out.println();
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
    flip(r, c, mat);
   
   }
}
