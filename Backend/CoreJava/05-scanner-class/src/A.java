import java.util.Scanner;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a complete token or word or a character");
		Scanner sc = new Scanner(System.in);
		String token = sc.next();
		System.out.println(" The token that we have entered is: " + token);
		sc.close();
		
	}
}
