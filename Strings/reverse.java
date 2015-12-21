//reverse a string 
import java.util.*;
public class reverse{	
	public static void main(String[] args){
		String str= args[0];
		StringBuffer s= new StringBuffer();
		for(int i=str.length()-1;i>=0;i--){
			s.append(str.charAt(i));
		}
		System.out.println(s.toString());
	}
}
