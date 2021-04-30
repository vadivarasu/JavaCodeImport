
public class Java_Learning1 {

	static int b=15;
	
	
	// Below class can run only if it is written inside the main block
	// Below block can be called from the main block for execution
	//Example- Instead of writing login code in every test case,write it in separate block 
	//and called whenever the script required 
	public void myclass(){
		
		System.out.println("Checking");
		//return 2;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_Learning1 MC=new Java_Learning1();
		Java_Learning2 JL=new Java_Learning2();
		JL.calling();
		MC.myclass();
		System.out.println("JAVA");
		System.out.println("Learning");
		System.out.println("First Class");
		
	int	a=10;
	int c=a+b;
	
	System.out.println(c);
	
	
	
		
	}

}
