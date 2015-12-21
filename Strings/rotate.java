
public class rotate{
	
	static boolean isSubstring(String s1, String s2){
		boolean flag= false;
		int count=0;
		for(int i=0;i<s1.length();i++){
			int k=i;
			count =0;
			for(int j=0;j<s2.length();j++){
				if(k==s1.length())
					break;
				if(s1.charAt(k)==s2.charAt(j)){
					k++;
					count++;
				}
				else
					break;

			}
			if(count==s2.length())
				return true;

		}
		return false;

	}
	public static void main(String[] args){

		String str = args[0];
		String str2 = args[1];
		String str1= str+str;
		System.out.println(isSubstring(str1,str2));
	}
}