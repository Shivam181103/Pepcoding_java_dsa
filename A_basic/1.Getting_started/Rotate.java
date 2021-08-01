import java.util.*;

public class Rotate{

public static void main(String[] args)
{
  // write your code here   
   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();  
      int count=1;
      int size=0;
      int m=n;
      while(m>0)
      {
        size++;
        m=m/10;
        
      }
      int arr[]=new int[size+1];
      while(n>0)
      { 
        //  int index=n%10;
          arr[n%10]=count;
          count++;
          n=n/10;
      }
      for(int i=size;i>0;i--)
      {
          System.out.print(arr[i]);
      }
}
}