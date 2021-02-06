package day6;

class Parent1
{
	Parent1(int id, String name)
	{
		System.out.println("This is parent constructor");
		System.out.println("id"+id+"name"+name);
	}
}
class child1 extends Parent1{
	child1(int id, String name)
	{
		super(id,name);
		System.out.println("This is child constructor");
	}
}
class SuperConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c=new child1(1,"sita");
	}

}
