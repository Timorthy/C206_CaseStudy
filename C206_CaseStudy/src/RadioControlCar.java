
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 18015077, 10 Aug 2021 4:38:45 pm
 */

public class RadioControlCar {

	private String Name;
	private String ProductCode;
	private boolean Availability;
	private double price;

	public RadioControlCar(String Name, String ProductCode, double price) {
		this.Name = Name;
		this.ProductCode = ProductCode;
		this.price = price;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}

	public boolean isAvailability() {
		return Availability;
	}

	public void setAvailability(boolean availability) {
		Availability = availability;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
