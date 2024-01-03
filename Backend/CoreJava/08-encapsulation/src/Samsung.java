class Apple 
{
	private String IOS = "iphone";
	public String getIOS()
	{
		return IOS;
	}
		public void setIOS(String change)
	{
			IOS = change;
	}
}

class Samsung
{

	public static void main(String[] args) 
	{
		Apple a1 = new Apple();
		System.out.println(a1.getIOS());
		a1.setIOS("ultra");
		System.out.println(a1.getIOS());
	}
}
