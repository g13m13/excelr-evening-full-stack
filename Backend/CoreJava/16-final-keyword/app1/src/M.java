class M
{
    public static void main(final String[] args)
    {
       args = new String[20];// error: final parameter args may not be assigned
	   args = null;// final parameter args may not be assigned
	   String[] s2 =  new String[10];
	   args = s2;//error: final parameter args may not be assigned
       System.out.println("done");
    }
}
