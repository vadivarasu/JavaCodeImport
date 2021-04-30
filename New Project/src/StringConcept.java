
public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// 1.String Literal method of string definition.
	//String	a="Vadivarasu"; 
    //By the above step,java back end automatically create new memory allocation for Vadivarasu.
	//String b="Vadivarasu";
	//Since the same string written in b variable, 
	//back end it wont create new memory since it is an duplication
	
	//2.String class creation method
	
	//String C=new String("Vadivarasu");
	String D=new String(" Vadivarasu");
	//Forcefully allocating memory for the duplicate string in both C&D variable.

	System.out.println(D.charAt(5));
	System.out.println(D.indexOf("s"));
	System.out.println(D.toLowerCase());
	System.out.println(D.toUpperCase());
	System.out.println(D.trim());
	String arr[]=D.split("v"); // Since the string splits into 2 parts, array index storage used 
	System.out.println(arr[0]); // index 0 means first split storage 
	System.out.println(arr[1]); // index 1 means second split storage
	
	
	
	
	
	
	
	
	
	
		
	}

}
