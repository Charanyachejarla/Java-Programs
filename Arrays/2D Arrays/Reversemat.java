import java.util.Scanner;
import java.util.Arrays;
public class Reversemat {
    public static void reverse(int r,int c,int mat[][]){
        for(int i=0;i<r;i++)
        {
            int left=0;int right=r-1;
            while(left<=right)
            {
             int temp= mat[i][left];
             mat[i][left]=mat[i][right];
             mat[i][right]=temp;
             left++;
             right--;

            }
        }
        for(int i=0;i<mat.length;i++)
        {
            System.out.println(Arrays.toString(mat[i]));
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
      reverse(r,c, mat);
      
    }
}
