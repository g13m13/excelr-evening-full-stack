 class CC
 {
    public static void main(String[] args) 
		{
        int num = 3;
        switch (num)
			{
            case 1:
            case 2:
            case 3:
                System.out.println("Small number");
            case 4:
            case 5:
            case 6:
                System.out.println("Medium number");
            default:
                System.out.println("Large number");
        }
    }
}