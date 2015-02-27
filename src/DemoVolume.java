
public class DemoVolume {
public static void main(String[]args){
	/**
	 * testing Object Book parameters
	 */
	Book bookprops = new Book("The Zealous drive towards a hollow goal","River Silks", 905);
	
	/**
	 * volume1 is testing out the parameters of object Volume
	 */
	Volume volume1 = new Volume(null ,5, " 'Coldness of MU'");
	/**
	 * System.out.println will show the contents of the toString values mixed with
	 *  the DemoVolume
	 */
	
	System.out.println(bookprops.toString());
	System.out.println(volume1.toString());

}
}
