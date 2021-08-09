import java.util.Scanner;
import java.util.Arrays;
public class differencekey {
    public static int keyDiff(int[] arr,int n,int key){
        int low,high;
        low=0;
        high=0;
        int count=0;
        Arrays.sort(arr);
        while(high<n){
         if(arr[high]-arr[low]==key){
            count++;
            low++;
            high++;
         }
         else if(arr[high]-arr[low]>key){
             low++;
         }
         else{
             high++;
         }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int res;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        res=keyDiff(arr, n, key);
        System.out.println(res);
    }
}
