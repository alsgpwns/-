public class PhoneInfo
{
	private String name,number,birth;

		
	PhoneInfo(String name, String number, String birth)
	{
		this.name = name;
		this.number = number;
		this.birth = birth;
	}
	public void showPhonInfo()
	{
		System.out.println("name: "+name);
		System.out.println("number: "+number);
		System.out.println("birth: "+birth);
	}


}