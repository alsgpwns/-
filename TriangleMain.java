class TriangleMain //main은 따로 만드는것이 좋음
{
	public static void main(String[] args)
	{
		Triangle t1= new Triangle();
		t1.setTriangle(10,5);
		t1.areaOfTriangle();
		t1.printTriangle();

	Triangle t2= new Triangle();
		t2.setTriangle(4,2);
		t2.areaOfTriangle();
		t2.printTriangle();

	Triangle t3= new Triangle();
		t3.setTriangle(20,10);
		t3.areaOfTriangle();
		t3.printTriangle();
	}
}