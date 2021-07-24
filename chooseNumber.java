package TestPK;
import java.util.*;
public class Javal1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mynum = (int)(Math.random()*100);
		int userNum=0;
		do {
			System.out.println("Guess my number:");
			 userNum = sc.nextInt();
			if(userNum == mynum)
			{
				System.out.println("Woohoo .. Correct number!!");
				break;
			}
			else if(userNum > mynum)
			{
				System.out.println("your number is too large");
			}
			else
			{
				System.out.println("your number is too small");
			}
		}while(userNum >=0);
		
		System.out.print("My number was :  ");
		System.out.println(mynum);
	}
}