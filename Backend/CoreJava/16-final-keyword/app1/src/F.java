class F
{
    public static void main(String[] args)
    {
        F f1 = new F();
        final F f2 = new F();
		f1 = f2;// error: cannot assign a value to final variable f2(f2 = f1;)
                ^
		f2 = f1;//error: cannot assign a value to final variable f2 (f2 = null;)
		f2 = null;// error: cannot assign a value to final variable f2
               // f2 = new F();
		f2 = new F();
        System.out.println("done");
    }
}
