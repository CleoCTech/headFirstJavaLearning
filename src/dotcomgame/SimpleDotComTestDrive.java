package dotcomgame;

public class SimpleDotComTestDrive {

	public static void main(String [] args) {
		SimpleDotComClass dot = new  SimpleDotComClass();
		
		int [] locations = {2,3,4};
		
		//invoke setter method and pass the params
		dot.setLocationCells(locations);
		//making  a fake user guess
		String userGuess = "2";
		
		//invoke checkYourself() method on the dot object of SimpleDotComClass and it with parameter fake guess from above
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed";
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
		System.out.println(testResult);
	}
}
