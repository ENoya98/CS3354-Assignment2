
public class Book extends StoreItem {
	
	private String author;
	private String subject;
	private boolean hardcover;
	private int pages;

	public Book(String title, String author, String subject, String description,
			boolean hardcover, int pages,int year, float price, float weight) {
		setTitle(title);
		this.author = author;
		this.subject = subject;
		setDescription(description);
		this.hardcover = hardcover;
		this.pages = pages;
		setYear(year);
		setPrice(price);
		setWeight(weight);
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public boolean isHardcover() {
		return hardcover;
	}
	public void setHardcover(boolean hardcover) {
		this.hardcover = hardcover;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [title=" + getTitle() +", author=" + author + ", subject=" + subject 
				+ ", hardcover=" + hardcover + ", pages=" + pages + ", description=" + getDescription() + ", year=" + getYear()
				+ ", price=$" + getPrice() + ", weight=" + getWeight() + "oz]";
	}
}
