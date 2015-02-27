import java.util.Arrays;

public class Volume {
	/**
	 * initializing variables for volume class
	 */
private Book book[];
private int booknumbers;
private String nameofvolume;

/**
 * setting parameters for object Volume
 * @param book
 * @param booknumbers in order to define how many books are there in the volume
 * @param nameofvolume and the name of the current volume
 */
public Volume(Book book[], int booknumbers, String nameofvolume){
	this.book = book;
	this.booknumbers = booknumbers;
	this.nameofvolume=nameofvolume;
}
public String getBookArray()
{
	String booklist = "";
	for(Book b:book)
	{
		booklist += b + "\n";
	}
	return booklist;
}

	
	public String toString(){
		return "the volume is " + Arrays.toString(book) + ". the number of volumes published is currently "
				+ booknumbers + ", with this volume being called" + nameofvolume ;
	}
}
