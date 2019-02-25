
public class Magpie
{

	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	public String getResponse(String statement)
	{
		String response = "";
		
		if (statement.lastIndexOf("!") >= 0 || statement==statement.toUpperCase())
		{
			response = "Stop yelling at me!";
	
		}
		
		else if (statement.toLowerCase().indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.toLowerCase().indexOf("mother") >= 0
				|| statement.toLowerCase().indexOf("father") >= 0
				|| statement.toLowerCase().indexOf("sister") >= 0
				|| statement.toLowerCase().indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
	
		}
		else if (statement.toLowerCase().indexOf("grossi") >= 0)
		{
			response = "Sounds like a...teacher.";
		}
		else if (statement.toLowerCase().indexOf("chad ditwit") >= 0)
		{
			response = "Your savior";
	
		}
		else if (statement.toLowerCase().indexOf("love") >= 0)
		{
			response = "I yearn to teach a robot to love";
	
		}
		else if (statement.toLowerCase().indexOf("fuck") >= 0
		|| statement.toLowerCase().indexOf("shit") >= 0
		|| statement.toLowerCase().indexOf("ass") >= 0
		|| statement.toLowerCase().indexOf("bitch") >= 0
		|| statement.toLowerCase().indexOf("cunt") >= 0
		|| statement.toLowerCase().indexOf("twat") >= 0)
		{
			response = "Watch your language.";
	
		}
		else if (statement.toLowerCase().indexOf("dog") >= 0
				|| statement.toLowerCase().indexOf("cat") >= 0
				|| statement.toLowerCase().indexOf("ocelot") >= 0
				|| statement.toLowerCase().indexOf("gerbil") >= 0
				|| statement.toLowerCase().indexOf("cow") >= 0
				|| statement.toLowerCase().indexOf("lion") >= 0
				|| statement.toLowerCase().indexOf("frog") >= 0
				|| statement.toLowerCase().indexOf("turtle") >= 0
				|| statement.toLowerCase().indexOf("horse") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.toLowerCase().trim().length()== 0)
			response = "Say something im giving up on you";
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "oo";
		}
		else if (whichResponse == 1)
		{
			response = "huh";
		}
		else if (whichResponse == 2)
		{
			response = "what";
		}
		else if (whichResponse == 3)
		{
			response = "rly?";
		}
		else if (whichResponse == 4)
		{
			response = "lol";
		}
		else if (whichResponse == 5)
		{
			response = "k";
		}
		return response;
	}
}