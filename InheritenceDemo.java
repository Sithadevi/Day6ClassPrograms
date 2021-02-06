package day6;
class Parent //only parent property
{
	int a=10;
}
class child extends Parent
{
	int a=20;
	void addition()
	{
		int result1 = a + a;
		System.out.println("result"+ result1);
		
		int result2= super.a + a;
		System.out.println("result1"+ result2);
		
		int result3=super.a+super.a;
		System.out.println("result1"+ result3);
	}
}

class InheritenceDemo {

	public static void main(String[] args) {
		child c= new child();
		c.addition();
		
	}

}
