class MinThreeNumber
{
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 7;
		int num3 = 5;
		System.out.println((num1<num2)?((num1<num3)?(num1):(num3)):((num2<num3)?(num2):(num3)));
	}
}