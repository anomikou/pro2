import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter all the characteristics of the attributes. When finsh press 0");

		ArrayList<String> titles = new ArrayList<String>();

		String t = null;

		while(true) {

			t = input.nextLine();

			if(t.equals("stop")) {

				break;

			} else {

				titles.add(t);

			}

		}

		System.out.println("All the characteristics are saved.");
	}
}