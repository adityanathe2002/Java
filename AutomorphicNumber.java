class AutomorphicNumber
{
	public static void main(String[] args) {
		int num=76;
		int dup=num;
		int sqr=num*num;   //5776
		int div=1;
		while(num!=0)
		{
			div=div*10;     //10
			num/=10;     
		}

		int op=sqr%div;
		if(dup==op)
		{
			System.out.print("Automorphic");
		}
		else{
			System.out.println("Not Automorphic");
		}
	}
}