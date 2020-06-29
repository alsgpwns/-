import java.util.Scanner;

class PhoneInfoManager
{
		//public static Scanner sc = new Scanner(System.in);
		private int chooses, count, year, temp;
		private String name, number, major,company;	
		PhoneInfo phoneArr[] = new PhoneInfo[100];
		PhoneInfo people;  //Friend people = new Friend( ...);
		Scanner sc = new Scanner(System.in);
		


//static을 붙이면 static 변수만 쓸 수 있고 인스턴스 변수는 쓸 수 없다. 인스턴스 메소드도 참조할 수 없다.-은지씨 감사해요...-
	public void insert() 
	{
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3. 회사");
		System.out.println("선택 >> ");
		chooses = sc.nextInt();
		sc.nextLine();

			if(chooses == 1)
			{
				System.out.println("이름 : ");
				name = sc.nextLine();
					
				System.out.println("전화번호 : ");
				number = sc.nextLine();

				people = new PhoneInfo(name, number);
				phoneArr[count++] = people; 

				System.out.println("데이터 입력이 완료되었습니다.\n");
			
			}
			else if( chooses ==2)
			{
				System.out.println("이름 : ");
				name = sc.nextLine();

				System.out.println("전화번호 : ");
				number = sc.nextLine();

				System.out.println("전공 : ");
				major = sc.nextLine();

				System.out.println("학년 : ");
				year = sc.nextInt();

				people =new PhoneUnivInfo(name, number, major, year);
				phoneArr[count++] = people;
				System.out.println("데이터 입력이 완료되었습니다.\n");
			
			}
			else if( chooses ==3)
			{
				System.out.println("이름 : ");
				name = sc.nextLine();

				System.out.println("전화번호 : ");
				number = sc.nextLine();

				System.out.println("회사 : ");
				company = sc.nextLine();
						
				people = new PhoneCompanyInfo(name, number,company);
				phoneArr[count++] = people;

				System.out.println("데이터 입력이 완료되었습니다.\n");
			
			}
			else
			{
				System.out.println("잘못입력하셨습니다.\n");
			
			}

	}


	
	public void find()
	{
			System.out.println("데이터 검색을 시작합니다.");
			System.out.print("이름 :");
			name = sc.nextLine();
			for(int i = 0; i<count; i++)
			{
				if(name.compareTo(phoneArr[i].getName())==0)
				{
					phoneArr[i].showData();
					System.out.println("");
				}
			}

			System.out.println("검색이 완료되었습니다.\n");

	}

	public void delete()
	{
		
			System.out.println("\n데이터 삭제를 시작합니다.");
			System.out.print("이름 :");
			name = sc.nextLine();
			for(int i = 0; i<count; i++)
			{
				if(name.compareTo(phoneArr[i].getName())==0)
				{
					temp = i;
				}
			}
			for(int i =temp ; i<count-1; i++)
			{
				phoneArr[i] = phoneArr[i+1];
			}

			phoneArr[count]=null;
			count--;

			System.out.println("데이터 삭제가 완료되었습니다.\n");

	}
	
	public void see()
	{

		System.out.println("\n전체 데이터 보기를 시작합니다.");

			for(int i = 0; i<count; i++)
			{
				phoneArr[i].showData();
				System.out.println("");
			}

			System.out.println("데이터 보기를 완료하였습니다.\n");
	}

	

}