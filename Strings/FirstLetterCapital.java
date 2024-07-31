import java.util.Scanner;
class FirstLetterCapital
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name: ");  //aditya
		String name=sc.next().toLowerCase();  // aditya

		String firstLetter=name.substring(0,1).toUpperCase();    //A
		String remainingLetter=name.substring(1,name.length()); //ditya
		String merge=firstLetter.concat(remainingLetter);      // A concat ditya

		System.out.println(merge);  // Aditya
	}
}