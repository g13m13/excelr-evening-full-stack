class B 
{
	B()
	{
		System.out.println("B()");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("done");
		
	}
}
/*
1. if at least one constructor kept by the user then compiler will not b keepng default constructor.
2.Constructor name shloud b same as class name
3.Constructors cant hv a return type.
4.Constructors r not normal methods but internally they r special kind of methods.
5. Constructor is a non-static.
6.Constructors r used to initialize the objects.
7.Constructors can take any no of arguments.
8.Constructor must b having a body.
9. we can develop any no of valid statements inside the constructor body.
10.In one class we can develop any no of constructor but arguments must b different.
11. Constructors must b developed within the class and outside of any method or block.
*/