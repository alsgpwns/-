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
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ��ü����");
		System.out.println("5. ���α׷� ����");
		System.out.print("���� : ");
		
	}
	
	public void subMenu()
	{
		System.out.println("������ �Է��� �����մϴ�.");
		System.out.println("1. �Ϲ� 2. ���� 3. ȸ��");
		System.out.print("����>> ");
	}
	//���� �޴� ����
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
		System.out.println("�̸�: ");
		name = sc.nextLine();
		System.out.println("��ȭ��ȣ: ");
		number =sc.nextLine();
		pm.insertData( new PhoneInfo(name,number) );
		
	}
	public void UnivInfo()
	{
		System.out.println("�̸�: ");
		name = sc.nextLine();
		System.out.println("��ȭ��ȣ: ");
		number =sc.nextLine();
		System.out.println("����: ");
		major = sc.nextLine();
		System.out.println("�г�: ");
		year = sc.nextInt();
		pm.insertData (new PhoneUnivInfo(name,number,major,year));
	
	}
	public void ComapnyInfo()
	{
		System.out.println("�̸�: ");
		name = sc.nextLine();
		System.out.println("��ȭ��ȣ: ");
		number =sc.nextLine();
		System.out.println("ȸ��: ");
		company = sc.nextLine();
		pm.insertData( new PhoneCompanyInfo(name,number,company) );
		
	}
	public void search()
	{
		System.out.println("�����͸� �˻��մϴ�.");
		System.out.print("�̸�: ");
		name1 = sc.nextLine();
		pm.searchData(name1);
	}
	public void delete()
	{
		System.out.println("������ ������ �����մϴ�.");
		System.out.println("�̸�: ");
		name = sc.nextLine();
		pm.deleteData(name);
	}
	public void showingData()
	{
		pm.showAllData();
	}
	
	

}
