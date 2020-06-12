class Comb
{
	public static void main(String[] args)
	{
		int i=0, j=0;

		for(i=0;i<=9;i++)
		{
			for(j=0;j<=9;j++)
			{
				if( (i*10+j) + (j*10+i) == 99)
							
			System.out.println(i+""+j+" + " + j + " " + i + " = 99");
			}  
		}
	}
}