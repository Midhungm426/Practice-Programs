package practice;

public class Instance2 
{
	public String show(String name)
	{
		return name;
	}
	public static void main(String[] args) 
	{
		Instance2 obj = new Instance2();
		System.out.println(obj.show("Anu"));
	}
}
