import java.util.Scanner;
class CalculateTip 
{
    public static void main (String[] args )
    {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the subTotal :");
      double subTotal=sc.nextDouble();
      System.out.print("Enter the tip rate : ");
      double tipRate = sc.nextDouble();
      double total = subTotal + tipRate*(subTotal/100);
      System.out.println("Subtotal is "+ subTotal+"and the tiprate is "+ tipRate + "total tip is "+total);
    }
}
 
    