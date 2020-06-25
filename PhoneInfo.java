class PhoneInfo
{
	private String name, number, birth;
	
	PhoneInfo(String name, String number, String birth)
	{
		this.name = name;
		this.number = number;
		this.birth = birth;
	}
	public void showInfo()
	{
		System.out.println("Name: "+name );
		System.out.println("PhoneNumber: "+number);
		System.out.println("BirthDay: "+birth);
	}
	public String getName()
	{
		return name;
	}
	public String getNumber()
	{
		return number;
	}

	

}


