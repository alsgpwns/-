class Circle
{
	double radius;//������
	double area; //����
	double circum; //�ѷ�
	//double pie=3.14; ����
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
		System.out.println("������ "+radius);
		System.out.println("�ѷ� "+circum);
		System.out.println("���� "+area);
		System.out.println(" ");
	}
		

}

