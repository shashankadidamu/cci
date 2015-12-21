
public class compress{
	
	public static void main(String[] args){

		String str = args[0];

		char ch = str.charAt(0);
		char temp;
		int count=1;
		StringBuffer s = new StringBuffer();
		for(int i=1;i<str.length();i++){
			temp=str.charAt(i);
			if(ch==temp){
				count++;
			}
			else{
				s.append(ch);
				s.append(count);	
				count=1;
				ch= temp;
			}
			if(i==str.length()-1){
				s.append(ch);
				s.append(count);
			}

		}

		System.out.println(s.toString());
	}
}