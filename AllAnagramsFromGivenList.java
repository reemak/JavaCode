import java.util.*;
public class AllAnagramsFromGivenList {
	public static List<String> anagrams(String[] strs) {
        Map<String,ArrayList<String>> mp=new HashMap<String,ArrayList<String>>();
        ArrayList<String> val=new ArrayList<String>();
        List<String> ans=new ArrayList<String>();
        for(int i=0;i<strs.length;i++)
        {
        
            String temp;
       
         char t[]=strs[i].toCharArray();
         Arrays.sort(t);
          temp=new String(t);
           
         if(mp.containsKey(temp))
            {
                val=mp.get(temp);
                val.add(strs[i]);
                mp.put(temp,val);
            }
            else
            {
                ArrayList<String> tval=new ArrayList<String>();
            	tval.add(strs[i]);
                mp.put(temp,tval);
            }
            
        }

        for(String z:mp.keySet())
        {
            val=mp.get(z);
            if(val.size()>1)
            {
                ans.addAll(val);
            }
        }
        
        return ans;
    }
 public static void main(String args[])
 {
	 String a[]={"ago","its","shy","nor","pie","rod","ray","vow","hip","get","web","old","gad","tex","tar","nan","goo","tug","ram","rim","chi","huh","mes","jut","noh","jam","via","avi","hal","gel","via","tip","gap","pal","zoe"};
	 System.out.println(anagrams(a));
 }
}