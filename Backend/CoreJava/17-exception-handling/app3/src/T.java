class T
{
	int test()
	{
		try//now cathch block will not b excuted bcoz exception is not there
		{
		}
		catch (ArithmeticException ex)
		{
			return 10;
		}
		return 20;
	}
}
