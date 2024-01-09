class E
{
    public static void main(String[] args)
    {
        final E e1 = new E();
		e1 = null;// cannot assign a value to final variable e1 (e1 = null;)
		e1 = new E();//error: cannot assign a value to final variable e1(e1 = new E();)
                ^
        System.out.println("done");
    }
}
