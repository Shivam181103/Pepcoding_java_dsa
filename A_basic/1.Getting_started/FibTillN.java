import java.util.*;
  
  public class FibTillN{
  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int first=0;
      int second=1;
      System.out.println(first);
      System.out.println(second);
      for(int i=3;i<=n;i++)
      {
          int third=first+second;
          first=second;
          second=third;
          System.out.println(third);
      }
   }
  }