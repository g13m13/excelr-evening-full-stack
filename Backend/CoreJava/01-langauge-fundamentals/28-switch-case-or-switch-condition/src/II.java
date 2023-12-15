class II 
{
	    public static void main(String[] args) 
			{
        int x = 5;
        switch (x) 
			{
            case 1:
                System.out.println("One");
                break;
            case 5:
                System.out.println("Five");
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Other value");
        }
        System.out.println("Outside switch");
    }
}