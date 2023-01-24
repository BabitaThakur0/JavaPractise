package demo;

public class LongestCommonPrefix {
	
	/*
	 Write a function to find the longest common prefix string amongst an array of strings.
     If there is no common prefix, return an empty string " ".


       Example 1:
      Input: strs = ["flower", "flow", "flight", 
      Outout: "fl"

    Example 2:
    Input: strs = ["dog" ,"racecar", "car"]
    Outout: " "
    Explanation: There is no common pretix amona the
    Input strings
	 */

	public static void main(String[] args) {
		String[] strAr = {"flower","flow","flight"};
        String newString = longestCommonPrefix(strAr);
      //System.out.println("newString--->"+newString);

	}
	public static String longestCommonPrefix(String[] strs)
	{
		if(strs.length==0)
			return " " ;
		String prefix = strs[0];
		//System.out.println("prefix--->"+prefix);
		for(int i = 0; i<strs.length;i++)
		{
			while(strs[i].indexOf(prefix)!=0)
			{
				//System.out.println("indexOf(prefix)--->"+strs[i].indexOf(prefix));
			prefix = prefix.substring(0, prefix.length()-1);
			System.out.println("prefix --->"+prefix );
			}
		}
		return prefix;
		
	}

}

/*
 output 
 
 prefix --->flowe
prefix --->flow
prefix --->flo
prefix --->fl

*/
