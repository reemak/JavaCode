import java.util.*;
public class FooBar {

	public static HashMap<String,ArrayList<String>> findRageFooBar(String s)
	{
		String[] s1=s.split(",");
		Stack<String>in=new Stack<String>();
		
		HashMap<String, ArrayList<String>> out=new HashMap<String,ArrayList<String>>();
		
		for(int i=0;i<s1.length;i++)
		{
			//System.out.println(s1[i]);
			String a1=s1[i];
			String[] a=a1.split(":");
			int num=Integer.parseInt(a[1]);
			if(num>=0)
			{
				in.push(s1[i]);
			//	System.out.println(num);
			}
			else
			{
				String c=in.pop();
				//System.out.println(c);
				String[] check=c.split(":");
				//System.out.println("Print");\
				
				//System.out.println(a[0]+check[0]);
				if(check[0].equals(a[0]))
				{
				
					
					String v=check[1]+a[1];
					//System.out.println(v);
					if(out.containsKey(a[0]))
					{
						ArrayList<String> f=out.get(a[0]);
						f.add(v);
						out.put(a[0],f);
					}
					else
					{
						ArrayList<String> arr=new ArrayList<String>();
						arr.add(v);
						out.put(a[0],arr);
					}
					
				}
				else 
					{
						System.out.println("The sequence doesnt match");
						return out;
					}
				
					
			}
			
			
		}
		return out;
	}

	public static void main(String[] args) {
		
		String s1="Foo:100,Foo:50,Foo:10,Bar:300,Foo:1,Bar:50,Bar:-50,Foo:-3,Bar:-500,Foo:-40,Foo:-70,Foo:-300";
		//
		HashMap<String,ArrayList<String>>ans=findRageFooBar(s1); 
		System.out.println(ans);
	}

}
