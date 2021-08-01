import java.util.*;
   
   public class Reverse{
   
   public static void main(String[] args) {
     // write your code here 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    //  int count=0;
      while(n>0)
      {
          System.out.println(n%10);
         n=n/10; 
      }
    }
   }