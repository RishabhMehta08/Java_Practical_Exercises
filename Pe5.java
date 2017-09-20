import java.util.Scanner;

class Pe5
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number: ");
		String str = sc.nextLine();
		int sum=0;
		boolean user=true;

		String[] split = str.split(" ");

		for(int i=0;i< split.length;i++)
		{
			if(!isInteger(split[i]))
			{
				user=false;
				break;
			}
			else
			{ 
				sum+= Integer.parseInt(split[i]);
			}
		}

		if(user)
			System.out.println(sum);
		else
			System.out.println("Do not enter not integral values"); 
	}

	public static boolean isInteger( String input ) 
	{
    	try 
    	{
        	Integer.parseInt( input );
        	return true;
    	}
    	catch( Exception e ) 
    	{
        	return false;
    	}
	}
}
