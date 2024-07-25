package week1.homeassignment;

public class Library {
	public String addBook(String booktitle)
	{
//		System.out.println("Book Added Successfully");
		return booktitle;
		
	}
	public void issueBook()
	{
		System.out.println("Book issued Successfully");
	}
	public static void main(String[] args) {
		Library lb=new Library();
		System.out.println(lb.addBook("Book Added Successfully"));
		lb.issueBook();
		
		
	
	}

}
