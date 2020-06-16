class Triangle
{

	double width; //멤버변수
	double height;
	double area;
	//멤버변수=지역변수 , 지역변수가 우선순위

	public void setTriangle(double width, double height) //지역변수
	{
		this.width = width; //this->객체의 주소값이 들어있음
		this.height = height;
		//멤버=지역;
		//width=whidth; 자신을 다시 대입하게됨.
		
		

	}
	public void areaOfTriangle()
	{
		area=width*height/2; //멤버변수를 불러옴
	}
	public void printTriangle()
	{
		System.out.println("밑변" + width);
		System.out.println("높이" + height);
		System.out.println("면적" + area);
	
	}
}