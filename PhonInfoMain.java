import java.util.Scanner;
class PhoneInfoMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name=null,number=null,birth=null;
		int choose=0, count = 0, temp = 0;
		PhoneInfo[] infoArr = new PhoneInfo[100];
		PhoneInfo people = null;
		boolean pflag = false;


			
		while(true)
		{
			System.out.println("�����ϼ���...");	
			System.out.println("1. ������ �Է�");	
			System.out.println("2. ������ �˻�");	
			System.out.println("3. ������ ����");	
			System.out.println("4. ��� ������ ����");	
			System.out.println("5. ���α׷� ����");	
			System.out.print("���� : ");
			choose = sc.nextInt();
			sc.nextLine();

			
			switch(choose)
			{
			case 1:
				System.out.println("\n������ �Է��� �����մϴ�.");
				System.out.print("�̸� : ");
				name = sc.nextLine();
	
				System.out.print("��ȭ��ȣ : ");
				number = sc.nextLine();

				System.out.print("������� : ");
				birth = sc.nextLine();
			
				people = new PhoneInfo(name, number, birth);
				infoArr[count++] = people;
				System.out.println("������ �Է��� �Ϸ��Ͽ����ϴ�.\n");
				break;

			case 2:
				System.out.println("\n������ �˻��� �����մϴ�.");
				System.out.print("�˻��� ����� �̸��� �Է����ּ���: ");
				name =  sc.nextLine();

				for(int i = 0; i<count; i++)
				{
					if(name.compareTo(infoArr[i].getName()) == 0)
					{
						infoArr[i].showInfo();
						pflag=true;
						break;
					}
				}	
				if(!pflag)System.out.println("�����Ϸ��� ����� �����Ͱ� �������� �ʽ��ϴ�.");	
				pflag=false;
				System.out.println("�˻��� �Ϸ��Ͽ����ϴ�.\n");

				break;
				
			

			case 3:
				System.out.println("������ ������ �����մϴ�.");
				System.out.println("������ ����� ��ȭ��ȣ�� �Է����ּ���.");
				System.out.print("��ȭ��ȣ: ");
				number = sc.nextLine();

				for(int i=0;i<count;i++)
				{
					if(number.compareTo(infoArr[i].getNumber())==0)
					{
						temp = i;
						pflag = true;
						break;
					}
				}
				if(!pflag)System.out.println("�����Ϸ��� ����� �����Ͱ� �������� �ʽ��ϴ�.\n");
				else
				{
					for(int i=temp; i<count-1; i++)
					{
						infoArr[temp]=infoArr[temp+1];
					}
					infoArr[count-1] = null;
					count--;
					pflag = false;
					System.out.println("������ �Ϸ��Ͽ����ϴ�.\n");
					
				}
	
				break;

			case 4:
				System.out.println("\n������ ��ü�� ���ϴ�.");
				for(int i=0;i<count;i++)
				{
					infoArr[i].showInfo();
					System.out.println(" ");
				}

				System.out.println("�Ϸ��Ͽ����ϴ�.\n");
				
				break;			

			case 5:
			
				System.out.println("�ý����� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");

			
				



				
					



			}



		}	


	}

}