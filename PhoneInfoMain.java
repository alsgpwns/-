import java.util.Scanner;
class PhoneInfoMain
{
	public static void main(String[] args)
	{
		PhoneInfoManager pm = new PhoneInfoManager();
		int choose = 0;		
		//Scanner sc = PhoneInfoManager.sc;
		Scanner si = new Scanner(System.in);
		


		while(true)
		{
			System.out.println("�����ϼ���...");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ������ �˻� ");
			System.out.println("3. ������ ���� ");
			System.out.println("4. ��� ������ ���� ");
			System.out.println("5. ���α׷� ���� ");
			System.out.print("���� : ");
			choose = si.nextInt();
			si.nextLine();

			switch (choose)
			{
			case 1:
				pm.insert();
				break;

			case 2:
				pm.find();
				break;


			case 3:
				pm.delete();
				break;
				


			case 4:	
				pm.see();
				break;

					
			case 5:
				System.out.println("\n�ý����� �����մϴ�.");
				return;

			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				

			}



		}




	}
}