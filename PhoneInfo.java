package PhoneBook6;

class MenuChoiceException extends Exception
{
	private int choose;
	MenuChoiceException(int choose)
	{
		super("잘못된 메뉴를 선택하셨습니다.");
		this.choose = choose;
	}
	public void showWrongMessage()
	{
		System.out.println(choose + "에 해당하는 선택은 존재하지 않습니다.");
		System.out.println("메뉴 선택을 다시 시작합니다.");
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
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+number);
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
		System.out.println("전공: "+major);
		System.out.println("학년: "+year);
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
		System.out.println("회사: "+company);
	}
}
