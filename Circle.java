class Circle
{
	double radius;//반지름
	double area; //면적
	double circum; //둘레
	//double pie=3.14; 파이
	final double PI =3.14;	

	public void setCircle(double radius)
	{
		this.radius=radius;
		
	}

	public void circumOfcircle()
	{
		circum=2*PI*radius;
	}

	public void areaOfcircle()
	{
		area=(3.14*radius*radius);
	}

	public void printCircle()
	{
		System.out.println("반지름 "+radius);
		System.out.println("둘레 "+circum);
		System.out.println("면적 "+area);
		System.out.println(" ");
	}
		

}

