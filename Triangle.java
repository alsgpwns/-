class Triangle
{

	double width; //�������
	double height;
	double area;
	//�������=�������� , ���������� �켱����

	public void setTriangle(double width, double height) //��������
	{
		this.width = width; //this->��ü�� �ּҰ��� �������
		this.height = height;
		//���=����;
		//width=whidth; �ڽ��� �ٽ� �����ϰԵ�.
		
		

	}
	public void areaOfTriangle()
	{
		area=width*height/2; //��������� �ҷ���
	}
	public void printTriangle()
	{
		System.out.println("�غ�" + width);
		System.out.println("����" + height);
		System.out.println("����" + area);
	
	}
}