import java.util.Scanner;

class Pe1
{
	public static void main(String[] args) 
	{
		int num1,check;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first number: ");
		num1=sc.nextInt();

		check=reverseNumber(num1);

		if(num1!=check)
			System.out.println(""+num1+" is not a palindrome");
		else
		{
			int sum=0;	
			while(check!=0)
			{
				if((check%10)%2==0)
					sum=sum+check%10;
				check/=10;
			}

			String ans = sum>25 ? "greater" : "less";

			System.out.println(""+num1+" is palindrome and the sum of even numbers is "+ans+" than 25");

		}
	} 

	static int reverseNumber(int num) 
	{
		int revNum=0;

		while(num!=0)
		{
			revNum=(revNum*10) + num%10;
			num/=10;
		}

		return revNum;
	}

}