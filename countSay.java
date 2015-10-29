import java.util.*;
public class countSay {
	
	public static String countandSay(int n) 
	{ 	String[] number = {"one","two","three","four","five","six","seven","eight","nine","ten"};
		//int temp=0;
		int count=1;
		int temp=n%10;
		int q=temp%10;
		//System.out.println(q);
		int r=n/10;
		//System.out.println(r);
		String c="";
		do{
		
		if(temp==q)
		{
			count++;
			System.out.println(q);
			c=number[count-1]+q+c;
		}
		else
		{	//System.out.println("in else");
			count=1;
			c=number[count-1]+q+c;
		}
		//c=number[count-1]+q+c;
		
		 temp=q;
		 r=r/10;
		 q=r%10;
		}while(q!=0);
		 
		return c;
	}
	
	public static void main(String[] args) 
	{
		int a=1112211;
		System.out.println(a);
		
			String b=countandSay(a);
			System.out.println(b);
	}
	
}

