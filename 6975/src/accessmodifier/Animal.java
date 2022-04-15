package accessmodifier;

class Animal
//protected method
{
   protected void display()
   {
	   System.out.println("The Dog is the Pet animal");
   }
}
class Dog extends Animal{
	public static void main(String[] args) {
//create an object of dog class
		Dog obj=new Dog();
		obj.display();
	}

}
