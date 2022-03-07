//This is min priority queue

import java.util.*;

public class main{
    public static void main(String [] args)
    {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("`````````````````````````````````````````````````````````````");
    //create
    PriorityQueue<Integer> pq = new PriorityQueue<>();  //default having min behvaiour 
    for(int ele: arr)
     pq.add(ele);    
     while(pq.size()!=0)
     {
         System.out.println(pq.peek());
         pq.remove();
     }
}

}