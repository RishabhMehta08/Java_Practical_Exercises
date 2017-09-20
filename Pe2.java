import java.util.Scanner;

class Pe2
{

	public static void main(String[] args)
	{
		int num1;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number: ");
		num1=sc.nextInt();

		if((num1>=20)&&(num1<=30))
		{
			String ans = (num1%2)!=0 ? "Tom" : "Jerry";
			System.out.println(ans);
		}
	}

}