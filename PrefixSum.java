//prefix sum of both 1D and 2D array 


import java.util.Scanner;

public class main {
    public static void prefix2D(int[][] arr) {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]+=arr[i-1][j];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                arr[i][j]+=arr[i][j-1];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
    public static void prefix1D(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }
        for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();

        int[] arr1d= new int[n];
        for(int i=0;i<n;i++)
        {
            arr1d[i]=sc.nextInt();
        }
        prefix1D(arr1d);
        // System.out.println("enter r");
        int r=sc.nextInt();
        // System.out.println("enter c");
        int c=sc.nextInt();
        int[][] arr2d=new int[r][c];
        // System.out.println("array");
        for(int i=0;i<r;i++)
        {
         for(int j=0;j<c;j++)
         {
             arr2d[i][j]= sc.nextInt();
         }
        }
        prefix2D(arr2d);
    }
}
