import java.util.*;
public class FrequencyofNumber {

	public static HashMap<Integer,Integer> count(int[]a)
	{
		HashMap<Integer,Integer> itsme=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(itsme.containsKey(a[i]))
			{
				int incr=itsme.get(a[i]);
				itsme.put(a[i], incr+1);
			}
			else
			{
				itsme.put(a[i],1);
			}
		}
		return itsme;
		
		
	}

	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,2,3,1,3,4,4,4,4,4,5,6,5,6,5,6,7,7,7,7,7,7,7,8,9,8,9,8,9,8};
		HashMap<Integer,Integer> ans=new HashMap<Integer,Integer>();
		ans=count(a);
		System.out.println(ans);
	}

}
