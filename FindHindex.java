import java.util.Arrays;


public class FindHindex {

	public FindHindex() {
		// TODO Auto-generated constructor stub
	}
	public static void rev(int a[])
	{
		for(int i=0;i<a.length/2;i++)
		{
			int t=a[a.length-i-1];
			a[a.length-i-1]=a[i];
			a[i]=t;
		}
	}
	public static int hIndex(int a[])
	{
		int start=0;
		int end=a.length-1;
		return hIndex(a,start,end);
	}
	public static int hIndex(int a[],int start,int end)
	{
		int mid=(start+end)/2;
		if(mid==start)
			return mid;
		else if(a[mid]>=mid)
		{
			return hIndex(a,mid+1,end);
		}
		else
			return hIndex(a,start,mid-1);
	}
	public static void main(String[] args) {
	int[] a={1,2,3,4,5};
	Arrays.sort(a);
	rev(a);
	System.out.println(Arrays.toString(a));
	System.out.println(hIndex(a));

	}

}
