import java.util.Scanner;
class PhoneInfoMain
{
	public static void main(String[] args)
	{
		PhoneInfoManager pm = new PhoneInfoManager();
		int choose = 0;		
		//Scanner sc = PhoneInfoManager.sc;
		Scanner si = new Scanner(System.in);
		


		while(true)
		{
			System.out.println("선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 검색 ");
			System.out.println("3. 데이터 삭제 ");
			System.out.println("4. 모든 데이터 보기 ");
			System.out.println("5. 프로그램 종료 ");
			System.out.print("선택 : ");
			choose = si.nextInt();
			si.nextLine();

			switch (choose)
			{
			case 1:
				pm.insert();
				break;

			case 2:
				pm.find();
				break;


			case 3:
				pm.delete();
				break;
				


			case 4:	
				pm.see();
				break;

					
			case 5:
				System.out.println("\n시스템을 종료합니다.");
				return;

			default:
				System.out.println("잘못입력하셨습니다.");
				

			}



		}




	}
}