import java.util.Scanner;

class Pe4
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int input = sc.nextInt();

		for(int i=0;i<input;i++)
		{
			int temp=i+1;
			while(temp!=0)
			{
				System.out.print(""+(i+1)+" ");
				temp--;
			}
		}
	}

}