import java.util.*;
public class fcfs {

	public static int[] dofcfs(int[][] in)
	{
		int[]ans=new int[5];
		ans[0]=in[0][1]-in[0][0];
		for(int i=1;i<5;i++)
		{
			int j=i-1;
			ans[i]=ans[j]+(in[i][1]-in[i][0]);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[][]in={{0,5},
				{1,4},
				{2,6},
				{3,7},
				{5,8},
		};
		int []ans=new int[in.length];
		ans=dofcfs(in);
		for(int i=0;i<in.length;i++)
		{
			System.out.print("Process P "+i+"will complete in: ");
			
			System.out.println(ans[i]);
			
		}
		

	}

}
