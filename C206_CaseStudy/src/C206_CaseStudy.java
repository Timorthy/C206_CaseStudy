
import java.util.ArrayList;
import java.util.Arrays;


public class C206_CaseStudy {

	public static void main(String[] args) {
		menu();
		ArrayList<RadioControlCar> rcList = new ArrayList<RadioControlCar>();

		int option = Helper.readInt("Enter Option > ");

		while (option != 7) {
			if (option == 1) {//Other people

			}

			else if (option == 2) {//Other people

			} else if (option == 3) {
				RadioControlCar rc1 = new RadioControlCar("ZoomZoom9000","RCPRO9000",295.35);
				RadioControlCar rc2 = new RCFeatures("VroomVroom9000", "VRFAST9000", 300.50, "Big", "Red");
				rcList.addAll(Arrays.asList(rc1,rc2));

				//View the list of Radio control cars and specification of the Radio control cars
				String list = String.format("%-10s %-20s %-20s\n", "NAME", "PRODUCTCODE","PRICE");
				for (RadioControlCar rcCar : rcList) {
					list += String.format("%-10d %-20s $%-25.2f\n", rcCar.getName(), rcCar.getProductCode(), rcCar.getPrice());
				}
				System.out.println(list);
				menu();
				option = Helper.readInt("Enter option > ");

			} else if (option == 4) {
				//Add and Delete RC Cars
				Helper.line(40, "-");
				System.out.println("1.Add to RC List \n2.Add To RC Features \n3.Delete RC List \4.Delete RC Feature");
				Helper.line(60, "-");
				System.out.println("ENTER NEW EMPLOYEE DETAILS");

				int type = Helper.readInt("Enter 1.Add RC List 2.Add RC Features > ");

				if (type == 1) {
					String Name = Helper.readString("Enter Name > ");
					String ProductCode = Helper.readString("Enter Product Code > ");
					double price = Helper.readDouble("Enter Product Price > ");
					rcList.add(new RadioControlCar(Name, ProductCode, price));
					System.out.println("*** RC Car Added!");
				} else if (type == 2) {

					String Name = Helper.readString("Enter Name > ");
					String ProductCode = Helper.readString("Enter Product Code > ");
					double price = Helper.readDouble("Enter Product Price > ");
					String Size = Helper.readString("Enter Size > ");
					String Colour = Helper.readString("Enter Colour >");
					rcList.add(new RCFeatures(Name, ProductCode, price, Size, Colour));
					System.out.println("*** RC Feature Added!");
				} else if (type == 3) {//Other People Do

				} else if (type == 4) {
					
				} else {
					System.out.println("***Invalid RC Type!");
				}
				} else if (option == 5) {

				} else if (option == 6) {

				} else if (option == 7) {

				} else {
				System.out.println("Thank you!");
			}
		}

	}

	private static void menu() {

		Helper.line(60, "=");
		System.out.println("WELCOME TO RADIO CONTROL CAR LOVER'S COMMUNITY");
		Helper.line(60, "=");
		System.out.println(
				"1. Buyer Registration \n2.View Radio Control Car Listing and Features List \n3.Radio Control Car Parts Listing and Features \n5Make Appointment \n6Feedback \n7.Quit");

	}

}
