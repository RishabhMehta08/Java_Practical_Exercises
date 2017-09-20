import java.util.Scanner;

class Pe3
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String: ");
		String input = sc.next();

		input=input.toLowerCase();

		for(int i=0;i<input.length();i++)
		{
			 int temp = ( int ) input.charAt(i);
			 if(temp<97||temp>122)
			 {
			 	System.out.println("Input String is not a letter");
			 	System.exit(0);
			 }
		}

		for(int i=0;i<input.length();i++)
		{
			if((input.charAt(i)=='a')||(input.charAt(i)=='e')||(input.charAt(i)=='i')||(input.charAt(i)=='o')||(input.charAt(i)=='u'))
				System.out.print("Vowel ");
			else
			{
				System.out.print("Consonant ");
			}
		}
	}

}