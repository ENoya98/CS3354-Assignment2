
public class CompactDisk extends StoreItem {
	
	private String composer;
	private String artist;
	
	public CompactDisk(String title, String composer, String artist, String description, int year, float price, float weight) {
		setTitle(title);
		this.composer = composer;
		this.artist = artist;
		setDescription(description);
		setYear(year);
		setPrice(price);
		setWeight(weight);
	}

	@Override
	public String toString() {
		return "CompactDisk [title=" + getTitle() +", composer=" + composer + ", artist=" + artist + ", description=" + getDescription() 
		+ ", year=" + getYear() + ", price=" + getPrice() + ", weight=" + getWeight() + "oz]";
	}
	
}
