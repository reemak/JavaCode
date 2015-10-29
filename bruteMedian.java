import java.util.*;
public class bruteMedian {

	public static double calbruteMedian(int[] A,int[]B)
	{
		int j=0;
		int[] c=new int[A.length+B.length];
		for(int i=0;i<A.length;i++)
		{
			c[i]=A[i];
		}
		
		for(int i=A.length;i<c.length;i++)
		{
			c[i]=B[j];
			j++;
		}
		
		Arrays.sort(c);
		
		int rlen=c.length/2;
		
		double rmed=0;
		if(!(c.length%2==0))
		{
			rmed= c[rlen];
		}
		
		else
			rmed= (c[rlen-1]+c[rlen])/2;
		
		return rmed;
		
		
	}

	public static void main(String[] args)
	{
		int[] a= {2,5,4,7,8};
		int[] b= {9,3,10,12,14,16};
		
		System.out.println(calbruteMedian(a,b));
		
	}

}
