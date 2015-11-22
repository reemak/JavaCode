import java.util.*;

public class IsomorphicString {

	public static boolean verify(String s, String t)
	{
		boolean and= help(s,t);
		return and;
	
	}
	
	public static boolean help(String s, String t)
	{
		HashMap <Character, Integer> scheck=new HashMap<Character,Integer>();
		HashMap <Character, Integer> tcheck=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(scheck.containsKey(s.charAt(i)) && tcheck.containsKey(t.charAt(i)))
					{
						int a=scheck.get(s.charAt(i));
						int b=tcheck.get(t.charAt(i));
						
						if(a==b)
						{
							scheck.put(s.charAt(i), i);
							tcheck.put(t.charAt(i), i);
						}
						else 
							return false;
					}
			else if(scheck.containsKey(s.charAt(i)) && !tcheck.containsKey(t.charAt(i)) || !scheck.containsKey(s.charAt(i)) && tcheck.containsKey(t.charAt(i)))
			{
				return false;
			}
			else
			{
				scheck.put(s.charAt(i), i);
				tcheck.put(t.charAt(i), i);
				//System.out.println()
				
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		String a="aba";
		String b="aba";
		
		boolean ans=verify(a,b);
		System.out.println(ans);

	}

}
