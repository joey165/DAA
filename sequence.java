import java.util.Scanner;
public class sequence {
    public static void Search(int[] arr,int n){
        int flag=0;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n-1;j++){
               for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]==arr[k])
                       System.out.println((++i)+" "+(++j)+" "+(++k));
                       flag=1;
                }
           }
       }
       if(flag==0){
       System.out.println("No sequence found");
       }
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
    Search(arr, n);
    }

}
