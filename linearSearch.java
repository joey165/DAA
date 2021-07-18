import java.util.Scanner;
public class linearSearch{
    static int count=0;
    public static int search(int[] arr,int x){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x)
             return x;
            else
            count++;
        }
        return -1;//when element is not present
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int x=sc.nextInt();
      int ans=search(arr, x);
      if(ans==-1){
          System.out.println("Not Present "+count);
      }
      else{
          System.out.println("Present "+(count+1));
      }
    }
}