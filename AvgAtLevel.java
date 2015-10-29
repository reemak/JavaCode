import java.util.*;
public class AvgAtLevel {

	public static void main(String args[])
	{
		
		TreeNode root=new TreeNode(5);
		TreeNode t=root;
		t.left=new TreeNode(2);
		t.right=new TreeNode(7);
		t=root.left;
		t.left=new TreeNode(1);
		t.right=new TreeNode(4);
		t=root.right;
		t.left=new TreeNode(6);
		t.right=new TreeNode(8);
		System.out.println(bfs(root));
	}
	
	public static HashMap<Integer,Double> bfs(TreeNode root)
	{
		HashMap<Integer,Double> avg=new HashMap<Integer,Double>();
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(root);
		int next=0,level=0;
		double avgin=0;
		int curr=1;
		int total=0;
		while(!q.isEmpty())
		{
			
			TreeNode t=q.poll();
			System.out.print(" "+t.val);
			avgin+=t.val;
			total++;
			curr--;
			if(t.left!=null)
			{
				q.add(t.left);
				next++;
			}
			if(t.right!=null)
			{
				q.add(t.right);
				next++;
			}
			
			if(curr==0)
			{
				System.out.println();
				curr=next;
				avgin=avgin/total;
				next=0;
				
				avg.put(level, avgin);
				level++;
				avgin=0;
				total=0;
			}
				
		}
		
		return avg;
	}
}
