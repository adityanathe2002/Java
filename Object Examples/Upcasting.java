class Parent
{
	void greeting()
	{
		System.out.println("Good Morning");
	}
	void m1()
	{
		System.out.println("Hello from m1()");
	}
}
class Child extends Parent
{
	void greeting()
	{
		System.out.println("Good Afternoon");
	}
	void m2()
	{
		System.out.println("Hi from M2()");
	}
}
class Upcasting
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.greeting();
		Parent obj1=new Child();
		obj1.greeting();
		Child obj2=(Child)obj;
		obj2.m2();
		obj2.m1();
		obj2.greeting();
	}
}






// class Parent
// {
// 	void greeting()
// 	{
// 		System.out.println("Good Morning");
// 	}
// 	void m1()
// 	{
// 		System.out.println("Hello from m1()");
// 	}
// }
// class Child extends Parent
// {
// 	void greeting()
// 	{
// 		System.out.println("Good Afternoon");
// 	}
// 	void m2()
// 	{
// 		System.out.println("Hi from m2()");
// 	}
// }

// class Upcasting
// {
// 	public static void main(String[] args) 
// 	{
	// Child obj=new Child();
	// obj.greeting();
	// Parent obj1=new Child();
	// obj1.greeting();
	// Child obj2=(Child)obj;
	// obj2.m2();
	// obj2.m1();
	// obj2.greeting();
// 	}
// }








// class Parent{}
// class Child1 extends Parent{}

// class Child2 extends Parent{}
// class SubChild2 extends Child2{}
// class SubChild3 extends Child2{}

// class Upcasting
// {
// 	public static void main(String[] args)
// 	{
// 		System.out.println("Hello World");
// 		SubChild1 obj=new SubChild1();
// 		SubChild1 ob =new Child1();  // CTE
// 		Child2 obj1=new Child2();
// 		Child2 obj2=new SubChild1();
// 		Child2 obj3=new SubChild2();
// 		Child2 obj4=new SubChild3();
// 		Parent obj5=new Child1();
// 		Parent obj6=new Child2();
// 		Parent obj7=new SubChild1();
// 		Parent obj8=new SubChild2();
// 		Parent obj9=new SubChild3();
// 	}
// }