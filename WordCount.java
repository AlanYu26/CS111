public class WordCount
{
	public static int countWords( String original, int maxLength )
	{
		int counter = 0;
		String tempholder = "";

		for(int i = 0; i < original.length(); i++)
		{
			if(Character.isAlphabetic(original.charAt(i)) == true)
			{
				tempholder = tempholder + original.charAt(i);
			}
			else
			{
				if(tempholder.length() <= maxLength && tempholder.isEmpty() == false)
				
					counter++;
					tempholder = "";
			
			}	
		}
		if(tempholder.length() <= maxLength && tempholder.isEmpty() == false)
		
					counter++;
					tempholder = "";
					return counter;	

	}

	public static void main(String[] args)
	{
		System.out.println("What's the wordage?");
		String original = IO.readString();
		System.out.println("What's the max amount of characters a word can have?");
		int maxLength = IO.readInt();
		System.out.println(countWords(original,maxLength));
	}
}