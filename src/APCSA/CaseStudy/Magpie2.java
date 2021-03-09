package APCSA.CaseStudy;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, foolish human.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		statement = statement.toLowerCase();
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Ok.";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(statement.contains("brother")){
			response = "I had two program brothers before. They were brutally uninstalled.";
		}
		else if(statement.contains("sister")){
			response = "I have two sisters that get all the spotlight in my family. One is named cortana and the other is named siri." +
					"\nNo one knows about maggie. :( ";
		}
		else if(statement.contains("dog") || statement.contains("cat")){
			response = "Tell me more about your pets.";
		}
		else if(statement.contains("mr.lu")){
			response = "Have you ever seen an eagle fly over the trees?";
		}
		else if(statement.trim().isEmpty()){
			response = "Say something.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}

	//Q1: The problem with the responses is that since the code checks whether or not the statement CONTAINS the phrase/word,
	//words such as "smothered" and "know" contains "mother" and "no" respectively, so it will trigger an incorrect response.

}
