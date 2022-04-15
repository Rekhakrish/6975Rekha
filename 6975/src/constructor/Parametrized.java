package constructor;
class Student4
{
	int id;
	String name;
	Student4(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+""+name);
	}
}
public class Parametrized 
{
	public static void main(String[] args)
	{
        Student4 s1=new Student4(111, "Rekha");
        Student4 s2=new Student4(222, "Krish");
        s1.display();
        s2.display();
	}
}
