class RevesreNameArray
{
	public static void main(String[] args) {
		String names[]={"Adi","Prakash","Anup","Raj"};
		System.out.println("Reverse Name: ");
		for(int i=names.length-1;i>=0;i--)
		{
			System.out.println(names[i]+" ");
		}
	}
}