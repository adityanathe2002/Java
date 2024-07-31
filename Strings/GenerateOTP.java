//wajp to generate random 25 OTPs and store them in stringBuffer object

class GenerateOTP
{
	public int otp()
	{
		int max=20000;
		int min=1;
		int otp=(int)(Math.random()*(max-min)+1)+max;
		return otp;
	}
	public static void main(String[] args) 
	{
		StringBuffer otps=new StringBuffer();
		GenerateOTP o=new GenerateOTP();

		for (int i=1;i<=25;i++) 
		{
			otps.append(o.otp()+"\n");
		}
		System.out.print(otps);
	}
}