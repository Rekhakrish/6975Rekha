package accessmodifier;
class Animal2
{
	public int legcount;
	//public method
	public void display() {
		System.out.println("I am an animal");
		System.out.println("I have" +legcount+ "legs.");
				}
}
public class Main2 {

	public static void main(String[] args) {
       Animal2 animal=new Animal2();
       animal.legcount=4;
       animal.display();
       
	}

}
