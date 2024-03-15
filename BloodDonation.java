import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter your age : ");
		int age = sc.nextInt();
		if(age<20){
			System.out.println(" You are kid try after"+(20-age)+"years. ");
		}else{
			System.out.println("You have a consumed a alcohol or cigar after 24 hrs (yes/no) :  ");
			String nasha = sc.next().toLowerCase();
			if (nasha.equals("no")){
				System.out.print("Enter your weight : ");
				double weight= sc.nextDouble();
				
				if(weight<50){
					System.out.println("Go and have some food and increase your weight");
				}else{
					System.out.println("We can pump your blood");
				}
				}else{
					System.out.println("your cannot donate blood you are in nasha");
				
			}
		}
	}
}




// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter your age : ");
// 		int age = sc.nextInt();
// 		if(age<20){
// 			System.out.println("You are a kid. try after "+(20-age)+"years");
// 		}else{
// 			System.out.print("have u consumed a aclcohol or cigar (yes/no) : ");
// 			string nasha = sc.next().toLowerCase();
// 			if(nasha.equals("no")){
// 				System.out.print("Enter your weight : ");
// 				double weight = sc.nextDouble();

// 				if(weigth >=50 ){
// 					System.out.println("We can pump your blood.");
// 				}else{
// 					System.out.println("Go and have some food and increase your weight");
// 				}
// 			}else{
// 				System.out.println("You cannot donate blood because are in nasha.");
// 			}
			
// 		}
// 	}
// }