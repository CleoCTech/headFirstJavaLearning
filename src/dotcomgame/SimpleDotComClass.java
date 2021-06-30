package dotcomgame;

public class SimpleDotComClass {

	int[] locationCells;
	
	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}

	int numberOfHits =0; 
	
	public String checkYourself(String userGuess) /**get userGuess or pass variable**/ {
		
		//convert the user string to integer
		int guess =  Integer.parseInt(userGuess);
		
		/** make a variable to hold the result we'll return. 
		 * We put "miss" in as  the default**/
		String result  = "miss";
		
		for (int cell: locationCells ) {
			 /*iterate through the array and comparing it with the user guess */
			if (guess == cell) {
				result = "hit";
				numberOfHits ++;
				
				break; //got out of the loop, no need to test other cells
			}
		}
		
		if (numberOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result; 
	}
}
