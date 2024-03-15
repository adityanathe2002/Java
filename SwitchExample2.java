class SwitchExample1
{
	public static void main(String[] args) {
		byte a =1;
		switch(a+0)
		{
		   case 1 : System.out.println("Hi from Case 1");break;
		   case 2 : System.out.println("Hi from Case 2");break;
		   case 'A' : System.out.println("Hi from Case 3");break;
		   case 65 : System.out.println("Hi from Case 4");break;
		   case 128 : System.out.println("Hi from Case 5");break;
		   default : System.out.println("DEFAULT BLOCK");

		}
	}
}