import java.util.*;
public class Diffelarge {
    public static void largesmall(int n,int arr[]){
        int large=arr[0];
        for(int i=1;i<n/2;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        int small=arr[arr.length-1];
        for(int i=n/2;i<n;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(large-small);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        largesmall(n,arr);
    }
    
}
