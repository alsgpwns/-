import java.util.Scanner;
class Info
{
	private String name,number,birth;

	public Info(String name, String number, String birth)
	{
		this.name=name;
		this.number=number;
		this.birth=birth;
	}
	public void result()
	{
		System.out.println("===================");
		System.out.println("입력된 정보 출력...");
		System.out.println("name : " +name+ "phone: " +number+ "birth : "+birth);
	}

	public static void main(String[] args)
	{
		while(true)
		{
			Scanner sc= new Scanner(System.in);
			
			System.out.println("\n 선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 프로그램 종료");
			System.out.print("선택: ");
			int num=sc.nextInt();
			sc.nextLine();

	

			if(num==1)
			{
				
				System.out.print("이름: ");
				String name=sc.nextLine();

				System.out.print("전화번호 : ");
				String number=sc.nextLine();
	
				System.out.print("생년월일 : ");
				String birth=sc.nextLine();

				Info p1 = new Info ( name , number, birth);
				p1.result();
			}

			else
			{
				System.out.println("프로그램을 종료합니다.");
				return;
			}


		}




	}
	


}