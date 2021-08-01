import java.util.*;
import java.lang.*;
public class PrimeTillN{
    public static boolean isprime(int n)
    {
        boolean flag =true;
          for(int i=2;i<=Math.sqrt(n);i++)
          {
             if(n%i==0){
             flag=false;
             break;
             }
             
          } 
          if(n==2)
          return true;
          
          else if(flag==true)
         return true;
          else
         return false;
    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int i=low;i<=high;i++)
        {
           if(isprime(i)==true)
           {
               System.out.println(i);
           }
        }
    }
}