class  Dodge
{
	private String charger = "car";
	public String getcharger()
	{
		return charger;
	}
}
class Mustang
{
	


	public static void main(String[] args) 
	{
		Dodge d1  = new Dodge();
		
		System.out.println(d1.getcharger());
	}
}
