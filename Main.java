
public class Main {

	public static void main(String[] args) {
		Inventory inv = new Inventory();
		inv.add(new CompactDisk("cd1", "composerperson", "artist1", "this is cd1 by artist1", 1993, 5.99F, 2.37F));
		inv.add(new CompactDisk("cd2", "composerperson", "artist2", "this is cd2 by artist2", 1996, 6.99F, 2.37F));
		inv.add(new CompactDisk("cd3", "composerperson", "artist3", "this is cd3 by artist3", 1993, 6.99F, 2.37F));
		inv.add(new CompactDisk("cd4", "composerperson", "artist4", "this is cd4 by artist4", 1994, 3.99F, 2.37F));
		inv.add(new CompactDisk("cd5", "composerperson", "artist5", "this is cd5 by artist5", 1995, 7.99F, 2.37F));
		inv.add(new CompactDisk("cd6", "composerperson", "artist6", "this is cd6 by artist6", 1989, 9.99F, 2.37F));
		inv.add(new CompactDisk("cd7", "composerperson", "artist7", "this is cd7 by artist7", 1996, 4.99F, 2.37F));
		inv.add(new CompactDisk("cd8", "composerperson", "artist8", "this is cd8 by artist8", 1992, 14.99F, 2.37F));
		inv.add(new CompactDisk("cd9", "composerperson", "artist9", "this is cd9 by artist9", 1991, 9.99F, 2.37F));
		inv.add(new CompactDisk("cd10", "composerperson", "artist10", "this is cd10 by artist10", 1996, 7.99F, 2.37F));
		inv.add(new Book("Harry Potter and the Sorcerer's Stone","J.K. Rowling","Fantasy","Boy millionare abandons family",false,309,1998,7.52F,8.5F));
		inv.add(new Book("Fifty Shades of Grey", "E.L. James", "Romance", ";)", false, 514, 2012,7.34F,12F));
		inv.add(new Book("Twilight","Stephenie Meyer","Fiction","Much older man impersonates high schooler to stalk underage girl", false, 544, 2006, 9.79F, 12F));
		inv.add(new Book("Player's Handbook (Dungeons & Dragons)", "Wizards RPG Team", "Gaming", "Ha! Nerd", true, 320, 2014, 29.97F, 41.6F));
		inv.add(new Book("A Song of Ice and Fire", "George R.R. Martin", "Fantasy", "Fire melts ice", true, 694, 1996, 25.16F,35.2F));
		inv.add(new Book("Fire and Fury", "Michael Wolff", "Politics","We wish this was fiction", true, 336, 2017, 17.99F, 17.6F));
		inv.add(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", "Neat freak is peer pressured into life of crime", false, 320, 1937, 6.14F,5.6F));
		inv.add(new Book("Of Mice and Men", "John Steinbeck", "Fiction", "Bunny farm bromance", false, 112, 1937, 8.8F,2.1F ));
		inv.add(new Book("1984","George Orwell", "Fiction", "Troublemaker attempts to destroy society", false, 328, 1949, 6.18F, 8.5F));
		inv.add(new Book("Moby Dick", "Herman Melville", "Fiction", "Man vs. Whale. Whale wins.", true, 768, 1851, 10.81F, 13.4F));
		
		
		for(int i = 0; i<inv.size(); i++)
		{
			System.out.println(inv.get(i));
		}
		
		
	}

}
