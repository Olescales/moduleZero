package by.htp.katokoleg.simpleclassandobject.task9;

public class Main {

	public static void main(String[] args) {
		
		Book[] books = new Book[6];
		
		Book book1 = new Book(125,"Neznayka v tsvetochnom gorode","Noskov","USSR",1975,250,120,"Solid");
		Book book2 = new Book(126, "Neznayka v solnechnom gorode", "Noskov", "USSR", 1977, 295, 128,"Wire-O");
		Book book3 = new Book(124, "Neznayka na lune", "Noskov", "USSR", 1979, 446, 150,"Mild");
		Book book4 = new Book(123, "Deadship island", "Beliaev", "Youth", 1986, 491, 111,"Clip");
		Book book5 = new Book(122, "Floating island", "Vern", "Youth", 1986, 491, 111,"Clip");
		Book book6 = new Book(121, "Old fortress", "Beliaev", "Youth", 1986, 576, 99.5,"Solid");
	
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		books[3] = book4;
		books[4] = book5;
		books[5] = book6;
		
		Library lib = new Library();

		Book[] sortArray = new Book[books.length];
		Book[] sortArray1 = new Book[books.length];
		Book[] sortArray2 = new Book[books.length];
		
		sortArray = lib.outputDefPublishingYear(books);

		for (Book b : sortArray) {
			System.out.println(b);
		}
		
		sortArray1 = lib.outputDefPublishingHouse(books);

		for (Book b : sortArray1) {
			System.out.println(b);
		}
		
		sortArray2 = lib.outputDefAuthorBook(books);

		for (Book b : sortArray2) {
			System.out.println(b);
		}
	}
	

}
