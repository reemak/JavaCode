import java.util.*;
public class ExistBoth {
	public static HashSet<Integer> get(int a[],int b[])   //with 1 iteration through the entire list of greater size if m>n Time complexity is O(m)
	{
		HashSet<Integer> c =new HashSet<Integer>();
		HashSet<Integer> tmp=new HashSet<Integer>();
		int i=0;
		int j=0;
		while(true)
		{
			if(a[i]==b[j]){
				c.add(a[i]);
				if(i<a.length-1)
					i++;
					if(j<b.length-1)
					j++;
			}
			if(a[i]>b[j])
			{
				while(b[j]<a[i] && j<b.length-1){
				if(b[j]==b[j+1])
					c.add(b[j]);
				j++;
				}
				
			}
			else if(b[j]>a[i])
			{
				while(a[i]<b[j] &&i<a.length-1 )
				{
					if(a[i]==a[i+1])
						c.add(a[i]);
					i++;
				}
			}
			if(i==a.length-1 && j!=b.length-1)
			{
				if(b[j]==b[j+1])
					c.add(b[j]);
				j++;
			}
				
			if(j==b.length-1 && i!=a.length-1)
			{
				if(a[i]==a[i+1])
					c.add(a[i]);
				i++;
			}
			if(i==a.length-1 && j==b.length-1)
				break;
		}
 		return c;
	}
	/*
	public static HashSet<Integer> getTwo(int a[],int b[])//Two Iterations same complexity  
	{
		Set<Integer> tmp=new HashSet<Integer>();
		HashSet<Integer> c=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)//iterate first list look for duplicates
		{
			if(tmp.contains(a[i]))
				c.add(a[i]);
			else
				tmp.add(a[i]);
		}
		for(int i=0;i<b.length;i++)//check for common elements in both list and repeated elements in the second list
		{
			if(tmp.contains(b[i]))
				c.add(b[i]);
			else
				tmp.add(b[i]);
		}
		return c;
	}
	*/
	public static void main(String args[])
	{
		int a[]={1,3,3,5,7};
		int b[]={2,4,5,6,8,8,8};
		System.out.println(get(a,b));
	//	System.out.println(getTwo(a,b));
	}
}


