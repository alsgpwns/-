class PhoneInfo
{
	private String name, number;
	
	PhoneInfo(String name, String number)
	{
		this.name = name;
		this.number = number;
	}
	public void showData()
	{
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+number);
	}
	public String getName()
	{
		return name;
	}
}
class PhoneUnivInfo extends PhoneInfo
{
	private String major, company;
	private int year;
	
	PhoneUnivInfo(String name, String number, String major,int year)
	{	
		super(name,number);
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
