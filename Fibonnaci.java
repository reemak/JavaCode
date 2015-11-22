import java.util.*;
public class Fibonnaci {

	public static int[] fib(int n) 
	{
		int[] ans=new int[n+1];
		ans[0]=0;
		ans[1]=1;
		int z=2,j=0,k=j+1;
		while (z<=n)
		{
			ans[z]=ans[j]+ans[k];
			z++;
			j++;
			k=j+1;
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		int n=14;
		int[] p=fib(n);
		int z=0;
		while(z<p.length)
		{
			System.out.print(p[z]);
			System.out.print("  ");
			z++;
			
		}

	}

}
