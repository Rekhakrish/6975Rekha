package Multithreading;

class BookMyShow
{
	 static int total_tickets=10;
	 synchronized public void bookTickets(int requestTickets)
	{
		if(total_tickets>=requestTickets)
		{
			total_tickets=total_tickets-requestTickets;
			System.out.println(requestTickets+"has bookets has been booked & remaining are"+total_tickets);
		}
		else
		{
			System.out.println("Ticket is not booked only"+total_tickets+"are available");
		}
	}
}
	public class MyMovieApp extends Thread
	{
	    static BookMyShow book;
		int t;
		
		
		public void run()
		{
			book.bookTickets(t);
		}
	

	public static void main(String[] args)
	{
		book=new BookMyShow();
		MyMovieApp movie=new MyMovieApp();
		movie.t=7;
		movie.start();
		MyMovieApp movie2=new MyMovieApp();
		movie2.t=8;
		movie2.start();

	}

}
