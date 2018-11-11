import java.util.Scanner;
import java.util.ArrayList;

public class Files {

	public void defineData() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter all the names of the attributes");

		ArrayList<String> titles = new ArrayList<String>();

		while(scan.hasNext()){

			String t = scan.next();
			titles.add(t);

		}

		/*int lsize=titles.size();

		String[] attributes = new String[lsize];

		System.out.println("Please enter all the values of the attributes");

		for (int i=1;i<lsize;i++) {

			attributes[i] = scan.nextLine();

		}
	*/}

	/*public String[] showData() {

		return attributes[];

	}*/



}

