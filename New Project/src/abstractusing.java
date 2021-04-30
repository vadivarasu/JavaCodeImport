
public class abstractusing extends abstractCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		abstractusing a=new abstractusing();
		a.fail();
		a.pass();
		a.firstclass();
		a.distinction();
		
	}

	@Override
	public void firstclass() {
		// TODO Auto-generated method stub
		System.out.println("above" + 80);
		
	}

	@Override
	public void distinction() {
		// TODO Auto-generated method stub
		System.out.println("above" + 90);
		
	}

}
