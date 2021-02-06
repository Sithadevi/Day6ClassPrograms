package day6;

class A
{
	void fun()
	{
		System.out.println("This is the parent class");
	}
	
}
class B extends A
{
	void fun1() {
		System.out.println("This is the first child class");
	}
	
}
class C extends B
{
	void fun2(){
		System.out.println("This is the second child class");
	}
}

class MultiLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.fun();
		obj.fun1();
		C obj1=new C();
		obj1.fun();
		obj1.fun1();
		obj1.fun2();
		
		}

}
