import java.util.Scanner;
public class PhoneInfoMain
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String name,number,birth;
		PhoneInfo[] infoArr = new PhoneInfo[100]; //PhonInfo�� 'inforArr'�迭 100��
		int cnt = 0;
		PhoneInfo info = null;
		
		while(true)
		{
			System.out.println("�����ϼ���...");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ������ �˻�");
			System.out.println("3. ������ ����");
			System.out.println("4. ��� ������ ����");
			System.out.println("5. ���α׷� ����");
			System.out.print("���� : ");
			choice =sc.nextInt();
			sc.nextLine();
			System.out.print("========================\n");
			
		
			switch(choice)
			{
			case 1: 
				System.out.println("������ �Է��� �����մϴ�.");
				System.out.println("�̸� : ");
				name = sc.nextLine();

				System.out.println("��ȭ��ȣ : ");
				number = sc.nextLine();

				System.out.println("������� : ");
				birth = sc.nextLine();
				info = new PhoneInfo(name,number,birth);
				infoArr[cnt++] = info;

				System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. ");
				break;

			case 2: 
				
				


			case 4:
				for(int i= 0; i<cnt;i++)
				{
					infoArr[i].showPhonInfo(); 
				}
				break;

			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				return;

			default:
				System.out.println("�ȹٷ� ��������Ѥ�");



			
			}
		}	
			



	}
	
	

}