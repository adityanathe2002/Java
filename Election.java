import java.util.Scanner;
class Election
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age= sc.nextInt();
		if(age>=18)
		{
			System.out.print("Do u hava a voter ID (yes / no) : ");
			String voterId = sc.next().toLowerCase();
			if(voterId.equals("yes"))
			{
				System.out.println("******WelCome******");
				System.out.println("1. BJP ");
				System.out.println("2. Congress");
				System.out.println("3. AAP");
				System.out.println("4. MNS");
				System.out.println("5. ShivSena ");
				System.out.println("6. NCP");
				System.out.println("7.NOTA");

				System.out.print("Enter the option to vote for your fav party : ");
				sc.nextLine();
				String vote = sc.next().toUpperCase();

				if(vote.equals("BJP"))
				{
					System.out.println("You have voted for BJP");
				}
				else if(vote.equals("CONGRESS"))
				{
					System.out.println("YOU have vote for CONGREE");
				}
				else if(vote.equals("MNS"))
				{
					System.out.println("You have vote for MNS");
				}
				else if(vote.equals("SHIVSENA"))
				{
					System.out.println("You have vote for SivSena");
				}
				else if(vote.equals("NCP"))
				{
					System.out.println("You have vote for NCP");
				}
			     else if (vote.equals("NOTA"))
			    {
				    System.out.println("You have Vested YOUR vote");
			    }
				else 
				{
					System.out.println("invalid inpit");
            	}
            }
            else 
            {
				System.out.println("jaldi yahaa se hatooooo");
			}
		}
		else
		{ 
			System.out.println("you are not mature to vote for try after "+(18-age)+"years. ");
            
		}
	}
}