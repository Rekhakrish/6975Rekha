package loop;

public class DoWhile {

	public static void main(String[] args) {
           int i=1;
           int sum=0;
           do
           {
        	   sum=sum+i;
        	   i++;
           }while(i<=5);
           System.out.println("The sum of 1 to 10 is.."+sum);
	}

}
