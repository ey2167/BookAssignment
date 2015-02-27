
/**
 * Elohe Yonas
 * CSC201
 * 
 *
 */
public class Book {
	/**
	 * initializing variables
	 */
	private String title;
	private String author;
	private int pagenumbers;
	public Book(String title, String author, int pagenumber){
		this.title= title;
		this.author=author;
		this.pagenumbers = pagenumber;
	}
		public String gettitle() {
			return title;
			/**
			 * the method gettitle takes the variable initialized in class book
			 */
		}
		public void settitle(String title){
			this.title=title;
			/**
			 * the variable in class Book is then given a value when used as an input
			 */
		}
		public String getauthor(){
			/**
			 * same with gettitle
			 */
			return author;
		}
		public void setauthor(String author){
			/**
			 * same with settitle
			 */
			this.author=author;
		}
		public int getpagenumbers(){
			/**
			 * same with gettitle & getauthor
			 */
			return pagenumbers;
		}
		public void setpagenumber(int pagenumbers){
			/**
			 * same with settitle & setauthor
			 */
			this.pagenumbers = pagenumbers;
		}
		
		public String toString(){
			return "the Book's title is ' " + title + "'.the content's work belongs to " + author + ", with " + pagenumbers + " pages to its name";
		}
	}

