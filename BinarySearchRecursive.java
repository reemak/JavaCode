import java.util.*;
public class BinarySearchRecursive {

	public static void searchBinary(int[] a,int key)
	{
		int an=binarySearch(a,key,0,a.length-1);
	}
	public static int binarySearch(int[]a,int key,int start,int end) 
	{
		if(start>end)
			{
			System.out.println("not found");
			
			return -1;
			}
		else
		{
			int mid=(start+end)/2;
			if(key==a[mid])
			{
				System.out.println("The number "+key+" was found at position "+mid);
				return mid;
			}
			else
			{
					if(key<a[mid])
						binarySearch(a,key,start,mid);
			
				else if(key>a[mid])
					binarySearch(a,key,mid+1,end);
		
			}
			
			}
		return 0;
		
	}
	

	public static void main(String[] args) {
		int[]a ={1,2,3,4,5,6,7};
		int key=6;
		searchBinary(a,key);

	}

}
