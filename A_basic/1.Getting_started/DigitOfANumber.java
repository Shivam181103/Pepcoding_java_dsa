import java.util.*;
    
    
    public class DigitOfANumber{
    
    public static void printDigit(int n)
    {
        if(n==0)
        return;
        
        printDigit(n/10);
        System.out.println(n%10);
    }
    
    public static void main(String[] args) {
      // write your code here  
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      printDigit(n);
     }
    }