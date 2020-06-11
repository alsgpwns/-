import java.util.Scanner;  //Slection Sort
class Spare5{
	public static void main(String[] args){
		int num1,num2,num3,num4,num5,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("임의의 숫자 5개를 입력하세요.");

		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		num5=sc.nextInt();

		for(int i=0;i<=5;i++){
		   
		  if(num1>num2){
		    temp=num1;
		    num1=num2;
		    num2=temp;
		   }
		 if(num2>num3){
		    temp=num2;
		    num2=num3;
		    num3=temp;
		  }
 		 if(num3>num4){
		    temp=num3;
		    num3=num4;
		    num4=temp;
		  }
		 if(num4>num5){
		    temp=num4;
		    num4=num5;
		    num5=temp;
		  }

		}


		System.out.println("정렬된 수는  "+num1+" "+num2+" "+num3+" "+num4+" "+num5);
		

	}
}
//16500
