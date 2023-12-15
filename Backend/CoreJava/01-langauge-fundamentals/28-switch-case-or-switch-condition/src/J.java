class J
{
	public static void main(String[] args) 
	{
		int i = 10;
		switch (i)
		{
			default:// ONLY 1 default case is allowed,if we hv more than 1 it will give error
				System.out.println("from case default");
			break;
		    case 2:
				System.out.println("from case 2");
				break;
			default:
				System.out.println("from case default");
			case 3:
				System.out.println("from case 3");
				break;
			case 5:
				System.out.println("from case 5");
				break;
				
					
		}
		
	}
}