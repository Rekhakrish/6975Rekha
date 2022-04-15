package Inheritance;
class Semester1
{
	public Semester1()
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
class Semester2 extends Semester1
{
	int java,dbms,eng;
	public Semester2()
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
class Sem3 extends Sem2
{
	int html,android,cg;
	public void input3()
	{
		html=96;
		android=98;
		cg=90;
	}
	public void output3()
	{
		System.out.println("Sem-3 constructor ");
		System.out.println("Marks in HTML   "+html);
		System.out.println("Marks in Android   "+html);
		System.out.println("Marks in Computer Graphics   "+cg);
		
	}
}

public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
       Sem3 obj=new Sem3();
       obj.input();
       obj.input2();
       obj.input3();
       obj.output();
       obj.output2();
       obj.output3();
       
	}

}
