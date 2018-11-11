package arraylist;

import java.util.Scanner;
import java.util.ArrayList;
public class File {

	public void defineData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter all the names of the attributes");
		ArrayList<Attributes> titles = new ArrayList<Attributes>();
		while(scan.hasNextString()){
			titles.add(scan.nextString());
		}
		int lsize=titles.size();
		String[] attributes = new String[lsize];
		System.out.println("Please enter all the values of the attributes");
		for (int i=1;i<lsize;i++) {
			attributes[i] = scan.nextLine();
		}
	}

	public String[] showData() {
		return attributes[];
	}

	public void

}

