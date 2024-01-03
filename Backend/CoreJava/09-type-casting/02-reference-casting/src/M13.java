class M13
{
	public static void main(String[] args) 
	{
		Ancestor ancestor = new GrandFather();
		GrandFather grandFather = (GrandFather)ancestor;//Manul downcasting from super type to subclass type

		System.out.println("done");
	}
}