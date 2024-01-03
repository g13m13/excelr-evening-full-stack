class M5 
{
	public static void main(String[] args) 
	{
		//if u r supplying sub tybe to the super type then auto upcasting will happen
		//type permotion
		//super class reference can hold sub class object
		A a1 = new B();// a1 = (A) new B(); --> autoupcasting
		B b1 = new C();
		C c1 = new D();
		System.out.println("done");
	}
}
