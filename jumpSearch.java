import java.util.Scanner;
import java.lang.Math;
public class jumpSearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int block=(int)(Math.floor(Math.sqrt(n)));
        int x=sc.nextInt();
        if(x>arr[n-1] || x<arr[0]){
          return;
        }
        int i=0;
        int j=block;
        while(arr[j]<x && j<n){
            i=j;
            j=j+block;
            if(j>n-1)
             j=n-1;
        }
        //now we will apply linear search for traversing
        for(int k=i;k<=j;k++){
            if(arr[k]==x){
              System.out.println("Present "+(k+1));
              return;
            }
        }
        System.out.println("Not Present "+n);
    }
}
