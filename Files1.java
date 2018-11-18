import java.util.Scanner;

public class Files1 {

	public Files1() {}

		private static int s.getTitlesSize(); //μπορεί να χρησιμοποιηθεί από όλες τις μεθόδους της κλάσης
		public Att[] attr = new Att[s];
		Scanner scan = new Scanner (System.in);

//το παλιό και μάλλον σωστό
	//public void setData(String scan) {

		//System.out.println("Please enter all the values of the attributes");
		//for (int j=1;j<s;j++) {
			//System.out.println(titles[j]);
			//attr[i] = scan.nextLine();
			//i++;
		//}
	//}

	//public Att[] getData() {
		//return attr;
	//}

	public void setData(String scan, String[] titles) {

		System.out.println("Please enter all the values of the attributes");
		for (int j=0;j<s;j++) {
			setNatt(titles[j]); //άρα δεν μας τα ξαναδίνει ο χρήστης
			setVatt(scan.nextLine);
		}
	}

//για την main
	// 
	public Att[] getData() {
		return attr;
	}

}

