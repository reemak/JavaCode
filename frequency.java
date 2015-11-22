import java.util.*;
public class frequency {

	public static void  findfrequency(String a) {
		char[] aab=a.toCharArray();
			  int count=0;
				HashMap<Character,Integer> map=new HashMap<Character,Integer>();
				for(int i=0;i<a.length();i++)
				{
				
					if(map.containsKey(a.charAt(i)))
					{
						int ab=map.get(a.charAt(i));
						map.put(a.charAt(i),ab+1);
					}
					else
						map.put(a.charAt(i),1);
				}
				
				for(Character z:map.keySet())
					System.out.println(z+" "+map.get(z));
			}


	public static void main(String[] args) {
		String a="abcdefabcdefaabbcczzzzzzzzzzzz";
		findfrequency(a);
	}

}
