import java.util.Scanner;
class Facebook 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Facebook! Please register");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first name");
		String  firstname = sc.next();

		System.out.println("Enter your surname");
		String  surname = sc.next();

		System.out.println("Enter your moblie number");
		long mobileNumber = sc.nextLong();

		System.out.println("Enter your email ID");
		String  emailid = sc.next();

		System.out.println("Enter your new password");
		String  newpassword = sc.next();

		System.out.println("Enter your DOB");
		String  dateofbirth = sc.next();

		System.out.println("Enter your gender");
		String  gender = sc.next();

		System.out.println("Enter your salary");
		double  salary = sc.nextDouble();

		System.out.println("Enter your first initials");
		String firstinitials = sc.next();

		System.out.println("Enter your favourite quote");
		sc.nextLine();
		String  quote = sc.nextLine();

		System.out.println("Are you Alive");
		boolean  status= sc.nextBoolean();

		



		System.out.println("_________________________\nyour details are listed \n"+
		"firstname :" + firstname + "\n" +
			"Surname :" + surname + "\n" +
			"MobileNUmber :" + mobileNumber + "\n" +
			"Emailid:" + emailid + "\n" +
			"Password :" + newpassword + "\n" +
			"Date of birth :" + dateofbirth + "\n" +
			"Salary:" + salary + "\n" +
			"First Intial :" +firstinitials + "\n" +
			"Quote:" + quote + "\n" +
				"Are you alive ?:" + status);
			
		

	}
}
