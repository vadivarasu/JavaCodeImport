
public class Interfacecheck
implements Result{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Since the interface in separate block, to execute the interface script
		// create object for the class inside the public class.
		Result r=new Interfacecheck();
		r.Hold();
		r.Fail();
		r.pass();
	
		System.out.println("Score Card");
		
		
		
	}

	@Override
	public void pass() {
		// TODO Auto-generated method stub
		System.out.println("Pass mark is" +50);
	}

	@Override
	public void Fail() {
		// TODO Auto-generated method stub
		System.out.println("Mark is"+30);
	}

	@Override
	public void Hold() {
		// TODO Auto-generated method stub
		System.out.println("Mark is"+34);
	}

}
