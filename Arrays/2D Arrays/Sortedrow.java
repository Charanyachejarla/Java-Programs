import java.util.Scanner;
import java.util.Arrays;
public class Sortedrow {
    public static void sorting(int r,int c,int mat[][])
    {
     for(int i=0;i<r;i++)
     {
            Arrays.sort(mat[i]);  
     }
     System.out.println(Arrays.deepToString(mat));

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
    sorting(r, c, mat);
}
}
