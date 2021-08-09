import java.util.Scanner;
public class noOfKeys {
    public static int find(int[] arr,int n,int k){
        int flag=0,c=0,mid,low=0,high=n-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==k)
            c++;
            flag=1;
            if(arr[mid-1]==k && low>=0){
                for(int i=mid-1;i>=low;i--){
                    if(arr[i]==k)
                    c++;
                    else
                    break;
                }
            }
            if(arr[mid+1]==k && high<=n){
                for(int i=mid+1;i<=high;i++){
                    if(arr[i]==k)
                    c++;
                    else
                    break;
                }
            }
            if(arr[mid]<k)
             low=mid+1;
            else
             high=mid-1;
        }
        if(flag==1)
         System.out.println(k+"-"+c);
        else
         System.out.println("key is not present");

         return 0;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        find(arr, n, k);
    }
}
