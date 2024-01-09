class D
{
    public static void main(String[] args)
    {
        final int i = 10;//error: cannot assign a value to final variable i
        
        i++;// i = i + 1;
        System.out.println(i);
    }
}
