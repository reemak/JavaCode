import java.util.*;

public class LinkedremoveCopy {

	public static void add(Link1 root,char a)
	{
		if(root==null)
			root=new Link1(a);
		else
		{
			Link1 t=root;
			while(t.next!=null)
				t=t.next;
			t.next=new Link1(a);
		}
	}
	

	public static void remove(Link1 root)
	{
		Link1 temp=root.next;
		char r1=root.n;
		Link1 p=root;
		while (temp!=null)
		{
			
			char r2=temp.n;
			if(r1==r2)
			{
				p.next=temp.next;
			}
			
			else
				r1=r2;
				p=temp;
				temp=temp.next;
			/*
			System.out.print(temp.n);
			System.out.print("-->");
			temp=temp.next;
			*/
				
		}
		
	}
	
	public static void removefromset(Link1 root)
	{
		Link1 temp=root;
		char r1=root.n;
		Link1 p=root;
		HashSet <Character> set=new HashSet<Character>();
		while (temp!=null)
		{	
			
			r1=temp.n;
			if(Character.isWhitespace(r1)==false)
				{
				if(set.contains(r1))
					{
						System.out.println(r1);
						p.next=temp.next;
					}
			
				else
					set.add(r1);
				//System.out.println(set);
				}
			
			p=temp;
			temp=temp.next;
			
				System.out.println(set);
		}
			
	}
	public static void print(Link1 root)
	{
		Link1 t=root;
		while(t!=null)
		{
			System.out.print(t.n);
			t=t.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//char a[]={'f','o','l','l','o','o','w'};
		String astr="Follow UP Rema Kuvaadia";
		//Link1 root=new Link1(a[0]);
		astr=astr.toLowerCase();
		Link1 root=new Link1(astr.charAt(0));
		for(int i=1;i<astr.length();i++)
		{
			add(root,astr.charAt(i));
			
		}
		/*for(int i=1;i<a.length;i++)
		{
			add(root,a[i]);
			
		}*/
		//remove(root);
		//print(root);
		removefromset(root);
		print(root);

	}

}
