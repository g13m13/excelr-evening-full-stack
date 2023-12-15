class I
{
	public static void main(String[] args) 
	{
		int i = 10;
		switch (i)
		{
			
		    case 2://duplicate case names r not allowed,we will get error
				System.out.println("from case 2");
				break;
		    case 2:
				System.out.println("from case 2");
				break;
			case 3:
				System.out.println("from case 3");
				break;
			case 5:
				System.out.println("from case 5");
				break;
				
					
		}
		
	}
}