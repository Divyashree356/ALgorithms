import java.io.*;
import java.util.*;

public class main {
    // recursive method
    public static boolean solve(int idx , int target , int[] arr)
    {
        if(idx==arr.length || target==0)
        {
            if(target==0)
             return true;
            else
             return false;
        }

        boolean no = solve(idx+1 , target , arr);
        boolean yes= false;
        if(target-arr[idx]>=0)
        {
            yes= solve(idx+1  ,target-arr[idx] , arr);
        }

        return yes|| no;
    }
    //tabulation method
    // public static boolean sumSubset(int[] arr , boolean[][] dp)
    // {
    //     int n=dp.length;
    //     int m=dp[0].length;

    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<m;j++)
    //         {
    //             if(j==0)
    //              dp[i][j]=true;

    //             else if(i==0)
    //              dp[i][j]=false;

    //             else
    //             {
    //              boolean noCall= dp[i-1][j];
    //              boolean yesCall =false;

    //              if(j-arr[i-1]>=0)
    //                yesCall=dp[i-1][j-arr[i-1]];  

    //             dp[i][j]= noCall|| yesCall;
                
    //             }
    //         }
             
    //     }
    //     return dp[n-1][m-1];
    // }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        boolean ans;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       int sum=0;
       for(int nums: arr)
        sum+=nums;

        if(sum%2 != 0)
       { ans= false;
       }

       else
        {
            sum/=2;
        boolean[][] dp= new  boolean[n+1][sum+1];
        
        for(int i=0;i<=n;i++)
         Arrays.fill(dp[i] ,false);

         ans= solve(0 , sum , arr );
         System.out.println(ans);
    }
}
}