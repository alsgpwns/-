import java.util.Scanner;

class ArrInt
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		int i=0, j=0 , temp=0;
		int [ ]arr = new int[5];
		
		//입력	
		System.out.println("정수 5개를 입력하세요."); //0 1 2 3 4
		for(i=0;i<5;i++)
		{
			int num = sc.nextInt();
			arr[i] = num;
			
		}

		//select sort
		for(i=0; i<arr.length-1; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}


		//출력
		System.out.println("정렬 결과");
		for(i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}



}



/*
5 4 7 9 2

2 9 7 4 5
*/


