class CalculateIncrement
{
	public static void main(String[] args) {
		// int a = 2;
		// int b = a++;
		// int c = ++a;
		// System.out.println(a+ ++b + ++c);
		 int d = 2;
		 int e = d++; //2(3)
		 int f = e++; //2(3)
		 System.out.println(d+ e++ + ++f + d++);
		 //                 3 + 3(4)+3+ 3(4)
	}
}