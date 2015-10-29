import java.util.*;
import java.io.*;
public class Coins {
	public static char coinsCompare(int a,int b,int c) 
 	{
		char n=0;
	
		if(a==b && b==c)
		{
			System.out.println("All the weigths are same");
			return 0;
		}
		else
		{
	 		if(a==b)
	 		{
	 			
	 			if(a>c)
	 				System.out.println("The different coin is Lighter");
	 			else
	 				System.out.println("The different coin is Heavier");
	 			n= 'c';
	 		}
	 		else if(c==a)
	 		{
	 			if(c>b)
	 				System.out.println("The different coin is Lighter");
	 			else
	 				System.out.println("The different coin is Heavier");
	 			n= 'b';
	 		}
	 		else if(b==c)
	 		{
	 			if (b>a)
	 				System.out.println("The different coin is Lighter");
	 			else
	 					System.out.println("The different coin is Heavier");
				n= 'a';
	 		}
	 	}
		return n;
	}
		
	
	public static void coinsubCompare(int a,int b,int c)
	{
			if(a==b && b==c)
			{
				System.out.println("Different weight "+c);
			//	return 0;
			}
			else if(b==c)
			{
				System.out.println("Different weigth:"+a);
			//	return 0;
			}
			else if(a==c)
			{
				System.out.println("Different weight "+b);
			//	return 0;
			}
			//else 
			//	System.out.println("Not found");
				//return 1;
			
	}
	
	public static void main(String[] args) {
		long st=0;
		int weights[]={2,2,2,2,2,2,2,2,2,4,2,2};
		//since we dividing into 3 parts and all should be equal
		if(weights.length%3==0)
		{
			int a=weights.length/3;
			int aarr[]=new int[a];
			int i,j,k,totala=0,totalb=0,totalc=0;
		
			for(i=0;i<a;i++)
			{
				
				aarr[i]=weights[i];
				totala+=weights[i];
				
			}
	
		
			int b=(weights.length-a)/2;
			int barr[]=new int[b];
			int r=0;
			for(j=i;j<i+b;j++)
			{
				barr[r]=weights[j];
				//System.out.println(barr[r]);
				totalb+=weights[j];
				r++;
			}
	
			
			int carr[]=new int[b];
			int m=0;
			for(k=j;k<weights.length;k++)
			{
				
				carr[m]=weights[k];
				//System.out.println(carr[r]);
				totalc+=weights[k];
				m++;
				
			}
			/*
			for(int g=0;g<aarr.length;g++)
			{
				//System.out.println("This is a"+aarr[g]);
				//System.out.println("This is b"+barr[g]);
				System.out.println("This is c"+carr[g]);
			}*/
			
			 st=System.currentTimeMillis();
			char compab=coinsCompare(totala,totalb,totalc);
			//System.out.println("The different weight is"+compab);
			
			//System.out.println(compab);
			//divide further and compare to find the different weight of coin
			switch (compab) {
			
			case 'a': 
					int w=0;
					int diffa=0;
					int loga=0;
					int fa=0;
				//	System.out.println(carr[f]);
					if(diffa==0)
					{
						do
					
					{ 
						int temp=carr[fa];
						int temp1=carr[++fa];
						int temp2=carr[++fa];
						//diffa=coinsubCompare(temp,temp1,temp2);
						coinsubCompare(temp,temp1,temp2);
						loga++;
						fa=loga;
					
					}while(aarr[fa]<aarr.length);
					}
						break;
			case 'b':
				System.out.println("Entered");
				int e=0;
				int diffb=0;
				int logb=0;
				int fb=0;
			//	System.out.println(carr[f]);
				
				
					do
					{ 	if(diffb!=0)
						{
							int temp=carr[fb];
							int temp1=carr[++fb];
							int temp2=carr[++fb];
							//System.out.println(fb);
							//diffb=coinsubCompare(temp,temp1,temp2);
							coinsubCompare(temp,temp1,temp2);
							logb++;
							fb=logb;
						}
					}while(carr[fb]<carr.length);
				
					break;
			case 'c':
				int diffc=0;
				int log=0;
				int f=0;
			//	System.out.println(carr[f]);
				if(diffc==0)
				{
					do
				
				{ 
					int temp=carr[f];
					int temp1=carr[++f];
					int temp2=carr[++f];
					//diffc=coinsubCompare(temp,temp1,temp2);
					coinsubCompare(temp,temp1,temp2);
					log++;
					f=log;
				
				}while(carr[f]<carr.length);
				}
				break;
			default: 
				System.out.println("Default");
				break;
			}
		}
		
		else 
			System.out.println("Cant proceed");
	
		long et=System.currentTimeMillis();
		
		System.out.println("Time Taken is:"+(et-st)+" ms");
	}

}
