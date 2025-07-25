import java.util.Scanner;

public class Bordersum {
    public static void alternate(int r,int c,int mat[][])
    {
        int sum=0;
        for(int i=r-1;i>=0;i-=2)
        {
            for(int j=0;j<c;j++)
            {
                if(j==0 ||j==c-1)
                {
                    sum+=mat[i][j];
                }
                    
            }
           
        }
        System.out.println(sum);
       
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
