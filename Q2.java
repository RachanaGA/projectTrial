 public class Book{
	 int id;
	 String name;
	 float price;
	 
	 public Book(int id, String name, float price){
		 super();
		 this.id = id;
		 this.name = name;
		 this.price = price;
	 }
	 
	 public String toString() {
		 return "Book [id=" + id + ",name=" + name+ ",price=" + price + "]";
	 }
 }
 
 public class MainBook {
	 static List<Book> books = new ArrayList<> ();
	 public static void main(String[] args){
		 Book book1 = new Book(1,"Java",100);
		 Book book2 = new Book(2,"Python",100);
		 Book book3 = new Book(3,"SQL",100);
		 Book book4 = new Book(1,"Java",100);
		 
		 addBook(book1);
		 addBook(book2);
		 addBook(book3);
		 addBook(book4);
		 
		 for(Book b: books) {
			 System.out.println(b);
		 }
		 
	 }
	 private static void addBook(Book book1){
		 for(Book newBook : books){
			 if(newBook.id == book1.id || newBook.name.equals(book1.name) || newBook.price == book1.price){
				 System.out.println(newBook + "cannot be added as it already exists");
				 return;
			 }
		 }
		 books.add(book1);
	 }
 }