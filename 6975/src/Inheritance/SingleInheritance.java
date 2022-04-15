package Inheritance;
class Sem1
{
	public Sem1()
	{
		System.out.println("Sem1 Constructor");
	}
	int math,c,tamil;
	void input()
	{
		math=80;
		c=90;
		tamil=98;
	}
	public void output()
	{
		System.out.println("Result of Semester-1 \n\n");
		System.out.println("Marks in Mathematics    "+math);
		System.out.println("Marks in C'language   "+c);
		System.out.println("Marks in Tamil  "+tamil);
		System.out.println("-----------------------\n\n");
	}
}
class Sem2 extends Sem1
{
	int java,dbms,eng;
	public Sem2()
	{
		System.out.println("Sem 2 constructor");
	}
	public void input2()
	{
		java=90;
		dbms=95;
		eng=98;
	}
	public void output2()
	{
		System.out.println("Result of Semester-2 \n\n");
		System.out.println("Marks in Java   "+java);
		System.out.println("Marks in Database System    "+dbms);
		System.out.println("Marks in English     "+eng);
	}
}
public class SingleInheritance {

	public static void main(String[] args) 
	{
     Sem2 obj=new Sem2();
     obj.input();
     obj.input2();
     obj.output();
     obj.output2();
     
     
	}

}
