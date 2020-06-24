import java.util.Scanner;
public class PhoneInfoMain
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String name,number,birth;
		PhoneInfo[] infoArr = new PhoneInfo[100]; //PhonInfo로 'inforArr'배열 100개
		int cnt = 0;
		PhoneInfo info = null;
		
		while(true)
		{
			System.out.println("선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 검색");
			System.out.println("3. 데이터 삭제");
			System.out.println("4. 모든 데이터 보기");
			System.out.println("5. 프로그램 종료");
			System.out.print("선택 : ");
			choice =sc.nextInt();
			sc.nextLine();
			System.out.print("========================\n");
			
		
			switch(choice)
			{
			case 1: 
				System.out.println("데이터 입력을 시작합니다.");
				System.out.println("이름 : ");
				name = sc.nextLine();

				System.out.println("전화번호 : ");
				number = sc.nextLine();

				System.out.println("생년월일 : ");
				birth = sc.nextLine();
				info = new PhoneInfo(name,number,birth);
				infoArr[cnt++] = info;

				System.out.println("데이터 입력이 완료되었습니다. ");
				break;

			case 2: 
				
				


			case 4:
				for(int i= 0; i<cnt;i++)
				{
					infoArr[i].showPhonInfo(); 
				}
				break;

			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("똑바로 누르세요ㅡㅡ");



			
			}
		}	
			



	}
	
	

}