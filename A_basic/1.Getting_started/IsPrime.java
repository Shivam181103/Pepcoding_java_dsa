import java.util.*;

public class IsPrime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans[]=new int[n];
		
		boolean flag=true;
		for(int i=0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]!=0)
				{
				if((arr[i]%arr[j]==0)&&i!=j)
				{
					ans[i]++;
					ans[j]++;
					flag=false;
				}
				}
				
				if(arr[i]!=0){
				if((arr[j]%arr[i]==0)&&i!=j&&flag==true)
				{
					ans[i]++;
					ans[j]++;
					flag=true;
				}
				}
				
			}
		}
		for(int i=0;i<n;i++)
		System.out.println(ans[i]);
	}//C:\Users\R.K\Downloads
}