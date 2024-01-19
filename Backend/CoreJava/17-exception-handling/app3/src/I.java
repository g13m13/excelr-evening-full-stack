class I
{
	int test(boolean flag)// error: missing return statement
	{
		if (flag)
		{
		}
		else
		{
			return 20;
		}
	}
}
