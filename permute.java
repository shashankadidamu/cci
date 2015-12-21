
public class permute{

	static boolean ispermute(String s1, String s2){

		if(s1.length()!= s2.length()){
			return false;
		}	

		int[] chcount=new int[256];
		int val=0;
		for(int i=0;i<s1.length();i++){
			val=s1.charAt(i);
			chcount[val]= chcount[val]+1;

		}
		for(int i=0;i<s2.length();i++){
			val=s2.charAt(i);
			if(chcount[val]>0)
				chcount[val]=chcount[val]-1;
			else
				return false;
		}
		return true;
		/*
		boolean[] ch =new boolean[256];
		int val1;
		for(int i=0;i<s1.length();i++){
			val1=s1.charAt(i);
			ch[val1]=true;			
		}

		for(int i=0;i<s2.length();i++){
			val1=s2.charAt(i);
			if(!ch[val1])
				return false;
		}
		return true;*/

	}
	
	public static void main(String[] args){
		String str1= args[0];
		String str2= args[1];

		System.out.println(ispermute(str1,str2));

	}
}