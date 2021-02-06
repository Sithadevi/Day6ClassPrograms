package day6;

class Compose{
	String email="some@gmail.com";
	String message="hello..";
			
}
class sentMail extends Compose{
	String status="deliverd";
}

class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Compose c= new Compose();
		//System.out.println(c.email);
		//System.out.println(c.message);
		//System.out.println(c.status);
		sentMail s=new sentMail();
		System.out.println(s.email);
		System.out.println(s.message);
		System.out.println(s.status);
		
	}

}
