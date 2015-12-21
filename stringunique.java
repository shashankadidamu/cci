import java.util.*;

public class stringunique{

	static boolean isstringunique(String s){
		boolean[] ch = new boolean[256];
		int val=0;
		for(int i=0;i<s.length();i++){
			val=s.charAt(i);
			if(ch[val])
				return false;

				
			ch[val]=true;
			System.out.println(val);
			System.out.println(s.charAt(i));
		} 
		return true;
	}


	public static void main(String[] args){
		String str= args[0];
		System.out.println(str);
		System.out.println(isstringunique(str));
	}

}