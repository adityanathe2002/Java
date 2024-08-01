 class Demo3
 {
 	String str="Hi I Am Non Static VAR";
 	public static void main(String[] args)
 	{
 		Demo4 obj =new Demo4();
 		obj.m2();
 	}
 	void m1()
 	{
 		System.out.println(str);
 	}
 }
 class Demo4
 {
 	void m2()
 	{
 		System.out.println("Hello From m2()");
 		Demo3 obj =new Demo3();
 		System.out.println(obj.str);
 	}
 }