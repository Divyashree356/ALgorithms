import java.util.Scanner;
import java.util.Stack;

public class main {
    
    public static void main(String [] args) 
    {
     Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();
     int[] arr= new int[n]; 
     
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
     }
     int[] ans=new int[n];
     Stack<Integer> st= new Stack<>();
     for(int i=n-1;i>=0;i--)
     {
         while(!st.empty() && arr[i]>st.peek())
        {
            st.pop();
        }
        ans[i]=st.size()>0?st.peek():-1;
        st.push(arr[i]);
     }
     for(int i=0;i<n;i++)
     {
         System.out.print(ans[i]+" ");
     }
    }
}
