class WhileLoopLabel
{
	public static void main(String[] args) {
		int num =19;
		int length=0;

		while(num<0)
		aditya:
		{
			length ++;
			num/=10;
		}
		System.out.println(length);
	}
}