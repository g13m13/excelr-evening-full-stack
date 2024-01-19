class L
{
	public static void main(String[] args) 
	{
		int i = 10 / 0;//AE

		int j = Integer.parseInt("abc");//NFE- Number format exception

		String s1 = null;
		int k = s1.length();//NPE- null pointer exception

		int[] l = new int[4];
		int m = l[4];//AIOBE-ArrayIndexOutOfBoundsException

		Object obj = new L();
		String s = (String)obj;//CCE-class cast exception
		main(null);//SOE -Stack over flow error
		int[] n = new int[99999999];//OME-out of memeory
		String s2 = "hello";
		String s3 = s2.substring(5, 10);//SIOBE- String index out of bond exception
		int[] p = new int[-10];//NASE - Negative array size exception
	}
}
