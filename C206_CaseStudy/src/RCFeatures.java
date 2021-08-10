
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 18015077, 10 Aug 2021 5:10:21 pm
 */

public class RCFeatures extends RadioControlCar {
	private String Size;
	private String Colour;

	public RCFeatures(String Name, String ProductCode, double price, String Size, String Colour) {
		super(Name, ProductCode, price);

		this.Size = Size;
		this.Colour = Colour;

	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

}
