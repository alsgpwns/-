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
			System.out.println("선택하세요...");	
			System.out.println("1. 데이터 입력");	
			System.out.println("2. 데이터 검색");	
			System.out.println("3. 데이터 삭제");	
			System.out.println("4. 모든 데이터 보기");	
			System.out.println("5. 프로그램 종료");	
			System.out.print("선택 : ");
			choose = sc.nextInt();
			sc.nextLine();

			
			switch(choose)
			{
			case 1:
				System.out.println("\n데이터 입력을 시작합니다.");
				System.out.print("이름 : ");
				name = sc.nextLine();
	
				System.out.print("전화번호 : ");
				number = sc.nextLine();

				System.out.print("생년월일 : ");
				birth = sc.nextLine();
			
				people = new PhoneInfo(name, number, birth);
				infoArr[count++] = people;
				System.out.println("데이터 입력을 완료하였습니다.\n");
				break;

			case 2:
				System.out.println("\n데이터 검색을 시작합니다.");
				System.out.print("검색할 사람의 이름을 입력해주세요: ");
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
				if(!pflag)System.out.println("삭제하려는 사람의 데이터가 존재하지 않습니다.");	
				pflag=false;
				System.out.println("검색을 완료하였습니다.\n");

				break;
				
			

			case 3:
				System.out.println("데이터 삭제를 시작합니다.");
				System.out.println("삭제할 사람의 전화번호를 입력해주세요.");
				System.out.print("전화번호: ");
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
				if(!pflag)System.out.println("삭제하려는 사람의 데이터가 존재하지 않습니다.\n");
				else
				{
					for(int i=temp; i<count-1; i++)
					{
						infoArr[temp]=infoArr[temp+1];
					}
					infoArr[count-1] = null;
					count--;
					pflag = false;
					System.out.println("삭제를 완료하였습니다.\n");
					
				}
	
				break;

			case 4:
				System.out.println("\n데이터 전체를 봅니다.");
				for(int i=0;i<count;i++)
				{
					infoArr[i].showInfo();
					System.out.println(" ");
				}

				System.out.println("완료하였습니다.\n");
				
				break;			

			case 5:
			
				System.out.println("시스템을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");

			
				



				
					



			}



		}	


	}

}