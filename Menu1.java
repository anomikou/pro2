
import java.util.Scanner;
import java.util.ArrayList;

public class Menu1 {

	public Menu1(){



	}

	public void getMenu() {

			Scanner scan = new Scanner(System.in);

			while(true){
				System.out.println("Menu:");
				System.out.println("Press 1: Add Attributes");
				System.out.println("Press 2: Delete Attributes");
				System.out.println("Press 3: Update favorite movies");
				System.out.println("Press 4: Show movies");
				int choice =scan.nextInt();
				if (choice==1)
					System.out.println("Menu:");
					/*Files.addData();
				else if (choice==2)
					showFavmov();
				else if(choice==3)
				    updateFavmov();
				else if(choice==4)
				     Movie.showMovies();*/
			}
    	}
   }