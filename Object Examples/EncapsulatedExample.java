class MyInfo
{
	private String name, nativePlace,branch;

	MyInfo(String name, String nativePlace, String branch)
	{
		this.name=name;
		this.nativePlace=nativePlace;
		this.branch=branch;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String updateName)
	{
		name = updateName;
	}
	public String getNativePlace()
	{
		return nativePlace;
	}
	public void setNativePlace(String updateNativePlace)
	{
		nativePlace=updateNativePlace;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String updateBranch)
	{
		branch=updateBranch;
	}
}
class EncapsulatedExample
{
	public static void main(String[] args) 
	{
		MyInfo obj = new MyInfo("Ramesh","Pune","Electronics");
		System.out.println(obj.getName());
		System.out.println(obj.getBranch());
		System.out.println(obj.getNativePlace());
	}
}