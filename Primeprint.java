//1���� 100������ ��� �Ҽ� ���


class Primeprint
{
	public static void main(String[] args)
	{
	int i=0, j=0;

	 System.out.println("2");

	   for(i=3;i<100 ;i++)
	    { 
	     for (j=2;j<i ;j++)
	      { 
	       //System.out.println(i+" "+j);

	        if(i%j == 0) break;

	       }
		if(i==j) System.out.println(i);
  	    }



	}
}	
