import java.util.Scanner;

public class Alternatecol{
    public static void alternate(int r,int c,int mat[][])
    {
        for(int i=0;i<r;i++)
        {
            for(int j=c-1;j>=0;j-=2)
            {
                    System.out.print(mat[i][j]+" ");  
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
    alternate(r, c, mat);
}
}
