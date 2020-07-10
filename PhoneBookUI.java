package PhoneBook6;
import java.util.Scanner;

interface PhoneBookMenu
{
	int INSERT_DATA = 1;
	int SEARCH_DATA = 2;
	int DELETE_DATA = 3;
	int SHOW_ALLDATA = 4;
	int QUIT_PROGRAM = 5;
	
	int GENERAL = 1;
	int UNIV = 2;
	int COMPANY =3;
}

public class PhoneBookUI 
{	
	Scanner sc = new Scanner(System.in);
	private String name, number,major,company,name1;
	private int year;
	PhoneInfo pInfo;
	PhoneBookManager pm = new PhoneBookManager();
	
	public void mainMenu()
	{
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 전체보기");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
		
	}
	
	public void subMenu()
	{
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1. 일반 2. 대학 3. 회사");
		System.out.print("선택>> ");
	}
	//서브 메뉴 예외
	public void subMenuChoice() throws MenuChoiceException
	{
		int choose = 0;
		if(choose<PhoneBookMenu.GENERAL && choose>PhoneBookMenu.COMPANY)
		{
			throw new MenuChoiceException(choose);
		}
		
		switch(choose)
		{
		case PhoneBookMenu.GENERAL:
			GenericInfo();
			break;
		case PhoneBookMenu.UNIV:
			UnivInfo();
			break;
		case PhoneBookMenu.COMPANY:
			ComapnyInfo();
			break;
			
		
		}
		
	}
	
	public void GenericInfo()
	{
		System.out.println("이름: ");
		name = sc.nextLine();
		System.out.println("전화번호: ");
		number =sc.nextLine();
		pm.insertData( new PhoneInfo(name,number) );
		
	}
	public void UnivInfo()
	{
		System.out.println("이름: ");
		name = sc.nextLine();
		System.out.println("전화번호: ");
		number =sc.nextLine();
		System.out.println("전공: ");
		major = sc.nextLine();
		System.out.println("학년: ");
		year = sc.nextInt();
		pm.insertData (new PhoneUnivInfo(name,number,major,year));
	
	}
	public void ComapnyInfo()
	{
		System.out.println("이름: ");
		name = sc.nextLine();
		System.out.println("전화번호: ");
		number =sc.nextLine();
		System.out.println("회사: ");
		company = sc.nextLine();
		pm.insertData( new PhoneCompanyInfo(name,number,company) );
		
	}
	public void search()
	{
		System.out.println("데이터를 검색합니다.");
		System.out.print("이름: ");
		name1 = sc.nextLine();
		pm.searchData(name1);
	}
	public void delete()
	{
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.println("이름: ");
		name = sc.nextLine();
		pm.deleteData(name);
	}
	public void showingData()
	{
		pm.showAllData();
	}
	
	

}
