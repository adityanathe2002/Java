import java.util.*;
class TriangleToy
{
	public static void main(String[] args) 
	{
		String [] dim={"36 36 30","47 8 60","86 86 86","46 96 90"};
		for(String i:dim)
		{
			String []indDim=i.split(" ");
			// System.out.println(Arrays.deepToString(i.split(" ")));
			if((indDim[0].equals(indDim[1]))&&(indDim[1].equals(indDim[2])))
			{
				System.out.println("Equi");
			}
			else if((indDim[0].equals(indDim[1]))||(indDim[1].equals(indDim[2])))
			{
				System.out.println("Isco");
			}
			else
			{
				System.out.println("None Of These");
			}
		}
	}
}