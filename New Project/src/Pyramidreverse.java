
public class Pyramidreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=1;
		for(int i=1;i<=4;i++) // 4 times outer loop should run for output in pyramid
		{
			for(int j=1;j<1+i;j++)  // since "i" value in addition so loop will break 
			{
				System.out.print(k);
				System.out.print("\t"); // used for space bar between letters
				k++;		
			}
			System.out.println("");
			
		}
		
		
	}

}
