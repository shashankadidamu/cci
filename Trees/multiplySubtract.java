class multiplySubtract{
	
	static int negate(int n){
		int neg=0;
		int d = n < 0 ? 1 : -1;
		while(n!=0){
			neg += d;
			n += d;
		}
		return neg;
	}

	static int minus(int n1,int n2){
		return n1+negate(n2);
	}

	static int multiply(int a, int b){
		if(a<b)
				return multiply(b,a);
		int sum=0;
		for(int i=abs(b);i>0;i--)
			sum += a;

		if(b<0)
			sum = negate(sum);
		return sum;
	}

	static int abs(int a){
		if(a<0)
			return negate(a);
		else
			return a;
	}

	public static void main(String[] args){
		int a=32,b=2;
		int result;

		result= minus(a,b);
		System.out.println(result);

		System.out.println(multiply(a,b));
	}
}