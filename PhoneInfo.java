package PhoneBook6;

class MenuChoiceException extends Exception
{
	private int choose;
	MenuChoiceException(int choose)
	{
		super("�߸��� �޴��� �����ϼ̽��ϴ�.");
		this.choose = choose;
	}
	public void showWrongMessage()
	{
		System.out.println(choose + "�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
		System.out.println("�޴� ������ �ٽ� �����մϴ�.");
	}
	
}
public class PhoneInfo 
{
	private String number, name;
	PhoneInfo(String name, String number)
	{
		this.name = name;
		this.number = number;
	}
	public String getName()
	{
		return name;
	}
	public void showData()
	{
		System.out.println("�̸�: "+name);
		System.out.println("��ȭ��ȣ: "+number);
	}
}
class PhoneUnivInfo extends PhoneInfo
{
	private String major;
	private int year;
	PhoneUnivInfo(String name, String number, String major, int year)
	{
		super(name, number);
		this.major = major;
		this.year = year;
	}
	public void showData()
	{
		super.showData();
		System.out.println("����: "+major);
		System.out.println("�г�: "+year);
	}
}
class PhoneCompanyInfo extends PhoneInfo
{
	private String company;
	PhoneCompanyInfo(String name, String number, String company)
	{
		super(name,number);
		this.company = company;
	}
	public void showData()
	{
		super.showData();
		System.out.println("ȸ��: "+company);
	}
}
