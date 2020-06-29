import java.util.Scanner;

class PhoneInfoManager
{
		//public static Scanner sc = new Scanner(System.in);
		private int chooses, count, year, temp;
		private String name, number, major,company;	
		PhoneInfo phoneArr[] = new PhoneInfo[100];
		PhoneInfo people;  //Friend people = new Friend( ...);
		Scanner sc = new Scanner(System.in);
		


//static�� ���̸� static ������ �� �� �ְ� �ν��Ͻ� ������ �� �� ����. �ν��Ͻ� �޼ҵ嵵 ������ �� ����.-������ �����ؿ�...-
	public void insert() 
	{
		System.out.println("������ �Է��� �����մϴ�.");
		System.out.println("1.�Ϲ�, 2.����, 3. ȸ��");
		System.out.println("���� >> ");
		chooses = sc.nextInt();
		sc.nextLine();

			if(chooses == 1)
			{
				System.out.println("�̸� : ");
				name = sc.nextLine();
					
				System.out.println("��ȭ��ȣ : ");
				number = sc.nextLine();

				people = new PhoneInfo(name, number);
				phoneArr[count++] = people; 

				System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.\n");
			
			}
			else if( chooses ==2)
			{
				System.out.println("�̸� : ");
				name = sc.nextLine();

				System.out.println("��ȭ��ȣ : ");
				number = sc.nextLine();

				System.out.println("���� : ");
				major = sc.nextLine();

				System.out.println("�г� : ");
				year = sc.nextInt();

				people =new PhoneUnivInfo(name, number, major, year);
				phoneArr[count++] = people;
				System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.\n");
			
			}
			else if( chooses ==3)
			{
				System.out.println("�̸� : ");
				name = sc.nextLine();

				System.out.println("��ȭ��ȣ : ");
				number = sc.nextLine();

				System.out.println("ȸ�� : ");
				company = sc.nextLine();
						
				people = new PhoneCompanyInfo(name, number,company);
				phoneArr[count++] = people;

				System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.\n");
			
			}
			else
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�.\n");
			
			}

	}


	
	public void find()
	{
			System.out.println("������ �˻��� �����մϴ�.");
			System.out.print("�̸� :");
			name = sc.nextLine();
			for(int i = 0; i<count; i++)
			{
				if(name.compareTo(phoneArr[i].getName())==0)
				{
					phoneArr[i].showData();
					System.out.println("");
				}
			}

			System.out.println("�˻��� �Ϸ�Ǿ����ϴ�.\n");

	}

	public void delete()
	{
		
			System.out.println("\n������ ������ �����մϴ�.");
			System.out.print("�̸� :");
			name = sc.nextLine();
			for(int i = 0; i<count; i++)
			{
				if(name.compareTo(phoneArr[i].getName())==0)
				{
					temp = i;
				}
			}
			for(int i =temp ; i<count-1; i++)
			{
				phoneArr[i] = phoneArr[i+1];
			}

			phoneArr[count]=null;
			count--;

			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.\n");

	}
	
	public void see()
	{

		System.out.println("\n��ü ������ ���⸦ �����մϴ�.");

			for(int i = 0; i<count; i++)
			{
				phoneArr[i].showData();
				System.out.println("");
			}

			System.out.println("������ ���⸦ �Ϸ��Ͽ����ϴ�.\n");
	}

	

}