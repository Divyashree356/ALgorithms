import java.util.*;

public class main {

public static void main (String[] args)
{
   Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    int ans=Integer.MAX_VALUE;
    int s=0;
    for(int j=0;j<k;j++)
        {
        s+=arr[j];     
        }
        // System.out.println(s);
    ans= Math.min(ans , s);
    
    for(int i=1;i<n-k+1;i++)
    {
        s-=arr[i-1];
        s+=arr[i+k-1];
        ans= Math.min(ans, s);
        // System.out.println(s);
    }
    System.out.println(ans);

}
}
