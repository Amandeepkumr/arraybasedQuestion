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
		
		int counter=1;
		while(counter<n-1)
		{
			for(int i=0;i<n-counter;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			counter++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}