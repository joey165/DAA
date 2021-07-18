import java.util.Scanner;
public class binarySearch
{
   public static int search(int[] arr,int low,int high,int x){
       int mid=(low+high)/2;
       while(low<=high){
           if(arr[mid]==x)
             return mid;
           if(arr[mid]>x){
               return search(arr, low, mid-1, x);
           }
           else{
               return search(arr, mid+1, high, x);
           }
       }
       return -1;
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int x=sc.nextInt();
       int low=0;
       int high=n-1;
       int res=search(arr, low, high, x);
       if(res==-1){
           System.out.println("Not present "+n);
       }
       else{
           System.out.println("Present "+(res+1));
       }
   }
}
