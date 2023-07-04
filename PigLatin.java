public class PigLatin
{
	public static String translate( String original )
	{
		//String word;
		String start = original;
		start = start.toLowerCase();

		char k = start.charAt(0);
		if( (k == 'a') || (k == 'e') || (k == 'i') || (k == 'o') || (k == 'u') )
		{
			original = start + "vai";
			System.out.println(original);
		}
		else
		{
			original = start.substring(1) + k + "ai";
			System.out.println(original);
		}
		//System.out.println(word);
		return original;

	}
	public static void main(String[] args)
	{
	translate("Lai");
	}
}