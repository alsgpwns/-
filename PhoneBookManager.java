package PhoneBook6;

public class PhoneBookManager 
{
	private static PhoneInfo[] infoArr= new PhoneInfo[100];
	private static int count;
	private static int sizePhone;
	//private PhoneBook pb;
	
//	PhoneBook(int sizePhone)
//	{
//		pInfoArr = new PhoneBookInfo[sizePhone];
//		cntPhone = 0;
//		this.sizePhone = sizePhone;
//	} �̰� ���ϴ��� �Ӹ�����
	
//	public static PhoneBookManager getphoneBook
	
	
	
	//1��
	public void insertData(PhoneInfo phoneInfo)
	{
		infoArr[count++] = phoneInfo;
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	//2��
	public void searchData(String name)
	{
		for(int i = 0 ; i <count; i++)
		{
			if(name.compareTo(infoArr[i].getName()) == 0)
			{
				infoArr[i].showData();
			}
			else
			{
				System.out.println("�˻��ϰ��� �ϴ� �����Ͱ� �����ϴ�.");
			}
		}
	}
	//3��
	public void deleteData(String name)
	{
		for(int i = 0 ; i<count; i++)
		{
			if(name.compareTo(infoArr[i].getName()) ==0)
			{
				System.out.println("��");
				infoArr[i] = infoArr[i+1];
				count--;
				infoArr[count] = null;
				break;
			}
			else
			{
				System.out.println("�����ϰ��� �ϴ� �����Ͱ� �����ϴ�.");
			}
		}
	}
	//4��
	public void showAllData()
	{
		for(int i = 0; i<count; i++)
		{
			infoArr[i].showData();
		}
	}
	

}
