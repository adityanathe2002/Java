class StaticBlock1
{
	static
	{
		System.out.println("Hello From SB 1");
	}
	public static void main(String[] args)
	{
		System.out.println("Hi From Main");
	}
	static
	{
		System.out.println("Hello From SB 2");
	}
}




// class StaticBlock1
// {
// 	static{
// 		System.out.println("Hello From SB 1");
// 	}
// 	public static void main(String[] args)
// 	{
// 		System.out.println("Hi From Main");
// 		StaticBlock2.m1();
// 	}
// 	static
// 	{
// 		System.out.println("Hello From SB 2");
// 	}
// }
// class StaticBlock2
// {
// 	static{
// 		System.out.println("Hello From SB 3");
// 	}
// 	public static void m1()
// 	{
// 		System.out.println("Hi From M1() ");
// 	}
// }





// class StaticBlock1
// {
// 	static{
// 		System.out.println("Hello From SB 2");
// 		StaticBlock2.m1();
// 	}
// 	static{
// 		System.out.println("Hello From SB 1");
// 	}
// 	public static void main(String[] args)
// 	{
// 		System.out.println("Hi from Main");
// 	}
// }
// class StaticBlock2
// {
// 	static{
// 		System.out.println("Hello From SB 3");
// 	}
// 	public static void m1()
// 	{
// 		System.out.println("Hi From m1()");
// 	}
// }




// class StaticBlock1
// { 
// 	static{
// 		System.out.println("Hello From SB 1");
// 		StaticBlock2.m1();
// 	}
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Hi from Main");
// 		StaticBlock2.m1();
// 	}
// }
// class StaticBlock2
// {
// 	static{
// 		System.out.println("Hello From SB 2");
// 	}
// 	public static void m1()
// 	{
// 		System.out.println("Hi From M1()");
// 	}
// }