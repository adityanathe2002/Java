import java.util.Scanner;
class Vowelswitch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch = sc.next().toLowerCase().charAt(0);

		switch(ch)
		{
		   case 'a': 
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u':System.out.println(ch +"is a VOWEL");break;
		   default : System.out.println(ch + "is A consonent");break;
		}
	}
}