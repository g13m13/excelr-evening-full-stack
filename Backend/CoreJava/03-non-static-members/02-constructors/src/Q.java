 class Q 
{
	

	Q()
	{
		this(10);
		System.out.println("Q()");
	}
	Q(int i)
	{
		this(true);
		System.out.println("Q(int)");
	}

	Q(boolean i)
	{
		this(10,20);
		System.out.println("Q()boolean");
	}
	Q(int i,int j)
	{
		this (i,j,30);
			System.out.println("Q(int,int)");
	}
	Q(int i,int j,int k)
	{
			System.out.println("Q(int,int,int)");
	}

     
	 public static void main(String[] args) 
	{
		Q obj1 = new Q();
		Q obj2 = new Q(10);
		Q obj3 = new Q(false);
		Q obj4 = new Q(100,200);
		Q obj5 = new Q(400,600,800);
	
		System.out.println("done");
	}
}
//we can keep this calling statement["this()"] inside the constructor body as a first statement.
//this()-invokes the current class constructor according to the argument we r passing
//this()- can b used within a constructor as well as within a method.