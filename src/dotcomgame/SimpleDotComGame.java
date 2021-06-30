package dotcomgame;

public class SimpleDotComGame {

	public static void main(String[] args) {
	
		int numberOfGuesses =0;
		
		GameHelper helper = new GameHelper();
		
		SimpleDotComClass dotCom = new SimpleDotComClass();
		
		/**math.random() will generate a double digit between 0-5, i., it can be 3, or 2.57, or 4.99 or 5. Since we want whole number; we will use (int) 
		   before math.random which help us in rounding of the double digit that may result to a whole number.
		**/
		int randomNo = (int) (Math.random() *5);
		
		int [] locations = {randomNo, randomNo+1, randomNo+2};
		dotCom.setLocationCells(locations);
		
		boolean isAlive = true; 
		
		
		while (isAlive) {
			String guess = helper.getUserInput("Enter a number");
			String result =  dotCom.checkYourself(guess);
			
			numberOfGuesses++;
			
			if (result.equals("kill")) {
				isAlive =false;
				System.out.println("You took " +numberOfGuesses+ " guesses");
			}
		}

	}

}
