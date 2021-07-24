package TestPK;
import java.util.*;

public class Aman
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int ans=2;
		int pd = arr[1]-arr[0];
		int j=2;
		int current=2;
		while(j<n)
		{
			if(pd==arr[j]-arr[j-1])
			{
				current++;
			}
			else
			{
				pd = arr[j]-arr[j-1];
				current=2;
			}
			ans=Math.max(ans, current);
			j++;
		}
		System.out.print(ans);
	}
}