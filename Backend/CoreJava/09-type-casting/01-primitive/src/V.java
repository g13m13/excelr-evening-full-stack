class V 
{
	public static void main(String[] args) 
	{
		double d = 20.9;
			
		float f =(byte)(double)(byte) (short)(int)(double)(float)(double)d;
		
		System.out.println("f: " + f);
	}
}
