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
		System.out.println("�Էµ� ���� ���...");
		System.out.println("name : " +name+ "phone: " +number+ "birth : "+birth);
	}

	public static void main(String[] args)
	{
		while(true)
		{
			Scanner sc= new Scanner(System.in);
			
			System.out.println("\n �����ϼ���...");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ���α׷� ����");
			System.out.print("����: ");
			int num=sc.nextInt();
			sc.nextLine();

	

			if(num==1)
			{
				
				System.out.print("�̸�: ");
				String name=sc.nextLine();

				System.out.print("��ȭ��ȣ : ");
				String number=sc.nextLine();
	
				System.out.print("������� : ");
				String birth=sc.nextLine();

				Info p1 = new Info ( name , number, birth);
				p1.result();
			}

			else
			{
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}


		}




	}
	


}