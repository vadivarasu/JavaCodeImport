
public class Pyramidconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=1;
		
		for(int i=0;i<4;i++)
		{
			for(int j=1;j<=4-i;j++) // first time runs for 4 times, and minus i checks 3 times in 2nd round
			{
				System.out.print(k); // Separate integer assigned for numbering
				System.out.print("\t"); // space option between numbers
				k++;
						
			}
			System.out.println("");
			
		}
		
	}

}
