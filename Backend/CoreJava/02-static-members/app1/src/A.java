class A
{
	static int i; // field,property,attribute
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
1. static is akey word or reserved word.
2. we can decelare a variable with static keyword.
3.static means something that does not change very often.
4.static members r also called class members.


        How static members are processed
        ---------------------------------
		1.All the static members gets loaded whenever the class is
		loading to the memory.
		
		2.In case of static variables they r going to b loaded with
		their default values Ex: int ==> 0, float,double ==> 0.0, 
		boolean ==> false, String ==> null etc.
		
		3.After all the static members gets loaded to the memory, 
		the next step is that all the static members gets initialized 
		and executed from top to botom only.

        4.all the static members gets initialized and executed from
		top to botom only once for one execution when the class is
		loading to the memory.

		5.After all the static members gets loaded, initialized and 
		executed from top to botom control comes to the main method,
		and starts execution from the main method.

Interview Questions ==> Is there any posibility of excuting something
before the execution of main method??

Ans. Yes, All the static members grts loaded,initialized and excuted
      before






	  */
