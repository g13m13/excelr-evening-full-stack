class  M8
{
	public static void main(String[] args) 
	{
		Ancestor ancestor  = null;
		GrandFather grandfather = null;
		Father father = null;
		Son son  = null;

		ancestor = grandfather;//(Ancestor) b1;
		grandfather = father;//(B) c1;
		father =son;//(C) d1;
		Object object = father;
		
		System.out.println("father");
		
	}
}
