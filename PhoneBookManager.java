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
//	} 이거 뭐하는지 머르겠음
	
//	public static PhoneBookManager getphoneBook
	
	
	
	//1번
	public void insertData(PhoneInfo phoneInfo)
	{
		infoArr[count++] = phoneInfo;
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	//2번
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
				System.out.println("검색하고자 하는 데이터가 없습니다.");
			}
		}
	}
	//3번
	public void deleteData(String name)
	{
		for(int i = 0 ; i<count; i++)
		{
			if(name.compareTo(infoArr[i].getName()) ==0)
			{
				System.out.println("야");
				infoArr[i] = infoArr[i+1];
				count--;
				infoArr[count] = null;
				break;
			}
			else
			{
				System.out.println("삭제하고자 하는 데이터가 없습니다.");
			}
		}
	}
	//4번
	public void showAllData()
	{
		for(int i = 0; i<count; i++)
		{
			infoArr[i].showData();
		}
	}
	

}
