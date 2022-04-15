package constructor;
class Student{
	int rollno;
	String name;
	static String college="Madras University";
	public static void change()
	{
		college="AAM University";
	}
		Student(int r,String n)
		{
			rollno=r;
			name=n;
		}
		void display()
		{
			System.out.println(rollno+" "+name+" "+college);
		}
}
public class Staticmethod {

	public static void main(String[] args) 
	{
	 Student.change();
	 Student s1=new Student(111,"Rekha");
	 Student s2=new Student(112,"Gayu");
	 Student s3=new Student(113,"Shar");
	 s1.display();
	 s2.display();
	 s3.display();
	}

}
