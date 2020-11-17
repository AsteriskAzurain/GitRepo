package ch04.entity;

public class BookBean {
	
	@Override
	public String toString() {
		return "BookBean [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price
				+ ", notes=" + notes + "]";
	}
	private int bookid; 
	private String bookname;
	private String author; 
	private float price; 
	private String notes; 
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

}
