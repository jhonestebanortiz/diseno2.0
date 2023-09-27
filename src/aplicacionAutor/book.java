package aplicacionAutor;

public class book {
	private String name;
	private double price;
	private int qty;
	private author author;
	public book(String name, double price,int qty, author author) {
	       this.name = name;
	       this.price=price;
	       this.qty=qty;
	       this.author = author;
	   }

	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", qty=" + qty + ", author=" + author + "]";
	}
}
