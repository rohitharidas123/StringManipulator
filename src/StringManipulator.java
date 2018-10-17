public class StringManipulator 

{
	public String noVowels(String input)
	{
		String str = "";
		for(int i=0; i<input.length(); i++)
		{
			char letter = input.charAt(i);
				if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u") 
					{
						 str += "*";
					}
					else
					{
						str += input.charAt(i);
					}
		}
	}
}
