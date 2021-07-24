package TestPK;
import java.util.*;

public class Aman
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int mx=-99999;
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			mx = Math.max(mx ,  arr[i]);
			System.out.print(mx + "  ");
		}
	}
}