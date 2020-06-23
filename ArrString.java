import java.util.Scanner;

class ArrString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i=0,j=0;
		String temp=null;

		String[] arr = new String[5];

		//입력
		System.out.println("문자열 5개를 입력해주세요.");
		for(i=0; i<5; i++)
		{
			String num = sc.nextLine();
			arr[i] = num;
		}
		
		for(i=0; i<4; i++)
		{
			for(j=i+1; j<5; j++)
			{
				if( arr[i].compareTo(arr[j])>0 ) //name[i].compareTo(name[j])>0
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
				}
			} 
		}

		//출력
		System.out.println("정렬된 문자열");
		for(i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		}



	}

}
/*
a c b d e
1 2 3 4 5

z q r t s
5 4 3 2 1
q z t r s
4 5 2 3 1


a e d c b
1 5 4 2 3
*/