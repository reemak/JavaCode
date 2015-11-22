import java.util.*;
public class knowABC {

	public static boolean reversecount(String in) {
		//it will return true if it has more than 20 reversed character in the string
		int current='a';
		String out="";
		int count=0;
		for(int i=in.length()-1;i>=0;i--)
		{
			//checks for the character
			if(current==in.charAt(i))
			{
				//System.out.println((char)current);
				out+=(char)current;
				count++;
				current=current+1;
			}
			
				
		}
		if(count>=20)
		return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		String given="afbcsaslkdjfovutsoiuwetsrqsdpsgonmlkjihaowiuegoaugfwoegddbcba";
		boolean output=reversecount(given);
		System.out.println(output);

	}

}

