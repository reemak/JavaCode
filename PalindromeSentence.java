package Strings;

import java.util.*;
public class PalindromeSentence {

	public static boolean isPalindromeSentence(String a)
	{
		a=a.toLowerCase();
		String ans="";
		
		if(a.length()==0 || a.length()==1)
		{
			return false;
		}
		else
		{
		for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i)>='a' && a.charAt(i)<='z')
				{
					ans+=a.charAt(i);
					
				}
			}
				
			System.out.println(ans);
			int low=0,high=(ans.length()-1);
			
			
			while(low<high)
			{
				//System.out.println("entered while");
				if(ans.charAt(low)==ans.charAt(high))
				{
					//System.out.println(ans.charAt(low)+"  "+ans.charAt(low));
					low++;
					high--;
				}
				else
					return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		String a="race a car";
		boolean v=isPalindromeSentence(a);
		
		if(v==true)
		{
			
				System.out.println("The given number: "+a+" is Palindrome");
			
			}
			else 
				System.out.println("The given number: "+a+" is NOT a Palindrome");

			}

	}



