package PhoneBook6;

public class PhoneMain 
{
	public static void main(String[] args)
	{
		PhoneBookUI pUI = new PhoneBookUI();
		
			
		while(true)
		{
			try
			{	
			
				pUI.mainMenu();
				
				int Choose = pUI.sc.nextInt(); //메인 메뉴 선택
				pUI.sc.nextLine();
				
				if(Choose < PhoneBookMenu.INSERT_DATA && Choose >  PhoneBookMenu.QUIT_PROGRAM)
				{
					Choose = pUI.sc.nextInt();
					throw new MenuChoiceException(Choose);
				}
			
				switch(Choose)
				{
					case PhoneBookMenu.INSERT_DATA:
						pUI.subMenu();
						pUI.subMenuChoice();
//						Choose = pUI.sc.nextInt();
//						pUI.sc.nextLine();
//							switch(Choose)
//							{
//							case 1:
//								pUI.GenericInfo();
//								break;
//							case 2:
//								pUI.UnivInfo();
//								break;
//							case 3:
//								pUI.ComapnyInfo();
//								break;
//							}
						break;
					
					case PhoneBookMenu.SEARCH_DATA:
						pUI. search();
						break;
						
					case PhoneBookMenu.DELETE_DATA:
						pUI.delete();
						break;
						
					case PhoneBookMenu.SHOW_ALLDATA:
						pUI.showingData();
						break;
						
					case PhoneBookMenu.QUIT_PROGRAM:
						return;
				}
			}
			catch(MenuChoiceException e)
			{
				System.out.println( e.getMessage() );
				e.showWrongMessage();
			}
			
				
				
		}
	}

}
